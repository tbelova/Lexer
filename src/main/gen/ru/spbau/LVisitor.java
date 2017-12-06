package ru.spbau;// Generated from /home/tanya/AU/5thTerm/FL/hw04/Lexer/src/main/antlr/L.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(LParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(LParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#readStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(LParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#writeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(LParser.WriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(LParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#thenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenStatement(LParser.ThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(LParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(LParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(LParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(LParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(LParser.AContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB(LParser.BContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC(LParser.CContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD(LParser.DContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(LParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#neq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeq(LParser.NeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#g}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitG(LParser.GContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#ge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGe(LParser.GeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL(LParser.LContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#le}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe(LParser.LeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(LParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(LParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#idents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdents(LParser.IdentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(LParser.PContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#m}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM(LParser.MContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#u}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitU(LParser.UContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#z}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZ(LParser.ZContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#smth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmth(LParser.SmthContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(LParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(LParser.DigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#digitsAndUnderscores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitsAndUnderscores(LParser.DigitsAndUnderscoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#digits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigits(LParser.DigitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#r_integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_integer(LParser.R_integerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#signedInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedInteger(LParser.SignedIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(LParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#r_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_float(LParser.R_floatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(LParser.IdentContext ctx);
}