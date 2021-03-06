// $ANTLR 3.4 C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g 2012-11-03 19:16:50

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
    public String getGrammarFileName() { return "C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:6:7: ( '!=' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:6:9: '!='
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:7:7: ( '&&' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:7:9: '&&'
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:8:7: ( '&' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:8:9: '&'
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:9:7: ( '(' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:9:9: '('
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:10:7: ( ')' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:10:9: ')'
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:11:7: ( '+' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:11:9: '+'
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:12:7: ( '-' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:12:9: '-'
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:13:7: ( ';' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:13:9: ';'
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:14:7: ( '<' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:14:9: '<'
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:15:7: ( '<<' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:15:9: '<<'
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:16:7: ( '=' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:16:9: '='
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:17:7: ( '==' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:17:9: '=='
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:18:7: ( '>' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:18:9: '>'
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:19:7: ( '>>' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:19:9: '>>'
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:20:7: ( '[' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:20:9: '['
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:21:7: ( ']' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:21:9: ']'
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:22:7: ( 'const' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:22:9: 'const'
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:23:7: ( 'else' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:23:9: 'else'
            {
            match("else"); 



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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:24:7: ( 'if' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:24:9: 'if'
            {
            match("if"); 



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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:25:7: ( 'input' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:25:9: 'input'
            {
            match("input"); 



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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:26:7: ( 'module' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:26:9: 'module'
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:27:7: ( 'output' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:27:9: 'output'
            {
            match("output"); 



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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:28:7: ( 'pipe' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:28:9: 'pipe'
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:29:7: ( 'reg' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:29:9: 'reg'
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:30:7: ( 'stdin' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:30:9: 'stdin'
            {
            match("stdin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:31:7: ( 'stdout' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:31:9: 'stdout'
            {
            match("stdout"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:32:7: ( 'while' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:32:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:33:7: ( '{' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:33:9: '{'
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:34:7: ( '|' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:34:9: '|'
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:35:7: ( '||' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:35:9: '||'
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:36:7: ( '}' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:36:9: '}'
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
    // $ANTLR end "T__40"

    // $ANTLR start "NOT_"
    public final void mNOT_() throws RecognitionException {
        try {
            int _type = NOT_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:179:7: ( '!' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:179:9: '!'
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:180:8: ( '*' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:180:10: '*'
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:181:6: ( '/' )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:181:8: '/'
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:183:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:183:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:183:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:186:5: ( ( '0' .. '9' )+ )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:186:7: ( '0' .. '9' )+
            {
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:186:7: ( '0' .. '9' )+
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
            	    // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:
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
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:203:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:203:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | NOT_ | TIMES_ | DIV_ | VAR | INT | WS )
        int alt3=37;
        alt3 = dfa3.predict(input);
        switch (alt3) {
            case 1 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:10: T__10
                {
                mT__10(); 


                }
                break;
            case 2 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:16: T__11
                {
                mT__11(); 


                }
                break;
            case 3 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:22: T__12
                {
                mT__12(); 


                }
                break;
            case 4 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:28: T__13
                {
                mT__13(); 


                }
                break;
            case 5 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:34: T__14
                {
                mT__14(); 


                }
                break;
            case 6 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:40: T__15
                {
                mT__15(); 


                }
                break;
            case 7 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:46: T__16
                {
                mT__16(); 


                }
                break;
            case 8 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:52: T__17
                {
                mT__17(); 


                }
                break;
            case 9 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:58: T__18
                {
                mT__18(); 


                }
                break;
            case 10 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:64: T__19
                {
                mT__19(); 


                }
                break;
            case 11 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:70: T__20
                {
                mT__20(); 


                }
                break;
            case 12 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:76: T__21
                {
                mT__21(); 


                }
                break;
            case 13 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:82: T__22
                {
                mT__22(); 


                }
                break;
            case 14 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:88: T__23
                {
                mT__23(); 


                }
                break;
            case 15 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:94: T__24
                {
                mT__24(); 


                }
                break;
            case 16 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:100: T__25
                {
                mT__25(); 


                }
                break;
            case 17 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:106: T__26
                {
                mT__26(); 


                }
                break;
            case 18 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:112: T__27
                {
                mT__27(); 


                }
                break;
            case 19 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:118: T__28
                {
                mT__28(); 


                }
                break;
            case 20 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:124: T__29
                {
                mT__29(); 


                }
                break;
            case 21 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:130: T__30
                {
                mT__30(); 


                }
                break;
            case 22 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:136: T__31
                {
                mT__31(); 


                }
                break;
            case 23 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:142: T__32
                {
                mT__32(); 


                }
                break;
            case 24 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:148: T__33
                {
                mT__33(); 


                }
                break;
            case 25 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:154: T__34
                {
                mT__34(); 


                }
                break;
            case 26 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:160: T__35
                {
                mT__35(); 


                }
                break;
            case 27 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:166: T__36
                {
                mT__36(); 


                }
                break;
            case 28 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:172: T__37
                {
                mT__37(); 


                }
                break;
            case 29 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:178: T__38
                {
                mT__38(); 


                }
                break;
            case 30 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:184: T__39
                {
                mT__39(); 


                }
                break;
            case 31 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:190: T__40
                {
                mT__40(); 


                }
                break;
            case 32 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:196: NOT_
                {
                mNOT_(); 


                }
                break;
            case 33 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:201: TIMES_
                {
                mTIMES_(); 


                }
                break;
            case 34 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:208: DIV_
                {
                mDIV_(); 


                }
                break;
            case 35 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:213: VAR
                {
                mVAR(); 


                }
                break;
            case 36 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:217: INT
                {
                mINT(); 


                }
                break;
            case 37 :
                // C:\\docs\\My Programing\\Java\\VerilogExpress\\eclipse\\VerilogExpress\\ANTLR_src\\VerilogExpress.g:1:221: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\1\uffff\1\37\1\41\5\uffff\1\43\1\45\1\47\2\uffff\11\33\1\uffff"+
        "\1\63\20\uffff\2\33\1\66\7\33\2\uffff\2\33\1\uffff\4\33\1\104\3"+
        "\33\1\111\3\33\1\115\1\uffff\3\33\1\121\1\uffff\1\122\2\33\1\uffff"+
        "\1\125\1\33\1\127\2\uffff\1\130\1\131\1\uffff\1\132\4\uffff";
    static final String DFA3_eofS =
        "\133\uffff";
    static final String DFA3_minS =
        "\1\11\1\75\1\46\5\uffff\1\74\1\75\1\76\2\uffff\1\157\1\154\1\146"+
        "\1\157\1\165\1\151\1\145\1\164\1\150\1\uffff\1\174\20\uffff\1\156"+
        "\1\163\1\60\1\160\1\144\1\164\1\160\1\147\1\144\1\151\2\uffff\1"+
        "\163\1\145\1\uffff\2\165\1\160\1\145\1\60\1\151\1\154\1\164\1\60"+
        "\1\164\1\154\1\165\1\60\1\uffff\1\156\1\165\1\145\1\60\1\uffff\1"+
        "\60\1\145\1\164\1\uffff\1\60\1\164\1\60\2\uffff\2\60\1\uffff\1\60"+
        "\4\uffff";
    static final String DFA3_maxS =
        "\1\175\1\75\1\46\5\uffff\1\74\1\75\1\76\2\uffff\1\157\1\154\1\156"+
        "\1\157\1\165\1\151\1\145\1\164\1\150\1\uffff\1\174\20\uffff\1\156"+
        "\1\163\1\172\1\160\1\144\1\164\1\160\1\147\1\144\1\151\2\uffff\1"+
        "\163\1\145\1\uffff\2\165\1\160\1\145\1\172\1\157\1\154\1\164\1\172"+
        "\1\164\1\154\1\165\1\172\1\uffff\1\156\1\165\1\145\1\172\1\uffff"+
        "\1\172\1\145\1\164\1\uffff\1\172\1\164\1\172\2\uffff\2\172\1\uffff"+
        "\1\172\4\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\4\1\5\1\6\1\7\1\10\3\uffff\1\17\1\20\11\uffff\1\34\1"+
        "\uffff\1\37\1\41\1\42\1\43\1\44\1\45\1\1\1\40\1\2\1\3\1\12\1\11"+
        "\1\14\1\13\1\16\1\15\12\uffff\1\36\1\35\2\uffff\1\23\15\uffff\1"+
        "\30\4\uffff\1\22\3\uffff\1\27\3\uffff\1\21\1\24\2\uffff\1\31\1\uffff"+
        "\1\33\1\25\1\26\1\32";
    static final String DFA3_specialS =
        "\133\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\35\2\uffff\1\35\22\uffff\1\35\1\1\4\uffff\1\2\1\uffff\1\3"+
            "\1\4\1\31\1\5\1\uffff\1\6\1\uffff\1\32\12\34\1\uffff\1\7\1\10"+
            "\1\11\1\12\2\uffff\32\33\1\13\1\uffff\1\14\1\uffff\1\33\1\uffff"+
            "\2\33\1\15\1\33\1\16\3\33\1\17\3\33\1\20\1\33\1\21\1\22\1\33"+
            "\1\23\1\24\3\33\1\25\3\33\1\26\1\27\1\30",
            "\1\36",
            "\1\40",
            "",
            "",
            "",
            "",
            "",
            "\1\42",
            "\1\44",
            "\1\46",
            "",
            "",
            "\1\50",
            "\1\51",
            "\1\52\7\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "\1\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64",
            "\1\65",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "",
            "\1\76",
            "\1\77",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\105\5\uffff\1\106",
            "\1\107",
            "\1\110",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\112",
            "\1\113",
            "\1\114",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\123",
            "\1\124",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\126",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | NOT_ | TIMES_ | DIV_ | VAR | INT | WS );";
        }
    }
 

}