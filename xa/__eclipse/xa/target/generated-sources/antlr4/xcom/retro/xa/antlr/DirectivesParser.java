// Generated from Directives.g4 by ANTLR 4.13.2
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
public class DirectivesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, ParameterAnnotations=24, 
		DefinedDirectives=25, BinaryLiteral=26, OctalLiteral=27, DecimalLiteral=28, 
		HexLiteral=29, CharacterLiteral=30, StringLiteral=31, Identifier=32;
	public static final int
		RULE_directive = 0, RULE_definedDirective = 1, RULE_macroDirective = 2, 
		RULE_macroInvocation = 3, RULE_label = 4, RULE_symbol = 5, RULE_argumentList = 6, 
		RULE_argument = 7, RULE_parameterList = 8, RULE_annotatedParameter = 9, 
		RULE_parameter = 10, RULE_paramaterDefault = 11, RULE_expr = 12, RULE_term = 13, 
		RULE_lc = 14, RULE_binary = 15, RULE_comparison = 16, RULE_unary = 17, 
		RULE_integerAdd = 18, RULE_integerSubtract = 19, RULE_integerMultiply = 20, 
		RULE_integerDivide = 21, RULE_bitwiseShiftLeft = 22, RULE_bitwiseShiftRight = 23, 
		RULE_bitwiseAnd = 24, RULE_bitwiseOr = 25, RULE_logicalAnd = 26, RULE_logicalOr = 27, 
		RULE_equal = 28, RULE_notEqual = 29, RULE_lessThan = 30, RULE_greaterThan = 31, 
		RULE_plus = 32, RULE_minus = 33, RULE_highByte = 34, RULE_lowByte = 35, 
		RULE_logicalNot = 36, RULE_literal = 37, RULE_numericLiteral = 38, RULE_alphanumericLiteral = 39, 
		RULE_binaryLiteral = 40, RULE_octalLiteral = 41, RULE_decimalLiteral = 42, 
		RULE_hexLiteral = 43, RULE_characterLiteral = 44, RULE_stringLiteral = 45, 
		RULE_identifier = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"directive", "definedDirective", "macroDirective", "macroInvocation", 
			"label", "symbol", "argumentList", "argument", "parameterList", "annotatedParameter", 
			"parameter", "paramaterDefault", "expr", "term", "lc", "binary", "comparison", 
			"unary", "integerAdd", "integerSubtract", "integerMultiply", "integerDivide", 
			"bitwiseShiftLeft", "bitwiseShiftRight", "bitwiseAnd", "bitwiseOr", "logicalAnd", 
			"logicalOr", "equal", "notEqual", "lessThan", "greaterThan", "plus", 
			"minus", "highByte", "lowByte", "logicalNot", "literal", "numericLiteral", 
			"alphanumericLiteral", "binaryLiteral", "octalLiteral", "decimalLiteral", 
			"hexLiteral", "characterLiteral", "stringLiteral", "identifier"
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
			"ParameterAnnotations", "DefinedDirectives", "BinaryLiteral", "OctalLiteral", 
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
		public DefinedDirectiveContext definedDirective() {
			return getRuleContext(DefinedDirectiveContext.class,0);
		}
		public MacroDirectiveContext macroDirective() {
			return getRuleContext(MacroDirectiveContext.class,0);
		}
		public MacroInvocationContext macroInvocation() {
			return getRuleContext(MacroInvocationContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitDirective(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_directive);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				definedDirective();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				macroDirective();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				macroInvocation();
				}
				break;
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
	public static class DefinedDirectiveContext extends ParserRuleContext {
		public TerminalNode DefinedDirectives() { return getToken(DirectivesParser.DefinedDirectives, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public DefinedDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definedDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterDefinedDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitDefinedDirective(this);
		}
	}

	public final DefinedDirectiveContext definedDirective() throws RecognitionException {
		DefinedDirectiveContext _localctx = new DefinedDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definedDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__0);
			setState(100);
			match(DefinedDirectives);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8537509024L) != 0)) {
				{
				setState(101);
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
	public static class MacroDirectiveContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MacroDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterMacroDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitMacroDirective(this);
		}
	}

	public final MacroDirectiveContext macroDirective() throws RecognitionException {
		MacroDirectiveContext _localctx = new MacroDirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_macroDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			symbol();
			setState(105);
			match(T__1);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ParameterAnnotations || _la==Identifier) {
				{
				setState(106);
				parameterList();
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
	public static class MacroInvocationContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MacroInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterMacroInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitMacroInvocation(this);
		}
	}

	public final MacroInvocationContext macroInvocation() throws RecognitionException {
		MacroInvocationContext _localctx = new MacroInvocationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_macroInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__0);
			setState(110);
			symbol();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8537509024L) != 0)) {
				{
				setState(111);
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
	public static class LabelContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_label);
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
	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitSymbol(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			argument();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(119);
				match(T__2);
				setState(120);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			expr();
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
	public static class ParameterListContext extends ParserRuleContext {
		public AnnotatedParameterContext annotatedParameter() {
			return getRuleContext(AnnotatedParameterContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ParameterAnnotations:
				{
				setState(125);
				annotatedParameter();
				}
				break;
			case Identifier:
				{
				setState(126);
				parameter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(129);
				match(T__2);
				setState(130);
				parameterList();
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
	public static class AnnotatedParameterContext extends ParserRuleContext {
		public TerminalNode ParameterAnnotations() { return getToken(DirectivesParser.ParameterAnnotations, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ParamaterDefaultContext paramaterDefault() {
			return getRuleContext(ParamaterDefaultContext.class,0);
		}
		public AnnotatedParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterAnnotatedParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitAnnotatedParameter(this);
		}
	}

	public final AnnotatedParameterContext annotatedParameter() throws RecognitionException {
		AnnotatedParameterContext _localctx = new AnnotatedParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_annotatedParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(ParameterAnnotations);
			setState(134);
			symbol();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(135);
				paramaterDefault();
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
	public static class ParameterContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ParamaterDefaultContext paramaterDefault() {
			return getRuleContext(ParamaterDefaultContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			symbol();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(139);
				paramaterDefault();
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
	public static class ParamaterDefaultContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParamaterDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramaterDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterParamaterDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitParamaterDefault(this);
		}
	}

	public final ParamaterDefaultContext paramaterDefault() throws RecognitionException {
		ParamaterDefaultContext _localctx = new ParamaterDefaultContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_paramaterDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__3);
			setState(143);
			expr();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			term();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8388480L) != 0)) {
				{
				{
				setState(148);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
					{
					setState(146);
					binary();
					}
					break;
				case T__7:
				case T__8:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
					{
					setState(147);
					comparison();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(150);
				term();
				}
				}
				setState(156);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_term);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				lc();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
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
				setState(159);
				literal();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(T__4);
				setState(161);
				expr();
				setState(162);
				match(T__5);
				}
				break;
			case T__9:
			case T__10:
			case T__20:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				unary();
				setState(165);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterLc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitLc(this);
		}
	}

	public final LcContext lc() throws RecognitionException {
		LcContext _localctx = new LcContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitBinary(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_binary);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				integerAdd();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				integerSubtract();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				integerMultiply();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				integerDivide();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				bitwiseShiftLeft();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(176);
				bitwiseShiftRight();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(177);
				bitwiseAnd();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 8);
				{
				setState(178);
				bitwiseOr();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 9);
				{
				setState(179);
				logicalAnd();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 10);
				{
				setState(180);
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
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comparison);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				equal();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				notEqual();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				lessThan();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				greaterThan();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				match(T__8);
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
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unary);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				plus();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				minus();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				highByte();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				lowByte();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
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
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterIntegerAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitIntegerAdd(this);
		}
	}

	public final IntegerAddContext integerAdd() throws RecognitionException {
		IntegerAddContext _localctx = new IntegerAddContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_integerAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
	public static class IntegerSubtractContext extends ParserRuleContext {
		public IntegerSubtractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerSubtract; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterIntegerSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitIntegerSubtract(this);
		}
	}

	public final IntegerSubtractContext integerSubtract() throws RecognitionException {
		IntegerSubtractContext _localctx = new IntegerSubtractContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_integerSubtract);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
	public static class IntegerMultiplyContext extends ParserRuleContext {
		public IntegerMultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerMultiply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterIntegerMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitIntegerMultiply(this);
		}
	}

	public final IntegerMultiplyContext integerMultiply() throws RecognitionException {
		IntegerMultiplyContext _localctx = new IntegerMultiplyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_integerMultiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
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
	public static class IntegerDivideContext extends ParserRuleContext {
		public IntegerDivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerDivide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterIntegerDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitIntegerDivide(this);
		}
	}

	public final IntegerDivideContext integerDivide() throws RecognitionException {
		IntegerDivideContext _localctx = new IntegerDivideContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_integerDivide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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
	public static class BitwiseShiftLeftContext extends ParserRuleContext {
		public BitwiseShiftLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseShiftLeft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterBitwiseShiftLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitBitwiseShiftLeft(this);
		}
	}

	public final BitwiseShiftLeftContext bitwiseShiftLeft() throws RecognitionException {
		BitwiseShiftLeftContext _localctx = new BitwiseShiftLeftContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bitwiseShiftLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
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
	public static class BitwiseShiftRightContext extends ParserRuleContext {
		public BitwiseShiftRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseShiftRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterBitwiseShiftRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitBitwiseShiftRight(this);
		}
	}

	public final BitwiseShiftRightContext bitwiseShiftRight() throws RecognitionException {
		BitwiseShiftRightContext _localctx = new BitwiseShiftRightContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bitwiseShiftRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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
	public static class BitwiseAndContext extends ParserRuleContext {
		public BitwiseAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterBitwiseAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitBitwiseAnd(this);
		}
	}

	public final BitwiseAndContext bitwiseAnd() throws RecognitionException {
		BitwiseAndContext _localctx = new BitwiseAndContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bitwiseAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
	public static class BitwiseOrContext extends ParserRuleContext {
		public BitwiseOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterBitwiseOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitBitwiseOr(this);
		}
	}

	public final BitwiseOrContext bitwiseOr() throws RecognitionException {
		BitwiseOrContext _localctx = new BitwiseOrContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bitwiseOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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
	public static class LogicalAndContext extends ParserRuleContext {
		public LogicalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitLogicalAnd(this);
		}
	}

	public final LogicalAndContext logicalAnd() throws RecognitionException {
		LogicalAndContext _localctx = new LogicalAndContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_logicalAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
	public static class LogicalOrContext extends ParserRuleContext {
		public LogicalOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitLogicalOr(this);
		}
	}

	public final LogicalOrContext logicalOr() throws RecognitionException {
		LogicalOrContext _localctx = new LogicalOrContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_logicalOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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
	public static class EqualContext extends ParserRuleContext {
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitEqual(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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
	public static class NotEqualContext extends ParserRuleContext {
		public NotEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitNotEqual(this);
		}
	}

	public final NotEqualContext notEqual() throws RecognitionException {
		NotEqualContext _localctx = new NotEqualContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_notEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
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
	public static class LessThanContext extends ParserRuleContext {
		public LessThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitLessThan(this);
		}
	}

	public final LessThanContext lessThan() throws RecognitionException {
		LessThanContext _localctx = new LessThanContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_lessThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
	public static class GreaterThanContext extends ParserRuleContext {
		public GreaterThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitGreaterThan(this);
		}
	}

	public final GreaterThanContext greaterThan() throws RecognitionException {
		GreaterThanContext _localctx = new GreaterThanContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_greaterThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__21);
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
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitPlus(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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
	public static class MinusContext extends ParserRuleContext {
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitMinus(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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
	public static class HighByteContext extends ParserRuleContext {
		public HighByteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_highByte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterHighByte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitHighByte(this);
		}
	}

	public final HighByteContext highByte() throws RecognitionException {
		HighByteContext _localctx = new HighByteContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_highByte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
	public static class LowByteContext extends ParserRuleContext {
		public LowByteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowByte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterLowByte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitLowByte(this);
		}
	}

	public final LowByteContext lowByte() throws RecognitionException {
		LowByteContext _localctx = new LowByteContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_lowByte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__21);
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
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitLogicalNot(this);
		}
	}

	public final LogicalNotContext logicalNot() throws RecognitionException {
		LogicalNotContext _localctx = new LogicalNotContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_logicalNot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__22);
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
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_literal);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BinaryLiteral:
			case OctalLiteral:
			case DecimalLiteral:
			case HexLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				numericLiteral();
				}
				break;
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
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
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_numericLiteral);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BinaryLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				binaryLiteral();
				}
				break;
			case OctalLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				octalLiteral();
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				decimalLiteral();
				}
				break;
			case HexLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
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
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterAlphanumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitAlphanumericLiteral(this);
		}
	}

	public final AlphanumericLiteralContext alphanumericLiteral() throws RecognitionException {
		AlphanumericLiteralContext _localctx = new AlphanumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_alphanumericLiteral);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CharacterLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				characterLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterBinaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitBinaryLiteral(this);
		}
	}

	public final BinaryLiteralContext binaryLiteral() throws RecognitionException {
		BinaryLiteralContext _localctx = new BinaryLiteralContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_binaryLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterOctalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitOctalLiteral(this);
		}
	}

	public final OctalLiteralContext octalLiteral() throws RecognitionException {
		OctalLiteralContext _localctx = new OctalLiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_octalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitDecimalLiteral(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterHexLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitHexLiteral(this);
		}
	}

	public final HexLiteralContext hexLiteral() throws RecognitionException {
		HexLiteralContext _localctx = new HexLiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_hexLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitCharacterLiteral(this);
		}
	}

	public final CharacterLiteralContext characterLiteral() throws RecognitionException {
		CharacterLiteralContext _localctx = new CharacterLiteralContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
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
		"\u0004\u0001 \u0109\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"b\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001g\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002l\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003q\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006z\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u0080\b\b\u0001"+
		"\b\u0001\b\u0003\b\u0084\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u0089\b\t"+
		"\u0001\n\u0001\n\u0003\n\u008d\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u0095\b\f\u0001\f\u0001\f\u0005\f\u0099"+
		"\b\f\n\f\f\f\u009c\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a8\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b6\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00be\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00c5\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001$\u0001$\u0001%\u0001%\u0003%\u00ef\b%\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u00f5\b&\u0001\'\u0001\'\u0003\'\u00f9\b\'\u0001(\u0001(\u0001"+
		")\u0001)\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001"+
		".\u0001.\u0001.\u0000\u0000/\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\\u0000\u0000\u0100\u0000a\u0001\u0000\u0000\u0000\u0002c\u0001\u0000"+
		"\u0000\u0000\u0004h\u0001\u0000\u0000\u0000\u0006m\u0001\u0000\u0000\u0000"+
		"\br\u0001\u0000\u0000\u0000\nt\u0001\u0000\u0000\u0000\fv\u0001\u0000"+
		"\u0000\u0000\u000e{\u0001\u0000\u0000\u0000\u0010\u007f\u0001\u0000\u0000"+
		"\u0000\u0012\u0085\u0001\u0000\u0000\u0000\u0014\u008a\u0001\u0000\u0000"+
		"\u0000\u0016\u008e\u0001\u0000\u0000\u0000\u0018\u0091\u0001\u0000\u0000"+
		"\u0000\u001a\u00a7\u0001\u0000\u0000\u0000\u001c\u00a9\u0001\u0000\u0000"+
		"\u0000\u001e\u00b5\u0001\u0000\u0000\u0000 \u00bd\u0001\u0000\u0000\u0000"+
		"\"\u00c4\u0001\u0000\u0000\u0000$\u00c6\u0001\u0000\u0000\u0000&\u00c8"+
		"\u0001\u0000\u0000\u0000(\u00ca\u0001\u0000\u0000\u0000*\u00cc\u0001\u0000"+
		"\u0000\u0000,\u00ce\u0001\u0000\u0000\u0000.\u00d0\u0001\u0000\u0000\u0000"+
		"0\u00d2\u0001\u0000\u0000\u00002\u00d4\u0001\u0000\u0000\u00004\u00d6"+
		"\u0001\u0000\u0000\u00006\u00d8\u0001\u0000\u0000\u00008\u00da\u0001\u0000"+
		"\u0000\u0000:\u00dc\u0001\u0000\u0000\u0000<\u00de\u0001\u0000\u0000\u0000"+
		">\u00e0\u0001\u0000\u0000\u0000@\u00e2\u0001\u0000\u0000\u0000B\u00e4"+
		"\u0001\u0000\u0000\u0000D\u00e6\u0001\u0000\u0000\u0000F\u00e8\u0001\u0000"+
		"\u0000\u0000H\u00ea\u0001\u0000\u0000\u0000J\u00ee\u0001\u0000\u0000\u0000"+
		"L\u00f4\u0001\u0000\u0000\u0000N\u00f8\u0001\u0000\u0000\u0000P\u00fa"+
		"\u0001\u0000\u0000\u0000R\u00fc\u0001\u0000\u0000\u0000T\u00fe\u0001\u0000"+
		"\u0000\u0000V\u0100\u0001\u0000\u0000\u0000X\u0102\u0001\u0000\u0000\u0000"+
		"Z\u0104\u0001\u0000\u0000\u0000\\\u0106\u0001\u0000\u0000\u0000^b\u0003"+
		"\u0002\u0001\u0000_b\u0003\u0004\u0002\u0000`b\u0003\u0006\u0003\u0000"+
		"a^\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000a`\u0001\u0000\u0000"+
		"\u0000b\u0001\u0001\u0000\u0000\u0000cd\u0005\u0001\u0000\u0000df\u0005"+
		"\u0019\u0000\u0000eg\u0003\f\u0006\u0000fe\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000g\u0003\u0001\u0000\u0000\u0000hi\u0003\n\u0005\u0000"+
		"ik\u0005\u0002\u0000\u0000jl\u0003\u0010\b\u0000kj\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000l\u0005\u0001\u0000\u0000\u0000mn\u0005\u0001"+
		"\u0000\u0000np\u0003\n\u0005\u0000oq\u0003\f\u0006\u0000po\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000q\u0007\u0001\u0000\u0000\u0000"+
		"rs\u0005 \u0000\u0000s\t\u0001\u0000\u0000\u0000tu\u0005 \u0000\u0000"+
		"u\u000b\u0001\u0000\u0000\u0000vy\u0003\u000e\u0007\u0000wx\u0005\u0003"+
		"\u0000\u0000xz\u0003\f\u0006\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z\r\u0001\u0000\u0000\u0000{|\u0003\u0018\f\u0000|\u000f\u0001"+
		"\u0000\u0000\u0000}\u0080\u0003\u0012\t\u0000~\u0080\u0003\u0014\n\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0083"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0003\u0000\u0000\u0082\u0084"+
		"\u0003\u0010\b\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0011\u0001\u0000\u0000\u0000\u0085\u0086\u0005"+
		"\u0018\u0000\u0000\u0086\u0088\u0003\n\u0005\u0000\u0087\u0089\u0003\u0016"+
		"\u000b\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u0013\u0001\u0000\u0000\u0000\u008a\u008c\u0003\n\u0005"+
		"\u0000\u008b\u008d\u0003\u0016\u000b\u0000\u008c\u008b\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u0015\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005\u0004\u0000\u0000\u008f\u0090\u0003\u0018\f\u0000"+
		"\u0090\u0017\u0001\u0000\u0000\u0000\u0091\u009a\u0003\u001a\r\u0000\u0092"+
		"\u0095\u0003\u001e\u000f\u0000\u0093\u0095\u0003 \u0010\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0003\u001a\r\u0000\u0097\u0099\u0001"+
		"\u0000\u0000\u0000\u0098\u0094\u0001\u0000\u0000\u0000\u0099\u009c\u0001"+
		"\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u0019\u0001\u0000\u0000\u0000\u009c\u009a\u0001"+
		"\u0000\u0000\u0000\u009d\u00a8\u0003\u001c\u000e\u0000\u009e\u00a8\u0003"+
		"\\.\u0000\u009f\u00a8\u0003J%\u0000\u00a0\u00a1\u0005\u0005\u0000\u0000"+
		"\u00a1\u00a2\u0003\u0018\f\u0000\u00a2\u00a3\u0005\u0006\u0000\u0000\u00a3"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003\"\u0011\u0000\u00a5\u00a6"+
		"\u0003\u001a\r\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u009d\u0001"+
		"\u0000\u0000\u0000\u00a7\u009e\u0001\u0000\u0000\u0000\u00a7\u009f\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a0\u0001\u0000\u0000\u0000\u00a7\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a8\u001b\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"\u0007\u0000\u0000\u00aa\u001d\u0001\u0000\u0000\u0000\u00ab\u00b6\u0003"+
		"$\u0012\u0000\u00ac\u00b6\u0003&\u0013\u0000\u00ad\u00b6\u0003(\u0014"+
		"\u0000\u00ae\u00b6\u0003*\u0015\u0000\u00af\u00b6\u0003,\u0016\u0000\u00b0"+
		"\u00b6\u0003.\u0017\u0000\u00b1\u00b6\u00030\u0018\u0000\u00b2\u00b6\u0003"+
		"2\u0019\u0000\u00b3\u00b6\u00034\u001a\u0000\u00b4\u00b6\u00036\u001b"+
		"\u0000\u00b5\u00ab\u0001\u0000\u0000\u0000\u00b5\u00ac\u0001\u0000\u0000"+
		"\u0000\u00b5\u00ad\u0001\u0000\u0000\u0000\u00b5\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b5\u00af\u0001\u0000\u0000\u0000\u00b5\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b5\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b6\u001f\u0001\u0000\u0000\u0000\u00b7\u00be\u00038\u001c\u0000"+
		"\u00b8\u00be\u0003:\u001d\u0000\u00b9\u00be\u0003<\u001e\u0000\u00ba\u00be"+
		"\u0003>\u001f\u0000\u00bb\u00be\u0005\b\u0000\u0000\u00bc\u00be\u0005"+
		"\t\u0000\u0000\u00bd\u00b7\u0001\u0000\u0000\u0000\u00bd\u00b8\u0001\u0000"+
		"\u0000\u0000\u00bd\u00b9\u0001\u0000\u0000\u0000\u00bd\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000"+
		"\u0000\u0000\u00be!\u0001\u0000\u0000\u0000\u00bf\u00c5\u0003@ \u0000"+
		"\u00c0\u00c5\u0003B!\u0000\u00c1\u00c5\u0003D\"\u0000\u00c2\u00c5\u0003"+
		"F#\u0000\u00c3\u00c5\u0003H$\u0000\u00c4\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c0\u0001\u0000\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c5#\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\n\u0000\u0000\u00c7"+
		"%\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u000b\u0000\u0000\u00c9\'"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0007\u0000\u0000\u00cb)\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0005\f\u0000\u0000\u00cd+\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0005\r\u0000\u0000\u00cf-\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0005\u000e\u0000\u0000\u00d1/\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005\u000f\u0000\u0000\u00d31\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0005\u0010\u0000\u0000\u00d53\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0005\u0011\u0000\u0000\u00d75\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005"+
		"\u0012\u0000\u0000\u00d97\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0013"+
		"\u0000\u0000\u00db9\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0014\u0000"+
		"\u0000\u00dd;\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0015\u0000\u0000"+
		"\u00df=\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0016\u0000\u0000\u00e1"+
		"?\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\n\u0000\u0000\u00e3A\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0005\u000b\u0000\u0000\u00e5C\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0005\u0015\u0000\u0000\u00e7E\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0005\u0016\u0000\u0000\u00e9G\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0005\u0017\u0000\u0000\u00ebI\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ef\u0003L&\u0000\u00ed\u00ef\u0003N\'\u0000\u00ee\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00efK\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f5\u0003P(\u0000\u00f1\u00f5\u0003R)\u0000\u00f2\u00f5"+
		"\u0003T*\u0000\u00f3\u00f5\u0003V+\u0000\u00f4\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5M\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f9\u0003X,\u0000\u00f7\u00f9\u0003Z-\u0000\u00f8\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9O\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0005\u001a\u0000\u0000\u00fbQ\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0005\u001b\u0000\u0000\u00fdS\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0005\u001c\u0000\u0000\u00ffU\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0005\u001d\u0000\u0000\u0101W\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0005\u001e\u0000\u0000\u0103Y\u0001\u0000\u0000\u0000\u0104\u0105\u0005"+
		"\u001f\u0000\u0000\u0105[\u0001\u0000\u0000\u0000\u0106\u0107\u0005 \u0000"+
		"\u0000\u0107]\u0001\u0000\u0000\u0000\u0012afkpy\u007f\u0083\u0088\u008c"+
		"\u0094\u009a\u00a7\u00b5\u00bd\u00c4\u00ee\u00f4\u00f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}