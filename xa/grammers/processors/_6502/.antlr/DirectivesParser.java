// Generated from h:/_cwg-base__Home/Computer Archtecture/Retro Computing/xa/grammers/processors/MOS6502/Directives.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DirectivesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, Directives=22, Inject=23, BinaryLiteral=24, 
		OctalLiteral=25, DecimalLiteral=26, HexLiteral=27, CharacterLiteral=28, 
		StringLiteral=29, Identifier=30;
	public static final int
		RULE_directive = 0, RULE_macro = 1, RULE_inject = 2, RULE_argumentList = 3, 
		RULE_argument = 4, RULE_dottedIdentifier = 5, RULE_label = 6, RULE_expr = 7, 
		RULE_term = 8, RULE_lc = 9, RULE_binary = 10, RULE_comparison = 11, RULE_unary = 12, 
		RULE_integerAdd = 13, RULE_integerSubtract = 14, RULE_integerMultiply = 15, 
		RULE_integerDivide = 16, RULE_bitwiseShiftLeft = 17, RULE_bitwiseShiftRight = 18, 
		RULE_bitwiseAnd = 19, RULE_bitwiseOr = 20, RULE_logicalAnd = 21, RULE_logicalOr = 22, 
		RULE_equal = 23, RULE_notEqual = 24, RULE_lessThan = 25, RULE_greaterThan = 26, 
		RULE_plus = 27, RULE_minus = 28, RULE_highByte = 29, RULE_lowByte = 30, 
		RULE_logicalNot = 31, RULE_literal = 32, RULE_numericLiteral = 33, RULE_alphanumericLiteral = 34, 
		RULE_binaryLiteral = 35, RULE_octalLiteral = 36, RULE_decimalLiteral = 37, 
		RULE_hexLiteral = 38, RULE_characterLiteral = 39, RULE_stringLiteral = 40, 
		RULE_identifier = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"directive", "macro", "inject", "argumentList", "argument", "dottedIdentifier", 
			"label", "expr", "term", "lc", "binary", "comparison", "unary", "integerAdd", 
			"integerSubtract", "integerMultiply", "integerDivide", "bitwiseShiftLeft", 
			"bitwiseShiftRight", "bitwiseAnd", "bitwiseOr", "logicalAnd", "logicalOr", 
			"equal", "notEqual", "lessThan", "greaterThan", "plus", "minus", "highByte", 
			"lowByte", "logicalNot", "literal", "numericLiteral", "alphanumericLiteral", 
			"binaryLiteral", "octalLiteral", "decimalLiteral", "hexLiteral", "characterLiteral", 
			"stringLiteral", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "'('", "')'", "'*'", "'<='", "'>='", "'+'", "'-'", 
			"'/'", "'<<'", "'>>'", "'&'", "'|'", "'&&'", "'||'", "'=='", "'!='", 
			"'<'", "'>'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "Directives", 
			"Inject", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", 
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

	@Override
	public String getGrammarFileName() { return "Directives.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DirectivesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveContext extends ParserRuleContext {
		public TerminalNode Directives() { return getToken(DirectivesParser.Directives, 0); }
		public MacroContext macro() {
			return getRuleContext(MacroContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public InjectContext inject() {
			return getRuleContext(InjectContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(84);
				label();
				}
			}

			setState(87);
			match(T__0);
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Directives:
				{
				setState(88);
				match(Directives);
				}
				break;
			case Identifier:
				{
				setState(89);
				macro();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2134377258L) != 0)) {
				{
				setState(92);
				argumentList();
				}
			}

			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inject) {
				{
				setState(95);
				inject();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MacroContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public MacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro; }
	}

	public final MacroContext macro() throws RecognitionException {
		MacroContext _localctx = new MacroContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_macro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InjectContext extends ParserRuleContext {
		public TerminalNode Inject() { return getToken(DirectivesParser.Inject, 0); }
		public InjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inject; }
	}

	public final InjectContext inject() throws RecognitionException {
		InjectContext _localctx = new InjectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(Inject);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			argument();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(103);
				match(T__1);
				setState(104);
				argumentList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public DottedIdentifierContext dottedIdentifier() {
			return getRuleContext(DottedIdentifierContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argument);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				dottedIdentifier();
				}
				break;
			case T__2:
			case T__4:
			case T__7:
			case T__8:
			case T__18:
			case T__19:
			case T__20:
			case BinaryLiteral:
			case OctalLiteral:
			case DecimalLiteral:
			case HexLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DottedIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public DottedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dottedIdentifier; }
	}

	public final DottedIdentifierContext dottedIdentifier() throws RecognitionException {
		DottedIdentifierContext _localctx = new DottedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dottedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__0);
			setState(112);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<BinaryContext> binary() {
			return getRuleContexts(BinaryContext.class);
		}
		public BinaryContext binary(int i) {
			return getRuleContext(BinaryContext.class,i);
		}
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			term();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2097120L) != 0)) {
				{
				{
				setState(119);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
					{
					setState(117);
					binary();
					}
					break;
				case T__5:
				case T__6:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
					{
					setState(118);
					comparison();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(121);
				term();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public LcContext lc() {
			return getRuleContext(LcContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_term);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				lc();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				identifier();
				}
				break;
			case BinaryLiteral:
			case OctalLiteral:
			case DecimalLiteral:
			case HexLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				literal();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				match(T__2);
				setState(132);
				expr();
				setState(133);
				match(T__3);
				}
				break;
			case T__7:
			case T__8:
			case T__18:
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				unary();
				setState(136);
				term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LcContext extends ParserRuleContext {
		public LcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lc; }
	}

	public final LcContext lc() throws RecognitionException {
		LcContext _localctx = new LcContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryContext extends ParserRuleContext {
		public IntegerAddContext integerAdd() {
			return getRuleContext(IntegerAddContext.class,0);
		}
		public IntegerSubtractContext integerSubtract() {
			return getRuleContext(IntegerSubtractContext.class,0);
		}
		public IntegerMultiplyContext integerMultiply() {
			return getRuleContext(IntegerMultiplyContext.class,0);
		}
		public IntegerDivideContext integerDivide() {
			return getRuleContext(IntegerDivideContext.class,0);
		}
		public BitwiseShiftLeftContext bitwiseShiftLeft() {
			return getRuleContext(BitwiseShiftLeftContext.class,0);
		}
		public BitwiseShiftRightContext bitwiseShiftRight() {
			return getRuleContext(BitwiseShiftRightContext.class,0);
		}
		public BitwiseAndContext bitwiseAnd() {
			return getRuleContext(BitwiseAndContext.class,0);
		}
		public BitwiseOrContext bitwiseOr() {
			return getRuleContext(BitwiseOrContext.class,0);
		}
		public LogicalAndContext logicalAnd() {
			return getRuleContext(LogicalAndContext.class,0);
		}
		public LogicalOrContext logicalOr() {
			return getRuleContext(LogicalOrContext.class,0);
		}
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_binary);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				integerAdd();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				integerSubtract();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				integerMultiply();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				integerDivide();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				bitwiseShiftLeft();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				bitwiseShiftRight();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 7);
				{
				setState(148);
				bitwiseAnd();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 8);
				{
				setState(149);
				bitwiseOr();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 9);
				{
				setState(150);
				logicalAnd();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 10);
				{
				setState(151);
				logicalOr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public NotEqualContext notEqual() {
			return getRuleContext(NotEqualContext.class,0);
		}
		public LessThanContext lessThan() {
			return getRuleContext(LessThanContext.class,0);
		}
		public GreaterThanContext greaterThan() {
			return getRuleContext(GreaterThanContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparison);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				equal();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				notEqual();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				lessThan();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				greaterThan();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryContext extends ParserRuleContext {
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public HighByteContext highByte() {
			return getRuleContext(HighByteContext.class,0);
		}
		public LowByteContext lowByte() {
			return getRuleContext(LowByteContext.class,0);
		}
		public LogicalNotContext logicalNot() {
			return getRuleContext(LogicalNotContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unary);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				plus();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				minus();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				highByte();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				lowByte();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				logicalNot();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerAddContext extends ParserRuleContext {
		public IntegerAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerAdd; }
	}

	public final IntegerAddContext integerAdd() throws RecognitionException {
		IntegerAddContext _localctx = new IntegerAddContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_integerAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerSubtractContext extends ParserRuleContext {
		public IntegerSubtractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerSubtract; }
	}

	public final IntegerSubtractContext integerSubtract() throws RecognitionException {
		IntegerSubtractContext _localctx = new IntegerSubtractContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_integerSubtract);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerMultiplyContext extends ParserRuleContext {
		public IntegerMultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerMultiply; }
	}

	public final IntegerMultiplyContext integerMultiply() throws RecognitionException {
		IntegerMultiplyContext _localctx = new IntegerMultiplyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_integerMultiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerDivideContext extends ParserRuleContext {
		public IntegerDivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerDivide; }
	}

	public final IntegerDivideContext integerDivide() throws RecognitionException {
		IntegerDivideContext _localctx = new IntegerDivideContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_integerDivide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseShiftLeftContext extends ParserRuleContext {
		public BitwiseShiftLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseShiftLeft; }
	}

	public final BitwiseShiftLeftContext bitwiseShiftLeft() throws RecognitionException {
		BitwiseShiftLeftContext _localctx = new BitwiseShiftLeftContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bitwiseShiftLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseShiftRightContext extends ParserRuleContext {
		public BitwiseShiftRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseShiftRight; }
	}

	public final BitwiseShiftRightContext bitwiseShiftRight() throws RecognitionException {
		BitwiseShiftRightContext _localctx = new BitwiseShiftRightContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bitwiseShiftRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseAndContext extends ParserRuleContext {
		public BitwiseAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseAnd; }
	}

	public final BitwiseAndContext bitwiseAnd() throws RecognitionException {
		BitwiseAndContext _localctx = new BitwiseAndContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bitwiseAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseOrContext extends ParserRuleContext {
		public BitwiseOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseOr; }
	}

	public final BitwiseOrContext bitwiseOr() throws RecognitionException {
		BitwiseOrContext _localctx = new BitwiseOrContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bitwiseOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndContext extends ParserRuleContext {
		public LogicalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAnd; }
	}

	public final LogicalAndContext logicalAnd() throws RecognitionException {
		LogicalAndContext _localctx = new LogicalAndContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logicalAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrContext extends ParserRuleContext {
		public LogicalOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOr; }
	}

	public final LogicalOrContext logicalOr() throws RecognitionException {
		LogicalOrContext _localctx = new LogicalOrContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logicalOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualContext extends ParserRuleContext {
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotEqualContext extends ParserRuleContext {
		public NotEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notEqual; }
	}

	public final NotEqualContext notEqual() throws RecognitionException {
		NotEqualContext _localctx = new NotEqualContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_notEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LessThanContext extends ParserRuleContext {
		public LessThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThan; }
	}

	public final LessThanContext lessThan() throws RecognitionException {
		LessThanContext _localctx = new LessThanContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lessThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanContext extends ParserRuleContext {
		public GreaterThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThan; }
	}

	public final GreaterThanContext greaterThan() throws RecognitionException {
		GreaterThanContext _localctx = new GreaterThanContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_greaterThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PlusContext extends ParserRuleContext {
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MinusContext extends ParserRuleContext {
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HighByteContext extends ParserRuleContext {
		public HighByteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_highByte; }
	}

	public final HighByteContext highByte() throws RecognitionException {
		HighByteContext _localctx = new HighByteContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_highByte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LowByteContext extends ParserRuleContext {
		public LowByteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowByte; }
	}

	public final LowByteContext lowByte() throws RecognitionException {
		LowByteContext _localctx = new LowByteContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_lowByte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalNotContext extends ParserRuleContext {
		public LogicalNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalNot; }
	}

	public final LogicalNotContext logicalNot() throws RecognitionException {
		LogicalNotContext _localctx = new LogicalNotContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_logicalNot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public AlphanumericLiteralContext alphanumericLiteral() {
			return getRuleContext(AlphanumericLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_literal);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BinaryLiteral:
			case OctalLiteral:
			case DecimalLiteral:
			case HexLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				numericLiteral();
				}
				break;
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				alphanumericLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumericLiteralContext extends ParserRuleContext {
		public BinaryLiteralContext binaryLiteral() {
			return getRuleContext(BinaryLiteralContext.class,0);
		}
		public OctalLiteralContext octalLiteral() {
			return getRuleContext(OctalLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public HexLiteralContext hexLiteral() {
			return getRuleContext(HexLiteralContext.class,0);
		}
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_numericLiteral);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BinaryLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				binaryLiteral();
				}
				break;
			case OctalLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				octalLiteral();
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				decimalLiteral();
				}
				break;
			case HexLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				hexLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlphanumericLiteralContext extends ParserRuleContext {
		public CharacterLiteralContext characterLiteral() {
			return getRuleContext(CharacterLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public AlphanumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphanumericLiteral; }
	}

	public final AlphanumericLiteralContext alphanumericLiteral() throws RecognitionException {
		AlphanumericLiteralContext _localctx = new AlphanumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_alphanumericLiteral);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CharacterLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				characterLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryLiteralContext extends ParserRuleContext {
		public TerminalNode BinaryLiteral() { return getToken(DirectivesParser.BinaryLiteral, 0); }
		public BinaryLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryLiteral; }
	}

	public final BinaryLiteralContext binaryLiteral() throws RecognitionException {
		BinaryLiteralContext _localctx = new BinaryLiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_binaryLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(BinaryLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OctalLiteralContext extends ParserRuleContext {
		public TerminalNode OctalLiteral() { return getToken(DirectivesParser.OctalLiteral, 0); }
		public OctalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octalLiteral; }
	}

	public final OctalLiteralContext octalLiteral() throws RecognitionException {
		OctalLiteralContext _localctx = new OctalLiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_octalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(OctalLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(DirectivesParser.DecimalLiteral, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(DecimalLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HexLiteralContext extends ParserRuleContext {
		public TerminalNode HexLiteral() { return getToken(DirectivesParser.HexLiteral, 0); }
		public HexLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexLiteral; }
	}

	public final HexLiteralContext hexLiteral() throws RecognitionException {
		HexLiteralContext _localctx = new HexLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_hexLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(HexLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharacterLiteralContext extends ParserRuleContext {
		public TerminalNode CharacterLiteral() { return getToken(DirectivesParser.CharacterLiteral, 0); }
		public CharacterLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterLiteral; }
	}

	public final CharacterLiteralContext characterLiteral() throws RecognitionException {
		CharacterLiteralContext _localctx = new CharacterLiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(CharacterLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(DirectivesParser.StringLiteral, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00ec\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0001\u0000\u0003\u0000V\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000[\b\u0000\u0001\u0000\u0003"+
		"\u0000^\b\u0000\u0001\u0000\u0003\u0000a\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"j\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004n\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007x\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007|\b\u0007"+
		"\n\u0007\f\u0007\u007f\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008b\b\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0099\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a1\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a8\b\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0003 \u00d2\b \u0001!\u0001!\u0001!\u0001!\u0003!\u00d8\b!\u0001\""+
		"\u0001\"\u0003\"\u00dc\b\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0000\u0000"+
		"*\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR\u0000\u0000\u00e4\u0000U\u0001"+
		"\u0000\u0000\u0000\u0002b\u0001\u0000\u0000\u0000\u0004d\u0001\u0000\u0000"+
		"\u0000\u0006f\u0001\u0000\u0000\u0000\bm\u0001\u0000\u0000\u0000\no\u0001"+
		"\u0000\u0000\u0000\fr\u0001\u0000\u0000\u0000\u000et\u0001\u0000\u0000"+
		"\u0000\u0010\u008a\u0001\u0000\u0000\u0000\u0012\u008c\u0001\u0000\u0000"+
		"\u0000\u0014\u0098\u0001\u0000\u0000\u0000\u0016\u00a0\u0001\u0000\u0000"+
		"\u0000\u0018\u00a7\u0001\u0000\u0000\u0000\u001a\u00a9\u0001\u0000\u0000"+
		"\u0000\u001c\u00ab\u0001\u0000\u0000\u0000\u001e\u00ad\u0001\u0000\u0000"+
		"\u0000 \u00af\u0001\u0000\u0000\u0000\"\u00b1\u0001\u0000\u0000\u0000"+
		"$\u00b3\u0001\u0000\u0000\u0000&\u00b5\u0001\u0000\u0000\u0000(\u00b7"+
		"\u0001\u0000\u0000\u0000*\u00b9\u0001\u0000\u0000\u0000,\u00bb\u0001\u0000"+
		"\u0000\u0000.\u00bd\u0001\u0000\u0000\u00000\u00bf\u0001\u0000\u0000\u0000"+
		"2\u00c1\u0001\u0000\u0000\u00004\u00c3\u0001\u0000\u0000\u00006\u00c5"+
		"\u0001\u0000\u0000\u00008\u00c7\u0001\u0000\u0000\u0000:\u00c9\u0001\u0000"+
		"\u0000\u0000<\u00cb\u0001\u0000\u0000\u0000>\u00cd\u0001\u0000\u0000\u0000"+
		"@\u00d1\u0001\u0000\u0000\u0000B\u00d7\u0001\u0000\u0000\u0000D\u00db"+
		"\u0001\u0000\u0000\u0000F\u00dd\u0001\u0000\u0000\u0000H\u00df\u0001\u0000"+
		"\u0000\u0000J\u00e1\u0001\u0000\u0000\u0000L\u00e3\u0001\u0000\u0000\u0000"+
		"N\u00e5\u0001\u0000\u0000\u0000P\u00e7\u0001\u0000\u0000\u0000R\u00e9"+
		"\u0001\u0000\u0000\u0000TV\u0003\f\u0006\u0000UT\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WZ\u0005\u0001\u0000"+
		"\u0000X[\u0005\u0016\u0000\u0000Y[\u0003\u0002\u0001\u0000ZX\u0001\u0000"+
		"\u0000\u0000ZY\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\^\u0003"+
		"\u0006\u0003\u0000]\\\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^`\u0001\u0000\u0000\u0000_a\u0003\u0004\u0002\u0000`_\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000a\u0001\u0001\u0000\u0000\u0000bc\u0005"+
		"\u001e\u0000\u0000c\u0003\u0001\u0000\u0000\u0000de\u0005\u0017\u0000"+
		"\u0000e\u0005\u0001\u0000\u0000\u0000fi\u0003\b\u0004\u0000gh\u0005\u0002"+
		"\u0000\u0000hj\u0003\u0006\u0003\u0000ig\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000j\u0007\u0001\u0000\u0000\u0000kn\u0003\n\u0005\u0000"+
		"ln\u0003\u000e\u0007\u0000mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000"+
		"\u0000n\t\u0001\u0000\u0000\u0000op\u0005\u0001\u0000\u0000pq\u0005\u001e"+
		"\u0000\u0000q\u000b\u0001\u0000\u0000\u0000rs\u0005\u001e\u0000\u0000"+
		"s\r\u0001\u0000\u0000\u0000t}\u0003\u0010\b\u0000ux\u0003\u0014\n\u0000"+
		"vx\u0003\u0016\u000b\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000yz\u0003\u0010\b\u0000z|\u0001\u0000\u0000"+
		"\u0000{w\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u000f\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u008b\u0003\u0012\t\u0000"+
		"\u0081\u008b\u0003R)\u0000\u0082\u008b\u0003@ \u0000\u0083\u0084\u0005"+
		"\u0003\u0000\u0000\u0084\u0085\u0003\u000e\u0007\u0000\u0085\u0086\u0005"+
		"\u0004\u0000\u0000\u0086\u008b\u0001\u0000\u0000\u0000\u0087\u0088\u0003"+
		"\u0018\f\u0000\u0088\u0089\u0003\u0010\b\u0000\u0089\u008b\u0001\u0000"+
		"\u0000\u0000\u008a\u0080\u0001\u0000\u0000\u0000\u008a\u0081\u0001\u0000"+
		"\u0000\u0000\u008a\u0082\u0001\u0000\u0000\u0000\u008a\u0083\u0001\u0000"+
		"\u0000\u0000\u008a\u0087\u0001\u0000\u0000\u0000\u008b\u0011\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005\u0005\u0000\u0000\u008d\u0013\u0001\u0000"+
		"\u0000\u0000\u008e\u0099\u0003\u001a\r\u0000\u008f\u0099\u0003\u001c\u000e"+
		"\u0000\u0090\u0099\u0003\u001e\u000f\u0000\u0091\u0099\u0003 \u0010\u0000"+
		"\u0092\u0099\u0003\"\u0011\u0000\u0093\u0099\u0003$\u0012\u0000\u0094"+
		"\u0099\u0003&\u0013\u0000\u0095\u0099\u0003(\u0014\u0000\u0096\u0099\u0003"+
		"*\u0015\u0000\u0097\u0099\u0003,\u0016\u0000\u0098\u008e\u0001\u0000\u0000"+
		"\u0000\u0098\u008f\u0001\u0000\u0000\u0000\u0098\u0090\u0001\u0000\u0000"+
		"\u0000\u0098\u0091\u0001\u0000\u0000\u0000\u0098\u0092\u0001\u0000\u0000"+
		"\u0000\u0098\u0093\u0001\u0000\u0000\u0000\u0098\u0094\u0001\u0000\u0000"+
		"\u0000\u0098\u0095\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u0015\u0001\u0000\u0000"+
		"\u0000\u009a\u00a1\u0003.\u0017\u0000\u009b\u00a1\u00030\u0018\u0000\u009c"+
		"\u00a1\u00032\u0019\u0000\u009d\u00a1\u00034\u001a\u0000\u009e\u00a1\u0005"+
		"\u0006\u0000\u0000\u009f\u00a1\u0005\u0007\u0000\u0000\u00a0\u009a\u0001"+
		"\u0000\u0000\u0000\u00a0\u009b\u0001\u0000\u0000\u0000\u00a0\u009c\u0001"+
		"\u0000\u0000\u0000\u00a0\u009d\u0001\u0000\u0000\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u0017\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a8\u00036\u001b\u0000\u00a3\u00a8\u00038\u001c"+
		"\u0000\u00a4\u00a8\u0003:\u001d\u0000\u00a5\u00a8\u0003<\u001e\u0000\u00a6"+
		"\u00a8\u0003>\u001f\u0000\u00a7\u00a2\u0001\u0000\u0000\u0000\u00a7\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u0019"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\b\u0000\u0000\u00aa\u001b\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0005\t\u0000\u0000\u00ac\u001d\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0005\u0005\u0000\u0000\u00ae\u001f\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0005\n\u0000\u0000\u00b0!\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0005\u000b\u0000\u0000\u00b2#\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0005\f\u0000\u0000\u00b4%\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0005\r\u0000\u0000\u00b6\'\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0005\u000e\u0000\u0000\u00b8)\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005"+
		"\u000f\u0000\u0000\u00ba+\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u0010"+
		"\u0000\u0000\u00bc-\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0011\u0000"+
		"\u0000\u00be/\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0012\u0000\u0000"+
		"\u00c01\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u0013\u0000\u0000\u00c2"+
		"3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0014\u0000\u0000\u00c45\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0005\b\u0000\u0000\u00c67\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0005\t\u0000\u0000\u00c89\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0005\u0013\u0000\u0000\u00ca;\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0005\u0014\u0000\u0000\u00cc=\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0005\u0015\u0000\u0000\u00ce?\u0001\u0000\u0000\u0000\u00cf\u00d2"+
		"\u0003B!\u0000\u00d0\u00d2\u0003D\"\u0000\u00d1\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2A\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d8\u0003F#\u0000\u00d4\u00d8\u0003H$\u0000\u00d5\u00d8\u0003"+
		"J%\u0000\u00d6\u00d8\u0003L&\u0000\u00d7\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8C\u0001\u0000\u0000\u0000\u00d9"+
		"\u00dc\u0003N\'\u0000\u00da\u00dc\u0003P(\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dcE\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0005\u0018\u0000\u0000\u00deG\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0005\u0019\u0000\u0000\u00e0I\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0005\u001a\u0000\u0000\u00e2K\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0005\u001b\u0000\u0000\u00e4M\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005"+
		"\u001c\u0000\u0000\u00e6O\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u001d"+
		"\u0000\u0000\u00e8Q\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u001e\u0000"+
		"\u0000\u00eaS\u0001\u0000\u0000\u0000\u000fUZ]`imw}\u008a\u0098\u00a0"+
		"\u00a7\u00d1\u00d7\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}