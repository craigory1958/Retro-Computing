// Generated from Directives.g4 by ANTLR 4.13.2
package xcom.retro.xa.antlr;
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
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, Directives=24, 
		BinaryLiteral=25, OctalLiteral=26, DecimalLiteral=27, HexLiteral=28, CharacterLiteral=29, 
		StringLiteral=30, Identifier=31;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "Directives", "BinaryLiteral", 
			"OctalLiteral", "DecimalLiteral", "HexLiteral", "CharacterLiteral", "StringLiteral", 
			"Identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'.macro'", "','", "'='", "'('", "')'", "'*'", "'<='", "'>='", 
			"'+'", "'-'", "'/'", "'<<'", "'>>'", "'&'", "'|'", "'&&'", "'||'", "'=='", 
			"'!='", "'<'", "'>'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"Directives", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", 
			"CharacterLiteral", "StringLiteral", "Identifier"
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
	public String getGrammarFileName() { return "Directives.g4"; }

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
		"\u0004\u0000\u001f\u00fe\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u00c7\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0004\u0018\u00cd\b\u0018\u000b\u0018\f\u0018\u00ce\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0004\u0019\u00d5\b\u0019\u000b\u0019"+
		"\f\u0019\u00d6\u0001\u001a\u0001\u001a\u0003\u001a\u00db\b\u001a\u0001"+
		"\u001a\u0004\u001a\u00de\b\u001a\u000b\u001a\f\u001a\u00df\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u00e5\b\u001b\u0001\u001b\u0004\u001b"+
		"\u00e8\b\u001b\u000b\u001b\f\u001b\u00e9\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0005\u001d\u00f1\b\u001d\n\u001d\f\u001d"+
		"\u00f4\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u00fa\b\u001e\n\u001e\f\u001e\u00fd\t\u001e\u0000\u0000\u001f\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f\u0001\u0000\u001c\u0002"+
		"\u0000MMmm\u0002\u0000AAaa\u0002\u0000CCcc\u0002\u0000RRrr\u0002\u0000"+
		"OOoo\u0002\u0000LLll\u0002\u0000IIii\u0002\u0000GGgg\u0002\u0000NNnn\u0002"+
		"\u0000BBbb\u0002\u0000YYyy\u0002\u0000TTtt\u0002\u0000EEee\u0002\u0000"+
		"DDdd\u0002\u0000FFff\u0002\u0000QQqq\u0002\u0000UUuu\u0002\u0000SSss\u0002"+
		"\u0000PPpp\u0002\u0000WWww\u0001\u000001\u0001\u000007\u0001\u000009\u0002"+
		"\u0000XXxx\u0003\u000009AFaf\u0001\u0000\"\"\u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u0114\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0001?\u0001\u0000\u0000\u0000\u0003"+
		"A\u0001\u0000\u0000\u0000\u0005H\u0001\u0000\u0000\u0000\u0007J\u0001"+
		"\u0000\u0000\u0000\tL\u0001\u0000\u0000\u0000\u000bN\u0001\u0000\u0000"+
		"\u0000\rP\u0001\u0000\u0000\u0000\u000fR\u0001\u0000\u0000\u0000\u0011"+
		"U\u0001\u0000\u0000\u0000\u0013X\u0001\u0000\u0000\u0000\u0015Z\u0001"+
		"\u0000\u0000\u0000\u0017\\\u0001\u0000\u0000\u0000\u0019^\u0001\u0000"+
		"\u0000\u0000\u001ba\u0001\u0000\u0000\u0000\u001dd\u0001\u0000\u0000\u0000"+
		"\u001ff\u0001\u0000\u0000\u0000!h\u0001\u0000\u0000\u0000#k\u0001\u0000"+
		"\u0000\u0000%n\u0001\u0000\u0000\u0000\'q\u0001\u0000\u0000\u0000)t\u0001"+
		"\u0000\u0000\u0000+v\u0001\u0000\u0000\u0000-x\u0001\u0000\u0000\u0000"+
		"/\u00c6\u0001\u0000\u0000\u00001\u00c8\u0001\u0000\u0000\u00003\u00d0"+
		"\u0001\u0000\u0000\u00005\u00da\u0001\u0000\u0000\u00007\u00e4\u0001\u0000"+
		"\u0000\u00009\u00eb\u0001\u0000\u0000\u0000;\u00ee\u0001\u0000\u0000\u0000"+
		"=\u00f7\u0001\u0000\u0000\u0000?@\u0005.\u0000\u0000@\u0002\u0001\u0000"+
		"\u0000\u0000AB\u0005.\u0000\u0000BC\u0007\u0000\u0000\u0000CD\u0007\u0001"+
		"\u0000\u0000DE\u0007\u0002\u0000\u0000EF\u0007\u0003\u0000\u0000FG\u0007"+
		"\u0004\u0000\u0000G\u0004\u0001\u0000\u0000\u0000HI\u0005,\u0000\u0000"+
		"I\u0006\u0001\u0000\u0000\u0000JK\u0005=\u0000\u0000K\b\u0001\u0000\u0000"+
		"\u0000LM\u0005(\u0000\u0000M\n\u0001\u0000\u0000\u0000NO\u0005)\u0000"+
		"\u0000O\f\u0001\u0000\u0000\u0000PQ\u0005*\u0000\u0000Q\u000e\u0001\u0000"+
		"\u0000\u0000RS\u0005<\u0000\u0000ST\u0005=\u0000\u0000T\u0010\u0001\u0000"+
		"\u0000\u0000UV\u0005>\u0000\u0000VW\u0005=\u0000\u0000W\u0012\u0001\u0000"+
		"\u0000\u0000XY\u0005+\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000Z[\u0005"+
		"-\u0000\u0000[\u0016\u0001\u0000\u0000\u0000\\]\u0005/\u0000\u0000]\u0018"+
		"\u0001\u0000\u0000\u0000^_\u0005<\u0000\u0000_`\u0005<\u0000\u0000`\u001a"+
		"\u0001\u0000\u0000\u0000ab\u0005>\u0000\u0000bc\u0005>\u0000\u0000c\u001c"+
		"\u0001\u0000\u0000\u0000de\u0005&\u0000\u0000e\u001e\u0001\u0000\u0000"+
		"\u0000fg\u0005|\u0000\u0000g \u0001\u0000\u0000\u0000hi\u0005&\u0000\u0000"+
		"ij\u0005&\u0000\u0000j\"\u0001\u0000\u0000\u0000kl\u0005|\u0000\u0000"+
		"lm\u0005|\u0000\u0000m$\u0001\u0000\u0000\u0000no\u0005=\u0000\u0000o"+
		"p\u0005=\u0000\u0000p&\u0001\u0000\u0000\u0000qr\u0005!\u0000\u0000rs"+
		"\u0005=\u0000\u0000s(\u0001\u0000\u0000\u0000tu\u0005<\u0000\u0000u*\u0001"+
		"\u0000\u0000\u0000vw\u0005>\u0000\u0000w,\u0001\u0000\u0000\u0000xy\u0005"+
		"!\u0000\u0000y.\u0001\u0000\u0000\u0000z{\u0007\u0001\u0000\u0000{|\u0007"+
		"\u0005\u0000\u0000|}\u0007\u0006\u0000\u0000}~\u0007\u0007\u0000\u0000"+
		"~\u00c7\u0007\b\u0000\u0000\u007f\u0080\u0007\t\u0000\u0000\u0080\u0081"+
		"\u0007\n\u0000\u0000\u0081\u0082\u0007\u000b\u0000\u0000\u0082\u00c7\u0007"+
		"\f\u0000\u0000\u0083\u0084\u0007\f\u0000\u0000\u0084\u0085\u0007\b\u0000"+
		"\u0000\u0085\u00c7\u0007\r\u0000\u0000\u0086\u0087\u0007\f\u0000\u0000"+
		"\u0087\u0088\u0007\b\u0000\u0000\u0088\u0089\u0007\r\u0000\u0000\u0089"+
		"\u008a\u0007\u0006\u0000\u0000\u008a\u00c7\u0007\u000e\u0000\u0000\u008b"+
		"\u008c\u0007\f\u0000\u0000\u008c\u008d\u0007\b\u0000\u0000\u008d\u008e"+
		"\u0007\r\u0000\u0000\u008e\u008f\u0007\u0000\u0000\u0000\u008f\u0090\u0007"+
		"\u0001\u0000\u0000\u0090\u0091\u0007\u0002\u0000\u0000\u0091\u0092\u0007"+
		"\u0003\u0000\u0000\u0092\u00c7\u0007\u0004\u0000\u0000\u0093\u0094\u0007"+
		"\f\u0000\u0000\u0094\u0095\u0007\u000f\u0000\u0000\u0095\u00c7\u0007\u0010"+
		"\u0000\u0000\u0096\u0097\u0007\u0006\u0000\u0000\u0097\u00c7\u0007\u000e"+
		"\u0000\u0000\u0098\u0099\u0007\u0006\u0000\u0000\u0099\u009a\u0007\u000e"+
		"\u0000\u0000\u009a\u009b\u0007\r\u0000\u0000\u009b\u009c\u0007\f\u0000"+
		"\u0000\u009c\u00c7\u0007\u000e\u0000\u0000\u009d\u009e\u0007\u0006\u0000"+
		"\u0000\u009e\u009f\u0007\u000e\u0000\u0000\u009f\u00a0\u0007\b\u0000\u0000"+
		"\u00a0\u00a1\u0007\r\u0000\u0000\u00a1\u00a2\u0007\f\u0000\u0000\u00a2"+
		"\u00c7\u0007\u000e\u0000\u0000\u00a3\u00a4\u0007\u0006\u0000\u0000\u00a4"+
		"\u00a5\u0007\b\u0000\u0000\u00a5\u00a6\u0007\u0002\u0000\u0000\u00a6\u00a7"+
		"\u0007\u0005\u0000\u0000\u00a7\u00a8\u0007\u0010\u0000\u0000\u00a8\u00a9"+
		"\u0007\r\u0000\u0000\u00a9\u00c7\u0007\f\u0000\u0000\u00aa\u00ab\u0007"+
		"\u0005\u0000\u0000\u00ab\u00ac\u0007\u0006\u0000\u0000\u00ac\u00ad\u0007"+
		"\u0011\u0000\u0000\u00ad\u00c7\u0007\u000b\u0000\u0000\u00ae\u00af\u0007"+
		"\b\u0000\u0000\u00af\u00b0\u0007\u0004\u0000\u0000\u00b0\u00b1\u0007\u0005"+
		"\u0000\u0000\u00b1\u00b2\u0007\u0006\u0000\u0000\u00b2\u00b3\u0007\u0011"+
		"\u0000\u0000\u00b3\u00c7\u0007\u000b\u0000\u0000\u00b4\u00b5\u0007\u0004"+
		"\u0000\u0000\u00b5\u00b6\u0007\u0003\u0000\u0000\u00b6\u00c7\u0007\u0007"+
		"\u0000\u0000\u00b7\u00b8\u0007\u0012\u0000\u0000\u00b8\u00b9\u0007\u0001"+
		"\u0000\u0000\u00b9\u00ba\u0007\u0007\u0000\u0000\u00ba\u00c7\u0007\f\u0000"+
		"\u0000\u00bb\u00bc\u0007\u0011\u0000\u0000\u00bc\u00bd\u0007\f\u0000\u0000"+
		"\u00bd\u00be\u0007\u0007\u0000\u0000\u00be\u00bf\u0007\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0007\f\u0000\u0000\u00c0\u00c1\u0007\b\u0000\u0000\u00c1"+
		"\u00c7\u0007\u000b\u0000\u0000\u00c2\u00c3\u0007\u0013\u0000\u0000\u00c3"+
		"\u00c4\u0007\u0004\u0000\u0000\u00c4\u00c5\u0007\u0003\u0000\u0000\u00c5"+
		"\u00c7\u0007\r\u0000\u0000\u00c6z\u0001\u0000\u0000\u0000\u00c6\u007f"+
		"\u0001\u0000\u0000\u0000\u00c6\u0083\u0001\u0000\u0000\u0000\u00c6\u0086"+
		"\u0001\u0000\u0000\u0000\u00c6\u008b\u0001\u0000\u0000\u0000\u00c6\u0093"+
		"\u0001\u0000\u0000\u0000\u00c6\u0096\u0001\u0000\u0000\u0000\u00c6\u0098"+
		"\u0001\u0000\u0000\u0000\u00c6\u009d\u0001\u0000\u0000\u0000\u00c6\u00a3"+
		"\u0001\u0000\u0000\u0000\u00c6\u00aa\u0001\u0000\u0000\u0000\u00c6\u00ae"+
		"\u0001\u0000\u0000\u0000\u00c6\u00b4\u0001\u0000\u0000\u0000\u00c6\u00b7"+
		"\u0001\u0000\u0000\u0000\u00c6\u00bb\u0001\u0000\u0000\u0000\u00c6\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c70\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"0\u0000\u0000\u00c9\u00ca\u0007\t\u0000\u0000\u00ca\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cd\u0007\u0014\u0000\u0000\u00cc\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf2\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u00050\u0000\u0000\u00d1\u00d2\u0007\u0004\u0000\u0000"+
		"\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00d5\u0007\u0015\u0000\u0000"+
		"\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d74\u0001\u0000\u0000\u0000\u00d8\u00d9\u00050\u0000\u0000\u00d9\u00db"+
		"\u0007\r\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001"+
		"\u0000\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00de\u0007"+
		"\u0016\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001"+
		"\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e06\u0001\u0000\u0000\u0000\u00e1\u00e5\u0005$\u0000"+
		"\u0000\u00e2\u00e3\u00050\u0000\u0000\u00e3\u00e5\u0007\u0017\u0000\u0000"+
		"\u00e4\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e8\u0007\u0018\u0000\u0000"+
		"\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ea8\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\'\u0000\u0000\u00ec"+
		"\u00ed\b\u0019\u0000\u0000\u00ed:\u0001\u0000\u0000\u0000\u00ee\u00f2"+
		"\u0005\"\u0000\u0000\u00ef\u00f1\b\u0019\u0000\u0000\u00f0\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"\"\u0000\u0000\u00f6<\u0001\u0000\u0000\u0000\u00f7\u00fb\u0007\u001a"+
		"\u0000\u0000\u00f8\u00fa\u0007\u001b\u0000\u0000\u00f9\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc>\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\n\u0000\u00c6\u00ce\u00d6\u00da"+
		"\u00df\u00e4\u00e9\u00f2\u00fb\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}