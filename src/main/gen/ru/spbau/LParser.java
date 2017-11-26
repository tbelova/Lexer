package ru.spbau;// Generated from /home/tanya/AU/5thTerm/FL/hw04/Lexer/src/main/antlr/L.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PositiveDigit=1, Underscore=2, Letter=3, LineTerminator=4, Dot=5, Comma=6, 
		LeftBrace=7, RightBrace=8, LeftFigureBrace=9, RightFigureBrace=10, Semicolon=11, 
		PLUS=12, MINUS=13, MULT=14, DIV=15, REM=16, EQ=17, NEQ=18, G=19, GE=20, 
		L=21, LE=22, AND=23, OR=24, AS=25, If=26, Then=27, Else=28, While=29, 
		Return=30, True=31, False=32, Zero=33, Sign=34, E=35, Comment=36, WhiteSpace=37;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_ifstatement = 4, RULE_assignment = 5, RULE_whileStatement = 6, RULE_conditionStatement = 7, 
		RULE_function = 8, RULE_functionCall = 9, RULE_comp = 10, RULE_eq = 11, 
		RULE_neq = 12, RULE_g = 13, RULE_ge = 14, RULE_l = 15, RULE_le = 16, RULE_returnStatement = 17, 
		RULE_expressions = 18, RULE_expression = 19, RULE_idents = 20, RULE_p = 21, 
		RULE_m = 22, RULE_u = 23, RULE_z = 24, RULE_smth = 25, RULE_number = 26, 
		RULE_digit = 27, RULE_digitsAndUnderscores = 28, RULE_digits = 29, RULE_r_integer = 30, 
		RULE_signedInteger = 31, RULE_exp = 32, RULE_r_float = 33, RULE_ident = 34;
	public static final String[] ruleNames = {
		"program", "block", "statements", "statement", "ifstatement", "assignment", 
		"whileStatement", "conditionStatement", "function", "functionCall", "comp", 
		"eq", "neq", "g", "ge", "l", "le", "returnStatement", "expressions", "expression", 
		"idents", "p", "m", "u", "z", "smth", "number", "digit", "digitsAndUnderscores", 
		"digits", "r_integer", "signedInteger", "exp", "r_float", "ident"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'_'", null, null, "'.'", "','", "'('", "')'", "'{'", "'}'", 
		"';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'>'", "'>='", 
		"'<'", "'<='", "'&&'", "'||'", "':='", "'if'", "'then'", "'else'", "'while'", 
		"'return'", "'true'", "'false'", "'0'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PositiveDigit", "Underscore", "Letter", "LineTerminator", "Dot", 
		"Comma", "LeftBrace", "RightBrace", "LeftFigureBrace", "RightFigureBrace", 
		"Semicolon", "PLUS", "MINUS", "MULT", "DIV", "REM", "EQ", "NEQ", "G", 
		"GE", "L", "LE", "AND", "OR", "AS", "If", "Then", "Else", "While", "Return", 
		"True", "False", "Zero", "Sign", "E", "Comment", "WhiteSpace"
	};
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
	public String getGrammarFileName() { return "L.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			statements();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LeftFigureBrace() { return getToken(LParser.LeftFigureBrace, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RightFigureBrace() { return getToken(LParser.RightFigureBrace, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(LeftFigureBrace);
			setState(73);
			statements();
			setState(74);
			match(RightFigureBrace);
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

	public static class StatementsContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				statement();
				setState(81);
				statements();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				block();
				setState(84);
				statements();
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

	public static class StatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(LParser.Semicolon, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				functionCall();
				setState(89);
				match(Semicolon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				assignment();
				setState(92);
				match(Semicolon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				ifstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				returnStatement();
				setState(97);
				match(Semicolon);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				expression();
				setState(100);
				match(Semicolon);
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

	public static class IfstatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(LParser.If, 0); }
		public TerminalNode LeftBrace() { return getToken(LParser.LeftBrace, 0); }
		public ConditionStatementContext conditionStatement() {
			return getRuleContext(ConditionStatementContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(LParser.RightBrace, 0); }
		public TerminalNode Then() { return getToken(LParser.Then, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode Else() { return getToken(LParser.Else, 0); }
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifstatement);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(If);
				setState(105);
				match(LeftBrace);
				setState(106);
				conditionStatement();
				setState(107);
				match(RightBrace);
				setState(108);
				match(Then);
				setState(109);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(If);
				setState(112);
				match(LeftBrace);
				setState(113);
				conditionStatement();
				setState(114);
				match(RightBrace);
				setState(115);
				match(Then);
				setState(116);
				block();
				setState(117);
				match(Else);
				setState(118);
				block();
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

	public static class AssignmentContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode AS() { return getToken(LParser.AS, 0); }
		public ConditionStatementContext conditionStatement() {
			return getRuleContext(ConditionStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				ident();
				setState(123);
				match(AS);
				setState(124);
				conditionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				ident();
				setState(127);
				match(AS);
				setState(128);
				expression();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(LParser.While, 0); }
		public TerminalNode LeftBrace() { return getToken(LParser.LeftBrace, 0); }
		public ConditionStatementContext conditionStatement() {
			return getRuleContext(ConditionStatementContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(LParser.RightBrace, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(While);
			setState(133);
			match(LeftBrace);
			setState(134);
			conditionStatement();
			setState(135);
			match(RightBrace);
			setState(136);
			block();
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

	public static class ConditionStatementContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(LParser.True, 0); }
		public TerminalNode False() { return getToken(LParser.False, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public ConditionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterConditionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitConditionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitConditionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionStatementContext conditionStatement() throws RecognitionException {
		ConditionStatementContext _localctx = new ConditionStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conditionStatement);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(True);
				}
				break;
			case False:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(False);
				}
				break;
			case PositiveDigit:
			case Underscore:
			case Letter:
			case Dot:
			case LeftBrace:
			case MINUS:
			case Zero:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				expression();
				setState(141);
				comp();
				setState(142);
				expression();
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

	public static class FunctionContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(LParser.LeftBrace, 0); }
		public IdentsContext idents() {
			return getRuleContext(IdentsContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(LParser.RightBrace, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			ident();
			setState(147);
			match(LeftBrace);
			setState(148);
			idents();
			setState(149);
			match(RightBrace);
			setState(150);
			block();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(LParser.LeftBrace, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(LParser.RightBrace, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			ident();
			setState(153);
			match(LeftBrace);
			setState(154);
			expressions();
			setState(155);
			match(RightBrace);
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

	public static class CompContext extends ParserRuleContext {
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public NeqContext neq() {
			return getRuleContext(NeqContext.class,0);
		}
		public GContext g() {
			return getRuleContext(GContext.class,0);
		}
		public GeContext ge() {
			return getRuleContext(GeContext.class,0);
		}
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public LeContext le() {
			return getRuleContext(LeContext.class,0);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comp);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				eq();
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				neq();
				}
				break;
			case G:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				g();
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				ge();
				}
				break;
			case L:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				l();
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				le();
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

	public static class EqContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(LParser.EQ, 0); }
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqContext eq() throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(EQ);
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

	public static class NeqContext extends ParserRuleContext {
		public TerminalNode NEQ() { return getToken(LParser.NEQ, 0); }
		public NeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterNeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitNeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitNeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NeqContext neq() throws RecognitionException {
		NeqContext _localctx = new NeqContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_neq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(NEQ);
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

	public static class GContext extends ParserRuleContext {
		public TerminalNode G() { return getToken(LParser.G, 0); }
		public GContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_g; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GContext g() throws RecognitionException {
		GContext _localctx = new GContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_g);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(G);
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

	public static class GeContext extends ParserRuleContext {
		public TerminalNode GE() { return getToken(LParser.GE, 0); }
		public GeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterGe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitGe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitGe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeContext ge() throws RecognitionException {
		GeContext _localctx = new GeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(GE);
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

	public static class LContext extends ParserRuleContext {
		public TerminalNode L() { return getToken(LParser.L, 0); }
		public LContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LContext l() throws RecognitionException {
		LContext _localctx = new LContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(L);
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

	public static class LeContext extends ParserRuleContext {
		public TerminalNode LE() { return getToken(LParser.LE, 0); }
		public LeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_le; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterLe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitLe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitLe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeContext le() throws RecognitionException {
		LeContext _localctx = new LeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_le);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(LE);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(LParser.Return, 0); }
		public SmthContext smth() {
			return getRuleContext(SmthContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnStatement);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(Return);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(Return);
				setState(179);
				smth();
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

	public static class ExpressionsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(LParser.Comma, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressions);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				expression();
				setState(184);
				match(Comma);
				setState(185);
				expressions();
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

	public static class ExpressionContext extends ParserRuleContext {
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			p(0);
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

	public static class IdentsContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode Comma() { return getToken(LParser.Comma, 0); }
		public IdentsContext idents() {
			return getRuleContext(IdentsContext.class,0);
		}
		public IdentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterIdents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitIdents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitIdents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentsContext idents() throws RecognitionException {
		IdentsContext _localctx = new IdentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_idents);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				ident();
				setState(193);
				match(Comma);
				setState(194);
				idents();
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

	public static class PContext extends ParserRuleContext {
		public PContext sum;
		public PContext sub;
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LParser.PLUS, 0); }
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(LParser.MINUS, 0); }
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PContext p() throws RecognitionException {
		return p(0);
	}

	private PContext p(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PContext _localctx = new PContext(_ctx, _parentState);
		PContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_p, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(199);
			m(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(207);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new PContext(_parentctx, _parentState);
						_localctx.sum = _prevctx;
						_localctx.sum = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_p);
						setState(201);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(202);
						match(PLUS);
						setState(203);
						m(0);
						}
						break;
					case 2:
						{
						_localctx = new PContext(_parentctx, _parentState);
						_localctx.sub = _prevctx;
						_localctx.sub = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_p);
						setState(204);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(205);
						match(MINUS);
						setState(206);
						m(0);
						}
						break;
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MContext extends ParserRuleContext {
		public MContext mult;
		public MContext div;
		public MContext rem;
		public UContext u() {
			return getRuleContext(UContext.class,0);
		}
		public TerminalNode MULT() { return getToken(LParser.MULT, 0); }
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public TerminalNode DIV() { return getToken(LParser.DIV, 0); }
		public TerminalNode REM() { return getToken(LParser.REM, 0); }
		public MContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MContext m() throws RecognitionException {
		return m(0);
	}

	private MContext m(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MContext _localctx = new MContext(_ctx, _parentState);
		MContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_m, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(213);
			u();
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(224);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MContext(_parentctx, _parentState);
						_localctx.mult = _prevctx;
						_localctx.mult = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_m);
						setState(215);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(216);
						match(MULT);
						setState(217);
						u();
						}
						break;
					case 2:
						{
						_localctx = new MContext(_parentctx, _parentState);
						_localctx.div = _prevctx;
						_localctx.div = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_m);
						setState(218);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(219);
						match(DIV);
						setState(220);
						u();
						}
						break;
					case 3:
						{
						_localctx = new MContext(_parentctx, _parentState);
						_localctx.rem = _prevctx;
						_localctx.rem = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_m);
						setState(221);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(222);
						match(REM);
						setState(223);
						u();
						}
						break;
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UContext extends ParserRuleContext {
		public org.antlr.v4.runtime.Token unary_minus;
		public UContext u() {
			return getRuleContext(UContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(LParser.MINUS, 0); }
		public ZContext z() {
			return getRuleContext(ZContext.class,0);
		}
		public UContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_u; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterU(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitU(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitU(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UContext u() throws RecognitionException {
		UContext _localctx = new UContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_u);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				((UContext)_localctx).unary_minus = match(MINUS);
				setState(230);
				u();
				}
				break;
			case PositiveDigit:
			case Underscore:
			case Letter:
			case Dot:
			case LeftBrace:
			case Zero:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				z();
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

	public static class ZContext extends ParserRuleContext {
		public SmthContext smth() {
			return getRuleContext(SmthContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(LParser.LeftBrace, 0); }
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(LParser.RightBrace, 0); }
		public ZContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_z; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterZ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitZ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitZ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZContext z() throws RecognitionException {
		ZContext _localctx = new ZContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_z);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PositiveDigit:
			case Underscore:
			case Letter:
			case Dot:
			case Zero:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				smth();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(LeftBrace);
				setState(236);
				p(0);
				setState(237);
				match(RightBrace);
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

	public static class SmthContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public SmthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterSmth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitSmth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitSmth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmthContext smth() throws RecognitionException {
		SmthContext _localctx = new SmthContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_smth);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				functionCall();
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

	public static class NumberContext extends ParserRuleContext {
		public R_integerContext r_integer() {
			return getRuleContext(R_integerContext.class,0);
		}
		public R_floatContext r_float() {
			return getRuleContext(R_floatContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_number);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				r_integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				r_float();
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

	public static class DigitContext extends ParserRuleContext {
		public TerminalNode Zero() { return getToken(LParser.Zero, 0); }
		public TerminalNode PositiveDigit() { return getToken(LParser.PositiveDigit, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !(_la==PositiveDigit || _la==Zero) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)== org.antlr.v4.runtime.Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DigitsAndUnderscoresContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public List<TerminalNode> Underscore() { return getTokens(LParser.Underscore); }
		public TerminalNode Underscore(int i) {
			return getToken(LParser.Underscore, i);
		}
		public DigitsAndUnderscoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digitsAndUnderscores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterDigitsAndUnderscores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitDigitsAndUnderscores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitDigitsAndUnderscores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitsAndUnderscoresContext digitsAndUnderscores() throws RecognitionException {
		DigitsAndUnderscoresContext _localctx = new DigitsAndUnderscoresContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_digitsAndUnderscores);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(254);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PositiveDigit:
					case Zero:
						{
						setState(252);
						digit();
						}
						break;
					case Underscore:
						{
						setState(253);
						match(Underscore);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class DigitsContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public DigitsAndUnderscoresContext digitsAndUnderscores() {
			return getRuleContext(DigitsAndUnderscoresContext.class,0);
		}
		public DigitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterDigits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitDigits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitDigits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitsContext digits() throws RecognitionException {
		DigitsContext _localctx = new DigitsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_digits);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				digit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				digit();
				setState(261);
				digitsAndUnderscores();
				setState(262);
				digit();
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

	public static class R_integerContext extends ParserRuleContext {
		public TerminalNode Zero() { return getToken(LParser.Zero, 0); }
		public TerminalNode PositiveDigit() { return getToken(LParser.PositiveDigit, 0); }
		public DigitsAndUnderscoresContext digitsAndUnderscores() {
			return getRuleContext(DigitsAndUnderscoresContext.class,0);
		}
		public R_integerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterR_integer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitR_integer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitR_integer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_integerContext r_integer() throws RecognitionException {
		R_integerContext _localctx = new R_integerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_r_integer);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(Zero);
				}
				break;
			case PositiveDigit:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(PositiveDigit);
				setState(268);
				digitsAndUnderscores();
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

	public static class SignedIntegerContext extends ParserRuleContext {
		public TerminalNode Sign() { return getToken(LParser.Sign, 0); }
		public R_integerContext r_integer() {
			return getRuleContext(R_integerContext.class,0);
		}
		public SignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterSignedInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitSignedInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitSignedInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedIntegerContext signedInteger() throws RecognitionException {
		SignedIntegerContext _localctx = new SignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_signedInteger);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Sign:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(Sign);
				setState(272);
				r_integer();
				}
				break;
			case PositiveDigit:
			case Zero:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				r_integer();
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode E() { return getToken(LParser.E, 0); }
		public SignedIntegerContext signedInteger() {
			return getRuleContext(SignedIntegerContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(E);
			setState(277);
			signedInteger();
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

	public static class R_floatContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(LParser.Dot, 0); }
		public List<R_integerContext> r_integer() {
			return getRuleContexts(R_integerContext.class);
		}
		public R_integerContext r_integer(int i) {
			return getRuleContext(R_integerContext.class,i);
		}
		public DigitsContext digits() {
			return getRuleContext(DigitsContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public R_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterR_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitR_float(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitR_float(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_floatContext r_float() throws RecognitionException {
		R_floatContext _localctx = new R_floatContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_r_float);
		int _la;
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PositiveDigit || _la==Zero) {
					{
					setState(279);
					r_integer();
					}
				}

				setState(282);
				match(Dot);
				setState(284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(283);
					digits();
					}
					break;
				}
				setState(287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(286);
					exp();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PositiveDigit || _la==Zero) {
					{
					{
					setState(289);
					r_integer();
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(295);
				match(Dot);
				setState(296);
				digits();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				r_integer();
				setState(299);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(298);
					exp();
					}
					break;
				}
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

	public static class IdentContext extends ParserRuleContext {
		public List<TerminalNode> Underscore() { return getTokens(LParser.Underscore); }
		public TerminalNode Underscore(int i) {
			return getToken(LParser.Underscore, i);
		}
		public List<TerminalNode> Letter() { return getTokens(LParser.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(LParser.Letter, i);
		}
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ident);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( !(_la==Underscore || _la==Letter) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)== Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(307);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Underscore:
						{
						setState(304);
						match(Underscore);
						}
						break;
					case Letter:
						{
						setState(305);
						match(Letter);
						}
						break;
					case PositiveDigit:
					case Zero:
						{
						setState(306);
						digit();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return p_sempred((PContext)_localctx, predIndex);
		case 22:
			return m_sempred((MContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean p_sempred(PContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean m_sempred(MContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u013b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4Y\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5i\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6{\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0085"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0093\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00a6\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\23\5\23\u00b7\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u00be"+
		"\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00c7\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00d2\n\27\f\27\16\27\u00d5\13\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00e3"+
		"\n\30\f\30\16\30\u00e6\13\30\3\31\3\31\3\31\5\31\u00eb\n\31\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u00f2\n\32\3\33\3\33\3\33\5\33\u00f7\n\33\3\34\3"+
		"\34\5\34\u00fb\n\34\3\35\3\35\3\36\3\36\7\36\u0101\n\36\f\36\16\36\u0104"+
		"\13\36\3\37\3\37\3\37\3\37\3\37\5\37\u010b\n\37\3 \3 \3 \5 \u0110\n \3"+
		"!\3!\3!\5!\u0115\n!\3\"\3\"\3\"\3#\5#\u011b\n#\3#\3#\5#\u011f\n#\3#\5"+
		"#\u0122\n#\3#\7#\u0125\n#\f#\16#\u0128\13#\3#\3#\3#\3#\5#\u012e\n#\5#"+
		"\u0130\n#\3$\3$\3$\3$\7$\u0136\n$\f$\16$\u0139\13$\3$\2\4,.%\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\4\4\2\3\3"+
		"##\3\2\4\5\2\u0146\2H\3\2\2\2\4J\3\2\2\2\6X\3\2\2\2\bh\3\2\2\2\nz\3\2"+
		"\2\2\f\u0084\3\2\2\2\16\u0086\3\2\2\2\20\u0092\3\2\2\2\22\u0094\3\2\2"+
		"\2\24\u009a\3\2\2\2\26\u00a5\3\2\2\2\30\u00a7\3\2\2\2\32\u00a9\3\2\2\2"+
		"\34\u00ab\3\2\2\2\36\u00ad\3\2\2\2 \u00af\3\2\2\2\"\u00b1\3\2\2\2$\u00b6"+
		"\3\2\2\2&\u00bd\3\2\2\2(\u00bf\3\2\2\2*\u00c6\3\2\2\2,\u00c8\3\2\2\2."+
		"\u00d6\3\2\2\2\60\u00ea\3\2\2\2\62\u00f1\3\2\2\2\64\u00f6\3\2\2\2\66\u00fa"+
		"\3\2\2\28\u00fc\3\2\2\2:\u0102\3\2\2\2<\u010a\3\2\2\2>\u010f\3\2\2\2@"+
		"\u0114\3\2\2\2B\u0116\3\2\2\2D\u012f\3\2\2\2F\u0131\3\2\2\2HI\5\6\4\2"+
		"I\3\3\2\2\2JK\7\13\2\2KL\5\6\4\2LM\7\f\2\2M\5\3\2\2\2NY\3\2\2\2OY\5\22"+
		"\n\2PY\5\b\5\2QY\5\4\3\2RS\5\b\5\2ST\5\6\4\2TY\3\2\2\2UV\5\4\3\2VW\5\6"+
		"\4\2WY\3\2\2\2XN\3\2\2\2XO\3\2\2\2XP\3\2\2\2XQ\3\2\2\2XR\3\2\2\2XU\3\2"+
		"\2\2Y\7\3\2\2\2Z[\5\24\13\2[\\\7\r\2\2\\i\3\2\2\2]^\5\f\7\2^_\7\r\2\2"+
		"_i\3\2\2\2`i\5\16\b\2ai\5\n\6\2bc\5$\23\2cd\7\r\2\2di\3\2\2\2ef\5(\25"+
		"\2fg\7\r\2\2gi\3\2\2\2hZ\3\2\2\2h]\3\2\2\2h`\3\2\2\2ha\3\2\2\2hb\3\2\2"+
		"\2he\3\2\2\2i\t\3\2\2\2jk\7\34\2\2kl\7\t\2\2lm\5\20\t\2mn\7\n\2\2no\7"+
		"\35\2\2op\5\4\3\2p{\3\2\2\2qr\7\34\2\2rs\7\t\2\2st\5\20\t\2tu\7\n\2\2"+
		"uv\7\35\2\2vw\5\4\3\2wx\7\36\2\2xy\5\4\3\2y{\3\2\2\2zj\3\2\2\2zq\3\2\2"+
		"\2{\13\3\2\2\2|}\5F$\2}~\7\33\2\2~\177\5\20\t\2\177\u0085\3\2\2\2\u0080"+
		"\u0081\5F$\2\u0081\u0082\7\33\2\2\u0082\u0083\5(\25\2\u0083\u0085\3\2"+
		"\2\2\u0084|\3\2\2\2\u0084\u0080\3\2\2\2\u0085\r\3\2\2\2\u0086\u0087\7"+
		"\37\2\2\u0087\u0088\7\t\2\2\u0088\u0089\5\20\t\2\u0089\u008a\7\n\2\2\u008a"+
		"\u008b\5\4\3\2\u008b\17\3\2\2\2\u008c\u0093\7!\2\2\u008d\u0093\7\"\2\2"+
		"\u008e\u008f\5(\25\2\u008f\u0090\5\26\f\2\u0090\u0091\5(\25\2\u0091\u0093"+
		"\3\2\2\2\u0092\u008c\3\2\2\2\u0092\u008d\3\2\2\2\u0092\u008e\3\2\2\2\u0093"+
		"\21\3\2\2\2\u0094\u0095\5F$\2\u0095\u0096\7\t\2\2\u0096\u0097\5*\26\2"+
		"\u0097\u0098\7\n\2\2\u0098\u0099\5\4\3\2\u0099\23\3\2\2\2\u009a\u009b"+
		"\5F$\2\u009b\u009c\7\t\2\2\u009c\u009d\5&\24\2\u009d\u009e\7\n\2\2\u009e"+
		"\25\3\2\2\2\u009f\u00a6\5\30\r\2\u00a0\u00a6\5\32\16\2\u00a1\u00a6\5\34"+
		"\17\2\u00a2\u00a6\5\36\20\2\u00a3\u00a6\5 \21\2\u00a4\u00a6\5\"\22\2\u00a5"+
		"\u009f\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\27\3\2\2\2\u00a7\u00a8"+
		"\7\23\2\2\u00a8\31\3\2\2\2\u00a9\u00aa\7\24\2\2\u00aa\33\3\2\2\2\u00ab"+
		"\u00ac\7\25\2\2\u00ac\35\3\2\2\2\u00ad\u00ae\7\26\2\2\u00ae\37\3\2\2\2"+
		"\u00af\u00b0\7\27\2\2\u00b0!\3\2\2\2\u00b1\u00b2\7\30\2\2\u00b2#\3\2\2"+
		"\2\u00b3\u00b7\7 \2\2\u00b4\u00b5\7 \2\2\u00b5\u00b7\5\64\33\2\u00b6\u00b3"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7%\3\2\2\2\u00b8\u00be\5(\25\2\u00b9"+
		"\u00ba\5(\25\2\u00ba\u00bb\7\b\2\2\u00bb\u00bc\5&\24\2\u00bc\u00be\3\2"+
		"\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be\'\3\2\2\2\u00bf\u00c0"+
		"\5,\27\2\u00c0)\3\2\2\2\u00c1\u00c7\5F$\2\u00c2\u00c3\5F$\2\u00c3\u00c4"+
		"\7\b\2\2\u00c4\u00c5\5*\26\2\u00c5\u00c7\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6"+
		"\u00c2\3\2\2\2\u00c7+\3\2\2\2\u00c8\u00c9\b\27\1\2\u00c9\u00ca\5.\30\2"+
		"\u00ca\u00d3\3\2\2\2\u00cb\u00cc\f\4\2\2\u00cc\u00cd\7\16\2\2\u00cd\u00d2"+
		"\5.\30\2\u00ce\u00cf\f\3\2\2\u00cf\u00d0\7\17\2\2\u00d0\u00d2\5.\30\2"+
		"\u00d1\u00cb\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4-\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00d7\b\30\1\2\u00d7\u00d8\5\60\31\2\u00d8\u00e4\3\2\2\2\u00d9\u00da"+
		"\f\5\2\2\u00da\u00db\7\20\2\2\u00db\u00e3\5\60\31\2\u00dc\u00dd\f\4\2"+
		"\2\u00dd\u00de\7\21\2\2\u00de\u00e3\5\60\31\2\u00df\u00e0\f\3\2\2\u00e0"+
		"\u00e1\7\22\2\2\u00e1\u00e3\5\60\31\2\u00e2\u00d9\3\2\2\2\u00e2\u00dc"+
		"\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5/\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\17\2\2"+
		"\u00e8\u00eb\5\60\31\2\u00e9\u00eb\5\62\32\2\u00ea\u00e7\3\2\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\61\3\2\2\2\u00ec\u00f2\5\64\33\2\u00ed\u00ee\7\t"+
		"\2\2\u00ee\u00ef\5,\27\2\u00ef\u00f0\7\n\2\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00ec\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f2\63\3\2\2\2\u00f3\u00f7\5\66\34"+
		"\2\u00f4\u00f7\5F$\2\u00f5\u00f7\5\24\13\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\65\3\2\2\2\u00f8\u00fb\5> \2\u00f9"+
		"\u00fb\5D#\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\67\3\2\2\2"+
		"\u00fc\u00fd\t\2\2\2\u00fd9\3\2\2\2\u00fe\u0101\58\35\2\u00ff\u0101\7"+
		"\4\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103;\3\2\2\2\u0104\u0102\3\2\2\2"+
		"\u0105\u010b\58\35\2\u0106\u0107\58\35\2\u0107\u0108\5:\36\2\u0108\u0109"+
		"\58\35\2\u0109\u010b\3\2\2\2\u010a\u0105\3\2\2\2\u010a\u0106\3\2\2\2\u010b"+
		"=\3\2\2\2\u010c\u0110\7#\2\2\u010d\u010e\7\3\2\2\u010e\u0110\5:\36\2\u010f"+
		"\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u0110?\3\2\2\2\u0111\u0112\7$\2\2\u0112"+
		"\u0115\5> \2\u0113\u0115\5> \2\u0114\u0111\3\2\2\2\u0114\u0113\3\2\2\2"+
		"\u0115A\3\2\2\2\u0116\u0117\7%\2\2\u0117\u0118\5@!\2\u0118C\3\2\2\2\u0119"+
		"\u011b\5> \2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2"+
		"\2\u011c\u011e\7\7\2\2\u011d\u011f\5<\37\2\u011e\u011d\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u0122\5B\"\2\u0121\u0120\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0130\3\2\2\2\u0123\u0125\5> \2\u0124\u0123\3\2\2"+
		"\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129"+
		"\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7\7\2\2\u012a\u0130\5<\37\2\u012b"+
		"\u012d\5> \2\u012c\u012e\5B\"\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2"+
		"\2\u012e\u0130\3\2\2\2\u012f\u011a\3\2\2\2\u012f\u0126\3\2\2\2\u012f\u012b"+
		"\3\2\2\2\u0130E\3\2\2\2\u0131\u0137\t\3\2\2\u0132\u0136\7\4\2\2\u0133"+
		"\u0136\7\5\2\2\u0134\u0136\58\35\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138G\3\2\2\2\u0139\u0137\3\2\2\2 Xhz\u0084\u0092\u00a5"+
		"\u00b6\u00bd\u00c6\u00d1\u00d3\u00e2\u00e4\u00ea\u00f1\u00f6\u00fa\u0100"+
		"\u0102\u010a\u010f\u0114\u011a\u011e\u0121\u0126\u012d\u012f\u0135\u0137";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}