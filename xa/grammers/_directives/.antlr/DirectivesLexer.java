// Generated from h:/_cwg-base__Home/Computer Archtecture/Retro Computing/xa/grammers/_directives/Directives_v2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DirectivesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, Directives=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "Directives"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'.macro'", "','", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "Directives"
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


	public DirectivesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Directives_v2.g4"; }

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
		"\u0004\u0000\u0005Z\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004Y\b\u0004\u0000\u0000\u0005\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u0001\u0000\u0014\u0002\u0000MMmm\u0002\u0000"+
		"AAaa\u0002\u0000CCcc\u0002\u0000RRrr\u0002\u0000OOoo\u0002\u0000BBbb\u0002"+
		"\u0000YYyy\u0002\u0000TTtt\u0002\u0000EEee\u0002\u0000NNnn\u0002\u0000"+
		"DDdd\u0002\u0000IIii\u0002\u0000FFff\u0002\u0000QQqq\u0002\u0000UUuu\u0002"+
		"\u0000LLll\u0002\u0000SSss\u0002\u0000GGgg\u0002\u0000PPpp\u0002\u0000"+
		"WWwwf\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0001\u000b\u0001\u0000\u0000\u0000"+
		"\u0003\r\u0001\u0000\u0000\u0000\u0005\u0014\u0001\u0000\u0000\u0000\u0007"+
		"\u0016\u0001\u0000\u0000\u0000\tX\u0001\u0000\u0000\u0000\u000b\f\u0005"+
		".\u0000\u0000\f\u0002\u0001\u0000\u0000\u0000\r\u000e\u0005.\u0000\u0000"+
		"\u000e\u000f\u0007\u0000\u0000\u0000\u000f\u0010\u0007\u0001\u0000\u0000"+
		"\u0010\u0011\u0007\u0002\u0000\u0000\u0011\u0012\u0007\u0003\u0000\u0000"+
		"\u0012\u0013\u0007\u0004\u0000\u0000\u0013\u0004\u0001\u0000\u0000\u0000"+
		"\u0014\u0015\u0005,\u0000\u0000\u0015\u0006\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0005=\u0000\u0000\u0017\b\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0007\u0005\u0000\u0000\u0019\u001a\u0007\u0006\u0000\u0000\u001a\u001b"+
		"\u0007\u0007\u0000\u0000\u001bY\u0007\b\u0000\u0000\u001c\u001d\u0007"+
		"\b\u0000\u0000\u001d\u001e\u0007\t\u0000\u0000\u001eY\u0007\n\u0000\u0000"+
		"\u001f \u0007\b\u0000\u0000 !\u0007\t\u0000\u0000!\"\u0007\n\u0000\u0000"+
		"\"#\u0007\u000b\u0000\u0000#Y\u0007\f\u0000\u0000$%\u0007\b\u0000\u0000"+
		"%&\u0007\t\u0000\u0000&\'\u0007\n\u0000\u0000\'(\u0007\u0000\u0000\u0000"+
		"()\u0007\u0001\u0000\u0000)*\u0007\u0002\u0000\u0000*+\u0007\u0003\u0000"+
		"\u0000+Y\u0007\u0004\u0000\u0000,-\u0007\b\u0000\u0000-.\u0007\r\u0000"+
		"\u0000.Y\u0007\u000e\u0000\u0000/0\u0007\u000b\u0000\u00000Y\u0007\f\u0000"+
		"\u000012\u0007\u000b\u0000\u000023\u0007\f\u0000\u000034\u0007\n\u0000"+
		"\u000045\u0007\b\u0000\u00005Y\u0007\f\u0000\u000067\u0007\u000b\u0000"+
		"\u000078\u0007\f\u0000\u000089\u0007\t\u0000\u00009:\u0007\n\u0000\u0000"+
		":;\u0007\b\u0000\u0000;Y\u0007\f\u0000\u0000<=\u0007\u000b\u0000\u0000"+
		"=>\u0007\t\u0000\u0000>?\u0007\u0002\u0000\u0000?@\u0007\u000f\u0000\u0000"+
		"@A\u0007\u000e\u0000\u0000AB\u0007\n\u0000\u0000BY\u0007\b\u0000\u0000"+
		"CD\u0007\u000f\u0000\u0000DE\u0007\u000b\u0000\u0000EF\u0007\u0010\u0000"+
		"\u0000FY\u0007\u0007\u0000\u0000GH\u0007\t\u0000\u0000HI\u0007\u0004\u0000"+
		"\u0000IJ\u0007\u000f\u0000\u0000JK\u0007\u000b\u0000\u0000KL\u0007\u0010"+
		"\u0000\u0000LY\u0007\u0007\u0000\u0000MN\u0007\u0004\u0000\u0000NO\u0007"+
		"\u0003\u0000\u0000OY\u0007\u0011\u0000\u0000PQ\u0007\u0012\u0000\u0000"+
		"QR\u0007\u0001\u0000\u0000RS\u0007\u0011\u0000\u0000SY\u0007\b\u0000\u0000"+
		"TU\u0007\u0013\u0000\u0000UV\u0007\u0004\u0000\u0000VW\u0007\u0003\u0000"+
		"\u0000WY\u0007\n\u0000\u0000X\u0018\u0001\u0000\u0000\u0000X\u001c\u0001"+
		"\u0000\u0000\u0000X\u001f\u0001\u0000\u0000\u0000X$\u0001\u0000\u0000"+
		"\u0000X,\u0001\u0000\u0000\u0000X/\u0001\u0000\u0000\u0000X1\u0001\u0000"+
		"\u0000\u0000X6\u0001\u0000\u0000\u0000X<\u0001\u0000\u0000\u0000XC\u0001"+
		"\u0000\u0000\u0000XG\u0001\u0000\u0000\u0000XM\u0001\u0000\u0000\u0000"+
		"XP\u0001\u0000\u0000\u0000XT\u0001\u0000\u0000\u0000Y\n\u0001\u0000\u0000"+
		"\u0000\u0002\u0000X\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}