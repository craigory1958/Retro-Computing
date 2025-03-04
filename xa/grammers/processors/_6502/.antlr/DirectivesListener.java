// Generated from h:/_cwg-base__Home/Computer Archtecture/Retro Computing/xa/grammers/xcom/retro/xa/processors/MOS6502_v1/Directives.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DirectivesParser}.
 */
public interface DirectivesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(DirectivesParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(DirectivesParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#macro}.
	 * @param ctx the parse tree
	 */
	void enterMacro(DirectivesParser.MacroContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#macro}.
	 * @param ctx the parse tree
	 */
	void exitMacro(DirectivesParser.MacroContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#inject}.
	 * @param ctx the parse tree
	 */
	void enterInject(DirectivesParser.InjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#inject}.
	 * @param ctx the parse tree
	 */
	void exitInject(DirectivesParser.InjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(DirectivesParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(DirectivesParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(DirectivesParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(DirectivesParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#dottedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterDottedIdentifier(DirectivesParser.DottedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#dottedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitDottedIdentifier(DirectivesParser.DottedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(DirectivesParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(DirectivesParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DirectivesParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DirectivesParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(DirectivesParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(DirectivesParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#lc}.
	 * @param ctx the parse tree
	 */
	void enterLc(DirectivesParser.LcContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#lc}.
	 * @param ctx the parse tree
	 */
	void exitLc(DirectivesParser.LcContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(DirectivesParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(DirectivesParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(DirectivesParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(DirectivesParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(DirectivesParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(DirectivesParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#integerAdd}.
	 * @param ctx the parse tree
	 */
	void enterIntegerAdd(DirectivesParser.IntegerAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#integerAdd}.
	 * @param ctx the parse tree
	 */
	void exitIntegerAdd(DirectivesParser.IntegerAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#integerSubtract}.
	 * @param ctx the parse tree
	 */
	void enterIntegerSubtract(DirectivesParser.IntegerSubtractContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#integerSubtract}.
	 * @param ctx the parse tree
	 */
	void exitIntegerSubtract(DirectivesParser.IntegerSubtractContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#integerMultiply}.
	 * @param ctx the parse tree
	 */
	void enterIntegerMultiply(DirectivesParser.IntegerMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#integerMultiply}.
	 * @param ctx the parse tree
	 */
	void exitIntegerMultiply(DirectivesParser.IntegerMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#integerDivide}.
	 * @param ctx the parse tree
	 */
	void enterIntegerDivide(DirectivesParser.IntegerDivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#integerDivide}.
	 * @param ctx the parse tree
	 */
	void exitIntegerDivide(DirectivesParser.IntegerDivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#bitwiseShiftLeft}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseShiftLeft(DirectivesParser.BitwiseShiftLeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#bitwiseShiftLeft}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseShiftLeft(DirectivesParser.BitwiseShiftLeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#bitwiseShiftRight}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseShiftRight(DirectivesParser.BitwiseShiftRightContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#bitwiseShiftRight}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseShiftRight(DirectivesParser.BitwiseShiftRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#bitwiseAnd}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseAnd(DirectivesParser.BitwiseAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#bitwiseAnd}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseAnd(DirectivesParser.BitwiseAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#bitwiseOr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOr(DirectivesParser.BitwiseOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#bitwiseOr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOr(DirectivesParser.BitwiseOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAnd(DirectivesParser.LogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAnd(DirectivesParser.LogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOr(DirectivesParser.LogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOr(DirectivesParser.LogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(DirectivesParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(DirectivesParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#notEqual}.
	 * @param ctx the parse tree
	 */
	void enterNotEqual(DirectivesParser.NotEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#notEqual}.
	 * @param ctx the parse tree
	 */
	void exitNotEqual(DirectivesParser.NotEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#lessThan}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(DirectivesParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#lessThan}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(DirectivesParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#greaterThan}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(DirectivesParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#greaterThan}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(DirectivesParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(DirectivesParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(DirectivesParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(DirectivesParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(DirectivesParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#highByte}.
	 * @param ctx the parse tree
	 */
	void enterHighByte(DirectivesParser.HighByteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#highByte}.
	 * @param ctx the parse tree
	 */
	void exitHighByte(DirectivesParser.HighByteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#lowByte}.
	 * @param ctx the parse tree
	 */
	void enterLowByte(DirectivesParser.LowByteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#lowByte}.
	 * @param ctx the parse tree
	 */
	void exitLowByte(DirectivesParser.LowByteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#logicalNot}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(DirectivesParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#logicalNot}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(DirectivesParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DirectivesParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DirectivesParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(DirectivesParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(DirectivesParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#alphanumericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterAlphanumericLiteral(DirectivesParser.AlphanumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#alphanumericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitAlphanumericLiteral(DirectivesParser.AlphanumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#binaryLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLiteral(DirectivesParser.BinaryLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#binaryLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLiteral(DirectivesParser.BinaryLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#octalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterOctalLiteral(DirectivesParser.OctalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#octalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitOctalLiteral(DirectivesParser.OctalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(DirectivesParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(DirectivesParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#hexLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexLiteral(DirectivesParser.HexLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#hexLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexLiteral(DirectivesParser.HexLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharacterLiteral(DirectivesParser.CharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharacterLiteral(DirectivesParser.CharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(DirectivesParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(DirectivesParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(DirectivesParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(DirectivesParser.IdentifierContext ctx);
}