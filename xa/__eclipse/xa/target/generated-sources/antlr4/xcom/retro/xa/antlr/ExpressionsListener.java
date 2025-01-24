// Generated from Expressions.g4 by ANTLR 4.13.2
package xcom.retro.xa.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionsParser}.
 */
public interface ExpressionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExpressionsParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExpressionsParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ExpressionsParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ExpressionsParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#org}.
	 * @param ctx the parse tree
	 */
	void enterOrg(ExpressionsParser.OrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#org}.
	 * @param ctx the parse tree
	 */
	void exitOrg(ExpressionsParser.OrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ExpressionsParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ExpressionsParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(ExpressionsParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(ExpressionsParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(ExpressionsParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(ExpressionsParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(ExpressionsParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(ExpressionsParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#integerAdd}.
	 * @param ctx the parse tree
	 */
	void enterIntegerAdd(ExpressionsParser.IntegerAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#integerAdd}.
	 * @param ctx the parse tree
	 */
	void exitIntegerAdd(ExpressionsParser.IntegerAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#integerSubtract}.
	 * @param ctx the parse tree
	 */
	void enterIntegerSubtract(ExpressionsParser.IntegerSubtractContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#integerSubtract}.
	 * @param ctx the parse tree
	 */
	void exitIntegerSubtract(ExpressionsParser.IntegerSubtractContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#integerMultiply}.
	 * @param ctx the parse tree
	 */
	void enterIntegerMultiply(ExpressionsParser.IntegerMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#integerMultiply}.
	 * @param ctx the parse tree
	 */
	void exitIntegerMultiply(ExpressionsParser.IntegerMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#integerDivide}.
	 * @param ctx the parse tree
	 */
	void enterIntegerDivide(ExpressionsParser.IntegerDivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#integerDivide}.
	 * @param ctx the parse tree
	 */
	void exitIntegerDivide(ExpressionsParser.IntegerDivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#bitwiseShiftLeft}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseShiftLeft(ExpressionsParser.BitwiseShiftLeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#bitwiseShiftLeft}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseShiftLeft(ExpressionsParser.BitwiseShiftLeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#bitwiseShiftRight}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseShiftRight(ExpressionsParser.BitwiseShiftRightContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#bitwiseShiftRight}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseShiftRight(ExpressionsParser.BitwiseShiftRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#bitwiseAnd}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseAnd(ExpressionsParser.BitwiseAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#bitwiseAnd}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseAnd(ExpressionsParser.BitwiseAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#bitwiseOr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOr(ExpressionsParser.BitwiseOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#bitwiseOr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOr(ExpressionsParser.BitwiseOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAnd(ExpressionsParser.LogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAnd(ExpressionsParser.LogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOr(ExpressionsParser.LogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOr(ExpressionsParser.LogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(ExpressionsParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(ExpressionsParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#notEqual}.
	 * @param ctx the parse tree
	 */
	void enterNotEqual(ExpressionsParser.NotEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#notEqual}.
	 * @param ctx the parse tree
	 */
	void exitNotEqual(ExpressionsParser.NotEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#lessThan}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(ExpressionsParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#lessThan}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(ExpressionsParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#greaterThan}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(ExpressionsParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#greaterThan}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(ExpressionsParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(ExpressionsParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(ExpressionsParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(ExpressionsParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(ExpressionsParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#highByte}.
	 * @param ctx the parse tree
	 */
	void enterHighByte(ExpressionsParser.HighByteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#highByte}.
	 * @param ctx the parse tree
	 */
	void exitHighByte(ExpressionsParser.HighByteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#lowByte}.
	 * @param ctx the parse tree
	 */
	void enterLowByte(ExpressionsParser.LowByteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#lowByte}.
	 * @param ctx the parse tree
	 */
	void exitLowByte(ExpressionsParser.LowByteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#logicalNot}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(ExpressionsParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#logicalNot}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(ExpressionsParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ExpressionsParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ExpressionsParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(ExpressionsParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(ExpressionsParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#alphanumericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterAlphanumericLiteral(ExpressionsParser.AlphanumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#alphanumericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitAlphanumericLiteral(ExpressionsParser.AlphanumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#binaryLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLiteral(ExpressionsParser.BinaryLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#binaryLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLiteral(ExpressionsParser.BinaryLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#octalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterOctalLiteral(ExpressionsParser.OctalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#octalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitOctalLiteral(ExpressionsParser.OctalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(ExpressionsParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(ExpressionsParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#hexLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexLiteral(ExpressionsParser.HexLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#hexLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexLiteral(ExpressionsParser.HexLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharacterLiteral(ExpressionsParser.CharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharacterLiteral(ExpressionsParser.CharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(ExpressionsParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(ExpressionsParser.StringLiteralContext ctx);
}