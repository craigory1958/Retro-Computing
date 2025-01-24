// Generated from Expressions.g4 by ANTLR 4.13.2
package xcom.retro.xa.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExpressionsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, BinaryLiteral=20, OctalLiteral=21, DecimalLiteral=22, 
		HexLiteral=23, CharacterLiteral=24, StringLiteral=25, Identifier=26;
	public static final int
		RULE_expr = 0, RULE_term = 1, RULE_org = 2, RULE_identifier = 3, RULE_binary = 4, 
		RULE_comparison = 5, RULE_unary = 6, RULE_integerAdd = 7, RULE_integerSubtract = 8, 
		RULE_integerMultiply = 9, RULE_integerDivide = 10, RULE_bitwiseShiftLeft = 11, 
		RULE_bitwiseShiftRight = 12, RULE_bitwiseAnd = 13, RULE_bitwiseOr = 14, 
		RULE_logicalAnd = 15, RULE_logicalOr = 16, RULE_equal = 17, RULE_notEqual = 18, 
		RULE_lessThan = 19, RULE_greaterThan = 20, RULE_plus = 21, RULE_minus = 22, 
		RULE_highByte = 23, RULE_lowByte = 24, RULE_logicalNot = 25, RULE_literal = 26, 
		RULE_numericLiteral = 27, RULE_alphanumericLiteral = 28, RULE_binaryLiteral = 29, 
		RULE_octalLiteral = 30, RULE_decimalLiteral = 31, RULE_hexLiteral = 32, 
		RULE_characterLiteral = 33, RULE_stringLiteral = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "term", "org", "identifier", "binary", "comparison", "unary", 
			"integerAdd", "integerSubtract", "integerMultiply", "integerDivide", 
			"bitwiseShiftLeft", "bitwiseShiftRight", "bitwiseAnd", "bitwiseOr", "logicalAnd", 
			"logicalOr", "equal", "notEqual", "lessThan", "greaterThan", "plus", 
			"minus", "highByte", "lowByte", "logicalNot", "literal", "numericLiteral", 
			"alphanumericLiteral", "binaryLiteral", "octalLiteral", "decimalLiteral", 
			"hexLiteral", "characterLiteral", "stringLiteral"
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

	@Override
	public String getGrammarFileName() { return "Expressions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			term();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524280L) != 0)) {
				{
				{
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
					{
					setState(71);
					binary();
					}
					break;
				case T__3:
				case T__4:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
					{
					setState(72);
					comparison();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(75);
				term();
				}
				}
				setState(81);
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
		public OrgContext org() {
			return getRuleContext(OrgContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_term);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				org();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
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
				setState(84);
				literal();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				match(T__0);
				setState(86);
				expr();
				setState(87);
				match(T__1);
				}
				break;
			case T__5:
			case T__6:
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				unary();
				setState(90);
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
	public static class OrgContext extends ParserRuleContext {
		public OrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_org; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterOrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitOrg(this);
		}
	}

	public final OrgContext org() throws RecognitionException {
		OrgContext _localctx = new OrgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_org);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__2);
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
		public TerminalNode Identifier() { return getToken(ExpressionsParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitBinary(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_binary);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				integerAdd();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				integerSubtract();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				integerMultiply();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				integerDivide();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				bitwiseShiftLeft();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				bitwiseShiftRight();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(104);
				bitwiseAnd();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 8);
				{
				setState(105);
				bitwiseOr();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 9);
				{
				setState(106);
				logicalAnd();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 10);
				{
				setState(107);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comparison);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				equal();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				notEqual();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				lessThan();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				greaterThan();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				match(T__4);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unary);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				plus();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				minus();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				highByte();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				lowByte();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterIntegerAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitIntegerAdd(this);
		}
	}

	public final IntegerAddContext integerAdd() throws RecognitionException {
		IntegerAddContext _localctx = new IntegerAddContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_integerAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__5);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterIntegerSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitIntegerSubtract(this);
		}
	}

	public final IntegerSubtractContext integerSubtract() throws RecognitionException {
		IntegerSubtractContext _localctx = new IntegerSubtractContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_integerSubtract);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__6);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterIntegerMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitIntegerMultiply(this);
		}
	}

	public final IntegerMultiplyContext integerMultiply() throws RecognitionException {
		IntegerMultiplyContext _localctx = new IntegerMultiplyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_integerMultiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__2);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterIntegerDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitIntegerDivide(this);
		}
	}

	public final IntegerDivideContext integerDivide() throws RecognitionException {
		IntegerDivideContext _localctx = new IntegerDivideContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_integerDivide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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
	public static class BitwiseShiftLeftContext extends ParserRuleContext {
		public BitwiseShiftLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseShiftLeft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterBitwiseShiftLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitBitwiseShiftLeft(this);
		}
	}

	public final BitwiseShiftLeftContext bitwiseShiftLeft() throws RecognitionException {
		BitwiseShiftLeftContext _localctx = new BitwiseShiftLeftContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bitwiseShiftLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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
	public static class BitwiseShiftRightContext extends ParserRuleContext {
		public BitwiseShiftRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseShiftRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterBitwiseShiftRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitBitwiseShiftRight(this);
		}
	}

	public final BitwiseShiftRightContext bitwiseShiftRight() throws RecognitionException {
		BitwiseShiftRightContext _localctx = new BitwiseShiftRightContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bitwiseShiftRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
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
	public static class BitwiseAndContext extends ParserRuleContext {
		public BitwiseAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterBitwiseAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitBitwiseAnd(this);
		}
	}

	public final BitwiseAndContext bitwiseAnd() throws RecognitionException {
		BitwiseAndContext _localctx = new BitwiseAndContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bitwiseAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
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
	public static class BitwiseOrContext extends ParserRuleContext {
		public BitwiseOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterBitwiseOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitBitwiseOr(this);
		}
	}

	public final BitwiseOrContext bitwiseOr() throws RecognitionException {
		BitwiseOrContext _localctx = new BitwiseOrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bitwiseOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
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
	public static class LogicalAndContext extends ParserRuleContext {
		public LogicalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitLogicalAnd(this);
		}
	}

	public final LogicalAndContext logicalAnd() throws RecognitionException {
		LogicalAndContext _localctx = new LogicalAndContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logicalAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
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
	public static class LogicalOrContext extends ParserRuleContext {
		public LogicalOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitLogicalOr(this);
		}
	}

	public final LogicalOrContext logicalOr() throws RecognitionException {
		LogicalOrContext _localctx = new LogicalOrContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logicalOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
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
	public static class EqualContext extends ParserRuleContext {
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitEqual(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
	public static class NotEqualContext extends ParserRuleContext {
		public NotEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitNotEqual(this);
		}
	}

	public final NotEqualContext notEqual() throws RecognitionException {
		NotEqualContext _localctx = new NotEqualContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_notEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
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
	public static class LessThanContext extends ParserRuleContext {
		public LessThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitLessThan(this);
		}
	}

	public final LessThanContext lessThan() throws RecognitionException {
		LessThanContext _localctx = new LessThanContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lessThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
	public static class GreaterThanContext extends ParserRuleContext {
		public GreaterThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitGreaterThan(this);
		}
	}

	public final GreaterThanContext greaterThan() throws RecognitionException {
		GreaterThanContext _localctx = new GreaterThanContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_greaterThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
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
	public static class PlusContext extends ParserRuleContext {
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitPlus(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__5);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitMinus(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__6);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterHighByte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitHighByte(this);
		}
	}

	public final HighByteContext highByte() throws RecognitionException {
		HighByteContext _localctx = new HighByteContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_highByte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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
	public static class LowByteContext extends ParserRuleContext {
		public LowByteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowByte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterLowByte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitLowByte(this);
		}
	}

	public final LowByteContext lowByte() throws RecognitionException {
		LowByteContext _localctx = new LowByteContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lowByte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
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
	public static class LogicalNotContext extends ParserRuleContext {
		public LogicalNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitLogicalNot(this);
		}
	}

	public final LogicalNotContext logicalNot() throws RecognitionException {
		LogicalNotContext _localctx = new LogicalNotContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logicalNot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BinaryLiteral:
			case OctalLiteral:
			case DecimalLiteral:
			case HexLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				numericLiteral();
				}
				break;
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_numericLiteral);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BinaryLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				binaryLiteral();
				}
				break;
			case OctalLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				octalLiteral();
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				decimalLiteral();
				}
				break;
			case HexLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterAlphanumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitAlphanumericLiteral(this);
		}
	}

	public final AlphanumericLiteralContext alphanumericLiteral() throws RecognitionException {
		AlphanumericLiteralContext _localctx = new AlphanumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_alphanumericLiteral);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CharacterLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				characterLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
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
		public TerminalNode BinaryLiteral() { return getToken(ExpressionsParser.BinaryLiteral, 0); }
		public BinaryLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterBinaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitBinaryLiteral(this);
		}
	}

	public final BinaryLiteralContext binaryLiteral() throws RecognitionException {
		BinaryLiteralContext _localctx = new BinaryLiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_binaryLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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
		public TerminalNode OctalLiteral() { return getToken(ExpressionsParser.OctalLiteral, 0); }
		public OctalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterOctalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitOctalLiteral(this);
		}
	}

	public final OctalLiteralContext octalLiteral() throws RecognitionException {
		OctalLiteralContext _localctx = new OctalLiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_octalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		public TerminalNode DecimalLiteral() { return getToken(ExpressionsParser.DecimalLiteral, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitDecimalLiteral(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
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
		public TerminalNode HexLiteral() { return getToken(ExpressionsParser.HexLiteral, 0); }
		public HexLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterHexLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitHexLiteral(this);
		}
	}

	public final HexLiteralContext hexLiteral() throws RecognitionException {
		HexLiteralContext _localctx = new HexLiteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_hexLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
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
		public TerminalNode CharacterLiteral() { return getToken(ExpressionsParser.CharacterLiteral, 0); }
		public CharacterLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitCharacterLiteral(this);
		}
	}

	public final CharacterLiteralContext characterLiteral() throws RecognitionException {
		CharacterLiteralContext _localctx = new CharacterLiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
		public TerminalNode StringLiteral() { return getToken(ExpressionsParser.StringLiteral, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionsListener ) ((ExpressionsListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u00be\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000J\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000N\b\u0000\n\u0000\f\u0000Q\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001]\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004m\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005u\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006|\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u00a6\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u00ac\b\u001b\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u00b0\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0000"+
		"\u0000#\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BD\u0000\u0000\u00b7\u0000F\u0001"+
		"\u0000\u0000\u0000\u0002\\\u0001\u0000\u0000\u0000\u0004^\u0001\u0000"+
		"\u0000\u0000\u0006`\u0001\u0000\u0000\u0000\bl\u0001\u0000\u0000\u0000"+
		"\nt\u0001\u0000\u0000\u0000\f{\u0001\u0000\u0000\u0000\u000e}\u0001\u0000"+
		"\u0000\u0000\u0010\u007f\u0001\u0000\u0000\u0000\u0012\u0081\u0001\u0000"+
		"\u0000\u0000\u0014\u0083\u0001\u0000\u0000\u0000\u0016\u0085\u0001\u0000"+
		"\u0000\u0000\u0018\u0087\u0001\u0000\u0000\u0000\u001a\u0089\u0001\u0000"+
		"\u0000\u0000\u001c\u008b\u0001\u0000\u0000\u0000\u001e\u008d\u0001\u0000"+
		"\u0000\u0000 \u008f\u0001\u0000\u0000\u0000\"\u0091\u0001\u0000\u0000"+
		"\u0000$\u0093\u0001\u0000\u0000\u0000&\u0095\u0001\u0000\u0000\u0000("+
		"\u0097\u0001\u0000\u0000\u0000*\u0099\u0001\u0000\u0000\u0000,\u009b\u0001"+
		"\u0000\u0000\u0000.\u009d\u0001\u0000\u0000\u00000\u009f\u0001\u0000\u0000"+
		"\u00002\u00a1\u0001\u0000\u0000\u00004\u00a5\u0001\u0000\u0000\u00006"+
		"\u00ab\u0001\u0000\u0000\u00008\u00af\u0001\u0000\u0000\u0000:\u00b1\u0001"+
		"\u0000\u0000\u0000<\u00b3\u0001\u0000\u0000\u0000>\u00b5\u0001\u0000\u0000"+
		"\u0000@\u00b7\u0001\u0000\u0000\u0000B\u00b9\u0001\u0000\u0000\u0000D"+
		"\u00bb\u0001\u0000\u0000\u0000FO\u0003\u0002\u0001\u0000GJ\u0003\b\u0004"+
		"\u0000HJ\u0003\n\u0005\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KL\u0003\u0002\u0001\u0000LN\u0001\u0000"+
		"\u0000\u0000MI\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u0001\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000R]\u0003\u0004\u0002\u0000S]\u0003\u0006"+
		"\u0003\u0000T]\u00034\u001a\u0000UV\u0005\u0001\u0000\u0000VW\u0003\u0000"+
		"\u0000\u0000WX\u0005\u0002\u0000\u0000X]\u0001\u0000\u0000\u0000YZ\u0003"+
		"\f\u0006\u0000Z[\u0003\u0002\u0001\u0000[]\u0001\u0000\u0000\u0000\\R"+
		"\u0001\u0000\u0000\u0000\\S\u0001\u0000\u0000\u0000\\T\u0001\u0000\u0000"+
		"\u0000\\U\u0001\u0000\u0000\u0000\\Y\u0001\u0000\u0000\u0000]\u0003\u0001"+
		"\u0000\u0000\u0000^_\u0005\u0003\u0000\u0000_\u0005\u0001\u0000\u0000"+
		"\u0000`a\u0005\u001a\u0000\u0000a\u0007\u0001\u0000\u0000\u0000bm\u0003"+
		"\u000e\u0007\u0000cm\u0003\u0010\b\u0000dm\u0003\u0012\t\u0000em\u0003"+
		"\u0014\n\u0000fm\u0003\u0016\u000b\u0000gm\u0003\u0018\f\u0000hm\u0003"+
		"\u001a\r\u0000im\u0003\u001c\u000e\u0000jm\u0003\u001e\u000f\u0000km\u0003"+
		" \u0010\u0000lb\u0001\u0000\u0000\u0000lc\u0001\u0000\u0000\u0000ld\u0001"+
		"\u0000\u0000\u0000le\u0001\u0000\u0000\u0000lf\u0001\u0000\u0000\u0000"+
		"lg\u0001\u0000\u0000\u0000lh\u0001\u0000\u0000\u0000li\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000m\t\u0001\u0000"+
		"\u0000\u0000nu\u0003\"\u0011\u0000ou\u0003$\u0012\u0000pu\u0003&\u0013"+
		"\u0000qu\u0003(\u0014\u0000ru\u0005\u0004\u0000\u0000su\u0005\u0005\u0000"+
		"\u0000tn\u0001\u0000\u0000\u0000to\u0001\u0000\u0000\u0000tp\u0001\u0000"+
		"\u0000\u0000tq\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000ts\u0001"+
		"\u0000\u0000\u0000u\u000b\u0001\u0000\u0000\u0000v|\u0003*\u0015\u0000"+
		"w|\u0003,\u0016\u0000x|\u0003.\u0017\u0000y|\u00030\u0018\u0000z|\u0003"+
		"2\u0019\u0000{v\u0001\u0000\u0000\u0000{w\u0001\u0000\u0000\u0000{x\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000"+
		"|\r\u0001\u0000\u0000\u0000}~\u0005\u0006\u0000\u0000~\u000f\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005\u0007\u0000\u0000\u0080\u0011\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005\u0003\u0000\u0000\u0082\u0013\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005\b\u0000\u0000\u0084\u0015\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005\t\u0000\u0000\u0086\u0017\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005\n\u0000\u0000\u0088\u0019\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005\u000b\u0000\u0000\u008a\u001b\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005\f\u0000\u0000\u008c\u001d\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005\r\u0000\u0000\u008e\u001f\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"\u000e\u0000\u0000\u0090!\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u000f"+
		"\u0000\u0000\u0092#\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0010\u0000"+
		"\u0000\u0094%\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0011\u0000\u0000"+
		"\u0096\'\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0012\u0000\u0000\u0098"+
		")\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0006\u0000\u0000\u009a+\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005\u0007\u0000\u0000\u009c-\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005\u0011\u0000\u0000\u009e/\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0005\u0012\u0000\u0000\u00a01\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0005\u0013\u0000\u0000\u00a23\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a6\u00036\u001b\u0000\u00a4\u00a6\u00038\u001c\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a65\u0001\u0000"+
		"\u0000\u0000\u00a7\u00ac\u0003:\u001d\u0000\u00a8\u00ac\u0003<\u001e\u0000"+
		"\u00a9\u00ac\u0003>\u001f\u0000\u00aa\u00ac\u0003@ \u0000\u00ab\u00a7"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000\u0000\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac7\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0003B!\u0000\u00ae\u00b0\u0003D\"\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b09\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0014\u0000\u0000\u00b2"+
		";\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0015\u0000\u0000\u00b4=\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005\u0016\u0000\u0000\u00b6?\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005\u0017\u0000\u0000\u00b8A\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0005\u0018\u0000\u0000\u00baC\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005\u0019\u0000\u0000\u00bcE\u0001\u0000\u0000\u0000\t"+
		"IO\\lt{\u00a5\u00ab\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}