// Generated from h:/_cwg-base__Home/Computer Archtecture/Retro Computing/xa/grammers/_expressions/Expressions_v2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExpressionsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, BinaryLiteral=22, OctalLiteral=23, 
		DecimalLiteral=24, HexLiteral=25, CharacterLiteral=26, StringLiteral=27, 
		Identifier=28, IdentifierExtensiom=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "BinaryLiteral", "OctalLiteral", 
			"DecimalLiteral", "HexLiteral", "CharacterLiteral", "StringLiteral", 
			"Identifier", "IdentifierExtensiom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'*'", "'.'", "'@'", "'<='", "'>='", "'+'", "'-'", 
			"'/'", "'<<'", "'>>'", "'&'", "'|'", "'&&'", "'||'", "'=='", "'!='", 
			"'<'", "'>'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "BinaryLiteral", 
			"OctalLiteral", "DecimalLiteral", "HexLiteral", "CharacterLiteral", "StringLiteral", 
			"Identifier", "IdentifierExtensiom"
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


	public ExpressionsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expressions_v2.g4"; }

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
		"\u0004\u0000\u001d\u00ab\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0004\u0015r\b\u0015\u000b\u0015\f\u0015s\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0004\u0016z\b\u0016\u000b\u0016\f\u0016{\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0080\b\u0017\u0001\u0017\u0004\u0017\u0083"+
		"\b\u0017\u000b\u0017\f\u0017\u0084\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u008a\b\u0018\u0001\u0018\u0004\u0018\u008d\b\u0018\u000b"+
		"\u0018\f\u0018\u008e\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u0096\b\u001a\n\u001a\f\u001a\u0099\t\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u009f\b\u001b\n\u001b"+
		"\f\u001b\u00a2\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u00a7\b\u001c\n\u001c\f\u001c\u00aa\t\u001c\u0000\u0000\u001d\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00193\u001a5\u001b7\u001c9\u001d\u0001\u0000\u000b\u0002\u0000BBbb"+
		"\u0001\u000001\u0002\u0000OOoo\u0001\u000007\u0002\u0000DDdd\u0001\u0000"+
		"09\u0002\u0000XXxx\u0003\u000009AFaf\u0001\u0000\"\"\u0003\u0000AZ__a"+
		"z\u0004\u000009AZ__az\u00b3\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0001;"+
		"\u0001\u0000\u0000\u0000\u0003=\u0001\u0000\u0000\u0000\u0005?\u0001\u0000"+
		"\u0000\u0000\u0007A\u0001\u0000\u0000\u0000\tC\u0001\u0000\u0000\u0000"+
		"\u000bE\u0001\u0000\u0000\u0000\rH\u0001\u0000\u0000\u0000\u000fK\u0001"+
		"\u0000\u0000\u0000\u0011M\u0001\u0000\u0000\u0000\u0013O\u0001\u0000\u0000"+
		"\u0000\u0015Q\u0001\u0000\u0000\u0000\u0017T\u0001\u0000\u0000\u0000\u0019"+
		"W\u0001\u0000\u0000\u0000\u001bY\u0001\u0000\u0000\u0000\u001d[\u0001"+
		"\u0000\u0000\u0000\u001f^\u0001\u0000\u0000\u0000!a\u0001\u0000\u0000"+
		"\u0000#d\u0001\u0000\u0000\u0000%g\u0001\u0000\u0000\u0000\'i\u0001\u0000"+
		"\u0000\u0000)k\u0001\u0000\u0000\u0000+m\u0001\u0000\u0000\u0000-u\u0001"+
		"\u0000\u0000\u0000/\u007f\u0001\u0000\u0000\u00001\u0089\u0001\u0000\u0000"+
		"\u00003\u0090\u0001\u0000\u0000\u00005\u0093\u0001\u0000\u0000\u00007"+
		"\u009c\u0001\u0000\u0000\u00009\u00a3\u0001\u0000\u0000\u0000;<\u0005"+
		"(\u0000\u0000<\u0002\u0001\u0000\u0000\u0000=>\u0005)\u0000\u0000>\u0004"+
		"\u0001\u0000\u0000\u0000?@\u0005*\u0000\u0000@\u0006\u0001\u0000\u0000"+
		"\u0000AB\u0005.\u0000\u0000B\b\u0001\u0000\u0000\u0000CD\u0005@\u0000"+
		"\u0000D\n\u0001\u0000\u0000\u0000EF\u0005<\u0000\u0000FG\u0005=\u0000"+
		"\u0000G\f\u0001\u0000\u0000\u0000HI\u0005>\u0000\u0000IJ\u0005=\u0000"+
		"\u0000J\u000e\u0001\u0000\u0000\u0000KL\u0005+\u0000\u0000L\u0010\u0001"+
		"\u0000\u0000\u0000MN\u0005-\u0000\u0000N\u0012\u0001\u0000\u0000\u0000"+
		"OP\u0005/\u0000\u0000P\u0014\u0001\u0000\u0000\u0000QR\u0005<\u0000\u0000"+
		"RS\u0005<\u0000\u0000S\u0016\u0001\u0000\u0000\u0000TU\u0005>\u0000\u0000"+
		"UV\u0005>\u0000\u0000V\u0018\u0001\u0000\u0000\u0000WX\u0005&\u0000\u0000"+
		"X\u001a\u0001\u0000\u0000\u0000YZ\u0005|\u0000\u0000Z\u001c\u0001\u0000"+
		"\u0000\u0000[\\\u0005&\u0000\u0000\\]\u0005&\u0000\u0000]\u001e\u0001"+
		"\u0000\u0000\u0000^_\u0005|\u0000\u0000_`\u0005|\u0000\u0000` \u0001\u0000"+
		"\u0000\u0000ab\u0005=\u0000\u0000bc\u0005=\u0000\u0000c\"\u0001\u0000"+
		"\u0000\u0000de\u0005!\u0000\u0000ef\u0005=\u0000\u0000f$\u0001\u0000\u0000"+
		"\u0000gh\u0005<\u0000\u0000h&\u0001\u0000\u0000\u0000ij\u0005>\u0000\u0000"+
		"j(\u0001\u0000\u0000\u0000kl\u0005!\u0000\u0000l*\u0001\u0000\u0000\u0000"+
		"mn\u00050\u0000\u0000no\u0007\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000"+
		"pr\u0007\u0001\u0000\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t,\u0001\u0000"+
		"\u0000\u0000uv\u00050\u0000\u0000vw\u0007\u0002\u0000\u0000wy\u0001\u0000"+
		"\u0000\u0000xz\u0007\u0003\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|.\u0001\u0000\u0000\u0000}~\u00050\u0000\u0000~\u0080\u0007\u0004\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u0083\u0007\u0005\u0000\u0000"+
		"\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u00850\u0001\u0000\u0000\u0000\u0086\u008a\u0005$\u0000\u0000\u0087\u0088"+
		"\u00050\u0000\u0000\u0088\u008a\u0007\u0006\u0000\u0000\u0089\u0086\u0001"+
		"\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008c\u0001"+
		"\u0000\u0000\u0000\u008b\u008d\u0007\u0007\u0000\u0000\u008c\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f2\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005\'\u0000\u0000\u0091\u0092\b\b\u0000\u0000"+
		"\u00924\u0001\u0000\u0000\u0000\u0093\u0097\u0005\"\u0000\u0000\u0094"+
		"\u0096\b\b\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0099"+
		"\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0001\u0000\u0000\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0005\"\u0000\u0000\u009b6\u0001"+
		"\u0000\u0000\u0000\u009c\u00a0\u0007\t\u0000\u0000\u009d\u009f\u0007\n"+
		"\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a18\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0005:\u0000\u0000\u00a4\u00a8\u0007\t\u0000\u0000"+
		"\u00a5\u00a7\u0007\n\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a9:\u0001\u0000\u0000\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\n\u0000s{\u007f\u0084\u0089\u008e\u0097\u00a0"+
		"\u00a8\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}