package ru.spbau;

import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jetbrains.annotations.NotNull;

public class Visitor implements LVisitor<String> {

    private int tabs = 0;

    private @NotNull String spaces(int t) {
        String spaces = "";
        for (int i = 0; i < t; i++) {
            spaces += ' ';
        }
        return spaces;
    }

    private @NotNull String spaces() {
        return spaces(2 * tabs);
    }

    private @NotNull String write(@NotNull String s, Interval i) {
        return spaces() + s + '(' + (i.a + 1)  + ',' + (i.b + 1) + ")\n";
    }

    private @NotNull String write(@NotNull String s, Interval i, @NotNull String t) {
        return spaces() + s + '(' + (i.a + 1)  + ',' + (i.b + 1) + ')' + '[' + t + "]\n";
    }

    /**
     * Visit a parse tree produced by {@link LParser#program}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitProgram(LParser.ProgramContext ctx) {
        String ans = write("PROGRAM", ctx.getSourceInterval());
        tabs++;
        ans += visitBlock(ctx.block());
        tabs--;
        return ans;
    }

    /**
     * Visit a parse tree produced by {@link LParser#block}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitBlock(LParser.BlockContext ctx) {
        String ans = write("BLOCK", ctx.getSourceInterval());
        tabs++;
        ans += visitStatements(ctx.statements());
        tabs--;
        return ans;
    }

    /**
     * Visit a parse tree produced by {@link LParser#statements}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitStatements(LParser.StatementsContext ctx) {
        String ans = write("STATEMENTS", ctx.getSourceInterval());
        tabs++;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ans += ctx.getChild(i).accept(this);
        }
        tabs--;
        return ans;
    }

    /**
     * Visit a parse tree produced by {@link LParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitStatement(LParser.StatementContext ctx) {
        String ans = write("STATEMENT", ctx.getSourceInterval());
        tabs++;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ans += ctx.getChild(i).accept(this);
        }
        tabs--;
        return ans;
    }

    /**
     * Visit a parse tree produced by {@link LParser#ifstatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitIfstatement(LParser.IfstatementContext ctx) {
        String ans = write("IF_STATEMENT", ctx.getSourceInterval());
        tabs++;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ans += ctx.getChild(i).accept(this);
        }
        tabs--;
        return ans;
    }

    /**
     * Visit a parse tree produced by {@link LParser#assignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitAssignment(LParser.AssignmentContext ctx) {
        String ans = write("ASSIGNMENT", ctx.getSourceInterval());
        tabs++;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ans += ctx.getChild(i).accept(this);
        }
        tabs--;
        return ans;
    }

    /**
     * Visit a parse tree produced by {@link LParser#whileStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitWhileStatement(LParser.WhileStatementContext ctx) {
        String ans = write("WHILE_STATEMENT", ctx.getSourceInterval());
        tabs++;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ans += ctx.getChild(i).accept(this);
        }
        tabs--;
        return ans;
    }

    /**
     * Visit a parse tree produced by {@link LParser#conditionStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitConditionStatement(LParser.ConditionStatementContext ctx) {
        String ans = write("CONDITION", ctx.getSourceInterval());
        tabs++;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ans += ctx.getChild(i).accept(this);
        }
        tabs--;
        return ans;
    }

    /**
     * Visit a parse tree produced by {@link LParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitFunctionCall(LParser.FunctionCallContext ctx) {
        String ans = write("FUNCTION_CALL", ctx.getSourceInterval());
        tabs++;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ans += ctx.getChild(i).accept(this);
        }
        tabs--;
        return ans;
    }

    /**
     * Visit a parse tree produced by {@link LParser#comp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitComp(LParser.CompContext ctx) {
        String ans = write("COMPARE", ctx.getSourceInterval());
        tabs++;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ans += ctx.getChild(i).accept(this);
        }
        tabs--;
        return ans;
    }

    /**
     * Visit a parse tree produced by {@link LParser#expressions}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitExpressions(LParser.ExpressionsContext ctx) {
        String ans = write("EXPRESSIONS", ctx.getSourceInterval());
        tabs++;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ans += ctx.getChild(i).accept(this);
        }
        tabs--;
        return ans;
    }

    /**
     * Visit a parse tree produced by {@link LParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitExpression(LParser.ExpressionContext ctx) {
        String ans = write("EXPRESSION", ctx.getSourceInterval());
        tabs++;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ans += ctx.getChild(i).accept(this);
        }
        tabs--;
        return ans;
    }

    /**
     * Visit a parse tree produced by {@link LParser#p}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitP(LParser.PContext ctx) {
        String ans = "";
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ans += ctx.getChild(i).accept(this);
        }
        return ans;
    }

    /**
     * Visit a parse tree produced by {@link LParser#m}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitM(LParser.MContext ctx) {
        String ans = "";
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ans += ctx.getChild(i).accept(this);
        }
        return ans;
    }

    /**
     * Visit a parse tree produced by {@link LParser#u}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitU(LParser.UContext ctx) {
        String ans = "";
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ans += ctx.getChild(i).accept(this);
        }
        return ans;
    }

    /**
     * Visit a parse tree produced by {@link LParser#z}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitZ(LParser.ZContext ctx) {
        String ans = "";
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ans += ctx.getChild(i).accept(this);
        }
        return ans;
    }

    /**
     * Visit a parse tree produced by {@link LParser#number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitNumber(LParser.NumberContext ctx) {
        String ans = "";
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ans += ctx.getChild(i).accept(this);
        }
        return ans;
    }

    /**
     * Visit a parse tree produced by {@link LParser#digit}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitDigit(LParser.DigitContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link LParser#digitsAndUnderscores}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitDigitsAndUnderscores(LParser.DigitsAndUnderscoresContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link LParser#digits}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitDigits(LParser.DigitsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link LParser#r_integer}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitR_integer(LParser.R_integerContext ctx) {
        return write("INTEGER", ctx.getSourceInterval(), ctx.getText());
    }

    /**
     * Visit a parse tree produced by {@link LParser#signedInteger}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitSignedInteger(LParser.SignedIntegerContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link LParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitExp(LParser.ExpContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link LParser#r_float}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitR_float(LParser.R_floatContext ctx) {
        return write("FLOAT", ctx.getSourceInterval(), ctx.getText());
    }

    /**
     * Visit a parse tree produced by {@link LParser#ident}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitIdent(LParser.IdentContext ctx) {
        return write("IDENT", ctx.getSourceInterval(), ctx.getText());
    }

    /**
     * Visit a parse tree, and return a user-defined result of the operation.
     *
     * @param tree The {@link ParseTree} to visit.
     * @return The result of visiting the parse tree.
     */
    @Override
    public String visit(ParseTree tree) {
        return null;
    }

    /**
     * Visit the children of a node, and return a user-defined result of the
     * operation.
     *
     * @param node The {@link RuleNode} whose children should be visited.
     * @return The result of visiting the children of the node.
     */
    @Override
    public String visitChildren(RuleNode node) {
        return null;
    }

    /**
     * Visit a terminal node, and return a user-defined result of the operation.
     *
     * @param node The {@link TerminalNode} to visit.
     * @return The result of visiting the node.
     */
    @Override
    public String visitTerminal(TerminalNode node) {
        return "";
    }

    /**
     * Visit an error node, and return a user-defined result of the operation.
     *
     * @param node The {@link ErrorNode} to visit.
     * @return The result of visiting the node.
     */
    @Override
    public String visitErrorNode(ErrorNode node) {
        return null;
    }
}