package verilogExpress;



import org.antlr.runtime.*;

//http://www.irisa.fr/caps/people/hardy/m1comp/doc/trees.html
//shows how to make ANTLR actually return something. Might be just for a previouse version of ANTLR

//http://www.antlr.org/wiki/display/ANTLR3/Migrating+from+ANTLR+2+to+ANTLR+3
//This helps me migrate that information to ANTLR 3

//http://www.antlr.org/wiki/display/ANTLR3/Parsing+XML
//might be a better page describing on how to produce and AST

public class Main {
    public static void main(String args[]) throws Exception {
    	if( args.length != 1 ) throw new Exception( "Must reference ve source" );
    	
        VerilogExpressLexer lex = new VerilogExpressLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);
 
        VerilogExpressParser parser = new VerilogExpressParser(tokens); // created from T.g
        VerilogSystem system = parser.system(); // launch parsing

		VerilogFileModule module = system.getTopLevel();
		System.out.println(module.generateSource(""));
             
    }
}

