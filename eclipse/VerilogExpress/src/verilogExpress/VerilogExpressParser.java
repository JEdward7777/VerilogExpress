<<<<<<< HEAD
// $ANTLR 3.4 C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g 2012-11-02 12:40:39
=======
// $ANTLR 3.4 C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g 2012-10-31 19:33:54
>>>>>>> origin/master

    package verilogExpress;
    
    import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class VerilogExpressParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIV_", "INT", "NOT_", "TIMES_", "VAR", "WS", "'!='", "'&&'", "'&'", "'('", "')'", "'+'", "'-'", "';'", "'<'", "'<<'", "'='", "'=='", "'>'", "'>>'", "'['", "']'", "'const'", "'module'", "'output'", "'pipe'", "'reg'", "'{'", "'|'", "'||'", "'}'"
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
    public String getGrammarFileName() { return "C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g"; }


    	DoBlock currentBlock = null;
    	int anonConstNum = 0;
    	LinkedList< OutputPort > outputPorts = new LinkedList< OutputPort >();
    	//LinkedList< InputPort >  inputPorts  = new LinkedList< InputPort  >();



    // $ANTLR start "system"
    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:24:1: system returns [VerilogSystem system] : moduleDec EOF ;
    public final VerilogSystem system() throws RecognitionException {
        VerilogSystem system = null;


        VerilogExpressParser.moduleDec_return moduleDec1 =null;


        try {
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:25:2: ( moduleDec EOF )
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:25:4: moduleDec EOF
            {
            pushFollow(FOLLOW_moduleDec_in_system39);
            moduleDec1=moduleDec();

            state._fsp--;


            match(input,EOF,FOLLOW_EOF_in_system41); 

             
            			system = new VerilogSystem( (moduleDec1!=null?moduleDec1.progName:null) );
            			system.setTopLevel( (moduleDec1!=null?moduleDec1.module:null) );
            		 

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
    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:31:1: moduleDec returns [ VerilogFileModule module, String progName ] : 'module' VAR doBlock ;
    public final VerilogExpressParser.moduleDec_return moduleDec() throws RecognitionException {
        VerilogExpressParser.moduleDec_return retval = new VerilogExpressParser.moduleDec_return();
        retval.start = input.LT(1);


        Token VAR2=null;
        DoBlock doBlock3 =null;


        try {
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:32:2: ( 'module' VAR doBlock )
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:32:4: 'module' VAR doBlock
            {
            match(input,27,FOLLOW_27_in_moduleDec58); 

            VAR2=(Token)match(input,VAR,FOLLOW_VAR_in_moduleDec60); 

            pushFollow(FOLLOW_doBlock_in_moduleDec62);
            doBlock3=doBlock();

            state._fsp--;



            		retval.module = new VerilogFileModule( (VAR2!=null?VAR2.getText():null) + "_top" );
            		retval.module.setMainBody( doBlock3 );
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
    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:42:1: doBlock returns [ DoBlock block ] : ( parallelDoer | sequentualDoer );
    public final DoBlock doBlock() throws RecognitionException {
        DoBlock block = null;


        DoBlock parallelDoer4 =null;

        DoBlock sequentualDoer5 =null;


        try {
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:43:2: ( parallelDoer | sequentualDoer )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            else if ( (LA1_0==31) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:44:3: parallelDoer
                    {
                    pushFollow(FOLLOW_parallelDoer_in_doBlock82);
                    parallelDoer4=parallelDoer();

                    state._fsp--;


                     block = parallelDoer4;  currentBlock = block.getParrent(); 

                    }
                    break;
                case 2 :
                    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:45:4: sequentualDoer
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
    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:48:1: parallelDoer returns [ DoBlock block ] : '[' ( doAble | varDec )+ ']' ;
    public final DoBlock parallelDoer() throws RecognitionException {
        DoBlock block = null;


        Doable doAble6 =null;


        try {
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:49:2: ( '[' ( doAble | varDec )+ ']' )
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:49:4: '[' ( doAble | varDec )+ ']'
            {

            		block = new ParallelDoer();
            	   	block.setParrent( currentBlock );
            	   	currentBlock = block;
            	 

            match(input,24,FOLLOW_24_in_parallelDoer111); 

            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:54:7: ( doAble | varDec )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==VAR||LA2_0==24||LA2_0==31) ) {
                    alt2=1;
                }
                else if ( (LA2_0==26||(LA2_0 >= 28 && LA2_0 <= 30)) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:54:9: doAble
            	    {
            	    pushFollow(FOLLOW_doAble_in_parallelDoer115);
            	    doAble6=doAble();

            	    state._fsp--;


            	     block.appendDo( doAble6 ); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:55:5: varDec
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
    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:59:1: sequentualDoer returns [ DoBlock block ] : '{' ( doAble | varDec )+ '}' ;
    public final DoBlock sequentualDoer() throws RecognitionException {
        DoBlock block = null;


        Doable doAble7 =null;


        try {
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:60:2: ( '{' ( doAble | varDec )+ '}' )
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:60:4: '{' ( doAble | varDec )+ '}'
            {

            		block = new SequentualDoer();
            	   	block.setParrent( currentBlock );
            	   	currentBlock = block;
            	 

            match(input,31,FOLLOW_31_in_sequentualDoer153); 

            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:65:7: ( doAble | varDec )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==VAR||LA3_0==24||LA3_0==31) ) {
                    alt3=1;
                }
                else if ( (LA3_0==26||(LA3_0 >= 28 && LA3_0 <= 30)) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:65:9: doAble
            	    {
            	    pushFollow(FOLLOW_doAble_in_sequentualDoer157);
            	    doAble7=doAble();

            	    state._fsp--;


            	     block.appendDo( doAble7 ); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:66:5: varDec
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


            match(input,34,FOLLOW_34_in_sequentualDoer170); 

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
    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:69:1: varDec : ( 'reg' VAR '=' INT ';' | 'pipe' VAR ';' | 'const' VAR '=' INT ';' | 'output' VAR ';' );
    public final void varDec() throws RecognitionException {
        Token VAR8=null;
        Token INT9=null;
        Token VAR10=null;
        Token VAR11=null;
        Token INT12=null;
        Token VAR13=null;

        try {
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:70:2: ( 'reg' VAR '=' INT ';' | 'pipe' VAR ';' | 'const' VAR '=' INT ';' | 'output' VAR ';' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            case 28:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:70:4: 'reg' VAR '=' INT ';'
                    {
                    match(input,30,FOLLOW_30_in_varDec182); 

                    VAR8=(Token)match(input,VAR,FOLLOW_VAR_in_varDec184); 

                    match(input,20,FOLLOW_20_in_varDec186); 

                    INT9=(Token)match(input,INT,FOLLOW_INT_in_varDec188); 

                    match(input,17,FOLLOW_17_in_varDec190); 

                     new RegVar( (VAR8!=null?VAR8.getText():null), (INT9!=null?INT9.getText():null), currentBlock ); 

                    }
                    break;
                case 2 :
                    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:71:4: 'pipe' VAR ';'
                    {
                    match(input,29,FOLLOW_29_in_varDec197); 

                    VAR10=(Token)match(input,VAR,FOLLOW_VAR_in_varDec199); 

                    match(input,17,FOLLOW_17_in_varDec201); 

                     new PipeVar((VAR10!=null?VAR10.getText():null), currentBlock ); 

                    }
                    break;
                case 3 :
                    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:72:4: 'const' VAR '=' INT ';'
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
                    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:73:4: 'output' VAR ';'
                    {
                    match(input,28,FOLLOW_28_in_varDec229); 

                    VAR13=(Token)match(input,VAR,FOLLOW_VAR_in_varDec231); 

                    match(input,17,FOLLOW_17_in_varDec233); 

                     
                    		OutputPort newOutput = new OutputPort( (VAR13!=null?VAR13.getText():null) ); 
                    		outputPorts.add( newOutput );
                    	

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
    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:79:1: doAble returns [ Doable doable ] : ( doBlock | doAssign );
    public final Doable doAble() throws RecognitionException {
        Doable doable = null;


        DoBlock doBlock14 =null;

        DoAssign doAssign15 =null;


        try {
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:80:2: ( doBlock | doAssign )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24||LA5_0==31) ) {
                alt5=1;
            }
            else if ( (LA5_0==VAR) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:80:4: doBlock
                    {
                    pushFollow(FOLLOW_doBlock_in_doAble256);
                    doBlock14=doBlock();

                    state._fsp--;


                     doable = doBlock14; 

                    }
                    break;
                case 2 :
                    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:81:4: doAssign
                    {
                    pushFollow(FOLLOW_doAssign_in_doAble263);
                    doAssign15=doAssign();

                    state._fsp--;


                     doable = doAssign15; 

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



    // $ANTLR start "doAssign"
    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:86:1: doAssign returns [ DoAssign assignment ] : VAR '=' expression ';' ;
    public final DoAssign doAssign() throws RecognitionException {
        DoAssign assignment = null;


        Token VAR17=null;
        DataSource expression16 =null;


        try {
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:87:2: ( VAR '=' expression ';' )
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:87:4: VAR '=' expression ';'
            {
            VAR17=(Token)match(input,VAR,FOLLOW_VAR_in_doAssign285); 

            match(input,20,FOLLOW_20_in_doAssign287); 

            pushFollow(FOLLOW_expression_in_doAssign289);
            expression16=expression();

            state._fsp--;


            match(input,17,FOLLOW_17_in_doAssign291); 

             
            		assignment = new DoAssign( expression16 );
            		Variable v = currentBlock.getVar( (VAR17!=null?VAR17.getText():null) );
            		v.connectDataSource( assignment );
            		

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



    // $ANTLR start "atom"
    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:103:1: atom returns [ DataSource d ] : ( VAR | INT | '(' expression ')' );
    public final DataSource atom() throws RecognitionException {
        DataSource d = null;


        Token VAR18=null;
        Token INT19=null;
        DataSource expression20 =null;


        try {
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:104:2: ( VAR | INT | '(' expression ')' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt6=1;
                }
                break;
            case INT:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:104:4: VAR
                    {
                    VAR18=(Token)match(input,VAR,FOLLOW_VAR_in_atom318); 

                     d = currentBlock.getVar( VAR18.getText() ); 

                    }
                    break;
                case 2 :
                    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:105:4: INT
                    {
                    INT19=(Token)match(input,INT,FOLLOW_INT_in_atom325); 

                     d = new ConstVar( "AnonInt" + (anonConstNum++), INT19.getText(), currentBlock ); 

                    }
                    break;
                case 3 :
                    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:107:4: '(' expression ')'
                    {
                    match(input,13,FOLLOW_13_in_atom333); 

                    pushFollow(FOLLOW_expression_in_atom335);
                    expression20=expression();

                    state._fsp--;


                    match(input,14,FOLLOW_14_in_atom337); 

                    d = expression20; 

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
    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:112:1: notExp returns [ DataSource d ] : ( NOT_ )? atom ;
    public final DataSource notExp() throws RecognitionException {
        DataSource d = null;


        DataSource atom21 =null;


        try {
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:113:2: ( ( NOT_ )? atom )
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:113:4: ( NOT_ )? atom
            {
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:113:4: ( NOT_ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==NOT_) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:113:4: NOT_
                    {
                    match(input,NOT_,FOLLOW_NOT__in_notExp356); 

                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_notExp359);
            atom21=atom();

            state._fsp--;


             d = new CalcUnaryOpperation( "!", atom21, currentBlock ); 

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
    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:116:1: multExp returns [ DataSource d ] : arg1= notExp ( (op= TIMES_ |op= DIV_ ) arg2= notExp )* ;
    public final DataSource multExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:117:2: (arg1= notExp ( (op= TIMES_ |op= DIV_ ) arg2= notExp )* )
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:117:3: arg1= notExp ( (op= TIMES_ |op= DIV_ ) arg2= notExp )*
            {
            pushFollow(FOLLOW_notExp_in_multExp378);
            arg1=notExp();

            state._fsp--;


            d = arg1;

            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:117:28: ( (op= TIMES_ |op= DIV_ ) arg2= notExp )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==DIV_||LA9_0==TIMES_) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:117:30: (op= TIMES_ |op= DIV_ ) arg2= notExp
            	    {
            	    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:117:30: (op= TIMES_ |op= DIV_ )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==TIMES_) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==DIV_) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:117:31: op= TIMES_
            	            {
            	            op=(Token)match(input,TIMES_,FOLLOW_TIMES__in_multExp387); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:117:41: op= DIV_
            	            {
            	            op=(Token)match(input,DIV_,FOLLOW_DIV__in_multExp391); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_notExp_in_multExp396);
            	    arg2=notExp();

            	    state._fsp--;


            	     d = new CalcBinaryOpperation( op.getText(), d, arg2, currentBlock ); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:120:1: addExp returns [ DataSource d ] : arg1= multExp ( (op= '+' |op= '-' ) arg2= multExp )* ;
    public final DataSource addExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:121:2: (arg1= multExp ( (op= '+' |op= '-' ) arg2= multExp )* )
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:121:4: arg1= multExp ( (op= '+' |op= '-' ) arg2= multExp )*
            {
            pushFollow(FOLLOW_multExp_in_addExp419);
            arg1=multExp();

            state._fsp--;


            d = arg1;

            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:121:30: ( (op= '+' |op= '-' ) arg2= multExp )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= 15 && LA11_0 <= 16)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:121:32: (op= '+' |op= '-' ) arg2= multExp
            	    {
            	    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:121:32: (op= '+' |op= '-' )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==15) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==16) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:121:33: op= '+'
            	            {
            	            op=(Token)match(input,15,FOLLOW_15_in_addExp428); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:121:40: op= '-'
            	            {
            	            op=(Token)match(input,16,FOLLOW_16_in_addExp432); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExp_in_addExp437);
            	    arg2=multExp();

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
    // $ANTLR end "addExp"



    // $ANTLR start "shiftExp"
    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:124:1: shiftExp returns [ DataSource d ] : arg1= addExp ( (op= '<<' |op= '>>' ) arg2= addExp )? ;
    public final DataSource shiftExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:125:2: (arg1= addExp ( (op= '<<' |op= '>>' ) arg2= addExp )? )
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:125:4: arg1= addExp ( (op= '<<' |op= '>>' ) arg2= addExp )?
            {
            pushFollow(FOLLOW_addExp_in_shiftExp460);
            arg1=addExp();

            state._fsp--;


            d = arg1;

            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:125:28: ( (op= '<<' |op= '>>' ) arg2= addExp )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19||LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:125:29: (op= '<<' |op= '>>' ) arg2= addExp
                    {
                    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:125:29: (op= '<<' |op= '>>' )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==19) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==23) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;

                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:125:31: op= '<<'
                            {
                            op=(Token)match(input,19,FOLLOW_19_in_shiftExp468); 

                            }
                            break;
                        case 2 :
                            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:125:41: op= '>>'
                            {
                            op=(Token)match(input,23,FOLLOW_23_in_shiftExp474); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_addExp_in_shiftExp480);
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
    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:128:1: cmpExp returns [ DataSource d ] : arg1= shiftExp ( (op= '<' |op= '>' ) arg2= shiftExp )? ;
    public final DataSource cmpExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:129:2: (arg1= shiftExp ( (op= '<' |op= '>' ) arg2= shiftExp )? )
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:129:4: arg1= shiftExp ( (op= '<' |op= '>' ) arg2= shiftExp )?
            {
            pushFollow(FOLLOW_shiftExp_in_cmpExp500);
            arg1=shiftExp();

            state._fsp--;


            d = arg1;

            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:129:31: ( (op= '<' |op= '>' ) arg2= shiftExp )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18||LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:129:33: (op= '<' |op= '>' ) arg2= shiftExp
                    {
                    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:129:33: (op= '<' |op= '>' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==18) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==22) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;

                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:129:35: op= '<'
                            {
                            op=(Token)match(input,18,FOLLOW_18_in_cmpExp510); 

                            }
                            break;
                        case 2 :
                            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:129:44: op= '>'
                            {
                            op=(Token)match(input,22,FOLLOW_22_in_cmpExp516); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_shiftExp_in_cmpExp522);
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
    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:132:1: eqlExp returns [ DataSource d ] : arg1= cmpExp ( (op= '==' |op= '!=' ) arg2= cmpExp )? ;
    public final DataSource eqlExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:133:2: (arg1= cmpExp ( (op= '==' |op= '!=' ) arg2= cmpExp )? )
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:133:4: arg1= cmpExp ( (op= '==' |op= '!=' ) arg2= cmpExp )?
            {
            pushFollow(FOLLOW_cmpExp_in_eqlExp544);
            arg1=cmpExp();

            state._fsp--;


            d = arg1;

            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:133:28: ( (op= '==' |op= '!=' ) arg2= cmpExp )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==10||LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:133:30: (op= '==' |op= '!=' ) arg2= cmpExp
                    {
                    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:133:30: (op= '==' |op= '!=' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==21) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==10) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;

                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:133:32: op= '=='
                            {
                            op=(Token)match(input,21,FOLLOW_21_in_eqlExp553); 

                            }
                            break;
                        case 2 :
                            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:133:42: op= '!='
                            {
                            op=(Token)match(input,10,FOLLOW_10_in_eqlExp559); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_cmpExp_in_eqlExp565);
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
    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:136:1: bitAndExp returns [ DataSource d ] : arg1= eqlExp ( (op= '&' |op= '|' ) arg2= eqlExp )* ;
    public final DataSource bitAndExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:137:2: (arg1= eqlExp ( (op= '&' |op= '|' ) arg2= eqlExp )* )
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:137:4: arg1= eqlExp ( (op= '&' |op= '|' ) arg2= eqlExp )*
            {
            pushFollow(FOLLOW_eqlExp_in_bitAndExp587);
            arg1=eqlExp();

            state._fsp--;


            d = arg1;

            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:137:28: ( (op= '&' |op= '|' ) arg2= eqlExp )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==12||LA19_0==32) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:137:30: (op= '&' |op= '|' ) arg2= eqlExp
            	    {
            	    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:137:30: (op= '&' |op= '|' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==12) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==32) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:137:32: op= '&'
            	            {
            	            op=(Token)match(input,12,FOLLOW_12_in_bitAndExp596); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:137:41: op= '|'
            	            {
            	            op=(Token)match(input,32,FOLLOW_32_in_bitAndExp602); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_eqlExp_in_bitAndExp608);
            	    arg2=eqlExp();

            	    state._fsp--;


            	    d =new CalcBinaryOpperation( op.getText(), d, arg2, currentBlock );

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:140:1: logicExp returns [ DataSource d ] : arg1= bitAndExp ( (op= '&&' |op= '||' ) arg2= bitAndExp )* ;
    public final DataSource logicExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:141:2: (arg1= bitAndExp ( (op= '&&' |op= '||' ) arg2= bitAndExp )* )
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:141:4: arg1= bitAndExp ( (op= '&&' |op= '||' ) arg2= bitAndExp )*
            {
            pushFollow(FOLLOW_bitAndExp_in_logicExp629);
            arg1=bitAndExp();

            state._fsp--;


            d = arg1;

            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:141:31: ( (op= '&&' |op= '||' ) arg2= bitAndExp )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==11||LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:141:33: (op= '&&' |op= '||' ) arg2= bitAndExp
            	    {
            	    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:141:33: (op= '&&' |op= '||' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==11) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==33) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:141:34: op= '&&'
            	            {
            	            op=(Token)match(input,11,FOLLOW_11_in_logicExp637); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:141:44: op= '||'
            	            {
            	            op=(Token)match(input,33,FOLLOW_33_in_logicExp643); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_bitAndExp_in_logicExp649);
            	    arg2=bitAndExp();

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
    // $ANTLR end "logicExp"



    // $ANTLR start "expression"
    // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:144:1: expression returns [ DataSource d ] : logicExp ;
    public final DataSource expression() throws RecognitionException {
        DataSource d = null;


        DataSource logicExp22 =null;


        try {
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:145:2: ( logicExp )
            // C:\\Shared_Docs\\lunch\\veGit\\VEGit\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:145:4: logicExp
            {
            pushFollow(FOLLOW_logicExp_in_expression669);
            logicExp22=logicExp();

            state._fsp--;


             d = logicExp22; 

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
    public static final BitSet FOLLOW_27_in_moduleDec58 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_VAR_in_moduleDec60 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_doBlock_in_moduleDec62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parallelDoer_in_doBlock82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequentualDoer_in_doBlock89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parallelDoer111 = new BitSet(new long[]{0x00000000F5000100L});
    public static final BitSet FOLLOW_doAble_in_parallelDoer115 = new BitSet(new long[]{0x00000000F7000100L});
    public static final BitSet FOLLOW_varDec_in_parallelDoer124 = new BitSet(new long[]{0x00000000F7000100L});
    public static final BitSet FOLLOW_25_in_parallelDoer129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_sequentualDoer153 = new BitSet(new long[]{0x00000000F5000100L});
    public static final BitSet FOLLOW_doAble_in_sequentualDoer157 = new BitSet(new long[]{0x00000004F5000100L});
    public static final BitSet FOLLOW_varDec_in_sequentualDoer166 = new BitSet(new long[]{0x00000004F5000100L});
    public static final BitSet FOLLOW_34_in_sequentualDoer170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_varDec182 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_VAR_in_varDec184 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_varDec186 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_varDec188 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_varDec190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_varDec197 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_VAR_in_varDec199 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_varDec201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_varDec215 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_VAR_in_varDec217 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_varDec219 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_varDec221 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_varDec223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_varDec229 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_VAR_in_varDec231 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_varDec233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doBlock_in_doAble256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doAssign_in_doAble263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_doAssign285 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_doAssign287 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_expression_in_doAssign289 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_doAssign291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_atom318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_atom333 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_expression_in_atom335 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_atom337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT__in_notExp356 = new BitSet(new long[]{0x0000000000002120L});
    public static final BitSet FOLLOW_atom_in_notExp359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExp_in_multExp378 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_TIMES__in_multExp387 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_DIV__in_multExp391 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_notExp_in_multExp396 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_multExp_in_addExp419 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_15_in_addExp428 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_16_in_addExp432 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_multExp_in_addExp437 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_addExp_in_shiftExp460 = new BitSet(new long[]{0x0000000000880002L});
    public static final BitSet FOLLOW_19_in_shiftExp468 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_23_in_shiftExp474 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_addExp_in_shiftExp480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExp_in_cmpExp500 = new BitSet(new long[]{0x0000000000440002L});
    public static final BitSet FOLLOW_18_in_cmpExp510 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_22_in_cmpExp516 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_shiftExp_in_cmpExp522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cmpExp_in_eqlExp544 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_21_in_eqlExp553 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_10_in_eqlExp559 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_cmpExp_in_eqlExp565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eqlExp_in_bitAndExp587 = new BitSet(new long[]{0x0000000100001002L});
    public static final BitSet FOLLOW_12_in_bitAndExp596 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_32_in_bitAndExp602 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_eqlExp_in_bitAndExp608 = new BitSet(new long[]{0x0000000100001002L});
    public static final BitSet FOLLOW_bitAndExp_in_logicExp629 = new BitSet(new long[]{0x0000000200000802L});
    public static final BitSet FOLLOW_11_in_logicExp637 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_33_in_logicExp643 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_bitAndExp_in_logicExp649 = new BitSet(new long[]{0x0000000200000802L});
    public static final BitSet FOLLOW_logicExp_in_expression669 = new BitSet(new long[]{0x0000000000000002L});

}