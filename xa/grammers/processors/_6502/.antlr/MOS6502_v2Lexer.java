// Generated from h:/_cwg-base__Home/Computer Archtecture/Retro Computing/xa/grammers/processors/_6502/_MOS6502_.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MOS6502_v2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, OpcodeBranches=9, 
		Opcodes=10, Comment=11, EOL=12, WS=13, ANY=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "OpcodeBranches", 
			"Opcodes", "Comment", "EOL", "WS", "ANY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'A'", "'#'", "',X'", "',Y'", "'['", "']'", "',X]'", "'],Y'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "OpcodeBranches", 
			"Opcodes", "Comment", "EOL", "WS", "ANY"
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


	public MOS6502_v2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "_MOS6502_.g4"; }

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
		"\u0004\u0000\u000e\u0102\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\bO\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00ed\b\t\u0001\n\u0001\n\u0005\n\u00f1\b\n\n\n\f\n\u00f4\t\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0004\u000b\u00f9\b\u000b\u000b\u000b\f\u000b\u00fa"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0000\u0000\u000e\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u0001"+
		"\u0000\u0018\u0002\u0000AAaa\u0002\u0000XXxx\u0002\u0000YYyy\u0002\u0000"+
		"BBbb\u0002\u0000CCcc\u0002\u0000SSss\u0002\u0000EEee\u0002\u0000QQqq\u0002"+
		"\u0000MMmm\u0002\u0000IIii\u0002\u0000NNnn\u0002\u0000PPpp\u0002\u0000"+
		"LLll\u0002\u0000RRrr\u0002\u0000VVvv\u0002\u0000DDdd\u0002\u0000TTtt\u0002"+
		"\u0000KKkk\u0002\u0000OOoo\u0002\u0000JJjj\u0002\u0000HHhh\u0002\u0000"+
		"ZZzz\u0002\u0000\n\n\r\r\u0002\u0000\t\t  \u013e\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000"+
		"\u0003\u001f\u0001\u0000\u0000\u0000\u0005!\u0001\u0000\u0000\u0000\u0007"+
		"$\u0001\u0000\u0000\u0000\t\'\u0001\u0000\u0000\u0000\u000b)\u0001\u0000"+
		"\u0000\u0000\r+\u0001\u0000\u0000\u0000\u000f/\u0001\u0000\u0000\u0000"+
		"\u0011N\u0001\u0000\u0000\u0000\u0013\u00ec\u0001\u0000\u0000\u0000\u0015"+
		"\u00ee\u0001\u0000\u0000\u0000\u0017\u00f8\u0001\u0000\u0000\u0000\u0019"+
		"\u00fc\u0001\u0000\u0000\u0000\u001b\u0100\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0007\u0000\u0000\u0000\u001e\u0002\u0001\u0000\u0000\u0000\u001f"+
		" \u0005#\u0000\u0000 \u0004\u0001\u0000\u0000\u0000!\"\u0005,\u0000\u0000"+
		"\"#\u0007\u0001\u0000\u0000#\u0006\u0001\u0000\u0000\u0000$%\u0005,\u0000"+
		"\u0000%&\u0007\u0002\u0000\u0000&\b\u0001\u0000\u0000\u0000\'(\u0005["+
		"\u0000\u0000(\n\u0001\u0000\u0000\u0000)*\u0005]\u0000\u0000*\f\u0001"+
		"\u0000\u0000\u0000+,\u0005,\u0000\u0000,-\u0007\u0001\u0000\u0000-.\u0005"+
		"]\u0000\u0000.\u000e\u0001\u0000\u0000\u0000/0\u0005]\u0000\u000001\u0005"+
		",\u0000\u000012\u0007\u0002\u0000\u00002\u0010\u0001\u0000\u0000\u0000"+
		"34\u0007\u0003\u0000\u000045\u0007\u0004\u0000\u00005O\u0007\u0004\u0000"+
		"\u000067\u0007\u0003\u0000\u000078\u0007\u0004\u0000\u00008O\u0007\u0005"+
		"\u0000\u00009:\u0007\u0003\u0000\u0000:;\u0007\u0006\u0000\u0000;O\u0007"+
		"\u0007\u0000\u0000<=\u0007\u0003\u0000\u0000=>\u0007\b\u0000\u0000>O\u0007"+
		"\t\u0000\u0000?@\u0007\u0003\u0000\u0000@A\u0007\n\u0000\u0000AO\u0007"+
		"\u0006\u0000\u0000BC\u0007\u0003\u0000\u0000CD\u0007\u000b\u0000\u0000"+
		"DO\u0007\f\u0000\u0000EF\u0007\u0003\u0000\u0000FG\u0007\r\u0000\u0000"+
		"GO\u0007\u0000\u0000\u0000HI\u0007\u0003\u0000\u0000IJ\u0007\u000e\u0000"+
		"\u0000JO\u0007\u0004\u0000\u0000KL\u0007\u0003\u0000\u0000LM\u0007\u000e"+
		"\u0000\u0000MO\u0007\u0005\u0000\u0000N3\u0001\u0000\u0000\u0000N6\u0001"+
		"\u0000\u0000\u0000N9\u0001\u0000\u0000\u0000N<\u0001\u0000\u0000\u0000"+
		"N?\u0001\u0000\u0000\u0000NB\u0001\u0000\u0000\u0000NE\u0001\u0000\u0000"+
		"\u0000NH\u0001\u0000\u0000\u0000NK\u0001\u0000\u0000\u0000O\u0012\u0001"+
		"\u0000\u0000\u0000PQ\u0007\u0000\u0000\u0000QR\u0007\u000f\u0000\u0000"+
		"R\u00ed\u0007\u0004\u0000\u0000ST\u0007\u0000\u0000\u0000TU\u0007\n\u0000"+
		"\u0000U\u00ed\u0007\u000f\u0000\u0000VW\u0007\u0000\u0000\u0000WX\u0007"+
		"\u0005\u0000\u0000X\u00ed\u0007\f\u0000\u0000YZ\u0007\u0003\u0000\u0000"+
		"Z[\u0007\t\u0000\u0000[\u00ed\u0007\u0010\u0000\u0000\\]\u0007\u0003\u0000"+
		"\u0000]^\u0007\r\u0000\u0000^\u00ed\u0007\u0011\u0000\u0000_`\u0007\u0004"+
		"\u0000\u0000`a\u0007\f\u0000\u0000a\u00ed\u0007\u0004\u0000\u0000bc\u0007"+
		"\u0004\u0000\u0000cd\u0007\f\u0000\u0000d\u00ed\u0007\u000f\u0000\u0000"+
		"ef\u0007\u0004\u0000\u0000fg\u0007\f\u0000\u0000g\u00ed\u0007\t\u0000"+
		"\u0000hi\u0007\u0004\u0000\u0000ij\u0007\f\u0000\u0000j\u00ed\u0007\u000e"+
		"\u0000\u0000kl\u0007\u0004\u0000\u0000lm\u0007\b\u0000\u0000m\u00ed\u0007"+
		"\u000b\u0000\u0000no\u0007\u0004\u0000\u0000op\u0007\u000b\u0000\u0000"+
		"p\u00ed\u0007\u0001\u0000\u0000qr\u0007\u0004\u0000\u0000rs\u0007\u000b"+
		"\u0000\u0000s\u00ed\u0007\u0002\u0000\u0000tu\u0007\u000f\u0000\u0000"+
		"uv\u0007\u0006\u0000\u0000v\u00ed\u0007\u0004\u0000\u0000wx\u0007\u000f"+
		"\u0000\u0000xy\u0007\u0006\u0000\u0000y\u00ed\u0007\u0001\u0000\u0000"+
		"z{\u0007\u000f\u0000\u0000{|\u0007\u0006\u0000\u0000|\u00ed\u0007\u0002"+
		"\u0000\u0000}~\u0007\u0006\u0000\u0000~\u007f\u0007\u0012\u0000\u0000"+
		"\u007f\u00ed\u0007\r\u0000\u0000\u0080\u0081\u0007\t\u0000\u0000\u0081"+
		"\u0082\u0007\n\u0000\u0000\u0082\u00ed\u0007\u0004\u0000\u0000\u0083\u0084"+
		"\u0007\t\u0000\u0000\u0084\u0085\u0007\n\u0000\u0000\u0085\u00ed\u0007"+
		"\u0001\u0000\u0000\u0086\u0087\u0007\t\u0000\u0000\u0087\u0088\u0007\n"+
		"\u0000\u0000\u0088\u00ed\u0007\u0002\u0000\u0000\u0089\u008a\u0007\u0013"+
		"\u0000\u0000\u008a\u008b\u0007\b\u0000\u0000\u008b\u00ed\u0007\u000b\u0000"+
		"\u0000\u008c\u008d\u0007\u0013\u0000\u0000\u008d\u008e\u0007\u0005\u0000"+
		"\u0000\u008e\u00ed\u0007\r\u0000\u0000\u008f\u0090\u0007\f\u0000\u0000"+
		"\u0090\u0091\u0007\u000f\u0000\u0000\u0091\u00ed\u0007\u0000\u0000\u0000"+
		"\u0092\u0093\u0007\f\u0000\u0000\u0093\u0094\u0007\u000f\u0000\u0000\u0094"+
		"\u00ed\u0007\u0002\u0000\u0000\u0095\u0096\u0007\f\u0000\u0000\u0096\u0097"+
		"\u0007\u000f\u0000\u0000\u0097\u00ed\u0007\u0001\u0000\u0000\u0098\u0099"+
		"\u0007\f\u0000\u0000\u0099\u009a\u0007\u0005\u0000\u0000\u009a\u00ed\u0007"+
		"\r\u0000\u0000\u009b\u009c\u0007\n\u0000\u0000\u009c\u009d\u0007\u0012"+
		"\u0000\u0000\u009d\u00ed\u0007\u000b\u0000\u0000\u009e\u009f\u0007\u0012"+
		"\u0000\u0000\u009f\u00a0\u0007\r\u0000\u0000\u00a0\u00ed\u0007\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0007\u000b\u0000\u0000\u00a2\u00a3\u0007\u0014\u0000"+
		"\u0000\u00a3\u00ed\u0007\u0000\u0000\u0000\u00a4\u00a5\u0007\u000b\u0000"+
		"\u0000\u00a5\u00a6\u0007\u0014\u0000\u0000\u00a6\u00ed\u0007\u0001\u0000"+
		"\u0000\u00a7\u00a8\u0007\u000b\u0000\u0000\u00a8\u00a9\u0007\u0014\u0000"+
		"\u0000\u00a9\u00ed\u0007\u0002\u0000\u0000\u00aa\u00ab\u0007\u000b\u0000"+
		"\u0000\u00ab\u00ac\u0007\u0014\u0000\u0000\u00ac\u00ed\u0007\u000b\u0000"+
		"\u0000\u00ad\u00ae\u0007\u000b\u0000\u0000\u00ae\u00af\u0007\f\u0000\u0000"+
		"\u00af\u00ed\u0007\u0000\u0000\u0000\u00b0\u00b1\u0007\u000b\u0000\u0000"+
		"\u00b1\u00b2\u0007\f\u0000\u0000\u00b2\u00ed\u0007\u000b\u0000\u0000\u00b3"+
		"\u00b4\u0007\u000b\u0000\u0000\u00b4\u00b5\u0007\f\u0000\u0000\u00b5\u00ed"+
		"\u0007\u0002\u0000\u0000\u00b6\u00b7\u0007\r\u0000\u0000\u00b7\u00b8\u0007"+
		"\u0012\u0000\u0000\u00b8\u00ed\u0007\f\u0000\u0000\u00b9\u00ba\u0007\r"+
		"\u0000\u0000\u00ba\u00bb\u0007\u0012\u0000\u0000\u00bb\u00ed\u0007\r\u0000"+
		"\u0000\u00bc\u00bd\u0007\r\u0000\u0000\u00bd\u00be\u0007\u0010\u0000\u0000"+
		"\u00be\u00ed\u0007\t\u0000\u0000\u00bf\u00c0\u0007\r\u0000\u0000\u00c0"+
		"\u00c1\u0007\u0010\u0000\u0000\u00c1\u00ed\u0007\u0005\u0000\u0000\u00c2"+
		"\u00c3\u0007\u0005\u0000\u0000\u00c3\u00c4\u0007\u0003\u0000\u0000\u00c4"+
		"\u00ed\u0007\u0004\u0000\u0000\u00c5\u00c6\u0007\u0005\u0000\u0000\u00c6"+
		"\u00c7\u0007\u0006\u0000\u0000\u00c7\u00ed\u0007\u0004\u0000\u0000\u00c8"+
		"\u00c9\u0007\u0005\u0000\u0000\u00c9\u00ca\u0007\u0006\u0000\u0000\u00ca"+
		"\u00ed\u0007\u000f\u0000\u0000\u00cb\u00cc\u0007\u0005\u0000\u0000\u00cc"+
		"\u00cd\u0007\u0006\u0000\u0000\u00cd\u00ed\u0007\t\u0000\u0000\u00ce\u00cf"+
		"\u0007\u0005\u0000\u0000\u00cf\u00d0\u0007\u0010\u0000\u0000\u00d0\u00ed"+
		"\u0007\u0000\u0000\u0000\u00d1\u00d2\u0007\u0005\u0000\u0000\u00d2\u00d3"+
		"\u0007\u0010\u0000\u0000\u00d3\u00ed\u0007\u0001\u0000\u0000\u00d4\u00d5"+
		"\u0007\u0005\u0000\u0000\u00d5\u00d6\u0007\u0010\u0000\u0000\u00d6\u00ed"+
		"\u0007\u0002\u0000\u0000\u00d7\u00d8\u0007\u0005\u0000\u0000\u00d8\u00d9"+
		"\u0007\u0010\u0000\u0000\u00d9\u00ed\u0007\u0015\u0000\u0000\u00da\u00db"+
		"\u0007\u0010\u0000\u0000\u00db\u00dc\u0007\u0000\u0000\u0000\u00dc\u00ed"+
		"\u0007\u0001\u0000\u0000\u00dd\u00de\u0007\u0010\u0000\u0000\u00de\u00df"+
		"\u0007\u0000\u0000\u0000\u00df\u00ed\u0007\u0002\u0000\u0000\u00e0\u00e1"+
		"\u0007\u0010\u0000\u0000\u00e1\u00e2\u0007\u0005\u0000\u0000\u00e2\u00ed"+
		"\u0007\u0001\u0000\u0000\u00e3\u00e4\u0007\u0010\u0000\u0000\u00e4\u00e5"+
		"\u0007\u0001\u0000\u0000\u00e5\u00ed\u0007\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0007\u0010\u0000\u0000\u00e7\u00e8\u0007\u0001\u0000\u0000\u00e8\u00ed"+
		"\u0007\u0005\u0000\u0000\u00e9\u00ea\u0007\u0010\u0000\u0000\u00ea\u00eb"+
		"\u0007\u0002\u0000\u0000\u00eb\u00ed\u0007\u0000\u0000\u0000\u00ecP\u0001"+
		"\u0000\u0000\u0000\u00ecS\u0001\u0000\u0000\u0000\u00ecV\u0001\u0000\u0000"+
		"\u0000\u00ecY\u0001\u0000\u0000\u0000\u00ec\\\u0001\u0000\u0000\u0000"+
		"\u00ec_\u0001\u0000\u0000\u0000\u00ecb\u0001\u0000\u0000\u0000\u00ece"+
		"\u0001\u0000\u0000\u0000\u00ech\u0001\u0000\u0000\u0000\u00eck\u0001\u0000"+
		"\u0000\u0000\u00ecn\u0001\u0000\u0000\u0000\u00ecq\u0001\u0000\u0000\u0000"+
		"\u00ect\u0001\u0000\u0000\u0000\u00ecw\u0001\u0000\u0000\u0000\u00ecz"+
		"\u0001\u0000\u0000\u0000\u00ec}\u0001\u0000\u0000\u0000\u00ec\u0080\u0001"+
		"\u0000\u0000\u0000\u00ec\u0083\u0001\u0000\u0000\u0000\u00ec\u0086\u0001"+
		"\u0000\u0000\u0000\u00ec\u0089\u0001\u0000\u0000\u0000\u00ec\u008c\u0001"+
		"\u0000\u0000\u0000\u00ec\u008f\u0001\u0000\u0000\u0000\u00ec\u0092\u0001"+
		"\u0000\u0000\u0000\u00ec\u0095\u0001\u0000\u0000\u0000\u00ec\u0098\u0001"+
		"\u0000\u0000\u0000\u00ec\u009b\u0001\u0000\u0000\u0000\u00ec\u009e\u0001"+
		"\u0000\u0000\u0000\u00ec\u00a1\u0001\u0000\u0000\u0000\u00ec\u00a4\u0001"+
		"\u0000\u0000\u0000\u00ec\u00a7\u0001\u0000\u0000\u0000\u00ec\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ad\u0001\u0000\u0000\u0000\u00ec\u00b0\u0001"+
		"\u0000\u0000\u0000\u00ec\u00b3\u0001\u0000\u0000\u0000\u00ec\u00b6\u0001"+
		"\u0000\u0000\u0000\u00ec\u00b9\u0001\u0000\u0000\u0000\u00ec\u00bc\u0001"+
		"\u0000\u0000\u0000\u00ec\u00bf\u0001\u0000\u0000\u0000\u00ec\u00c2\u0001"+
		"\u0000\u0000\u0000\u00ec\u00c5\u0001\u0000\u0000\u0000\u00ec\u00c8\u0001"+
		"\u0000\u0000\u0000\u00ec\u00cb\u0001\u0000\u0000\u0000\u00ec\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ec\u00d1\u0001\u0000\u0000\u0000\u00ec\u00d4\u0001"+
		"\u0000\u0000\u0000\u00ec\u00d7\u0001\u0000\u0000\u0000\u00ec\u00da\u0001"+
		"\u0000\u0000\u0000\u00ec\u00dd\u0001\u0000\u0000\u0000\u00ec\u00e0\u0001"+
		"\u0000\u0000\u0000\u00ec\u00e3\u0001\u0000\u0000\u0000\u00ec\u00e6\u0001"+
		"\u0000\u0000\u0000\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ed\u0014\u0001"+
		"\u0000\u0000\u0000\u00ee\u00f2\u0005;\u0000\u0000\u00ef\u00f1\b\u0016"+
		"\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0006\n\u0000\u0000\u00f6\u0016\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f9\u0007\u0016\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u0018\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0007\u0017\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0006\f\u0000\u0000\u00ff\u001a\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\t\u0000\u0000\u0000\u0101\u001c\u0001\u0000\u0000\u0000\u0005"+
		"\u0000N\u00ec\u00f2\u00fa\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}