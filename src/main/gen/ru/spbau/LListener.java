package ru.spbau;// Generated from /home/tanya/AU/5thTerm/FL/hw04/Lexer/src/main/antlr/L.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LParser}.
 */
public interface LListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(LParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(LParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(LParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(LParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(LParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(LParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(LParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(LParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(LParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(LParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#thenStatement}.
	 * @param ctx the parse tree
	 */
	void enterThenStatement(LParser.ThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#thenStatement}.
	 * @param ctx the parse tree
	 */
	void exitThenStatement(LParser.ThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(LParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(LParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(LParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(LParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(LParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(LParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(LParser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(LParser.AContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#b}.
	 * @param ctx the parse tree
	 */
	void enterB(LParser.BContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#b}.
	 * @param ctx the parse tree
	 */
	void exitB(LParser.BContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#c}.
	 * @param ctx the parse tree
	 */
	void enterC(LParser.CContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#c}.
	 * @param ctx the parse tree
	 */
	void exitC(LParser.CContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#d}.
	 * @param ctx the parse tree
	 */
	void enterD(LParser.DContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#d}.
	 * @param ctx the parse tree
	 */
	void exitD(LParser.DContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(LParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(LParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#neq}.
	 * @param ctx the parse tree
	 */
	void enterNeq(LParser.NeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#neq}.
	 * @param ctx the parse tree
	 */
	void exitNeq(LParser.NeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#g}.
	 * @param ctx the parse tree
	 */
	void enterG(LParser.GContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#g}.
	 * @param ctx the parse tree
	 */
	void exitG(LParser.GContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#ge}.
	 * @param ctx the parse tree
	 */
	void enterGe(LParser.GeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#ge}.
	 * @param ctx the parse tree
	 */
	void exitGe(LParser.GeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#l}.
	 * @param ctx the parse tree
	 */
	void enterL(LParser.LContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#l}.
	 * @param ctx the parse tree
	 */
	void exitL(LParser.LContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#le}.
	 * @param ctx the parse tree
	 */
	void enterLe(LParser.LeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#le}.
	 * @param ctx the parse tree
	 */
	void exitLe(LParser.LeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(LParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(LParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(LParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(LParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#idents}.
	 * @param ctx the parse tree
	 */
	void enterIdents(LParser.IdentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#idents}.
	 * @param ctx the parse tree
	 */
	void exitIdents(LParser.IdentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(LParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(LParser.PContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#m}.
	 * @param ctx the parse tree
	 */
	void enterM(LParser.MContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#m}.
	 * @param ctx the parse tree
	 */
	void exitM(LParser.MContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#u}.
	 * @param ctx the parse tree
	 */
	void enterU(LParser.UContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#u}.
	 * @param ctx the parse tree
	 */
	void exitU(LParser.UContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#z}.
	 * @param ctx the parse tree
	 */
	void enterZ(LParser.ZContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#z}.
	 * @param ctx the parse tree
	 */
	void exitZ(LParser.ZContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#smth}.
	 * @param ctx the parse tree
	 */
	void enterSmth(LParser.SmthContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#smth}.
	 * @param ctx the parse tree
	 */
	void exitSmth(LParser.SmthContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(LParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(LParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(LParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(LParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#digitsAndUnderscores}.
	 * @param ctx the parse tree
	 */
	void enterDigitsAndUnderscores(LParser.DigitsAndUnderscoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#digitsAndUnderscores}.
	 * @param ctx the parse tree
	 */
	void exitDigitsAndUnderscores(LParser.DigitsAndUnderscoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#digits}.
	 * @param ctx the parse tree
	 */
	void enterDigits(LParser.DigitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#digits}.
	 * @param ctx the parse tree
	 */
	void exitDigits(LParser.DigitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#r_integer}.
	 * @param ctx the parse tree
	 */
	void enterR_integer(LParser.R_integerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#r_integer}.
	 * @param ctx the parse tree
	 */
	void exitR_integer(LParser.R_integerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#signedInteger}.
	 * @param ctx the parse tree
	 */
	void enterSignedInteger(LParser.SignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#signedInteger}.
	 * @param ctx the parse tree
	 */
	void exitSignedInteger(LParser.SignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(LParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(LParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#r_float}.
	 * @param ctx the parse tree
	 */
	void enterR_float(LParser.R_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#r_float}.
	 * @param ctx the parse tree
	 */
	void exitR_float(LParser.R_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(LParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(LParser.IdentContext ctx);
}