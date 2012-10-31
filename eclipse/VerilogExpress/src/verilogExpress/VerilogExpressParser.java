// $ANTLR 3.4 C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g 2012-10-31 19:33:54

    package verilogExpress;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class VerilogExpressParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIV_", "INT", "NOT_", "TIMES_", "VAR", "WS", "'!='", "'&&'", "'&'", "'('", "')'", "'+'", "'-'", "';'", "'<'", "'<<'", "'='", "'=='", "'>'", "'>>'", "'['", "']'", "'const'", "'module'", "'pipe'", "'reg'", "'{'", "'|'", "'||'", "'}'"
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
    public String getGrammarFileName() { return "C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g"; }


    	DoBlock currentBlock = null;
    	int anonConstNum = 0;



    // $ANTLR start "system"
    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:20:1: system returns [VerilogSystem system] : moduleDec EOF ;
    public final VerilogSystem system() throws RecognitionException {
        VerilogSystem system = null;


        VerilogExpressParser.moduleDec_return moduleDec1 =null;


        try {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:21:2: ( moduleDec EOF )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:21:4: moduleDec EOF
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
    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:27:1: moduleDec returns [ VerilogFileModule module, String progName ] : 'module' VAR doBlock ;
    public final VerilogExpressParser.moduleDec_return moduleDec() throws RecognitionException {
        VerilogExpressParser.moduleDec_return retval = new VerilogExpressParser.moduleDec_return();
        retval.start = input.LT(1);


        Token VAR2=null;
        DoBlock doBlock3 =null;


        try {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:28:2: ( 'module' VAR doBlock )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:28:4: 'module' VAR doBlock
            {
            match(input,27,FOLLOW_27_in_moduleDec58); 

            VAR2=(Token)match(input,VAR,FOLLOW_VAR_in_moduleDec60); 

            pushFollow(FOLLOW_doBlock_in_moduleDec62);
            doBlock3=doBlock();

            state._fsp--;



            		retval.module = new VerilogFileModule( (VAR2!=null?VAR2.getText():null) + "_top" );
            		retval.module.setMainBody( doBlock3 );
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
    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:35:1: doBlock returns [ DoBlock block ] : ( parallelDoer | sequentualDoer );
    public final DoBlock doBlock() throws RecognitionException {
        DoBlock block = null;


        DoBlock parallelDoer4 =null;

        DoBlock sequentualDoer5 =null;


        try {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:36:2: ( parallelDoer | sequentualDoer )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            else if ( (LA1_0==30) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:37:3: parallelDoer
                    {
                    pushFollow(FOLLOW_parallelDoer_in_doBlock82);
                    parallelDoer4=parallelDoer();

                    state._fsp--;


                     block = parallelDoer4;  currentBlock = block.getParrent(); 

                    }
                    break;
                case 2 :
                    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:38:4: sequentualDoer
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
    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:41:1: parallelDoer returns [ DoBlock block ] : '[' ( doAble | varDec )+ ']' ;
    public final DoBlock parallelDoer() throws RecognitionException {
        DoBlock block = null;


        Doable doAble6 =null;


        try {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:42:2: ( '[' ( doAble | varDec )+ ']' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:42:4: '[' ( doAble | varDec )+ ']'
            {

            		block = new ParallelDoer();
            	   	block.setParrent( currentBlock );
            	   	currentBlock = block;
            	 

            match(input,24,FOLLOW_24_in_parallelDoer111); 

            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:47:7: ( doAble | varDec )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==VAR||LA2_0==24||LA2_0==30) ) {
                    alt2=1;
                }
                else if ( (LA2_0==26||(LA2_0 >= 28 && LA2_0 <= 29)) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:47:9: doAble
            	    {
            	    pushFollow(FOLLOW_doAble_in_parallelDoer115);
            	    doAble6=doAble();

            	    state._fsp--;


            	     block.appendDo( doAble6 ); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:48:5: varDec
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
    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:52:1: sequentualDoer returns [ DoBlock block ] : '{' ( doAble | varDec )+ '}' ;
    public final DoBlock sequentualDoer() throws RecognitionException {
        DoBlock block = null;


        Doable doAble7 =null;


        try {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:53:2: ( '{' ( doAble | varDec )+ '}' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:53:4: '{' ( doAble | varDec )+ '}'
            {

            		block = new SequentualDoer();
            	   	block.setParrent( currentBlock );
            	   	currentBlock = block;
            	 

            match(input,30,FOLLOW_30_in_sequentualDoer153); 

            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:58:7: ( doAble | varDec )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==VAR||LA3_0==24||LA3_0==30) ) {
                    alt3=1;
                }
                else if ( (LA3_0==26||(LA3_0 >= 28 && LA3_0 <= 29)) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:58:9: doAble
            	    {
            	    pushFollow(FOLLOW_doAble_in_sequentualDoer157);
            	    doAble7=doAble();

            	    state._fsp--;


            	     block.appendDo( doAble7 ); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:59:5: varDec
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


            match(input,33,FOLLOW_33_in_sequentualDoer170); 

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
    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:62:1: varDec : ( 'reg' VAR '=' INT ';' | 'pipe' VAR ';' | 'const' VAR '=' INT ';' );
    public final void varDec() throws RecognitionException {
        Token VAR8=null;
        Token INT9=null;
        Token VAR10=null;
        Token VAR11=null;
        Token INT12=null;

        try {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:63:2: ( 'reg' VAR '=' INT ';' | 'pipe' VAR ';' | 'const' VAR '=' INT ';' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt4=1;
                }
                break;
            case 28:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:63:4: 'reg' VAR '=' INT ';'
                    {
                    match(input,29,FOLLOW_29_in_varDec182); 

                    VAR8=(Token)match(input,VAR,FOLLOW_VAR_in_varDec184); 

                    match(input,20,FOLLOW_20_in_varDec186); 

                    INT9=(Token)match(input,INT,FOLLOW_INT_in_varDec188); 

                    match(input,17,FOLLOW_17_in_varDec190); 

                     new RegVar( (VAR8!=null?VAR8.getText():null), (INT9!=null?INT9.getText():null), currentBlock ); 

                    }
                    break;
                case 2 :
                    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:64:4: 'pipe' VAR ';'
                    {
                    match(input,28,FOLLOW_28_in_varDec197); 

                    VAR10=(Token)match(input,VAR,FOLLOW_VAR_in_varDec199); 

                    match(input,17,FOLLOW_17_in_varDec201); 

                     new PipeVar((VAR10!=null?VAR10.getText():null), currentBlock ); 

                    }
                    break;
                case 3 :
                    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:65:4: 'const' VAR '=' INT ';'
                    {
                    match(input,26,FOLLOW_26_in_varDec215); 

                    VAR11=(Token)match(input,VAR,FOLLOW_VAR_in_varDec217); 

                    match(input,20,FOLLOW_20_in_varDec219); 

                    INT12=(Token)match(input,INT,FOLLOW_INT_in_varDec221); 

                    match(input,17,FOLLOW_17_in_varDec223); 

                     new ConstVar( (VAR11!=null?VAR11.getText():null), (INT12!=null?INT12.getText():null), currentBlock ); 

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
    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:68:1: doAble returns [ Doable doable ] : ( doBlock | doAssign );
    public final Doable doAble() throws RecognitionException {
        Doable doable = null;


        DoBlock doBlock13 =null;

        DoAssign doAssign14 =null;


        try {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:69:2: ( doBlock | doAssign )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24||LA5_0==30) ) {
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
                    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:69:4: doBlock
                    {
                    pushFollow(FOLLOW_doBlock_in_doAble240);
                    doBlock13=doBlock();

                    state._fsp--;


                     doable = doBlock13; 

                    }
                    break;
                case 2 :
                    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:70:4: doAssign
                    {
                    pushFollow(FOLLOW_doAssign_in_doAble247);
                    doAssign14=doAssign();

                    state._fsp--;


                     doable = doAssign14; 

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
    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:75:1: doAssign returns [ DoAssign assignment ] : VAR '=' expression ';' ;
    public final DoAssign doAssign() throws RecognitionException {
        DoAssign assignment = null;


        Token VAR16=null;
        DataSource expression15 =null;


        try {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:76:2: ( VAR '=' expression ';' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:76:4: VAR '=' expression ';'
            {
            VAR16=(Token)match(input,VAR,FOLLOW_VAR_in_doAssign269); 

            match(input,20,FOLLOW_20_in_doAssign271); 

            pushFollow(FOLLOW_expression_in_doAssign273);
            expression15=expression();

            state._fsp--;


            match(input,17,FOLLOW_17_in_doAssign275); 

             
            		assignment = new DoAssign( expression15 );
            		Variable v = currentBlock.getVar( (VAR16!=null?VAR16.getText():null) );
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
    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:92:1: atom returns [ DataSource d ] : ( VAR | INT | '(' expression ')' );
    public final DataSource atom() throws RecognitionException {
        DataSource d = null;


        Token VAR17=null;
        Token INT18=null;
        DataSource expression19 =null;


        try {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:93:2: ( VAR | INT | '(' expression ')' )
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
                    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:93:4: VAR
                    {
                    VAR17=(Token)match(input,VAR,FOLLOW_VAR_in_atom302); 

                     d = currentBlock.getVar( VAR17.getText() ); 

                    }
                    break;
                case 2 :
                    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:94:4: INT
                    {
                    INT18=(Token)match(input,INT,FOLLOW_INT_in_atom309); 

                     d = new ConstVar( "AnonInt" + (anonConstNum++), INT18.getText(), currentBlock ); 

                    }
                    break;
                case 3 :
                    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:96:4: '(' expression ')'
                    {
                    match(input,13,FOLLOW_13_in_atom317); 

                    pushFollow(FOLLOW_expression_in_atom319);
                    expression19=expression();

                    state._fsp--;


                    match(input,14,FOLLOW_14_in_atom321); 

                    d = expression19; 

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
    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:101:1: notExp returns [ DataSource d ] : ( NOT_ )? atom ;
    public final DataSource notExp() throws RecognitionException {
        DataSource d = null;


        DataSource atom20 =null;


        try {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:102:2: ( ( NOT_ )? atom )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:102:4: ( NOT_ )? atom
            {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:102:4: ( NOT_ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==NOT_) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:102:4: NOT_
                    {
                    match(input,NOT_,FOLLOW_NOT__in_notExp340); 

                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_notExp343);
            atom20=atom();

            state._fsp--;


             d = new CalcUnaryOpperation( "!", atom20, currentBlock ); 

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
    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:105:1: multExp returns [ DataSource d ] : arg1= notExp ( (op= TIMES_ |op= DIV_ ) arg2= notExp )* ;
    public final DataSource multExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:106:2: (arg1= notExp ( (op= TIMES_ |op= DIV_ ) arg2= notExp )* )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:106:3: arg1= notExp ( (op= TIMES_ |op= DIV_ ) arg2= notExp )*
            {
            pushFollow(FOLLOW_notExp_in_multExp362);
            arg1=notExp();

            state._fsp--;


            d = arg1;

            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:106:28: ( (op= TIMES_ |op= DIV_ ) arg2= notExp )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==DIV_||LA9_0==TIMES_) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:106:30: (op= TIMES_ |op= DIV_ ) arg2= notExp
            	    {
            	    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:106:30: (op= TIMES_ |op= DIV_ )
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
            	            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:106:31: op= TIMES_
            	            {
            	            op=(Token)match(input,TIMES_,FOLLOW_TIMES__in_multExp371); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:106:41: op= DIV_
            	            {
            	            op=(Token)match(input,DIV_,FOLLOW_DIV__in_multExp375); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_notExp_in_multExp380);
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
    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:109:1: addExp returns [ DataSource d ] : arg1= multExp ( (op= '+' |op= '-' ) arg2= multExp )* ;
    public final DataSource addExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:110:2: (arg1= multExp ( (op= '+' |op= '-' ) arg2= multExp )* )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:110:4: arg1= multExp ( (op= '+' |op= '-' ) arg2= multExp )*
            {
            pushFollow(FOLLOW_multExp_in_addExp403);
            arg1=multExp();

            state._fsp--;


            d = arg1;

            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:110:30: ( (op= '+' |op= '-' ) arg2= multExp )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= 15 && LA11_0 <= 16)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:110:32: (op= '+' |op= '-' ) arg2= multExp
            	    {
            	    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:110:32: (op= '+' |op= '-' )
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
            	            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:110:33: op= '+'
            	            {
            	            op=(Token)match(input,15,FOLLOW_15_in_addExp412); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:110:40: op= '-'
            	            {
            	            op=(Token)match(input,16,FOLLOW_16_in_addExp416); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExp_in_addExp421);
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
    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:113:1: shiftExp returns [ DataSource d ] : arg1= addExp ( (op= '<<' |op= '>>' ) arg2= addExp )? ;
    public final DataSource shiftExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:114:2: (arg1= addExp ( (op= '<<' |op= '>>' ) arg2= addExp )? )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:114:4: arg1= addExp ( (op= '<<' |op= '>>' ) arg2= addExp )?
            {
            pushFollow(FOLLOW_addExp_in_shiftExp444);
            arg1=addExp();

            state._fsp--;


            d = arg1;

            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:114:28: ( (op= '<<' |op= '>>' ) arg2= addExp )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19||LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:114:29: (op= '<<' |op= '>>' ) arg2= addExp
                    {
                    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:114:29: (op= '<<' |op= '>>' )
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
                            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:114:31: op= '<<'
                            {
                            op=(Token)match(input,19,FOLLOW_19_in_shiftExp452); 

                            }
                            break;
                        case 2 :
                            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:114:41: op= '>>'
                            {
                            op=(Token)match(input,23,FOLLOW_23_in_shiftExp458); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_addExp_in_shiftExp464);
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
    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:117:1: cmpExp returns [ DataSource d ] : arg1= shiftExp ( (op= '<' |op= '>' ) arg2= shiftExp )? ;
    public final DataSource cmpExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:118:2: (arg1= shiftExp ( (op= '<' |op= '>' ) arg2= shiftExp )? )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:118:4: arg1= shiftExp ( (op= '<' |op= '>' ) arg2= shiftExp )?
            {
            pushFollow(FOLLOW_shiftExp_in_cmpExp484);
            arg1=shiftExp();

            state._fsp--;


            d = arg1;

            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:118:31: ( (op= '<' |op= '>' ) arg2= shiftExp )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18||LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:118:33: (op= '<' |op= '>' ) arg2= shiftExp
                    {
                    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:118:33: (op= '<' |op= '>' )
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
                            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:118:35: op= '<'
                            {
                            op=(Token)match(input,18,FOLLOW_18_in_cmpExp494); 

                            }
                            break;
                        case 2 :
                            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:118:44: op= '>'
                            {
                            op=(Token)match(input,22,FOLLOW_22_in_cmpExp500); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_shiftExp_in_cmpExp506);
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
    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:121:1: eqlExp returns [ DataSource d ] : arg1= cmpExp ( (op= '==' |op= '!=' ) arg2= cmpExp )? ;
    public final DataSource eqlExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:122:2: (arg1= cmpExp ( (op= '==' |op= '!=' ) arg2= cmpExp )? )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:122:4: arg1= cmpExp ( (op= '==' |op= '!=' ) arg2= cmpExp )?
            {
            pushFollow(FOLLOW_cmpExp_in_eqlExp528);
            arg1=cmpExp();

            state._fsp--;


            d = arg1;

            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:122:28: ( (op= '==' |op= '!=' ) arg2= cmpExp )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==10||LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:122:30: (op= '==' |op= '!=' ) arg2= cmpExp
                    {
                    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:122:30: (op= '==' |op= '!=' )
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
                            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:122:32: op= '=='
                            {
                            op=(Token)match(input,21,FOLLOW_21_in_eqlExp537); 

                            }
                            break;
                        case 2 :
                            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:122:42: op= '!='
                            {
                            op=(Token)match(input,10,FOLLOW_10_in_eqlExp543); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_cmpExp_in_eqlExp549);
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
    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:125:1: bitAndExp returns [ DataSource d ] : arg1= eqlExp ( (op= '&' |op= '|' ) arg2= eqlExp )* ;
    public final DataSource bitAndExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:126:2: (arg1= eqlExp ( (op= '&' |op= '|' ) arg2= eqlExp )* )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:126:4: arg1= eqlExp ( (op= '&' |op= '|' ) arg2= eqlExp )*
            {
            pushFollow(FOLLOW_eqlExp_in_bitAndExp571);
            arg1=eqlExp();

            state._fsp--;


            d = arg1;

            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:126:28: ( (op= '&' |op= '|' ) arg2= eqlExp )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==12||LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:126:30: (op= '&' |op= '|' ) arg2= eqlExp
            	    {
            	    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:126:30: (op= '&' |op= '|' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==12) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==31) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:126:32: op= '&'
            	            {
            	            op=(Token)match(input,12,FOLLOW_12_in_bitAndExp580); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:126:41: op= '|'
            	            {
            	            op=(Token)match(input,31,FOLLOW_31_in_bitAndExp586); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_eqlExp_in_bitAndExp592);
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
    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:129:1: logicExp returns [ DataSource d ] : arg1= bitAndExp ( (op= '&&' |op= '||' ) arg2= bitAndExp )* ;
    public final DataSource logicExp() throws RecognitionException {
        DataSource d = null;


        Token op=null;
        DataSource arg1 =null;

        DataSource arg2 =null;


        try {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:130:2: (arg1= bitAndExp ( (op= '&&' |op= '||' ) arg2= bitAndExp )* )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:130:4: arg1= bitAndExp ( (op= '&&' |op= '||' ) arg2= bitAndExp )*
            {
            pushFollow(FOLLOW_bitAndExp_in_logicExp613);
            arg1=bitAndExp();

            state._fsp--;


            d = arg1;

            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:130:31: ( (op= '&&' |op= '||' ) arg2= bitAndExp )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==11||LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:130:33: (op= '&&' |op= '||' ) arg2= bitAndExp
            	    {
            	    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:130:33: (op= '&&' |op= '||' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==11) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==32) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:130:34: op= '&&'
            	            {
            	            op=(Token)match(input,11,FOLLOW_11_in_logicExp621); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:130:44: op= '||'
            	            {
            	            op=(Token)match(input,32,FOLLOW_32_in_logicExp627); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_bitAndExp_in_logicExp633);
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
    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:133:1: expression returns [ DataSource d ] : logicExp ;
    public final DataSource expression() throws RecognitionException {
        DataSource d = null;


        DataSource logicExp21 =null;


        try {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:134:2: ( logicExp )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:134:4: logicExp
            {
            pushFollow(FOLLOW_logicExp_in_expression653);
            logicExp21=logicExp();

            state._fsp--;


             d = logicExp21; 

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
    public static final BitSet FOLLOW_VAR_in_moduleDec60 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_doBlock_in_moduleDec62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parallelDoer_in_doBlock82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequentualDoer_in_doBlock89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parallelDoer111 = new BitSet(new long[]{0x0000000075000100L});
    public static final BitSet FOLLOW_doAble_in_parallelDoer115 = new BitSet(new long[]{0x0000000077000100L});
    public static final BitSet FOLLOW_varDec_in_parallelDoer124 = new BitSet(new long[]{0x0000000077000100L});
    public static final BitSet FOLLOW_25_in_parallelDoer129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_sequentualDoer153 = new BitSet(new long[]{0x0000000075000100L});
    public static final BitSet FOLLOW_doAble_in_sequentualDoer157 = new BitSet(new long[]{0x0000000275000100L});
    public static final BitSet FOLLOW_varDec_in_sequentualDoer166 = new BitSet(new long[]{0x0000000275000100L});
    public static final BitSet FOLLOW_33_in_sequentualDoer170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_varDec182 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_VAR_in_varDec184 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_varDec186 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_varDec188 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_varDec190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_varDec197 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_VAR_in_varDec199 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_varDec201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_varDec215 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_VAR_in_varDec217 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_varDec219 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_varDec221 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_varDec223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doBlock_in_doAble240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doAssign_in_doAble247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_doAssign269 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_doAssign271 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_expression_in_doAssign273 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_doAssign275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_atom302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_atom317 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_expression_in_atom319 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_atom321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT__in_notExp340 = new BitSet(new long[]{0x0000000000002120L});
    public static final BitSet FOLLOW_atom_in_notExp343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExp_in_multExp362 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_TIMES__in_multExp371 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_DIV__in_multExp375 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_notExp_in_multExp380 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_multExp_in_addExp403 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_15_in_addExp412 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_16_in_addExp416 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_multExp_in_addExp421 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_addExp_in_shiftExp444 = new BitSet(new long[]{0x0000000000880002L});
    public static final BitSet FOLLOW_19_in_shiftExp452 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_23_in_shiftExp458 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_addExp_in_shiftExp464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExp_in_cmpExp484 = new BitSet(new long[]{0x0000000000440002L});
    public static final BitSet FOLLOW_18_in_cmpExp494 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_22_in_cmpExp500 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_shiftExp_in_cmpExp506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cmpExp_in_eqlExp528 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_21_in_eqlExp537 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_10_in_eqlExp543 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_cmpExp_in_eqlExp549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eqlExp_in_bitAndExp571 = new BitSet(new long[]{0x0000000080001002L});
    public static final BitSet FOLLOW_12_in_bitAndExp580 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_31_in_bitAndExp586 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_eqlExp_in_bitAndExp592 = new BitSet(new long[]{0x0000000080001002L});
    public static final BitSet FOLLOW_bitAndExp_in_logicExp613 = new BitSet(new long[]{0x0000000100000802L});
    public static final BitSet FOLLOW_11_in_logicExp621 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_32_in_logicExp627 = new BitSet(new long[]{0x0000000000002160L});
    public static final BitSet FOLLOW_bitAndExp_in_logicExp633 = new BitSet(new long[]{0x0000000100000802L});
    public static final BitSet FOLLOW_logicExp_in_expression653 = new BitSet(new long[]{0x0000000000000002L});

}