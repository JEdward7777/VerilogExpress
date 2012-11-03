grammar VerilogExpress;

//http://www.antlr.org/wiki/display/ANTLR3/ANTLR+Cheat+Sheet


@header {
    package verilogExpress;
    
    import java.util.LinkedList;
}

@lexer::header {
    package verilogExpress;
}

@members{
	DoBlock currentBlock = null;
	int anonConstNum = 0;
	LinkedList< OutputPort > outputPorts = new LinkedList< OutputPort >();
	LinkedList< InputPort >  inputPorts  = new LinkedList< InputPort  >();
	VerilogSystem verilogSystem = new VerilogSystem();
}


system returns [VerilogSystem system]
	: moduleDec EOF { 
			$system = verilogSystem;
			$system.setProgName( $moduleDec.progName );
			$system.setTopModule( $moduleDec.module );
		 }
	;

moduleDec returns [ VerilogFileModule module, String progName ]
	: 'module' VAR doBlock {
		$module = new VerilogFileModule( );
		$module.setModuleName( $VAR.text + "_top" );
		$module.setMainBody( $doBlock.block );
		for( InputPort inputPort : inputPorts ){
			$module.addInputPort( inputPort );
		}
		for( OutputPort outputPort : outputPorts ){
			$module.addOutputPort( outputPort );
		}
		$progName = $VAR.text;
	}
	;
	
doBlock returns [ DoBlock block ]
	:
	 parallelDoer { $block = $parallelDoer.block;  currentBlock = $block.getParrent(); }
	| sequentualDoer { $block = $sequentualDoer.block;  currentBlock = $block.getParrent(); }
	;
	
parallelDoer returns [ DoBlock block ]
	: {
		$block = new ParallelDoer();
	   	$block.setParrent( currentBlock );
	   	currentBlock = $block;
	 }
	 '[' ( doAble { $block.appendDo( $doAble.doable ); } 
	 | varDec )+ ']' 
	 
	;
	
sequentualDoer returns [ DoBlock block ]
	: {
		$block = new SequentualDoer();
	   	$block.setParrent( currentBlock );
	   	currentBlock = $block;
	 }
	 '{' ( doAble  { $block.appendDo( $doAble.doable ); }
	 | varDec )+'}' 
	;

varDec
	: 'reg' VAR '=' INT ';' { new RegVar( $VAR.text, $INT.text, currentBlock ); }
	| 'pipe' VAR ';'        { new PipeVar($VAR.text, currentBlock ); }
	| 'const' VAR '=' INT ';'{ new ConstVar( $VAR.text, $INT.text, currentBlock ); }
	| 'output' VAR ';'      { 
		OutputPort newOutput = new OutputPort( $VAR.text, currentBlock ); 
		outputPorts.add( newOutput );
	}
	| 'input' VAR ';'       {
		InputPort newInput = new InputPort( $VAR.text, currentBlock );
		inputPorts.add( newInput );
	}
	;
	
doAble returns [ Doable doable ]
	: doBlock { $doable = $doBlock.block; }
	| doAssign { $doable = $doAssign.assignment; }
	| doIf    { $doable = $doIf.doIf; }
	| doWhile { $doable = $doWhile.doWhile; }
	;
	
doIf returns [ DoIf doIf ]
	: 
	{ $doIf = new DoIf(); }
	'if' '(' expression ')' ifDo=doAble{
		$doIf.connectDataSource( $expression.d );
		$doIf.connectIfDo( ifDo );
	}
	( options{ greedy=true; }:'else' elseDo=doAble { $doIf.connectElseDo( elseDo ); } )?
	;
	
doWhile returns [ DoWhile doWhile ]
	: 'while' '(' expression ')' doAble { 
		$doWhile = new DoWhile();
		$doWhile.connectDataSource( $expression.d );
		$doWhile.connectWhileDo( $doAble.doable );
	}
	;
	
doAssign returns [ DoAssign assignment ]
	: dataTarget '=' expression ';' { 
		$assignment = new DoAssign( $expression.d );
		$dataTarget.target.connectDataSource( $assignment );
		}
	;
	
dataTarget returns [ DataTarget target ]
	: VAR       { $target = currentBlock.getVar( $VAR.text ); }
	| 'stdout'  { $target = verilogSystem.getStdOut(); }
	;
	

//java operator precidence	
//http://bmanolov.free.fr/javaoperators.php



atom returns [ DataSource d ]
	: VAR { $d = currentBlock.getVar( $VAR.getText() ); }
	| INT { $d = new ConstVar( "AnonInt" + (anonConstNum++), $INT.getText(), currentBlock ); }
//	| FLOAT
	| 'stdin'  { $d = verilogSystem.getStdIn(); }
	| '(' expression ')' {$d = $expression.d; }
	;
/*

*/	
notExp returns [ DataSource d ]
	: NOT_? atom { $d = new CalcUnaryOpperation( "!", $atom.d, currentBlock ); }
	;
	
multExp returns [ DataSource d ]
	:arg1=notExp {$d = arg1;} ( (op=TIMES_|op=DIV_) arg2=notExp { $d = new CalcBinaryOpperation( op.getText(), $d, arg2, currentBlock ); } )*
	;
	
addExp returns [ DataSource d ]
	: arg1=multExp {$d = arg1;} ( (op='+'|op='-') arg2=multExp {$d = new CalcBinaryOpperation( op.getText(), $d, arg2, currentBlock ); } )*
	;
	
shiftExp returns [ DataSource d ]
	: arg1=addExp {$d = arg1;}(( op='<<' | op='>>' ) arg2=addExp{$d =new CalcBinaryOpperation( op.getText(), $d, arg2, currentBlock ); })?
	;

cmpExp returns [ DataSource d ]
	: arg1=shiftExp {$d = arg1;} ( ( op='<' | op='>' ) arg2=shiftExp {$d =new CalcBinaryOpperation( op.getText(), $d, arg2, currentBlock );} )?
	;

eqlExp returns [ DataSource d ]
	: arg1=cmpExp {$d = arg1;}( ( op='==' | op='!=' ) arg2=cmpExp{$d =new CalcBinaryOpperation( op.getText(), $d, arg2, currentBlock ); } )?
	;
	
bitAndExp returns [ DataSource d ]
	: arg1=eqlExp {$d = arg1;}( ( op='&' | op='|' ) arg2=eqlExp{$d =new CalcBinaryOpperation( op.getText(), $d, arg2, currentBlock );} )*
	;

logicExp returns [ DataSource d ]
	: arg1=bitAndExp {$d = arg1;}( (op='&&' | op='||' ) arg2=bitAndExp{$d =new CalcBinaryOpperation( op.getText(), $d, arg2, currentBlock );} )*
	;
	
expression returns [ DataSource d ]
	: logicExp { $d = $logicExp.d; }
	;
	

NOT_ 	:	'!';
TIMES_	:	'*';
DIV_	:	'/';

VAR  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

/*
FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;
*/


//COMMENT
//    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
//    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
//    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
       ) {$channel=HIDDEN;}
    ;

//STRING
//    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
//    ;

//CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
//    ;

//fragment
//EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
//
//fragment
//HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

//fragment
//ESC_SEQ
//    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
//    |   UNICODE_ESC
//   |   OCTAL_ESC
//    ;

//fragment
//OCTAL_ESC
//    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
//    |   '\\' ('0'..'7') ('0'..'7')
//    |   '\\' ('0'..'7')
//    ;

//fragment
//UNICODE_ESC
//    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
//    ;
