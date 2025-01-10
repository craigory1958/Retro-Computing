// Generated from h:/_cwg-base__Home/Computer Archtecture/Retro Computing/xa/grammers/processors/MOS6502/MOS6502_v1_.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MOS6502v1_Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, OpcodeBranches=28, Opcodes=29, Directives=30, 
		Inject=31, BinaryLiteral=32, OctalLiteral=33, DecimalLiteral=34, HexLiteral=35, 
		CharacterLiteral=36, StringLiteral=37, Identifier=38, Comment=39, EOL=40, 
		WS=41;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "OpcodeBranches", "Opcodes", "Directives", "Inject", 
			"BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "CharacterLiteral", 
			"StringLiteral", "Identifier", "Comment", "EOL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'A'", "'#'", "','", "'X'", "'Y'", "'['", "']'", "'.'", "'('", 
			"')'", "'*'", "'<='", "'>='", "'+'", "'-'", "'/'", "'<<'", "'>>'", "'&'", 
			"'|'", "'&&'", "'||'", "'=='", "'!='", "'<'", "'>'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "OpcodeBranches", "Opcodes", "Directives", "Inject", 
			"BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "CharacterLiteral", 
			"StringLiteral", "Identifier", "Comment", "EOL", "WS"
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


	public MOS6502v1_Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MOS6502_v1_.g4"; }

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
		"\u0004\u0000)\u01aa\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u00ad\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u014b\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u015c\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u0162\b\u001e\n\u001e\f\u001e\u0165\t\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0004\u001f\u016b\b\u001f\u000b\u001f\f\u001f\u016c"+
		"\u0001 \u0001 \u0001 \u0001 \u0004 \u0173\b \u000b \f \u0174\u0001!\u0004"+
		"!\u0178\b!\u000b!\f!\u0179\u0001\"\u0001\"\u0001\"\u0003\"\u017f\b\"\u0001"+
		"\"\u0004\"\u0182\b\"\u000b\"\f\"\u0183\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0005$\u018b\b$\n$\f$\u018e\t$\u0001$\u0001$\u0001%\u0001%\u0005%\u0194"+
		"\b%\n%\f%\u0197\t%\u0001&\u0001&\u0005&\u019b\b&\n&\f&\u019e\t&\u0001"+
		"&\u0001&\u0001\'\u0004\'\u01a3\b\'\u000b\'\f\'\u01a4\u0001(\u0001(\u0001"+
		"(\u0001(\u0000\u0000)\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)\u0001\u0000 \u0002\u0000AAaa\u0002"+
		"\u0000XXxx\u0002\u0000YYyy\u0002\u0000BBbb\u0002\u0000CCcc\u0002\u0000"+
		"SSss\u0002\u0000EEee\u0002\u0000QQqq\u0002\u0000MMmm\u0002\u0000IIii\u0002"+
		"\u0000NNnn\u0002\u0000PPpp\u0002\u0000LLll\u0002\u0000RRrr\u0002\u0000"+
		"VVvv\u0002\u0000DDdd\u0002\u0000TTtt\u0002\u0000KKkk\u0002\u0000OOoo\u0002"+
		"\u0000JJjj\u0002\u0000HHhh\u0002\u0000ZZzz\u0002\u0000UUuu\u0002\u0000"+
		"\n\n\r\r\u0001\u000001\u0001\u000007\u0001\u000009\u0003\u000009AFaf\u0001"+
		"\u0000\"\"\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000\t\t  \u01f0"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K"+
		"\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000"+
		"\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0001S\u0001\u0000\u0000\u0000"+
		"\u0003U\u0001\u0000\u0000\u0000\u0005W\u0001\u0000\u0000\u0000\u0007Y"+
		"\u0001\u0000\u0000\u0000\t[\u0001\u0000\u0000\u0000\u000b]\u0001\u0000"+
		"\u0000\u0000\r_\u0001\u0000\u0000\u0000\u000fa\u0001\u0000\u0000\u0000"+
		"\u0011c\u0001\u0000\u0000\u0000\u0013e\u0001\u0000\u0000\u0000\u0015g"+
		"\u0001\u0000\u0000\u0000\u0017i\u0001\u0000\u0000\u0000\u0019l\u0001\u0000"+
		"\u0000\u0000\u001bo\u0001\u0000\u0000\u0000\u001dq\u0001\u0000\u0000\u0000"+
		"\u001fs\u0001\u0000\u0000\u0000!u\u0001\u0000\u0000\u0000#x\u0001\u0000"+
		"\u0000\u0000%{\u0001\u0000\u0000\u0000\'}\u0001\u0000\u0000\u0000)\u007f"+
		"\u0001\u0000\u0000\u0000+\u0082\u0001\u0000\u0000\u0000-\u0085\u0001\u0000"+
		"\u0000\u0000/\u0088\u0001\u0000\u0000\u00001\u008b\u0001\u0000\u0000\u0000"+
		"3\u008d\u0001\u0000\u0000\u00005\u008f\u0001\u0000\u0000\u00007\u00ac"+
		"\u0001\u0000\u0000\u00009\u014a\u0001\u0000\u0000\u0000;\u015b\u0001\u0000"+
		"\u0000\u0000=\u015d\u0001\u0000\u0000\u0000?\u0166\u0001\u0000\u0000\u0000"+
		"A\u016e\u0001\u0000\u0000\u0000C\u0177\u0001\u0000\u0000\u0000E\u017e"+
		"\u0001\u0000\u0000\u0000G\u0185\u0001\u0000\u0000\u0000I\u0188\u0001\u0000"+
		"\u0000\u0000K\u0191\u0001\u0000\u0000\u0000M\u0198\u0001\u0000\u0000\u0000"+
		"O\u01a2\u0001\u0000\u0000\u0000Q\u01a6\u0001\u0000\u0000\u0000ST\u0007"+
		"\u0000\u0000\u0000T\u0002\u0001\u0000\u0000\u0000UV\u0005#\u0000\u0000"+
		"V\u0004\u0001\u0000\u0000\u0000WX\u0005,\u0000\u0000X\u0006\u0001\u0000"+
		"\u0000\u0000YZ\u0007\u0001\u0000\u0000Z\b\u0001\u0000\u0000\u0000[\\\u0007"+
		"\u0002\u0000\u0000\\\n\u0001\u0000\u0000\u0000]^\u0005[\u0000\u0000^\f"+
		"\u0001\u0000\u0000\u0000_`\u0005]\u0000\u0000`\u000e\u0001\u0000\u0000"+
		"\u0000ab\u0005.\u0000\u0000b\u0010\u0001\u0000\u0000\u0000cd\u0005(\u0000"+
		"\u0000d\u0012\u0001\u0000\u0000\u0000ef\u0005)\u0000\u0000f\u0014\u0001"+
		"\u0000\u0000\u0000gh\u0005*\u0000\u0000h\u0016\u0001\u0000\u0000\u0000"+
		"ij\u0005<\u0000\u0000jk\u0005=\u0000\u0000k\u0018\u0001\u0000\u0000\u0000"+
		"lm\u0005>\u0000\u0000mn\u0005=\u0000\u0000n\u001a\u0001\u0000\u0000\u0000"+
		"op\u0005+\u0000\u0000p\u001c\u0001\u0000\u0000\u0000qr\u0005-\u0000\u0000"+
		"r\u001e\u0001\u0000\u0000\u0000st\u0005/\u0000\u0000t \u0001\u0000\u0000"+
		"\u0000uv\u0005<\u0000\u0000vw\u0005<\u0000\u0000w\"\u0001\u0000\u0000"+
		"\u0000xy\u0005>\u0000\u0000yz\u0005>\u0000\u0000z$\u0001\u0000\u0000\u0000"+
		"{|\u0005&\u0000\u0000|&\u0001\u0000\u0000\u0000}~\u0005|\u0000\u0000~"+
		"(\u0001\u0000\u0000\u0000\u007f\u0080\u0005&\u0000\u0000\u0080\u0081\u0005"+
		"&\u0000\u0000\u0081*\u0001\u0000\u0000\u0000\u0082\u0083\u0005|\u0000"+
		"\u0000\u0083\u0084\u0005|\u0000\u0000\u0084,\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005=\u0000\u0000\u0086\u0087\u0005=\u0000\u0000\u0087.\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0005!\u0000\u0000\u0089\u008a\u0005=\u0000"+
		"\u0000\u008a0\u0001\u0000\u0000\u0000\u008b\u008c\u0005<\u0000\u0000\u008c"+
		"2\u0001\u0000\u0000\u0000\u008d\u008e\u0005>\u0000\u0000\u008e4\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0005!\u0000\u0000\u00906\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0007\u0003\u0000\u0000\u0092\u0093\u0007\u0004\u0000"+
		"\u0000\u0093\u00ad\u0007\u0004\u0000\u0000\u0094\u0095\u0007\u0003\u0000"+
		"\u0000\u0095\u0096\u0007\u0004\u0000\u0000\u0096\u00ad\u0007\u0005\u0000"+
		"\u0000\u0097\u0098\u0007\u0003\u0000\u0000\u0098\u0099\u0007\u0006\u0000"+
		"\u0000\u0099\u00ad\u0007\u0007\u0000\u0000\u009a\u009b\u0007\u0003\u0000"+
		"\u0000\u009b\u009c\u0007\b\u0000\u0000\u009c\u00ad\u0007\t\u0000\u0000"+
		"\u009d\u009e\u0007\u0003\u0000\u0000\u009e\u009f\u0007\n\u0000\u0000\u009f"+
		"\u00ad\u0007\u0006\u0000\u0000\u00a0\u00a1\u0007\u0003\u0000\u0000\u00a1"+
		"\u00a2\u0007\u000b\u0000\u0000\u00a2\u00ad\u0007\f\u0000\u0000\u00a3\u00a4"+
		"\u0007\u0003\u0000\u0000\u00a4\u00a5\u0007\r\u0000\u0000\u00a5\u00ad\u0007"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0007\u0003\u0000\u0000\u00a7\u00a8\u0007"+
		"\u000e\u0000\u0000\u00a8\u00ad\u0007\u0004\u0000\u0000\u00a9\u00aa\u0007"+
		"\u0003\u0000\u0000\u00aa\u00ab\u0007\u000e\u0000\u0000\u00ab\u00ad\u0007"+
		"\u0005\u0000\u0000\u00ac\u0091\u0001\u0000\u0000\u0000\u00ac\u0094\u0001"+
		"\u0000\u0000\u0000\u00ac\u0097\u0001\u0000\u0000\u0000\u00ac\u009a\u0001"+
		"\u0000\u0000\u0000\u00ac\u009d\u0001\u0000\u0000\u0000\u00ac\u00a0\u0001"+
		"\u0000\u0000\u0000\u00ac\u00a3\u0001\u0000\u0000\u0000\u00ac\u00a6\u0001"+
		"\u0000\u0000\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ad8\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0007\u0000\u0000\u0000\u00af\u00b0\u0007\u000f"+
		"\u0000\u0000\u00b0\u014b\u0007\u0004\u0000\u0000\u00b1\u00b2\u0007\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0007\n\u0000\u0000\u00b3\u014b\u0007\u000f\u0000"+
		"\u0000\u00b4\u00b5\u0007\u0000\u0000\u0000\u00b5\u00b6\u0007\u0005\u0000"+
		"\u0000\u00b6\u014b\u0007\f\u0000\u0000\u00b7\u00b8\u0007\u0003\u0000\u0000"+
		"\u00b8\u00b9\u0007\t\u0000\u0000\u00b9\u014b\u0007\u0010\u0000\u0000\u00ba"+
		"\u00bb\u0007\u0003\u0000\u0000\u00bb\u00bc\u0007\r\u0000\u0000\u00bc\u014b"+
		"\u0007\u0011\u0000\u0000\u00bd\u00be\u0007\u0004\u0000\u0000\u00be\u00bf"+
		"\u0007\f\u0000\u0000\u00bf\u014b\u0007\u0004\u0000\u0000\u00c0\u00c1\u0007"+
		"\u0004\u0000\u0000\u00c1\u00c2\u0007\f\u0000\u0000\u00c2\u014b\u0007\u000f"+
		"\u0000\u0000\u00c3\u00c4\u0007\u0004\u0000\u0000\u00c4\u00c5\u0007\f\u0000"+
		"\u0000\u00c5\u014b\u0007\t\u0000\u0000\u00c6\u00c7\u0007\u0004\u0000\u0000"+
		"\u00c7\u00c8\u0007\f\u0000\u0000\u00c8\u014b\u0007\u000e\u0000\u0000\u00c9"+
		"\u00ca\u0007\u0004\u0000\u0000\u00ca\u00cb\u0007\b\u0000\u0000\u00cb\u014b"+
		"\u0007\u000b\u0000\u0000\u00cc\u00cd\u0007\u0004\u0000\u0000\u00cd\u00ce"+
		"\u0007\u000b\u0000\u0000\u00ce\u014b\u0007\u0001\u0000\u0000\u00cf\u00d0"+
		"\u0007\u0004\u0000\u0000\u00d0\u00d1\u0007\u000b\u0000\u0000\u00d1\u014b"+
		"\u0007\u0002\u0000\u0000\u00d2\u00d3\u0007\u000f\u0000\u0000\u00d3\u00d4"+
		"\u0007\u0006\u0000\u0000\u00d4\u014b\u0007\u0004\u0000\u0000\u00d5\u00d6"+
		"\u0007\u000f\u0000\u0000\u00d6\u00d7\u0007\u0006\u0000\u0000\u00d7\u014b"+
		"\u0007\u0001\u0000\u0000\u00d8\u00d9\u0007\u000f\u0000\u0000\u00d9\u00da"+
		"\u0007\u0006\u0000\u0000\u00da\u014b\u0007\u0002\u0000\u0000\u00db\u00dc"+
		"\u0007\u0006\u0000\u0000\u00dc\u00dd\u0007\u0012\u0000\u0000\u00dd\u014b"+
		"\u0007\r\u0000\u0000\u00de\u00df\u0007\t\u0000\u0000\u00df\u00e0\u0007"+
		"\n\u0000\u0000\u00e0\u014b\u0007\u0004\u0000\u0000\u00e1\u00e2\u0007\t"+
		"\u0000\u0000\u00e2\u00e3\u0007\n\u0000\u0000\u00e3\u014b\u0007\u0001\u0000"+
		"\u0000\u00e4\u00e5\u0007\t\u0000\u0000\u00e5\u00e6\u0007\n\u0000\u0000"+
		"\u00e6\u014b\u0007\u0002\u0000\u0000\u00e7\u00e8\u0007\u0013\u0000\u0000"+
		"\u00e8\u00e9\u0007\b\u0000\u0000\u00e9\u014b\u0007\u000b\u0000\u0000\u00ea"+
		"\u00eb\u0007\u0013\u0000\u0000\u00eb\u00ec\u0007\u0005\u0000\u0000\u00ec"+
		"\u014b\u0007\r\u0000\u0000\u00ed\u00ee\u0007\f\u0000\u0000\u00ee\u00ef"+
		"\u0007\u000f\u0000\u0000\u00ef\u014b\u0007\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0007\f\u0000\u0000\u00f1\u00f2\u0007\u000f\u0000\u0000\u00f2\u014b\u0007"+
		"\u0002\u0000\u0000\u00f3\u00f4\u0007\f\u0000\u0000\u00f4\u00f5\u0007\u000f"+
		"\u0000\u0000\u00f5\u014b\u0007\u0001\u0000\u0000\u00f6\u00f7\u0007\f\u0000"+
		"\u0000\u00f7\u00f8\u0007\u0005\u0000\u0000\u00f8\u014b\u0007\r\u0000\u0000"+
		"\u00f9\u00fa\u0007\n\u0000\u0000\u00fa\u00fb\u0007\u0012\u0000\u0000\u00fb"+
		"\u014b\u0007\u000b\u0000\u0000\u00fc\u00fd\u0007\u0012\u0000\u0000\u00fd"+
		"\u00fe\u0007\r\u0000\u0000\u00fe\u014b\u0007\u0000\u0000\u0000\u00ff\u0100"+
		"\u0007\u000b\u0000\u0000\u0100\u0101\u0007\u0014\u0000\u0000\u0101\u014b"+
		"\u0007\u0000\u0000\u0000\u0102\u0103\u0007\u000b\u0000\u0000\u0103\u0104"+
		"\u0007\u0014\u0000\u0000\u0104\u014b\u0007\u0001\u0000\u0000\u0105\u0106"+
		"\u0007\u000b\u0000\u0000\u0106\u0107\u0007\u0014\u0000\u0000\u0107\u014b"+
		"\u0007\u0002\u0000\u0000\u0108\u0109\u0007\u000b\u0000\u0000\u0109\u010a"+
		"\u0007\u0014\u0000\u0000\u010a\u014b\u0007\u000b\u0000\u0000\u010b\u010c"+
		"\u0007\u000b\u0000\u0000\u010c\u010d\u0007\f\u0000\u0000\u010d\u014b\u0007"+
		"\u0000\u0000\u0000\u010e\u010f\u0007\u000b\u0000\u0000\u010f\u0110\u0007"+
		"\f\u0000\u0000\u0110\u014b\u0007\u000b\u0000\u0000\u0111\u0112\u0007\u000b"+
		"\u0000\u0000\u0112\u0113\u0007\f\u0000\u0000\u0113\u014b\u0007\u0002\u0000"+
		"\u0000\u0114\u0115\u0007\r\u0000\u0000\u0115\u0116\u0007\u0012\u0000\u0000"+
		"\u0116\u014b\u0007\f\u0000\u0000\u0117\u0118\u0007\r\u0000\u0000\u0118"+
		"\u0119\u0007\u0012\u0000\u0000\u0119\u014b\u0007\r\u0000\u0000\u011a\u011b"+
		"\u0007\r\u0000\u0000\u011b\u011c\u0007\u0010\u0000\u0000\u011c\u014b\u0007"+
		"\t\u0000\u0000\u011d\u011e\u0007\r\u0000\u0000\u011e\u011f\u0007\u0010"+
		"\u0000\u0000\u011f\u014b\u0007\u0005\u0000\u0000\u0120\u0121\u0007\u0005"+
		"\u0000\u0000\u0121\u0122\u0007\u0003\u0000\u0000\u0122\u014b\u0007\u0004"+
		"\u0000\u0000\u0123\u0124\u0007\u0005\u0000\u0000\u0124\u0125\u0007\u0006"+
		"\u0000\u0000\u0125\u014b\u0007\u0004\u0000\u0000\u0126\u0127\u0007\u0005"+
		"\u0000\u0000\u0127\u0128\u0007\u0006\u0000\u0000\u0128\u014b\u0007\u000f"+
		"\u0000\u0000\u0129\u012a\u0007\u0005\u0000\u0000\u012a\u012b\u0007\u0006"+
		"\u0000\u0000\u012b\u014b\u0007\t\u0000\u0000\u012c\u012d\u0007\u0005\u0000"+
		"\u0000\u012d\u012e\u0007\u0010\u0000\u0000\u012e\u014b\u0007\u0000\u0000"+
		"\u0000\u012f\u0130\u0007\u0005\u0000\u0000\u0130\u0131\u0007\u0010\u0000"+
		"\u0000\u0131\u014b\u0007\u0001\u0000\u0000\u0132\u0133\u0007\u0005\u0000"+
		"\u0000\u0133\u0134\u0007\u0010\u0000\u0000\u0134\u014b\u0007\u0002\u0000"+
		"\u0000\u0135\u0136\u0007\u0005\u0000\u0000\u0136\u0137\u0007\u0010\u0000"+
		"\u0000\u0137\u014b\u0007\u0015\u0000\u0000\u0138\u0139\u0007\u0010\u0000"+
		"\u0000\u0139\u013a\u0007\u0000\u0000\u0000\u013a\u014b\u0007\u0001\u0000"+
		"\u0000\u013b\u013c\u0007\u0010\u0000\u0000\u013c\u013d\u0007\u0000\u0000"+
		"\u0000\u013d\u014b\u0007\u0002\u0000\u0000\u013e\u013f\u0007\u0010\u0000"+
		"\u0000\u013f\u0140\u0007\u0005\u0000\u0000\u0140\u014b\u0007\u0001\u0000"+
		"\u0000\u0141\u0142\u0007\u0010\u0000\u0000\u0142\u0143\u0007\u0001\u0000"+
		"\u0000\u0143\u014b\u0007\u0000\u0000\u0000\u0144\u0145\u0007\u0010\u0000"+
		"\u0000\u0145\u0146\u0007\u0001\u0000\u0000\u0146\u014b\u0007\u0005\u0000"+
		"\u0000\u0147\u0148\u0007\u0010\u0000\u0000\u0148\u0149\u0007\u0002\u0000"+
		"\u0000\u0149\u014b\u0007\u0000\u0000\u0000\u014a\u00ae\u0001\u0000\u0000"+
		"\u0000\u014a\u00b1\u0001\u0000\u0000\u0000\u014a\u00b4\u0001\u0000\u0000"+
		"\u0000\u014a\u00b7\u0001\u0000\u0000\u0000\u014a\u00ba\u0001\u0000\u0000"+
		"\u0000\u014a\u00bd\u0001\u0000\u0000\u0000\u014a\u00c0\u0001\u0000\u0000"+
		"\u0000\u014a\u00c3\u0001\u0000\u0000\u0000\u014a\u00c6\u0001\u0000\u0000"+
		"\u0000\u014a\u00c9\u0001\u0000\u0000\u0000\u014a\u00cc\u0001\u0000\u0000"+
		"\u0000\u014a\u00cf\u0001\u0000\u0000\u0000\u014a\u00d2\u0001\u0000\u0000"+
		"\u0000\u014a\u00d5\u0001\u0000\u0000\u0000\u014a\u00d8\u0001\u0000\u0000"+
		"\u0000\u014a\u00db\u0001\u0000\u0000\u0000\u014a\u00de\u0001\u0000\u0000"+
		"\u0000\u014a\u00e1\u0001\u0000\u0000\u0000\u014a\u00e4\u0001\u0000\u0000"+
		"\u0000\u014a\u00e7\u0001\u0000\u0000\u0000\u014a\u00ea\u0001\u0000\u0000"+
		"\u0000\u014a\u00ed\u0001\u0000\u0000\u0000\u014a\u00f0\u0001\u0000\u0000"+
		"\u0000\u014a\u00f3\u0001\u0000\u0000\u0000\u014a\u00f6\u0001\u0000\u0000"+
		"\u0000\u014a\u00f9\u0001\u0000\u0000\u0000\u014a\u00fc\u0001\u0000\u0000"+
		"\u0000\u014a\u00ff\u0001\u0000\u0000\u0000\u014a\u0102\u0001\u0000\u0000"+
		"\u0000\u014a\u0105\u0001\u0000\u0000\u0000\u014a\u0108\u0001\u0000\u0000"+
		"\u0000\u014a\u010b\u0001\u0000\u0000\u0000\u014a\u010e\u0001\u0000\u0000"+
		"\u0000\u014a\u0111\u0001\u0000\u0000\u0000\u014a\u0114\u0001\u0000\u0000"+
		"\u0000\u014a\u0117\u0001\u0000\u0000\u0000\u014a\u011a\u0001\u0000\u0000"+
		"\u0000\u014a\u011d\u0001\u0000\u0000\u0000\u014a\u0120\u0001\u0000\u0000"+
		"\u0000\u014a\u0123\u0001\u0000\u0000\u0000\u014a\u0126\u0001\u0000\u0000"+
		"\u0000\u014a\u0129\u0001\u0000\u0000\u0000\u014a\u012c\u0001\u0000\u0000"+
		"\u0000\u014a\u012f\u0001\u0000\u0000\u0000\u014a\u0132\u0001\u0000\u0000"+
		"\u0000\u014a\u0135\u0001\u0000\u0000\u0000\u014a\u0138\u0001\u0000\u0000"+
		"\u0000\u014a\u013b\u0001\u0000\u0000\u0000\u014a\u013e\u0001\u0000\u0000"+
		"\u0000\u014a\u0141\u0001\u0000\u0000\u0000\u014a\u0144\u0001\u0000\u0000"+
		"\u0000\u014a\u0147\u0001\u0000\u0000\u0000\u014b:\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0007\u0006\u0000\u0000\u014d\u014e\u0007\u0007\u0000\u0000"+
		"\u014e\u015c\u0007\u0016\u0000\u0000\u014f\u0150\u0007\t\u0000\u0000\u0150"+
		"\u0151\u0007\n\u0000\u0000\u0151\u0152\u0007\u0004\u0000\u0000\u0152\u0153"+
		"\u0007\f\u0000\u0000\u0153\u0154\u0007\u0016\u0000\u0000\u0154\u0155\u0007"+
		"\u000f\u0000\u0000\u0155\u015c\u0007\u0006\u0000\u0000\u0156\u0157\u0007"+
		"\b\u0000\u0000\u0157\u0158\u0007\u0000\u0000\u0000\u0158\u0159\u0007\u0004"+
		"\u0000\u0000\u0159\u015a\u0007\r\u0000\u0000\u015a\u015c\u0007\u0012\u0000"+
		"\u0000\u015b\u014c\u0001\u0000\u0000\u0000\u015b\u014f\u0001\u0000\u0000"+
		"\u0000\u015b\u0156\u0001\u0000\u0000\u0000\u015c<\u0001\u0000\u0000\u0000"+
		"\u015d\u015e\u0005-\u0000\u0000\u015e\u015f\u0005>\u0000\u0000\u015f\u0163"+
		"\u0001\u0000\u0000\u0000\u0160\u0162\b\u0017\u0000\u0000\u0161\u0160\u0001"+
		"\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163\u0161\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164>\u0001\u0000"+
		"\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u0167\u00050\u0000"+
		"\u0000\u0167\u0168\u0007\u0003\u0000\u0000\u0168\u016a\u0001\u0000\u0000"+
		"\u0000\u0169\u016b\u0007\u0018\u0000\u0000\u016a\u0169\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000"+
		"\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d@\u0001\u0000\u0000\u0000"+
		"\u016e\u016f\u00050\u0000\u0000\u016f\u0170\u0007\u0012\u0000\u0000\u0170"+
		"\u0172\u0001\u0000\u0000\u0000\u0171\u0173\u0007\u0019\u0000\u0000\u0172"+
		"\u0171\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174"+
		"\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175"+
		"B\u0001\u0000\u0000\u0000\u0176\u0178\u0007\u001a\u0000\u0000\u0177\u0176"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u0177"+
		"\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017aD\u0001"+
		"\u0000\u0000\u0000\u017b\u017f\u0005$\u0000\u0000\u017c\u017d\u00050\u0000"+
		"\u0000\u017d\u017f\u0007\u0001\u0000\u0000\u017e\u017b\u0001\u0000\u0000"+
		"\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u0181\u0001\u0000\u0000"+
		"\u0000\u0180\u0182\u0007\u001b\u0000\u0000\u0181\u0180\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184F\u0001\u0000\u0000\u0000"+
		"\u0185\u0186\u0005\'\u0000\u0000\u0186\u0187\b\u001c\u0000\u0000\u0187"+
		"H\u0001\u0000\u0000\u0000\u0188\u018c\u0005\"\u0000\u0000\u0189\u018b"+
		"\b\u001c\u0000\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018b\u018e\u0001"+
		"\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001"+
		"\u0000\u0000\u0000\u018d\u018f\u0001\u0000\u0000\u0000\u018e\u018c\u0001"+
		"\u0000\u0000\u0000\u018f\u0190\u0005\"\u0000\u0000\u0190J\u0001\u0000"+
		"\u0000\u0000\u0191\u0195\u0007\u001d\u0000\u0000\u0192\u0194\u0007\u001e"+
		"\u0000\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0194\u0197\u0001\u0000"+
		"\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000"+
		"\u0000\u0000\u0196L\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000"+
		"\u0000\u0198\u019c\u0005;\u0000\u0000\u0199\u019b\b\u0017\u0000\u0000"+
		"\u019a\u0199\u0001\u0000\u0000\u0000\u019b\u019e\u0001\u0000\u0000\u0000"+
		"\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000"+
		"\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000"+
		"\u019f\u01a0\u0006&\u0000\u0000\u01a0N\u0001\u0000\u0000\u0000\u01a1\u01a3"+
		"\u0007\u0017\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a5P\u0001\u0000\u0000\u0000\u01a6\u01a7\u0007"+
		"\u001f\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9\u0006"+
		"(\u0000\u0000\u01a9R\u0001\u0000\u0000\u0000\u000e\u0000\u00ac\u014a\u015b"+
		"\u0163\u016c\u0174\u0179\u017e\u0183\u018c\u0195\u019c\u01a4\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}