// Generated from h:/_cwg-base__Home/Computer Archtecture/Retro Computing/xa/grammers/processors/MOS6502/Expressions.g4 by ANTLR 4.13.1
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
		T__17=18, T__18=19, BinaryLiteral=20, OctalLiteral=21, DecimalLiteral=22, 
		HexLiteral=23, CharacterLiteral=24, StringLiteral=25, Identifier=26;
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
			"T__17", "T__18", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", 
			"HexLiteral", "CharacterLiteral", "StringLiteral", "Identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'*'", "'<='", "'>='", "'+'", "'-'", "'/'", "'<<'", 
			"'>>'", "'&'", "'|'", "'&&'", "'||'", "'=='", "'!='", "'<'", "'>'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "BinaryLiteral", "OctalLiteral", 
			"DecimalLiteral", "HexLiteral", "CharacterLiteral", "StringLiteral", 
			"Identifier"
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
	public String getGrammarFileName() { return "Expressions.g4"; }

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
		"\u0004\u0000\u001a\u0095\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0004\u0013h\b\u0013\u000b\u0013\f\u0013i\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014p\b\u0014\u000b\u0014"+
		"\f\u0014q\u0001\u0015\u0004\u0015u\b\u0015\u000b\u0015\f\u0015v\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016|\b\u0016\u0001\u0016\u0004"+
		"\u0016\u007f\b\u0016\u000b\u0016\f\u0016\u0080\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0005\u0018\u0088\b\u0018\n\u0018"+
		"\f\u0018\u008b\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u0091\b\u0019\n\u0019\f\u0019\u0094\t\u0019\u0000\u0000\u001a"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a\u0001\u0000\n\u0002\u0000BBbb\u0001\u000001\u0002"+
		"\u0000OOoo\u0001\u000007\u0001\u000009\u0002\u0000XXxx\u0003\u000009A"+
		"Faf\u0001\u0000\"\"\u0003\u0000AZ__az\u0004\u000009AZ__az\u009b\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00015\u0001\u0000\u0000\u0000\u00037\u0001\u0000\u0000\u0000"+
		"\u00059\u0001\u0000\u0000\u0000\u0007;\u0001\u0000\u0000\u0000\t>\u0001"+
		"\u0000\u0000\u0000\u000bA\u0001\u0000\u0000\u0000\rC\u0001\u0000\u0000"+
		"\u0000\u000fE\u0001\u0000\u0000\u0000\u0011G\u0001\u0000\u0000\u0000\u0013"+
		"J\u0001\u0000\u0000\u0000\u0015M\u0001\u0000\u0000\u0000\u0017O\u0001"+
		"\u0000\u0000\u0000\u0019Q\u0001\u0000\u0000\u0000\u001bT\u0001\u0000\u0000"+
		"\u0000\u001dW\u0001\u0000\u0000\u0000\u001fZ\u0001\u0000\u0000\u0000!"+
		"]\u0001\u0000\u0000\u0000#_\u0001\u0000\u0000\u0000%a\u0001\u0000\u0000"+
		"\u0000\'c\u0001\u0000\u0000\u0000)k\u0001\u0000\u0000\u0000+t\u0001\u0000"+
		"\u0000\u0000-{\u0001\u0000\u0000\u0000/\u0082\u0001\u0000\u0000\u0000"+
		"1\u0085\u0001\u0000\u0000\u00003\u008e\u0001\u0000\u0000\u000056\u0005"+
		"(\u0000\u00006\u0002\u0001\u0000\u0000\u000078\u0005)\u0000\u00008\u0004"+
		"\u0001\u0000\u0000\u00009:\u0005*\u0000\u0000:\u0006\u0001\u0000\u0000"+
		"\u0000;<\u0005<\u0000\u0000<=\u0005=\u0000\u0000=\b\u0001\u0000\u0000"+
		"\u0000>?\u0005>\u0000\u0000?@\u0005=\u0000\u0000@\n\u0001\u0000\u0000"+
		"\u0000AB\u0005+\u0000\u0000B\f\u0001\u0000\u0000\u0000CD\u0005-\u0000"+
		"\u0000D\u000e\u0001\u0000\u0000\u0000EF\u0005/\u0000\u0000F\u0010\u0001"+
		"\u0000\u0000\u0000GH\u0005<\u0000\u0000HI\u0005<\u0000\u0000I\u0012\u0001"+
		"\u0000\u0000\u0000JK\u0005>\u0000\u0000KL\u0005>\u0000\u0000L\u0014\u0001"+
		"\u0000\u0000\u0000MN\u0005&\u0000\u0000N\u0016\u0001\u0000\u0000\u0000"+
		"OP\u0005|\u0000\u0000P\u0018\u0001\u0000\u0000\u0000QR\u0005&\u0000\u0000"+
		"RS\u0005&\u0000\u0000S\u001a\u0001\u0000\u0000\u0000TU\u0005|\u0000\u0000"+
		"UV\u0005|\u0000\u0000V\u001c\u0001\u0000\u0000\u0000WX\u0005=\u0000\u0000"+
		"XY\u0005=\u0000\u0000Y\u001e\u0001\u0000\u0000\u0000Z[\u0005!\u0000\u0000"+
		"[\\\u0005=\u0000\u0000\\ \u0001\u0000\u0000\u0000]^\u0005<\u0000\u0000"+
		"^\"\u0001\u0000\u0000\u0000_`\u0005>\u0000\u0000`$\u0001\u0000\u0000\u0000"+
		"ab\u0005!\u0000\u0000b&\u0001\u0000\u0000\u0000cd\u00050\u0000\u0000d"+
		"e\u0007\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fh\u0007\u0001\u0000"+
		"\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000j(\u0001\u0000\u0000\u0000kl\u0005"+
		"0\u0000\u0000lm\u0007\u0002\u0000\u0000mo\u0001\u0000\u0000\u0000np\u0007"+
		"\u0003\u0000\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r*\u0001\u0000\u0000"+
		"\u0000su\u0007\u0004\u0000\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w,\u0001"+
		"\u0000\u0000\u0000x|\u0005$\u0000\u0000yz\u00050\u0000\u0000z|\u0007\u0005"+
		"\u0000\u0000{x\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|~\u0001"+
		"\u0000\u0000\u0000}\u007f\u0007\u0006\u0000\u0000~}\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081.\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005\'\u0000\u0000\u0083\u0084\b\u0007\u0000\u0000\u00840\u0001"+
		"\u0000\u0000\u0000\u0085\u0089\u0005\"\u0000\u0000\u0086\u0088\b\u0007"+
		"\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005\"\u0000\u0000\u008d2\u0001\u0000\u0000"+
		"\u0000\u008e\u0092\u0007\b\u0000\u0000\u008f\u0091\u0007\t\u0000\u0000"+
		"\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u00934\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\b"+
		"\u0000iqv{\u0080\u0089\u0092\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}