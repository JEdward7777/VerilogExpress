// $ANTLR 3.4 C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g 2012-10-31 19:33:55

    package verilogExpress;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class VerilogExpressLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public VerilogExpressLexer() {} 
    public VerilogExpressLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public VerilogExpressLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:6:7: ( '!=' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:6:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:7:7: ( '&&' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:7:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:8:7: ( '&' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:8:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:9:7: ( '(' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:9:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:10:7: ( ')' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:10:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:11:7: ( '+' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:11:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:12:7: ( '-' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:12:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:13:7: ( ';' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:13:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:14:7: ( '<' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:14:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:15:7: ( '<<' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:15:9: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:16:7: ( '=' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:16:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:17:7: ( '==' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:17:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:18:7: ( '>' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:18:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:19:7: ( '>>' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:19:9: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:20:7: ( '[' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:20:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:21:7: ( ']' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:21:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:22:7: ( 'const' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:22:9: 'const'
            {
            match("const"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:23:7: ( 'module' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:23:9: 'module'
            {
            match("module"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:24:7: ( 'pipe' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:24:9: 'pipe'
            {
            match("pipe"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:25:7: ( 'reg' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:25:9: 'reg'
            {
            match("reg"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:26:7: ( '{' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:26:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:27:7: ( '|' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:27:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:28:7: ( '||' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:28:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:29:7: ( '}' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:29:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "NOT_"
    public final void mNOT_() throws RecognitionException {
        try {
            int _type = NOT_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:138:7: ( '!' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:138:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_"

    // $ANTLR start "TIMES_"
    public final void mTIMES_() throws RecognitionException {
        try {
            int _type = TIMES_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:139:8: ( '*' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:139:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TIMES_"

    // $ANTLR start "DIV_"
    public final void mDIV_() throws RecognitionException {
        try {
            int _type = DIV_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:140:6: ( '/' )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:140:8: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV_"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:142:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:142:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:142:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:145:5: ( ( '0' .. '9' )+ )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:145:7: ( '0' .. '9' )+
            {
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:145:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:162:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:162:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | NOT_ | TIMES_ | DIV_ | VAR | INT | WS )
        int alt3=30;
        switch ( input.LA(1) ) {
        case '!':
            {
            int LA3_1 = input.LA(2);

            if ( (LA3_1=='=') ) {
                alt3=1;
            }
            else {
                alt3=25;
            }
            }
            break;
        case '&':
            {
            int LA3_2 = input.LA(2);

            if ( (LA3_2=='&') ) {
                alt3=2;
            }
            else {
                alt3=3;
            }
            }
            break;
        case '(':
            {
            alt3=4;
            }
            break;
        case ')':
            {
            alt3=5;
            }
            break;
        case '+':
            {
            alt3=6;
            }
            break;
        case '-':
            {
            alt3=7;
            }
            break;
        case ';':
            {
            alt3=8;
            }
            break;
        case '<':
            {
            int LA3_8 = input.LA(2);

            if ( (LA3_8=='<') ) {
                alt3=10;
            }
            else {
                alt3=9;
            }
            }
            break;
        case '=':
            {
            int LA3_9 = input.LA(2);

            if ( (LA3_9=='=') ) {
                alt3=12;
            }
            else {
                alt3=11;
            }
            }
            break;
        case '>':
            {
            int LA3_10 = input.LA(2);

            if ( (LA3_10=='>') ) {
                alt3=14;
            }
            else {
                alt3=13;
            }
            }
            break;
        case '[':
            {
            alt3=15;
            }
            break;
        case ']':
            {
            alt3=16;
            }
            break;
        case 'c':
            {
            int LA3_13 = input.LA(2);

            if ( (LA3_13=='o') ) {
                int LA3_35 = input.LA(3);

                if ( (LA3_35=='n') ) {
                    int LA3_41 = input.LA(4);

                    if ( (LA3_41=='s') ) {
                        int LA3_45 = input.LA(5);

                        if ( (LA3_45=='t') ) {
                            int LA3_49 = input.LA(6);

                            if ( ((LA3_49 >= '0' && LA3_49 <= '9')||(LA3_49 >= 'A' && LA3_49 <= 'Z')||LA3_49=='_'||(LA3_49 >= 'a' && LA3_49 <= 'z')) ) {
                                alt3=28;
                            }
                            else {
                                alt3=17;
                            }
                        }
                        else {
                            alt3=28;
                        }
                    }
                    else {
                        alt3=28;
                    }
                }
                else {
                    alt3=28;
                }
            }
            else {
                alt3=28;
            }
            }
            break;
        case 'm':
            {
            int LA3_14 = input.LA(2);

            if ( (LA3_14=='o') ) {
                int LA3_36 = input.LA(3);

                if ( (LA3_36=='d') ) {
                    int LA3_42 = input.LA(4);

                    if ( (LA3_42=='u') ) {
                        int LA3_46 = input.LA(5);

                        if ( (LA3_46=='l') ) {
                            int LA3_50 = input.LA(6);

                            if ( (LA3_50=='e') ) {
                                int LA3_53 = input.LA(7);

                                if ( ((LA3_53 >= '0' && LA3_53 <= '9')||(LA3_53 >= 'A' && LA3_53 <= 'Z')||LA3_53=='_'||(LA3_53 >= 'a' && LA3_53 <= 'z')) ) {
                                    alt3=28;
                                }
                                else {
                                    alt3=18;
                                }
                            }
                            else {
                                alt3=28;
                            }
                        }
                        else {
                            alt3=28;
                        }
                    }
                    else {
                        alt3=28;
                    }
                }
                else {
                    alt3=28;
                }
            }
            else {
                alt3=28;
            }
            }
            break;
        case 'p':
            {
            int LA3_15 = input.LA(2);

            if ( (LA3_15=='i') ) {
                int LA3_37 = input.LA(3);

                if ( (LA3_37=='p') ) {
                    int LA3_43 = input.LA(4);

                    if ( (LA3_43=='e') ) {
                        int LA3_47 = input.LA(5);

                        if ( ((LA3_47 >= '0' && LA3_47 <= '9')||(LA3_47 >= 'A' && LA3_47 <= 'Z')||LA3_47=='_'||(LA3_47 >= 'a' && LA3_47 <= 'z')) ) {
                            alt3=28;
                        }
                        else {
                            alt3=19;
                        }
                    }
                    else {
                        alt3=28;
                    }
                }
                else {
                    alt3=28;
                }
            }
            else {
                alt3=28;
            }
            }
            break;
        case 'r':
            {
            int LA3_16 = input.LA(2);

            if ( (LA3_16=='e') ) {
                int LA3_38 = input.LA(3);

                if ( (LA3_38=='g') ) {
                    int LA3_44 = input.LA(4);

                    if ( ((LA3_44 >= '0' && LA3_44 <= '9')||(LA3_44 >= 'A' && LA3_44 <= 'Z')||LA3_44=='_'||(LA3_44 >= 'a' && LA3_44 <= 'z')) ) {
                        alt3=28;
                    }
                    else {
                        alt3=20;
                    }
                }
                else {
                    alt3=28;
                }
            }
            else {
                alt3=28;
            }
            }
            break;
        case '{':
            {
            alt3=21;
            }
            break;
        case '|':
            {
            int LA3_18 = input.LA(2);

            if ( (LA3_18=='|') ) {
                alt3=23;
            }
            else {
                alt3=22;
            }
            }
            break;
        case '}':
            {
            alt3=24;
            }
            break;
        case '*':
            {
            alt3=26;
            }
            break;
        case '/':
            {
            alt3=27;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'n':
        case 'o':
        case 'q':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt3=28;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt3=29;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt3=30;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:10: T__10
                {
                mT__10(); 


                }
                break;
            case 2 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:16: T__11
                {
                mT__11(); 


                }
                break;
            case 3 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:22: T__12
                {
                mT__12(); 


                }
                break;
            case 4 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:28: T__13
                {
                mT__13(); 


                }
                break;
            case 5 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:34: T__14
                {
                mT__14(); 


                }
                break;
            case 6 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:40: T__15
                {
                mT__15(); 


                }
                break;
            case 7 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:46: T__16
                {
                mT__16(); 


                }
                break;
            case 8 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:52: T__17
                {
                mT__17(); 


                }
                break;
            case 9 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:58: T__18
                {
                mT__18(); 


                }
                break;
            case 10 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:64: T__19
                {
                mT__19(); 


                }
                break;
            case 11 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:70: T__20
                {
                mT__20(); 


                }
                break;
            case 12 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:76: T__21
                {
                mT__21(); 


                }
                break;
            case 13 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:82: T__22
                {
                mT__22(); 


                }
                break;
            case 14 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:88: T__23
                {
                mT__23(); 


                }
                break;
            case 15 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:94: T__24
                {
                mT__24(); 


                }
                break;
            case 16 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:100: T__25
                {
                mT__25(); 


                }
                break;
            case 17 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:106: T__26
                {
                mT__26(); 


                }
                break;
            case 18 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:112: T__27
                {
                mT__27(); 


                }
                break;
            case 19 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:118: T__28
                {
                mT__28(); 


                }
                break;
            case 20 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:124: T__29
                {
                mT__29(); 


                }
                break;
            case 21 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:130: T__30
                {
                mT__30(); 


                }
                break;
            case 22 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:136: T__31
                {
                mT__31(); 


                }
                break;
            case 23 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:142: T__32
                {
                mT__32(); 


                }
                break;
            case 24 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:148: T__33
                {
                mT__33(); 


                }
                break;
            case 25 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:154: NOT_
                {
                mNOT_(); 


                }
                break;
            case 26 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:159: TIMES_
                {
                mTIMES_(); 


                }
                break;
            case 27 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:166: DIV_
                {
                mDIV_(); 


                }
                break;
            case 28 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:171: VAR
                {
                mVAR(); 


                }
                break;
            case 29 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:175: INT
                {
                mINT(); 


                }
                break;
            case 30 :
                // C:\\docs\\Google Drive\\VE Briefcase\\ve\\VerilogExpress.g:1:179: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}