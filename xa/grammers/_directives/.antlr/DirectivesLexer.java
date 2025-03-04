// Generated from h:/_cwg-base__Home/Computer Archtecture/Retro Computing/xa/grammers/_directives/Directives_v4.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Directives=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "Directives"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'.macro'", "'.struct'", "','", "'='", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "Directives"
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
	public String getGrammarFileName() { return "Directives_v4.g4"; }

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
		"\u0004\u0000\u0007}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"|\b\u0006\u0000\u0000\u0007\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u0001\u0000\u0014\u0002\u0000MMmm\u0002"+
		"\u0000AAaa\u0002\u0000CCcc\u0002\u0000RRrr\u0002\u0000OOoo\u0002\u0000"+
		"SSss\u0002\u0000TTtt\u0002\u0000UUuu\u0002\u0000LLll\u0002\u0000IIii\u0002"+
		"\u0000GGgg\u0002\u0000NNnn\u0002\u0000BBbb\u0002\u0000YYyy\u0002\u0000"+
		"EEee\u0002\u0000DDdd\u0002\u0000FFff\u0002\u0000QQqq\u0002\u0000PPpp\u0002"+
		"\u0000WWww\u008c\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0001\u000f\u0001\u0000\u0000"+
		"\u0000\u0003\u0011\u0001\u0000\u0000\u0000\u0005\u0018\u0001\u0000\u0000"+
		"\u0000\u0007 \u0001\u0000\u0000\u0000\t\"\u0001\u0000\u0000\u0000\u000b"+
		"$\u0001\u0000\u0000\u0000\r{\u0001\u0000\u0000\u0000\u000f\u0010\u0005"+
		".\u0000\u0000\u0010\u0002\u0001\u0000\u0000\u0000\u0011\u0012\u0005.\u0000"+
		"\u0000\u0012\u0013\u0007\u0000\u0000\u0000\u0013\u0014\u0007\u0001\u0000"+
		"\u0000\u0014\u0015\u0007\u0002\u0000\u0000\u0015\u0016\u0007\u0003\u0000"+
		"\u0000\u0016\u0017\u0007\u0004\u0000\u0000\u0017\u0004\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0005.\u0000\u0000\u0019\u001a\u0007\u0005\u0000\u0000"+
		"\u001a\u001b\u0007\u0006\u0000\u0000\u001b\u001c\u0007\u0003\u0000\u0000"+
		"\u001c\u001d\u0007\u0007\u0000\u0000\u001d\u001e\u0007\u0002\u0000\u0000"+
		"\u001e\u001f\u0007\u0006\u0000\u0000\u001f\u0006\u0001\u0000\u0000\u0000"+
		" !\u0005,\u0000\u0000!\b\u0001\u0000\u0000\u0000\"#\u0005=\u0000\u0000"+
		"#\n\u0001\u0000\u0000\u0000$%\u0005:\u0000\u0000%\f\u0001\u0000\u0000"+
		"\u0000&\'\u0007\u0001\u0000\u0000\'(\u0007\b\u0000\u0000()\u0007\t\u0000"+
		"\u0000)*\u0007\n\u0000\u0000*|\u0007\u000b\u0000\u0000+,\u0007\f\u0000"+
		"\u0000,-\u0007\r\u0000\u0000-.\u0007\u0006\u0000\u0000.|\u0007\u000e\u0000"+
		"\u0000/0\u0007\u000e\u0000\u000001\u0007\u000b\u0000\u00001|\u0007\u000f"+
		"\u0000\u000023\u0007\u000e\u0000\u000034\u0007\u000b\u0000\u000045\u0007"+
		"\u000f\u0000\u000056\u0007\t\u0000\u00006|\u0007\u0010\u0000\u000078\u0007"+
		"\u000e\u0000\u000089\u0007\u000b\u0000\u00009:\u0007\u000f\u0000\u0000"+
		":;\u0007\u0000\u0000\u0000;<\u0007\u0001\u0000\u0000<=\u0007\u0002\u0000"+
		"\u0000=>\u0007\u0003\u0000\u0000>|\u0007\u0004\u0000\u0000?@\u0007\u000e"+
		"\u0000\u0000@A\u0007\u000b\u0000\u0000AB\u0007\u000f\u0000\u0000BC\u0007"+
		"\u0005\u0000\u0000CD\u0007\u0006\u0000\u0000DE\u0007\u0003\u0000\u0000"+
		"EF\u0007\u0007\u0000\u0000FG\u0007\u0002\u0000\u0000G|\u0007\u0006\u0000"+
		"\u0000HI\u0007\u000e\u0000\u0000IJ\u0007\u0011\u0000\u0000J|\u0007\u0007"+
		"\u0000\u0000KL\u0007\t\u0000\u0000L|\u0007\u0010\u0000\u0000MN\u0007\t"+
		"\u0000\u0000NO\u0007\u0010\u0000\u0000OP\u0007\u000f\u0000\u0000PQ\u0007"+
		"\u000e\u0000\u0000Q|\u0007\u0010\u0000\u0000RS\u0007\t\u0000\u0000ST\u0007"+
		"\u0010\u0000\u0000TU\u0007\u000b\u0000\u0000UV\u0007\u000f\u0000\u0000"+
		"VW\u0007\u000e\u0000\u0000W|\u0007\u0010\u0000\u0000XY\u0007\t\u0000\u0000"+
		"YZ\u0007\u000b\u0000\u0000Z[\u0007\u0002\u0000\u0000[\\\u0007\b\u0000"+
		"\u0000\\]\u0007\u0007\u0000\u0000]^\u0007\u000f\u0000\u0000^|\u0007\u000e"+
		"\u0000\u0000_`\u0007\b\u0000\u0000`a\u0007\t\u0000\u0000ab\u0007\u0005"+
		"\u0000\u0000b|\u0007\u0006\u0000\u0000cd\u0007\u000b\u0000\u0000de\u0007"+
		"\u0004\u0000\u0000ef\u0007\b\u0000\u0000fg\u0007\t\u0000\u0000gh\u0007"+
		"\u0005\u0000\u0000h|\u0007\u0006\u0000\u0000ij\u0007\u0004\u0000\u0000"+
		"jk\u0007\u0003\u0000\u0000k|\u0007\n\u0000\u0000lm\u0007\u0012\u0000\u0000"+
		"mn\u0007\u0001\u0000\u0000no\u0007\n\u0000\u0000o|\u0007\u000e\u0000\u0000"+
		"pq\u0007\u0005\u0000\u0000qr\u0007\u000e\u0000\u0000rs\u0007\n\u0000\u0000"+
		"st\u0007\u0000\u0000\u0000tu\u0007\u000e\u0000\u0000uv\u0007\u000b\u0000"+
		"\u0000v|\u0007\u0006\u0000\u0000wx\u0007\u0013\u0000\u0000xy\u0007\u0004"+
		"\u0000\u0000yz\u0007\u0003\u0000\u0000z|\u0007\u000f\u0000\u0000{&\u0001"+
		"\u0000\u0000\u0000{+\u0001\u0000\u0000\u0000{/\u0001\u0000\u0000\u0000"+
		"{2\u0001\u0000\u0000\u0000{7\u0001\u0000\u0000\u0000{?\u0001\u0000\u0000"+
		"\u0000{H\u0001\u0000\u0000\u0000{K\u0001\u0000\u0000\u0000{M\u0001\u0000"+
		"\u0000\u0000{R\u0001\u0000\u0000\u0000{X\u0001\u0000\u0000\u0000{_\u0001"+
		"\u0000\u0000\u0000{c\u0001\u0000\u0000\u0000{i\u0001\u0000\u0000\u0000"+
		"{l\u0001\u0000\u0000\u0000{p\u0001\u0000\u0000\u0000{w\u0001\u0000\u0000"+
		"\u0000|\u000e\u0001\u0000\u0000\u0000\u0002\u0000{\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}