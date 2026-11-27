// Generated from c:/Users/yuval/Desktop/Bever/AST/bever_ast.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class bever_astLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, Access_decl=6, Access_Modifires=7, 
		Types=8, Param=9, PUB=10, STAT=11, STRING_TYPE=12, INT_TYPE=13, FLOAT_TYPE=14, 
		TOKENS=15, ID=16, FLOAT=17, NUM=18, COMMENT=19, STRING=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "Access_decl", "Access_Modifires", 
			"Types", "Param", "PUB", "STAT", "STRING_TYPE", "INT_TYPE", "FLOAT_TYPE", 
			"TOKENS", "ID", "FLOAT", "NUM", "COMMENT", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'class'", "':'", "'->'", null, null, null, null, 
			"'pub'", "'stat'", "'str'", "'int'", "'float'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "Access_decl", "Access_Modifires", 
			"Types", "Param", "PUB", "STAT", "STRING_TYPE", "INT_TYPE", "FLOAT_TYPE", 
			"TOKENS", "ID", "FLOAT", "NUM", "COMMENT", "STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public bever_astLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "bever_ast.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0015\u00a5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005"+
		"=\b\u0005\n\u0005\f\u0005@\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0003\u0006F\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007K\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000ek\b\u000e\u0001\u000f\u0001\u000f\u0005\u000f"+
		"o\b\u000f\n\u000f\f\u000fr\t\u000f\u0001\u0010\u0004\u0010u\b\u0010\u000b"+
		"\u0010\f\u0010v\u0001\u0010\u0001\u0010\u0004\u0010{\b\u0010\u000b\u0010"+
		"\f\u0010|\u0001\u0011\u0004\u0011\u0080\b\u0011\u000b\u0011\f\u0011\u0081"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0086\b\u0012\n\u0012\f\u0012\u0089"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u008f"+
		"\b\u0013\n\u0013\f\u0013\u0092\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u0097\b\u0013\n\u0013\f\u0013\u009a\t\u0013\u0001\u0013\u0003"+
		"\u0013\u009d\b\u0013\u0001\u0014\u0004\u0014\u00a0\b\u0014\u000b\u0014"+
		"\f\u0014\u00a1\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001\u0000\u0007\u0002\u0000AZa"+
		"z\u0004\u000009AZ__az\u0001\u000009\u0002\u0000\n\n\r\r\u0003\u0000\n"+
		"\n\r\r\"\"\u0003\u0000\n\n\r\r\'\'\u0003\u0000\t\n\r\r  \u00b4\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001"+
		"\u0000\u0000\u0000\u0003-\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000"+
		"\u0000\u00075\u0001\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000b"+
		":\u0001\u0000\u0000\u0000\rE\u0001\u0000\u0000\u0000\u000fJ\u0001\u0000"+
		"\u0000\u0000\u0011L\u0001\u0000\u0000\u0000\u0013O\u0001\u0000\u0000\u0000"+
		"\u0015S\u0001\u0000\u0000\u0000\u0017X\u0001\u0000\u0000\u0000\u0019\\"+
		"\u0001\u0000\u0000\u0000\u001b`\u0001\u0000\u0000\u0000\u001dj\u0001\u0000"+
		"\u0000\u0000\u001fl\u0001\u0000\u0000\u0000!t\u0001\u0000\u0000\u0000"+
		"#\u007f\u0001\u0000\u0000\u0000%\u0083\u0001\u0000\u0000\u0000\'\u009c"+
		"\u0001\u0000\u0000\u0000)\u009f\u0001\u0000\u0000\u0000+,\u0005{\u0000"+
		"\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005}\u0000\u0000.\u0004\u0001"+
		"\u0000\u0000\u0000/0\u0005c\u0000\u000001\u0005l\u0000\u000012\u0005a"+
		"\u0000\u000023\u0005s\u0000\u000034\u0005s\u0000\u00004\u0006\u0001\u0000"+
		"\u0000\u000056\u0005:\u0000\u00006\b\u0001\u0000\u0000\u000078\u0005-"+
		"\u0000\u000089\u0005>\u0000\u00009\n\u0001\u0000\u0000\u0000:>\u0005<"+
		"\u0000\u0000;=\u0003\r\u0006\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000"+
		"\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001"+
		"\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0005>\u0000\u0000B\f\u0001"+
		"\u0000\u0000\u0000CF\u0003\u0013\t\u0000DF\u0003\u0015\n\u0000EC\u0001"+
		"\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000F\u000e\u0001\u0000\u0000"+
		"\u0000GK\u0003\u0017\u000b\u0000HK\u0003\u0019\f\u0000IK\u0003\u001b\r"+
		"\u0000JG\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000"+
		"\u0000\u0000K\u0010\u0001\u0000\u0000\u0000LM\u0003\u000f\u0007\u0000"+
		"MN\u0003\u001f\u000f\u0000N\u0012\u0001\u0000\u0000\u0000OP\u0005p\u0000"+
		"\u0000PQ\u0005u\u0000\u0000QR\u0005b\u0000\u0000R\u0014\u0001\u0000\u0000"+
		"\u0000ST\u0005s\u0000\u0000TU\u0005t\u0000\u0000UV\u0005a\u0000\u0000"+
		"VW\u0005t\u0000\u0000W\u0016\u0001\u0000\u0000\u0000XY\u0005s\u0000\u0000"+
		"YZ\u0005t\u0000\u0000Z[\u0005r\u0000\u0000[\u0018\u0001\u0000\u0000\u0000"+
		"\\]\u0005i\u0000\u0000]^\u0005n\u0000\u0000^_\u0005t\u0000\u0000_\u001a"+
		"\u0001\u0000\u0000\u0000`a\u0005f\u0000\u0000ab\u0005l\u0000\u0000bc\u0005"+
		"o\u0000\u0000cd\u0005a\u0000\u0000de\u0005t\u0000\u0000e\u001c\u0001\u0000"+
		"\u0000\u0000fk\u0003\u001f\u000f\u0000gk\u0003!\u0010\u0000hk\u0003#\u0011"+
		"\u0000ik\u0003\'\u0013\u0000jf\u0001\u0000\u0000\u0000jg\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000k\u001e\u0001"+
		"\u0000\u0000\u0000lp\u0007\u0000\u0000\u0000mo\u0007\u0001\u0000\u0000"+
		"nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000q \u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000su\u0007\u0002\u0000\u0000ts\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000xz\u0005.\u0000\u0000y{\u0007\u0002\u0000\u0000"+
		"zy\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\"\u0001\u0000\u0000\u0000~\u0080\u0007"+
		"\u0002\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000"+
		"\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082$\u0001\u0000\u0000\u0000\u0083\u0087\u0005#\u0000\u0000"+
		"\u0084\u0086\b\u0003\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086"+
		"\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0006\u0012\u0000\u0000\u008b"+
		"&\u0001\u0000\u0000\u0000\u008c\u0090\u0005\"\u0000\u0000\u008d\u008f"+
		"\b\u0004\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0093\u009d\u0005\"\u0000\u0000\u0094\u0098\u0005\'"+
		"\u0000\u0000\u0095\u0097\b\u0005\u0000\u0000\u0096\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009d\u0005\'\u0000\u0000"+
		"\u009c\u008c\u0001\u0000\u0000\u0000\u009c\u0094\u0001\u0000\u0000\u0000"+
		"\u009d(\u0001\u0000\u0000\u0000\u009e\u00a0\u0007\u0006\u0000\u0000\u009f"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0006\u0014\u0000\u0000\u00a4"+
		"*\u0001\u0000\u0000\u0000\u000e\u0000>EJjpv|\u0081\u0087\u0090\u0098\u009c"+
		"\u00a1\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}