// $ANTLR 3.4 C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g 2012-11-03 19:24:01

    package verilogExpress;
    
    import java.util.LinkedList;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class VerilogExpressParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIV_", "INT", "NOT_", "TIMES_", "VAR", "WS", "'!='", "'&&'", "'&'", "'('", "')'", "'+'", "'-'", "';'", "'<'", "'<<'", "'='", "'=='", "'>'", "'>>'", "'['", "']'", "'const'", "'else'", "'if'", "'input'", "'module'", "'output'", "'pipe'", "'reg'", "'stdin'", "'stdout'", "'while'", "'{'", "'|'", "'||'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int DIV_=4;
    public static final int INT=5;
    public static final int NOT_=6;
    public static final int TIMES_=7;
    public static final int VAR=8;
    public static final int WS=9;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public VerilogExpressParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public VerilogExpressParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return VerilogExpressParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g"; }


    	DoBlock currentBlock = null;
    	int anonConstNum = 0;
    	LinkedList< OutputPort > outputPorts = new LinkedList< OutputPort >();
    	LinkedList< InputPort >  inputPorts  = new LinkedList< InputPort  >();
    	VerilogSystem verilogSystem = new VerilogSystem();



    // $ANTLR start "system"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:25:1: system returns [VerilogSystem system] : moduleDec EOF ;
    public final VerilogSystem system() throws RecognitionException {
        VerilogSystem system = null;


        VerilogExpressParser.moduleDec_return moduleDec1 =null;


        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:26:2: ( moduleDec EOF )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:26:4: moduleDec EOF
            {
            pushFollow(FOLLOW_moduleDec_in_system39);
            moduleDec1=moduleDec();

            state._fsp--;


            match(input,EOF,FOLLOW_EOF_in_system41); 

             
            			system = verilogSystem;
            			system.setProgName( (moduleDec1!=null?moduleDec1.progName:null) );
            			system.setTopModule( (moduleDec1!=null?moduleDec1.module:null) );
            		 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return system;
    }
    // $ANTLR end "system"


    public static class moduleDec_return extends ParserRuleReturnScope {
        public VerilogFileModule module;
        public String progName;
    };


    // $ANTLR start "moduleDec"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:33:1: moduleDec returns [ VerilogFileModule module, String progName ] : 'module' VAR doBlock ;
    public final VerilogExpressParser.moduleDec_return moduleDec() throws RecognitionException {
        VerilogExpressParser.moduleDec_return retval = new VerilogExpressParser.moduleDec_return();
        retval.start = input.LT(1);


        Token VAR2=null;
        DoBlock doBlock3 =null;


        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:34:2: ( 'module' VAR doBlock )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:34:4: 'module' VAR doBlock
            {
            match(input,30,FOLLOW_30_in_moduleDec58); 

            VAR2=(Token)match(input,VAR,FOLLOW_VAR_in_moduleDec60); 

            pushFollow(FOLLOW_doBlock_in_moduleDec62);
            doBlock3=doBlock();

            state._fsp--;



            		retval.module = new VerilogFileModule( );
            		retval.module.setModuleName( (VAR2!=null?VAR2.getText():null) + "_top" );
            		retval.module.setMainBody( doBlock3 );
            		for( InputPort inputPort : inputPorts ){
            			retval.module.addInputPort( inputPort );
            		}
            		for( OutputPort outputPort : outputPorts ){
            			retval.module.addOutputPort( outputPort );
            		}
            		retval.progName = (VAR2!=null?VAR2.getText():null);
            	

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "moduleDec"



    // $ANTLR start "doBlock"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:48:1: doBlock returns [ DoBlock block ] : ( parallelDoer | sequentualDoer );
    public final DoBlock doBlock() throws RecognitionException {
        DoBlock block = null;


        DoBlock parallelDoer4 =null;

        DoBlock sequentualDoer5 =null;


        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:49:2: ( parallelDoer | sequentualDoer )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            else if ( (LA1_0==37) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:50:3: parallelDoer
                    {
                    pushFollow(FOLLOW_parallelDoer_in_doBlock82);
                    parallelDoer4=parallelDoer();

                    state._fsp--;


                     block = parallelDoer4;  currentBlock = block.getParrent(); 

                    }
                    break;
                case 2 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:51:4: sequentualDoer
                    {
                    pushFollow(FOLLOW_sequentualDoer_in_doBlock89);
                    sequentualDoer5=sequentualDoer();

                    state._fsp--;


                     block = sequentualDoer5;  currentBlock = block.getParrent(); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return block;
    }
    // $ANTLR end "doBlock"



    // $ANTLR start "parallelDoer"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:54:1: parallelDoer returns [ DoBlock block ] : '[' ( doAble | varDec )+ ']' ;
    public final DoBlock parallelDoer() throws RecognitionException {
        DoBlock block = null;


        Doable doAble6 =null;


        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:55:2: ( '[' ( doAble | varDec )+ ']' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:55:4: '[' ( doAble | varDec )+ ']'
            {

            		block = new ParallelDoer();
            	   	block.setParrent( currentBlock );
            	   	currentBlock = block;
            	 

            match(input,24,FOLLOW_24_in_parallelDoer111); 

            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:60:7: ( doAble | varDec )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==VAR||LA2_0==24||LA2_0==28||(LA2_0 >= 35 && LA2_0 <= 37)) ) {
                    alt2=1;
                }
                else if ( (LA2_0==26||LA2_0==29||(LA2_0 >= 31 && LA2_0 <= 33)) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:60:9: doAble
            	    {
            	    pushFollow(FOLLOW_doAble_in_parallelDoer115);
            	    doAble6=doAble();

            	    state._fsp--;


            	     block.appendDo( doAble6 ); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:61:5: varDec
            	    {
            	    pushFollow(FOLLOW_varDec_in_parallelDoer124);
            	    varDec();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match(input,25,FOLLOW_25_in_parallelDoer129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return block;
    }
    // $ANTLR end "parallelDoer"



    // $ANTLR start "sequentualDoer"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:65:1: sequentualDoer returns [ DoBlock block ] : '{' ( doAble | varDec )+ '}' ;
    public final DoBlock sequentualDoer() throws RecognitionException {
        DoBlock block = null;


        Doable doAble7 =null;


        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:66:2: ( '{' ( doAble | varDec )+ '}' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:66:4: '{' ( doAble | varDec )+ '}'
            {

            		block = new SequentualDoer();
            	   	block.setParrent( currentBlock );
            	   	currentBlock = block;
            	 

            match(input,37,FOLLOW_37_in_sequentualDoer153); 

            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:71:7: ( doAble | varDec )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==VAR||LA3_0==24||LA3_0==28||(LA3_0 >= 35 && LA3_0 <= 37)) ) {
                    alt3=1;
                }
                else if ( (LA3_0==26||LA3_0==29||(LA3_0 >= 31 && LA3_0 <= 33)) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:71:9: doAble
            	    {
            	    pushFollow(FOLLOW_doAble_in_sequentualDoer157);
            	    doAble7=doAble();

            	    state._fsp--;


            	     block.appendDo( doAble7 ); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:72:5: varDec
            	    {
            	    pushFollow(FOLLOW_varDec_in_sequentualDoer166);
            	    varDec();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match(input,40,FOLLOW_40_in_sequentualDoer170); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return block;
    }
    // $ANTLR end "sequentualDoer"



    // $ANTLR start "varDec"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:75:1: varDec : ( 'reg' VAR '=' INT ';' | 'pipe' VAR ';' | 'const' VAR '=' INT ';' | 'output' VAR ';' | 'input' VAR ';' );
    public final void varDec() throws RecognitionException {
        Token VAR8=null;
        Token INT9=null;
        Token VAR10=null;
        Token VAR11=null;
        Token INT12=null;
        Token VAR13=null;
        Token VAR14=null;

        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:76:2: ( 'reg' VAR '=' INT ';' | 'pipe' VAR ';' | 'const' VAR '=' INT ';' | 'output' VAR ';' | 'input' VAR ';' )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            case 31:
                {
                alt4=4;
                }
                break;
            case 29:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:76:4: 'reg' VAR '=' INT ';'
                    {
                    match(input,33,FOLLOW_33_in_varDec182); 

                    VAR8=(Token)match(input,VAR,FOLLOW_VAR_in_varDec184); 

                    match(input,20,FOLLOW_20_in_varDec186); 

                    INT9=(Token)match(input,INT,FOLLOW_INT_in_varDec188); 

                    match(input,17,FOLLOW_17_in_varDec190); 

                     new RegVar( (VAR8!=null?VAR8.getText():null), (INT9!=null?INT9.getText():null), currentBlock ); 

                    }
                    break;
                case 2 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:77:4: 'pipe' VAR ';'
                    {
                    match(input,32,FOLLOW_32_in_varDec197); 

                    VAR10=(Token)match(input,VAR,FOLLOW_VAR_in_varDec199); 

                    match(input,17,FOLLOW_17_in_varDec201); 

                     new PipeVar((VAR10!=null?VAR10.getText():null), currentBlock ); 

                    }
                    break;
                case 3 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:78:4: 'const' VAR '=' INT ';'
                    {
                    match(input,26,FOLLOW_26_in_varDec215); 

                    VAR11=(Token)match(input,VAR,FOLLOW_VAR_in_varDec217); 

                    match(input,20,FOLLOW_20_in_varDec219); 

                    INT12=(Token)match(input,INT,FOLLOW_INT_in_varDec221); 

                    match(input,17,FOLLOW_17_in_varDec223); 

                     new ConstVar( (VAR11!=null?VAR11.getText():null), (INT12!=null?INT12.getText():null), currentBlock ); 

                    }
                    break;
                case 4 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:79:4: 'output' VAR ';'
                    {
                    match(input,31,FOLLOW_31_in_varDec229); 

                    VAR13=(Token)match(input,VAR,FOLLOW_VAR_in_varDec231); 

                    match(input,17,FOLLOW_17_in_varDec233); 

                     
                    		OutputPort newOutput = new OutputPort( (VAR13!=null?VAR13.getText():null), currentBlock ); 
                    		outputPorts.add( newOutput );
                    	

                    }
                    break;
                case 5 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:83:4: 'input' VAR ';'
                    {
                    match(input,29,FOLLOW_29_in_varDec245); 

                    VAR14=(Token)match(input,VAR,FOLLOW_VAR_in_varDec247); 

                    match(input,17,FOLLOW_17_in_varDec249); 


                    		InputPort newInput = new InputPort( (VAR14!=null?VAR14.getText():null), currentBlock );
                    		inputPorts.add( newInput );
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "varDec"



    // $ANTLR start "doAble"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:89:1: doAble returns [ Doable doable ] : ( doBlock | doAssign | doIf | doWhile );
    public final Doable doAble() throws RecognitionException {
        Doable doable = null;


        DoBlock doBlock15 =null;

        DoAssign doAssign16 =null;

        DoIf doIf17 =null;

        DoWhile doWhile18 =null;


        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:90:2: ( doBlock | doAssign | doIf | doWhile )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 24:
            case 37:
                {
                alt5=1;
                }
                break;
            case VAR:
            case 35:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case 36:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:90:4: doBlock
                    {
                    pushFollow(FOLLOW_doBlock_in_doAble273);
                    doBlock15=doBlock();

                    state._fsp--;


                     doable = doBlock15; 

                    }
                    break;
                case 2 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:91:4: doAssign
                    {
                    pushFollow(FOLLOW_doAssign_in_doAble280);
                    doAssign16=doAssign();

                    state._fsp--;


                     doable = doAssign16; 

                    }
                    break;
                case 3 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:92:4: doIf
                    {
                    pushFollow(FOLLOW_doIf_in_doAble287);
                    doIf17=doIf();

                    state._fsp--;


                     doable = doIf17; 

                    }
                    break;
                case 4 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:93:4: doWhile
                    {
                    pushFollow(FOLLOW_doWhile_in_doAble297);
                    doWhile18=doWhile();

                    state._fsp--;


                     doable = doWhile18; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return doable;
    }
    // $ANTLR end "doAble"



    // $ANTLR start "doIf"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:96:1: doIf returns [ DoIf doIf ] : 'if' '(' expression ')' ifDo= doAble ( options {greedy=true; } : 'else' elseDo= doAble )? ;
    public final DoIf doIf() throws RecognitionException {
        DoIf doIf = null;


        Doable ifDo =null;

        Doable elseDo =null;

        DataSource expression19 =null;


        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:97:2: ( 'if' '(' expression ')' ifDo= doAble ( options {greedy=true; } : 'else' elseDo= doAble )? )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:98:2: 'if' '(' expression ')' ifDo= doAble ( options {greedy=true; } : 'else' elseDo= doAble )?
            {
             doIf = new DoIf(); 

            match(input,28,FOLLOW_28_in_doIf320); 

            match(input,13,FOLLOW_13_in_doIf322); 

            pushFollow(FOLLOW_expression_in_doIf324);
            expression19=expression();

            state._fsp--;


            match(input,14,FOLLOW_14_in_doIf326); 

            pushFollow(FOLLOW_doAble_in_doIf330);
            ifDo=doAble();

            state._fsp--;



            		doIf.connectDataSource( expression19 );
            		doIf.connectIfDo( ifDo );
            	

            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:103:2: ( options {greedy=true; } : 'else' elseDo= doAble )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:103:28: 'else' elseDo= doAble
                    {
                    match(input,27,FOLLOW_27_in_doIf345); 

                    pushFollow(FOLLOW_doAble_in_doIf349);
                    elseDo=doAble();

                    state._fsp--;


                     doIf.connectElseDo( elseDo ); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return doIf;
    }
    // $ANTLR end "doIf"



    // $ANTLR start "doWhile"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:106:1: doWhile returns [ DoWhile doWhile ] : 'while' '(' expression ')' doAble ;
    public final DoWhile doWhile() throws RecognitionException {
        DoWhile doWhile = null;


        DataSource expression20 =null;

        Doable doAble21 =null;


        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:107:2: ( 'while' '(' expression ')' doAble )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:107:4: 'while' '(' expression ')' doAble
            {
            match(input,36,FOLLOW_36_in_doWhile370); 

            match(input,13,FOLLOW_13_in_doWhile372); 

            pushFollow(FOLLOW_expression_in_doWhile374);
            expression20=expression();

            state._fsp--;


            match(input,14,FOLLOW_14_in_doWhile376); 

            pushFollow(FOLLOW_doAble_in_doWhile378);
            doAble21=doAble();

            state._fsp--;


             
            		doWhile = new DoWhile();
            		doWhile.connectDataSource( expression20 );
            		doWhile.connectWhileDo( doAble21 );
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return doWhile;
    }
    // $ANTLR end "doWhile"



    // $ANTLR start "doAssign"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:114:1: doAssign returns [ DoAssign assignment ] : dataTarget '=' expression ';' ;
    public final DoAssign doAssign() throws RecognitionException {
        DoAssign assignment = null;


        DataSource expression22 =null;

        DataTarget dataTarget23 =null;


        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:115:2: ( dataTarget '=' expression ';' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:115:4: dataTarget '=' expression ';'
            {
            pushFollow(FOLLOW_dataTarget_in_doAssign396);
            dataTarget23=dataTarget();

            state._fsp--;


            match(input,20,FOLLOW_20_in_doAssign398); 

            pushFollow(FOLLOW_expression_in_doAssign400);
            expression22=expression();

            state._fsp--;


            match(input,17,FOLLOW_17_in_doAssign402); 

             
            		assignment = new DoAssign( expression22 );
            		dataTarget23.connectDataSource( assignment );
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return assignment;
    }
    // $ANTLR end "doAssign"



    // $ANTLR start "dataTarget"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:121:1: dataTarget returns [ DataTarget target ] : ( VAR | 'stdout' );
    public final DataTarget dataTarget() throws RecognitionException {
        DataTarget target = null;


        Token VAR24=null;

        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:122:2: ( VAR | 'stdout' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==VAR) ) {
                alt7=1;
            }
            else if ( (LA7_0==35) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:122:4: VAR
                    {
                    VAR24=(Token)match(input,VAR,FOLLOW_VAR_in_dataTarget420); 

                     target = currentBlock.getVar( (VAR24!=null?VAR24.getText():null) ); 

                    }
                    break;
                case 2 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:123:4: 'stdout'
                    {
                    match(input,35,FOLLOW_35_in_dataTarget433); 

                     target = verilogSystem.getStdOut(); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return target;
    }
    // $ANTLR end "dataTarget"



    // $ANTLR start "atom"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:132:1: atom returns [ DataSource d ] : ( VAR | INT | 'stdin' | '(' expression ')' );
    public final DataSource atom() throws RecognitionException {
        DataSource d = null;


        Token VAR25=null;
        Token INT26=null;
        DataSource expression27 =null;


        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:133:2: ( VAR | INT | 'stdin' | '(' expression ')' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt8=1;
                }
                break;
            case INT:
                {
                alt8=2;
                }
                break;
            case 34:
                {
                alt8=3;
                }
                break;
            case 13:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:133:4: VAR
                    {
                    VAR25=(Token)match(input,VAR,FOLLOW_VAR_in_atom458); 

                     d = currentBlock.getVar( VAR25.getText() ); 

                    }
                    break;
                case 2 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:134:4: INT
                    {
                    INT26=(Token)match(input,INT,FOLLOW_INT_in_atom465); 

                     d = new ConstVar( "AnonInt" + (anonConstNum++), INT26.getText(), currentBlock ); 

                    }
                    break;
                case 3 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:136:4: 'stdin'
                    {
                    match(input,34,FOLLOW_34_in_atom473); 

                     d = verilogSystem.getStdIn(); 

                    }
                    break;
                case 4 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:137:4: '(' expression ')'
                    {
                    match(input,13,FOLLOW_13_in_atom481); 

                    pushFollow(FOLLOW_expression_in_atom483);
                    expression27=expression();

                    state._fsp--;


                    match(input,14,FOLLOW_14_in_atom485); 

                    d = expression27; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return d;
    }
    // $ANTLR end "atom"



    // $ANTLR start "notExp"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:142:1: notExp returns [ DataSource d ] : ( NOT_ )? atom ;
    public final DataSource notExp() throws RecognitionException {
        DataSource d = null;


        DataSource atom28 =null;


        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:143:2: ( ( NOT_ )? atom )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:143:4: ( NOT_ )? atom
            {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:143:4: ( NOT_ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==NOT_) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:143:4: NOT_
                    {
                    match(input,NOT_,FOLLOW_NOT__in_notExp504); 

                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_notExp507);
            atom28=atom();

            state._fsp--;


             d = new CalcUnaryOpperation( "!", atom28, currentBlock ); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return d;
    }
    // $ANTLR end "notExp"



    // $ANTLR start "multExp"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:146:1: multExp returns [ DataSource d ] : arg1= notExp ( (op= TIMES_ |op= DIV_ ) arg2= notExp )* ;
    public final DataSource multExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:147:2: (arg1= notExp ( (op= TIMES_ |op= DIV_ ) arg2= notExp )* )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:147:3: arg1= notExp ( (op= TIMES_ |op= DIV_ ) arg2= notExp )*
            {
            pushFollow(FOLLOW_notExp_in_multExp526);
            arg1=notExp();

            state._fsp--;


            d = arg1;

            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:147:28: ( (op= TIMES_ |op= DIV_ ) arg2= notExp )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==DIV_||LA11_0==TIMES_) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:147:30: (op= TIMES_ |op= DIV_ ) arg2= notExp
            	    {
            	    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:147:30: (op= TIMES_ |op= DIV_ )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==TIMES_) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==DIV_) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:147:31: op= TIMES_
            	            {
            	            op=(Token)match(input,TIMES_,FOLLOW_TIMES__in_multExp535); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:147:41: op= DIV_
            	            {
            	            op=(Token)match(input,DIV_,FOLLOW_DIV__in_multExp539); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_notExp_in_multExp544);
            	    arg2=notExp();

            	    state._fsp--;


            	     d = new CalcBinaryOpperation( op.getText(), d, arg2, currentBlock ); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return d;
    }
    // $ANTLR end "multExp"



    // $ANTLR start "addExp"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:150:1: addExp returns [ DataSource d ] : arg1= multExp ( (op= '+' |op= '-' ) arg2= multExp )* ;
    public final DataSource addExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:151:2: (arg1= multExp ( (op= '+' |op= '-' ) arg2= multExp )* )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:151:4: arg1= multExp ( (op= '+' |op= '-' ) arg2= multExp )*
            {
            pushFollow(FOLLOW_multExp_in_addExp567);
            arg1=multExp();

            state._fsp--;


            d = arg1;

            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:151:30: ( (op= '+' |op= '-' ) arg2= multExp )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= 15 && LA13_0 <= 16)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:151:32: (op= '+' |op= '-' ) arg2= multExp
            	    {
            	    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:151:32: (op= '+' |op= '-' )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==15) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==16) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:151:33: op= '+'
            	            {
            	            op=(Token)match(input,15,FOLLOW_15_in_addExp576); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:151:40: op= '-'
            	            {
            	            op=(Token)match(input,16,FOLLOW_16_in_addExp580); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExp_in_addExp585);
            	    arg2=multExp();

            	    state._fsp--;


            	    d = new CalcBinaryOpperation( op.getText(), d, arg2, currentBlock ); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return d;
    }
    // $ANTLR end "addExp"



    // $ANTLR start "shiftExp"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:154:1: shiftExp returns [ DataSource d ] : arg1= addExp ( (op= '<<' |op= '>>' ) arg2= addExp )? ;
    public final DataSource shiftExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:155:2: (arg1= addExp ( (op= '<<' |op= '>>' ) arg2= addExp )? )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:155:4: arg1= addExp ( (op= '<<' |op= '>>' ) arg2= addExp )?
            {
            pushFollow(FOLLOW_addExp_in_shiftExp608);
            arg1=addExp();

            state._fsp--;


            d = arg1;

            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:155:28: ( (op= '<<' |op= '>>' ) arg2= addExp )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19||LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:155:29: (op= '<<' |op= '>>' ) arg2= addExp
                    {
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:155:29: (op= '<<' |op= '>>' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==19) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==23) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;

                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:155:31: op= '<<'
                            {
                            op=(Token)match(input,19,FOLLOW_19_in_shiftExp616); 

                            }
                            break;
                        case 2 :
                            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:155:41: op= '>>'
                            {
                            op=(Token)match(input,23,FOLLOW_23_in_shiftExp622); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_addExp_in_shiftExp628);
                    arg2=addExp();

                    state._fsp--;


                    d =new CalcBinaryOpperation( op.getText(), d, arg2, currentBlock ); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return d;
    }
    // $ANTLR end "shiftExp"



    // $ANTLR start "cmpExp"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:158:1: cmpExp returns [ DataSource d ] : arg1= shiftExp ( (op= '<' |op= '>' ) arg2= shiftExp )? ;
    public final DataSource cmpExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:159:2: (arg1= shiftExp ( (op= '<' |op= '>' ) arg2= shiftExp )? )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:159:4: arg1= shiftExp ( (op= '<' |op= '>' ) arg2= shiftExp )?
            {
            pushFollow(FOLLOW_shiftExp_in_cmpExp648);
            arg1=shiftExp();

            state._fsp--;


            d = arg1;

            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:159:31: ( (op= '<' |op= '>' ) arg2= shiftExp )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18||LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:159:33: (op= '<' |op= '>' ) arg2= shiftExp
                    {
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:159:33: (op= '<' |op= '>' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==18) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==22) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;

                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:159:35: op= '<'
                            {
                            op=(Token)match(input,18,FOLLOW_18_in_cmpExp658); 

                            }
                            break;
                        case 2 :
                            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:159:44: op= '>'
                            {
                            op=(Token)match(input,22,FOLLOW_22_in_cmpExp664); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_shiftExp_in_cmpExp670);
                    arg2=shiftExp();

                    state._fsp--;


                    d =new CalcBinaryOpperation( op.getText(), d, arg2, currentBlock );

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return d;
    }
    // $ANTLR end "cmpExp"



    // $ANTLR start "eqlExp"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:162:1: eqlExp returns [ DataSource d ] : arg1= cmpExp ( (op= '==' |op= '!=' ) arg2= cmpExp )? ;
    public final DataSource eqlExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:163:2: (arg1= cmpExp ( (op= '==' |op= '!=' ) arg2= cmpExp )? )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:163:4: arg1= cmpExp ( (op= '==' |op= '!=' ) arg2= cmpExp )?
            {
            pushFollow(FOLLOW_cmpExp_in_eqlExp692);
            arg1=cmpExp();

            state._fsp--;


            d = arg1;

            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:163:28: ( (op= '==' |op= '!=' ) arg2= cmpExp )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==10||LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:163:30: (op= '==' |op= '!=' ) arg2= cmpExp
                    {
                    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:163:30: (op= '==' |op= '!=' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==21) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==10) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;

                    }
                    switch (alt18) {
                        case 1 :
                            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:163:32: op= '=='
                            {
                            op=(Token)match(input,21,FOLLOW_21_in_eqlExp701); 

                            }
                            break;
                        case 2 :
                            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:163:42: op= '!='
                            {
                            op=(Token)match(input,10,FOLLOW_10_in_eqlExp707); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_cmpExp_in_eqlExp713);
                    arg2=cmpExp();

                    state._fsp--;


                    d =new CalcBinaryOpperation( op.getText(), d, arg2, currentBlock ); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return d;
    }
    // $ANTLR end "eqlExp"



    // $ANTLR start "bitAndExp"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:166:1: bitAndExp returns [ DataSource d ] : arg1= eqlExp ( (op= '&' |op= '|' ) arg2= eqlExp )* ;
    public final DataSource bitAndExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:167:2: (arg1= eqlExp ( (op= '&' |op= '|' ) arg2= eqlExp )* )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:167:4: arg1= eqlExp ( (op= '&' |op= '|' ) arg2= eqlExp )*
            {
            pushFollow(FOLLOW_eqlExp_in_bitAndExp735);
            arg1=eqlExp();

            state._fsp--;


            d = arg1;

            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:167:28: ( (op= '&' |op= '|' ) arg2= eqlExp )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==12||LA21_0==38) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:167:30: (op= '&' |op= '|' ) arg2= eqlExp
            	    {
            	    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:167:30: (op= '&' |op= '|' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==12) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==38) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:167:32: op= '&'
            	            {
            	            op=(Token)match(input,12,FOLLOW_12_in_bitAndExp744); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:167:41: op= '|'
            	            {
            	            op=(Token)match(input,38,FOLLOW_38_in_bitAndExp750); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_eqlExp_in_bitAndExp756);
            	    arg2=eqlExp();

            	    state._fsp--;


            	    d =new CalcBinaryOpperation( op.getText(), d, arg2, currentBlock );

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return d;
    }
    // $ANTLR end "bitAndExp"



    // $ANTLR start "logicExp"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:170:1: logicExp returns [ DataSource d ] : arg1= bitAndExp ( (op= '&&' |op= '||' ) arg2= bitAndExp )* ;
    public final DataSource logicExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:171:2: (arg1= bitAndExp ( (op= '&&' |op= '||' ) arg2= bitAndExp )* )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:171:4: arg1= bitAndExp ( (op= '&&' |op= '||' ) arg2= bitAndExp )*
            {
            pushFollow(FOLLOW_bitAndExp_in_logicExp777);
            arg1=bitAndExp();

            state._fsp--;


            d = arg1;

            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:171:31: ( (op= '&&' |op= '||' ) arg2= bitAndExp )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==11||LA23_0==39) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:171:33: (op= '&&' |op= '||' ) arg2= bitAndExp
            	    {
            	    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:171:33: (op= '&&' |op= '||' )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==11) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==39) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:171:34: op= '&&'
            	            {
            	            op=(Token)match(input,11,FOLLOW_11_in_logicExp785); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:171:44: op= '||'
            	            {
            	            op=(Token)match(input,39,FOLLOW_39_in_logicExp791); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_bitAndExp_in_logicExp797);
            	    arg2=bitAndExp();

            	    state._fsp--;


            	    d =new CalcBinaryOpperation( op.getText(), d, arg2, currentBlock );

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return d;
    }
    // $ANTLR end "logicExp"



    // $ANTLR start "expression"
    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:174:1: expression returns [ DataSource d ] : logicExp ;
    public final DataSource expression() throws RecognitionException {
        DataSource d = null;


        DataSource logicExp29 =null;


        try {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:175:2: ( logicExp )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:175:4: logicExp
            {
            pushFollow(FOLLOW_logicExp_in_expression817);
            logicExp29=logicExp();

            state._fsp--;


             d = logicExp29; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return d;
    }
    // $ANTLR end "expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_moduleDec_in_system39 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_system41 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_moduleDec58 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_VAR_in_moduleDec60 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_doBlock_in_moduleDec62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parallelDoer_in_doBlock82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequentualDoer_in_doBlock89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parallelDoer111 = new BitSet(new long[]{0x0000003BB5000100L});
    public static final BitSet FOLLOW_doAble_in_parallelDoer115 = new BitSet(new long[]{0x0000003BB7000100L});
    public static final BitSet FOLLOW_varDec_in_parallelDoer124 = new BitSet(new long[]{0x0000003BB7000100L});
    public static final BitSet FOLLOW_25_in_parallelDoer129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_sequentualDoer153 = new BitSet(new long[]{0x0000003BB5000100L});
    public static final BitSet FOLLOW_doAble_in_sequentualDoer157 = new BitSet(new long[]{0x0000013BB5000100L});
    public static final BitSet FOLLOW_varDec_in_sequentualDoer166 = new BitSet(new long[]{0x0000013BB5000100L});
    public static final BitSet FOLLOW_40_in_sequentualDoer170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_varDec182 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_VAR_in_varDec184 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_varDec186 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_varDec188 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_varDec190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_varDec197 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_VAR_in_varDec199 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_varDec201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_varDec215 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_VAR_in_varDec217 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_varDec219 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_varDec221 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_varDec223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_varDec229 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_VAR_in_varDec231 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_varDec233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_varDec245 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_VAR_in_varDec247 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_varDec249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doBlock_in_doAble273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doAssign_in_doAble280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doIf_in_doAble287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doWhile_in_doAble297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_doIf320 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_doIf322 = new BitSet(new long[]{0x0000000400002160L});
    public static final BitSet FOLLOW_expression_in_doIf324 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_doIf326 = new BitSet(new long[]{0x0000003811000100L});
    public static final BitSet FOLLOW_doAble_in_doIf330 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_doIf345 = new BitSet(new long[]{0x0000003811000100L});
    public static final BitSet FOLLOW_doAble_in_doIf349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_doWhile370 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_doWhile372 = new BitSet(new long[]{0x0000000400002160L});
    public static final BitSet FOLLOW_expression_in_doWhile374 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_doWhile376 = new BitSet(new long[]{0x0000003811000100L});
    public static final BitSet FOLLOW_doAble_in_doWhile378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataTarget_in_doAssign396 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_doAssign398 = new BitSet(new long[]{0x0000000400002160L});
    public static final BitSet FOLLOW_expression_in_doAssign400 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_doAssign402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_dataTarget420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_dataTarget433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_atom458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_atom473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_atom481 = new BitSet(new long[]{0x0000000400002160L});
    public static final BitSet FOLLOW_expression_in_atom483 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_atom485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT__in_notExp504 = new BitSet(new long[]{0x0000000400002120L});
    public static final BitSet FOLLOW_atom_in_notExp507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExp_in_multExp526 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_TIMES__in_multExp535 = new BitSet(new long[]{0x0000000400002160L});
    public static final BitSet FOLLOW_DIV__in_multExp539 = new BitSet(new long[]{0x0000000400002160L});
    public static final BitSet FOLLOW_notExp_in_multExp544 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_multExp_in_addExp567 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_15_in_addExp576 = new BitSet(new long[]{0x0000000400002160L});
    public static final BitSet FOLLOW_16_in_addExp580 = new BitSet(new long[]{0x0000000400002160L});
    public static final BitSet FOLLOW_multExp_in_addExp585 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_addExp_in_shiftExp608 = new BitSet(new long[]{0x0000000000880002L});
    public static final BitSet FOLLOW_19_in_shiftExp616 = new BitSet(new long[]{0x0000000400002160L});
    public static final BitSet FOLLOW_23_in_shiftExp622 = new BitSet(new long[]{0x0000000400002160L});
    public static final BitSet FOLLOW_addExp_in_shiftExp628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExp_in_cmpExp648 = new BitSet(new long[]{0x0000000000440002L});
    public static final BitSet FOLLOW_18_in_cmpExp658 = new BitSet(new long[]{0x0000000400002160L});
    public static final BitSet FOLLOW_22_in_cmpExp664 = new BitSet(new long[]{0x0000000400002160L});
    public static final BitSet FOLLOW_shiftExp_in_cmpExp670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cmpExp_in_eqlExp692 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_21_in_eqlExp701 = new BitSet(new long[]{0x0000000400002160L});
    public static final BitSet FOLLOW_10_in_eqlExp707 = new BitSet(new long[]{0x0000000400002160L});
    public static final BitSet FOLLOW_cmpExp_in_eqlExp713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eqlExp_in_bitAndExp735 = new BitSet(new long[]{0x0000004000001002L});
    public static final BitSet FOLLOW_12_in_bitAndExp744 = new BitSet(new long[]{0x0000000400002160L});
    public static final BitSet FOLLOW_38_in_bitAndExp750 = new BitSet(new long[]{0x0000000400002160L});
    public static final BitSet FOLLOW_eqlExp_in_bitAndExp756 = new BitSet(new long[]{0x0000004000001002L});
    public static final BitSet FOLLOW_bitAndExp_in_logicExp777 = new BitSet(new long[]{0x0000008000000802L});
    public static final BitSet FOLLOW_11_in_logicExp785 = new BitSet(new long[]{0x0000000400002160L});
    public static final BitSet FOLLOW_39_in_logicExp791 = new BitSet(new long[]{0x0000000400002160L});
    public static final BitSet FOLLOW_bitAndExp_in_logicExp797 = new BitSet(new long[]{0x0000008000000802L});
    public static final BitSet FOLLOW_logicExp_in_expression817 = new BitSet(new long[]{0x0000000000000002L});

}