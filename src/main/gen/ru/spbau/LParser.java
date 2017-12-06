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
		PositiveDigit=1, Underscore=2, Letter=3, Dot=4, Comma=5, LeftBrace=6, 
		RightBrace=7, LeftFigureBrace=8, RightFigureBrace=9, Semicolon=10, PLUS=11, 
		MINUS=12, MULT=13, DIV=14, REM=15, EQ=16, NEQ=17, GE=18, G=19, LE=20, 
		L=21, AND=22, OR=23, AS=24, If=25, Then=26, Else=27, While=28, Write=29, 
		Read=30, Do=31, Return=32, True=33, False=34, Zero=35, Sign=36, E=37, 
		Comment=38, LineTerminator=39, WhiteSpace=40;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_ifstatement = 4, RULE_readStatement = 5, RULE_writeStatement = 6, 
		RULE_assignment = 7, RULE_whileStatement = 8, RULE_thenStatement = 9, 
		RULE_elseStatement = 10, RULE_function = 11, RULE_functionCall = 12, RULE_booleanExpression = 13, 
		RULE_a = 14, RULE_b = 15, RULE_c = 16, RULE_d = 17, RULE_eq = 18, RULE_neq = 19, 
		RULE_g = 20, RULE_ge = 21, RULE_l = 22, RULE_le = 23, RULE_returnStatement = 24, 
		RULE_expressions = 25, RULE_expression = 26, RULE_idents = 27, RULE_p = 28, 
		RULE_m = 29, RULE_u = 30, RULE_z = 31, RULE_smth = 32, RULE_number = 33, 
		RULE_digit = 34, RULE_digitsAndUnderscores = 35, RULE_digits = 36, RULE_r_integer = 37, 
		RULE_signedInteger = 38, RULE_exp = 39, RULE_r_float = 40, RULE_ident = 41;
	public static final String[] ruleNames = {
		"program", "block", "statements", "statement", "ifstatement", "readStatement", 
		"writeStatement", "assignment", "whileStatement", "thenStatement", "elseStatement", 
		"function", "functionCall", "booleanExpression", "a", "b", "c", "d", "eq", 
		"neq", "g", "ge", "l", "le", "returnStatement", "expressions", "expression", 
		"idents", "p", "m", "u", "z", "smth", "number", "digit", "digitsAndUnderscores", 
		"digits", "r_integer", "signedInteger", "exp", "r_float", "ident"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'_'", null, "'.'", "','", "'('", "')'", "'{'", "'}'", "';'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'>='", "'>'", "'<='", 
		"'<'", "'&&'", "'||'", "':='", "'if'", "'then'", "'else'", "'while'", 
		"'write'", "'read'", "'do'", "'return'", "'true'", "'false'", "'0'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PositiveDigit", "Underscore", "Letter", "Dot", "Comma", "LeftBrace", 
		"RightBrace", "LeftFigureBrace", "RightFigureBrace", "Semicolon", "PLUS", 
		"MINUS", "MULT", "DIV", "REM", "EQ", "NEQ", "GE", "G", "LE", "L", "AND", 
		"OR", "AS", "If", "Then", "Else", "While", "Write", "Read", "Do", "Return", 
		"True", "False", "Zero", "Sign", "E", "Comment", "LineTerminator", "WhiteSpace"
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
		public TerminalNode EOF() { return getToken(LParser.EOF, 0); }
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
			setState(84);
			statements();
			setState(85);
			match(EOF);
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
			setState(87);
			match(LeftFigureBrace);
			setState(88);
			statements();
			setState(89);
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
			setState(104);
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
				setState(92);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				function();
				setState(96);
				statements();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				statement();
				setState(99);
				statements();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
				block();
				setState(102);
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
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class,0);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				functionCall();
				setState(107);
				match(Semicolon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				assignment();
				setState(110);
				match(Semicolon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				ifstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				returnStatement();
				setState(115);
				match(Semicolon);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				readStatement();
				setState(118);
				match(Semicolon);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				writeStatement();
				setState(121);
				match(Semicolon);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(123);
				expression();
				setState(124);
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
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(LParser.RightBrace, 0); }
		public TerminalNode Then() { return getToken(LParser.Then, 0); }
		public ThenStatementContext thenStatement() {
			return getRuleContext(ThenStatementContext.class,0);
		}
		public TerminalNode Else() { return getToken(LParser.Else, 0); }
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(If);
				setState(129);
				match(LeftBrace);
				setState(130);
				booleanExpression();
				setState(131);
				match(RightBrace);
				setState(132);
				match(Then);
				setState(133);
				thenStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(If);
				setState(136);
				match(LeftBrace);
				setState(137);
				booleanExpression();
				setState(138);
				match(RightBrace);
				setState(139);
				match(Then);
				setState(140);
				thenStatement();
				setState(141);
				match(Else);
				setState(142);
				elseStatement();
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

	public static class ReadStatementContext extends ParserRuleContext {
		public TerminalNode Read() { return getToken(LParser.Read, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterReadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitReadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitReadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_readStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(Read);
			setState(147);
			ident();
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

	public static class WriteStatementContext extends ParserRuleContext {
		public TerminalNode Write() { return getToken(LParser.Write, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitWriteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitWriteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_writeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(Write);
			setState(150);
			expression();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
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
		enterRule(_localctx, 14, RULE_assignment);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				ident();
				setState(153);
				match(AS);
				setState(154);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				ident();
				setState(157);
				match(AS);
				setState(158);
				booleanExpression();
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
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(LParser.RightBrace, 0); }
		public TerminalNode Do() { return getToken(LParser.Do, 0); }
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
		enterRule(_localctx, 16, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(While);
			setState(163);
			match(LeftBrace);
			setState(164);
			booleanExpression();
			setState(165);
			match(RightBrace);
			setState(166);
			match(Do);
			setState(167);
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

	public static class ThenStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitThenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitThenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenStatementContext thenStatement() throws RecognitionException {
		ThenStatementContext _localctx = new ThenStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_thenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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

	public static class ElseStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
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
		enterRule(_localctx, 22, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			ident();
			setState(174);
			match(LeftBrace);
			setState(175);
			idents();
			setState(176);
			match(RightBrace);
			setState(177);
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
		enterRule(_localctx, 24, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			ident();
			setState(180);
			match(LeftBrace);
			setState(181);
			expressions();
			setState(182);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			a(0);
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

	public static class AContext extends ParserRuleContext {
		public AContext r_or;
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public TerminalNode OR() { return getToken(LParser.OR, 0); }
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AContext a() throws RecognitionException {
		return a(0);
	}

	private AContext a(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AContext _localctx = new AContext(_ctx, _parentState);
		AContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_a, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(187);
			b(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AContext(_parentctx, _parentState);
					_localctx.r_or = _prevctx;
					_localctx.r_or = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_a);
					setState(189);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(190);
					match(OR);
					setState(191);
					b(0);
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class BContext extends ParserRuleContext {
		public BContext r_and;
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public TerminalNode AND() { return getToken(LParser.AND, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BContext b() throws RecognitionException {
		return b(0);
	}

	private BContext b(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BContext _localctx = new BContext(_ctx, _parentState);
		BContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_b, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(198);
			c(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BContext(_parentctx, _parentState);
					_localctx.r_and = _prevctx;
					_localctx.r_and = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_b);
					setState(200);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(201);
					match(AND);
					setState(202);
					c(0);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class CContext extends ParserRuleContext {
		public CContext r_eq;
		public CContext r_neq;
		public CContext r_g;
		public CContext r_ge;
		public CContext r_l;
		public CContext r_le;
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public TerminalNode EQ() { return getToken(LParser.EQ, 0); }
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public TerminalNode NEQ() { return getToken(LParser.NEQ, 0); }
		public TerminalNode G() { return getToken(LParser.G, 0); }
		public TerminalNode GE() { return getToken(LParser.GE, 0); }
		public TerminalNode L() { return getToken(LParser.L, 0); }
		public TerminalNode LE() { return getToken(LParser.LE, 0); }
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CContext c() throws RecognitionException {
		return c(0);
	}

	private CContext c(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CContext _localctx = new CContext(_ctx, _parentState);
		CContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_c, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(209);
			d();
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(229);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new CContext(_parentctx, _parentState);
						_localctx.r_eq = _prevctx;
						_localctx.r_eq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_c);
						setState(211);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(212);
						match(EQ);
						setState(213);
						d();
						}
						break;
					case 2:
						{
						_localctx = new CContext(_parentctx, _parentState);
						_localctx.r_neq = _prevctx;
						_localctx.r_neq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_c);
						setState(214);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(215);
						match(NEQ);
						setState(216);
						d();
						}
						break;
					case 3:
						{
						_localctx = new CContext(_parentctx, _parentState);
						_localctx.r_g = _prevctx;
						_localctx.r_g = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_c);
						setState(217);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(218);
						match(G);
						setState(219);
						d();
						}
						break;
					case 4:
						{
						_localctx = new CContext(_parentctx, _parentState);
						_localctx.r_ge = _prevctx;
						_localctx.r_ge = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_c);
						setState(220);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(221);
						match(GE);
						setState(222);
						d();
						}
						break;
					case 5:
						{
						_localctx = new CContext(_parentctx, _parentState);
						_localctx.r_l = _prevctx;
						_localctx.r_l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_c);
						setState(223);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(224);
						match(L);
						setState(225);
						d();
						}
						break;
					case 6:
						{
						_localctx = new CContext(_parentctx, _parentState);
						_localctx.r_le = _prevctx;
						_localctx.r_le = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_c);
						setState(226);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(227);
						match(LE);
						setState(228);
						d();
						}
						break;
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class DContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode True() { return getToken(LParser.True, 0); }
		public TerminalNode False() { return getToken(LParser.False, 0); }
		public TerminalNode LeftBrace() { return getToken(LParser.LeftBrace, 0); }
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(LParser.RightBrace, 0); }
		public DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DContext d() throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_d);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(True);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(False);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				match(LeftBrace);
				setState(238);
				d();
				setState(239);
				match(RightBrace);
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
		enterRule(_localctx, 36, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
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
		enterRule(_localctx, 38, RULE_neq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		enterRule(_localctx, 40, RULE_g);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		enterRule(_localctx, 42, RULE_ge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		enterRule(_localctx, 44, RULE_l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
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
		enterRule(_localctx, 46, RULE_le);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
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
		enterRule(_localctx, 48, RULE_returnStatement);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(Return);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(Return);
				setState(257);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(Return);
				setState(259);
				booleanExpression();
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
		enterRule(_localctx, 50, RULE_expressions);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				expression();
				setState(264);
				match(Comma);
				setState(265);
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
		enterRule(_localctx, 52, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		enterRule(_localctx, 54, RULE_idents);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				ident();
				setState(273);
				match(Comma);
				setState(274);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_p, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(279);
			m(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(287);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new PContext(_parentctx, _parentState);
						_localctx.sum = _prevctx;
						_localctx.sum = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_p);
						setState(281);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(282);
						match(PLUS);
						setState(283);
						m(0);
						}
						break;
					case 2:
						{
						_localctx = new PContext(_parentctx, _parentState);
						_localctx.sub = _prevctx;
						_localctx.sub = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_p);
						setState(284);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(285);
						match(MINUS);
						setState(286);
						m(0);
						}
						break;
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_m, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(293);
			u();
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(304);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new MContext(_parentctx, _parentState);
						_localctx.mult = _prevctx;
						_localctx.mult = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_m);
						setState(295);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(296);
						match(MULT);
						setState(297);
						u();
						}
						break;
					case 2:
						{
						_localctx = new MContext(_parentctx, _parentState);
						_localctx.div = _prevctx;
						_localctx.div = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_m);
						setState(298);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(299);
						match(DIV);
						setState(300);
						u();
						}
						break;
					case 3:
						{
						_localctx = new MContext(_parentctx, _parentState);
						_localctx.rem = _prevctx;
						_localctx.rem = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_m);
						setState(301);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(302);
						match(REM);
						setState(303);
						u();
						}
						break;
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 60, RULE_u);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				((UContext)_localctx).unary_minus = match(MINUS);
				setState(310);
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
				setState(311);
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
		enterRule(_localctx, 62, RULE_z);
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PositiveDigit:
			case Underscore:
			case Letter:
			case Dot:
			case Zero:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				smth();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(LeftBrace);
				setState(316);
				p(0);
				setState(317);
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
		enterRule(_localctx, 64, RULE_smth);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
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
		enterRule(_localctx, 66, RULE_number);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				r_integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
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
		enterRule(_localctx, 68, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
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
		enterRule(_localctx, 70, RULE_digitsAndUnderscores);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(334);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PositiveDigit:
					case Zero:
						{
						setState(332);
						digit();
						}
						break;
					case Underscore:
						{
						setState(333);
						match(Underscore);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 72, RULE_digits);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				digit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				digit();
				setState(341);
				digitsAndUnderscores();
				setState(342);
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
		enterRule(_localctx, 74, RULE_r_integer);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(Zero);
				}
				break;
			case PositiveDigit:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(PositiveDigit);
				setState(348);
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
		enterRule(_localctx, 76, RULE_signedInteger);
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Sign:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(Sign);
				setState(352);
				r_integer();
				}
				break;
			case PositiveDigit:
			case Zero:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
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
		enterRule(_localctx, 78, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(E);
			setState(357);
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
		enterRule(_localctx, 80, RULE_r_float);
		int _la;
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PositiveDigit || _la==Zero) {
					{
					setState(359);
					r_integer();
					}
				}

				setState(362);
				match(Dot);
				setState(364);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(363);
					digits();
					}
					break;
				}
				setState(367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(366);
					exp();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PositiveDigit || _la==Zero) {
					{
					{
					setState(369);
					r_integer();
					}
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(375);
				match(Dot);
				setState(376);
				digits();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				r_integer();
				setState(379);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(378);
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
		enterRule(_localctx, 82, RULE_ident);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_la = _input.LA(1);
			if ( !(_la==Underscore || _la==Letter) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)== Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(387);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Underscore:
						{
						setState(384);
						match(Underscore);
						}
						break;
					case Letter:
						{
						setState(385);
						match(Letter);
						}
						break;
					case PositiveDigit:
					case Zero:
						{
						setState(386);
						digit();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		case 14:
			return a_sempred((AContext)_localctx, predIndex);
		case 15:
			return b_sempred((BContext)_localctx, predIndex);
		case 16:
			return c_sempred((CContext)_localctx, predIndex);
		case 28:
			return p_sempred((PContext)_localctx, predIndex);
		case 29:
			return m_sempred((MContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean a_sempred(AContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean b_sempred(BContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean c_sempred(CContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean p_sempred(PContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean m_sempred(MContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u018b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4k\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0081\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0093\n\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a3\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00c3\n\20\f\20\16"+
		"\20\u00c6\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00ce\n\21\f\21\16"+
		"\21\u00d1\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00e8\n\22\f\22"+
		"\16\22\u00eb\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f4\n\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0107\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u010e\n"+
		"\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u0117\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0122\n\36\f\36\16\36\u0125\13\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0133"+
		"\n\37\f\37\16\37\u0136\13\37\3 \3 \3 \5 \u013b\n \3!\3!\3!\3!\3!\5!\u0142"+
		"\n!\3\"\3\"\3\"\5\"\u0147\n\"\3#\3#\5#\u014b\n#\3$\3$\3%\3%\7%\u0151\n"+
		"%\f%\16%\u0154\13%\3&\3&\3&\3&\3&\5&\u015b\n&\3\'\3\'\3\'\5\'\u0160\n"+
		"\'\3(\3(\3(\5(\u0165\n(\3)\3)\3)\3*\5*\u016b\n*\3*\3*\5*\u016f\n*\3*\5"+
		"*\u0172\n*\3*\7*\u0175\n*\f*\16*\u0178\13*\3*\3*\3*\3*\5*\u017e\n*\5*"+
		"\u0180\n*\3+\3+\3+\3+\7+\u0186\n+\f+\16+\u0189\13+\3+\2\7\36 \":<,\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RT\2\4\4\2\3\3%%\3\2\4\5\2\u0197\2V\3\2\2\2\4Y\3\2\2\2\6j\3\2\2\2\b\u0080"+
		"\3\2\2\2\n\u0092\3\2\2\2\f\u0094\3\2\2\2\16\u0097\3\2\2\2\20\u00a2\3\2"+
		"\2\2\22\u00a4\3\2\2\2\24\u00ab\3\2\2\2\26\u00ad\3\2\2\2\30\u00af\3\2\2"+
		"\2\32\u00b5\3\2\2\2\34\u00ba\3\2\2\2\36\u00bc\3\2\2\2 \u00c7\3\2\2\2\""+
		"\u00d2\3\2\2\2$\u00f3\3\2\2\2&\u00f5\3\2\2\2(\u00f7\3\2\2\2*\u00f9\3\2"+
		"\2\2,\u00fb\3\2\2\2.\u00fd\3\2\2\2\60\u00ff\3\2\2\2\62\u0106\3\2\2\2\64"+
		"\u010d\3\2\2\2\66\u010f\3\2\2\28\u0116\3\2\2\2:\u0118\3\2\2\2<\u0126\3"+
		"\2\2\2>\u013a\3\2\2\2@\u0141\3\2\2\2B\u0146\3\2\2\2D\u014a\3\2\2\2F\u014c"+
		"\3\2\2\2H\u0152\3\2\2\2J\u015a\3\2\2\2L\u015f\3\2\2\2N\u0164\3\2\2\2P"+
		"\u0166\3\2\2\2R\u017f\3\2\2\2T\u0181\3\2\2\2VW\5\6\4\2WX\7\2\2\3X\3\3"+
		"\2\2\2YZ\7\n\2\2Z[\5\6\4\2[\\\7\13\2\2\\\5\3\2\2\2]k\3\2\2\2^k\5\30\r"+
		"\2_k\5\b\5\2`k\5\4\3\2ab\5\30\r\2bc\5\6\4\2ck\3\2\2\2de\5\b\5\2ef\5\6"+
		"\4\2fk\3\2\2\2gh\5\4\3\2hi\5\6\4\2ik\3\2\2\2j]\3\2\2\2j^\3\2\2\2j_\3\2"+
		"\2\2j`\3\2\2\2ja\3\2\2\2jd\3\2\2\2jg\3\2\2\2k\7\3\2\2\2lm\5\32\16\2mn"+
		"\7\f\2\2n\u0081\3\2\2\2op\5\20\t\2pq\7\f\2\2q\u0081\3\2\2\2r\u0081\5\22"+
		"\n\2s\u0081\5\n\6\2tu\5\62\32\2uv\7\f\2\2v\u0081\3\2\2\2wx\5\f\7\2xy\7"+
		"\f\2\2y\u0081\3\2\2\2z{\5\16\b\2{|\7\f\2\2|\u0081\3\2\2\2}~\5\66\34\2"+
		"~\177\7\f\2\2\177\u0081\3\2\2\2\u0080l\3\2\2\2\u0080o\3\2\2\2\u0080r\3"+
		"\2\2\2\u0080s\3\2\2\2\u0080t\3\2\2\2\u0080w\3\2\2\2\u0080z\3\2\2\2\u0080"+
		"}\3\2\2\2\u0081\t\3\2\2\2\u0082\u0083\7\33\2\2\u0083\u0084\7\b\2\2\u0084"+
		"\u0085\5\34\17\2\u0085\u0086\7\t\2\2\u0086\u0087\7\34\2\2\u0087\u0088"+
		"\5\24\13\2\u0088\u0093\3\2\2\2\u0089\u008a\7\33\2\2\u008a\u008b\7\b\2"+
		"\2\u008b\u008c\5\34\17\2\u008c\u008d\7\t\2\2\u008d\u008e\7\34\2\2\u008e"+
		"\u008f\5\24\13\2\u008f\u0090\7\35\2\2\u0090\u0091\5\26\f\2\u0091\u0093"+
		"\3\2\2\2\u0092\u0082\3\2\2\2\u0092\u0089\3\2\2\2\u0093\13\3\2\2\2\u0094"+
		"\u0095\7 \2\2\u0095\u0096\5T+\2\u0096\r\3\2\2\2\u0097\u0098\7\37\2\2\u0098"+
		"\u0099\5\66\34\2\u0099\17\3\2\2\2\u009a\u009b\5T+\2\u009b\u009c\7\32\2"+
		"\2\u009c\u009d\5\66\34\2\u009d\u00a3\3\2\2\2\u009e\u009f\5T+\2\u009f\u00a0"+
		"\7\32\2\2\u00a0\u00a1\5\34\17\2\u00a1\u00a3\3\2\2\2\u00a2\u009a\3\2\2"+
		"\2\u00a2\u009e\3\2\2\2\u00a3\21\3\2\2\2\u00a4\u00a5\7\36\2\2\u00a5\u00a6"+
		"\7\b\2\2\u00a6\u00a7\5\34\17\2\u00a7\u00a8\7\t\2\2\u00a8\u00a9\7!\2\2"+
		"\u00a9\u00aa\5\4\3\2\u00aa\23\3\2\2\2\u00ab\u00ac\5\4\3\2\u00ac\25\3\2"+
		"\2\2\u00ad\u00ae\5\4\3\2\u00ae\27\3\2\2\2\u00af\u00b0\5T+\2\u00b0\u00b1"+
		"\7\b\2\2\u00b1\u00b2\58\35\2\u00b2\u00b3\7\t\2\2\u00b3\u00b4\5\4\3\2\u00b4"+
		"\31\3\2\2\2\u00b5\u00b6\5T+\2\u00b6\u00b7\7\b\2\2\u00b7\u00b8\5\64\33"+
		"\2\u00b8\u00b9\7\t\2\2\u00b9\33\3\2\2\2\u00ba\u00bb\5\36\20\2\u00bb\35"+
		"\3\2\2\2\u00bc\u00bd\b\20\1\2\u00bd\u00be\5 \21\2\u00be\u00c4\3\2\2\2"+
		"\u00bf\u00c0\f\3\2\2\u00c0\u00c1\7\31\2\2\u00c1\u00c3\5 \21\2\u00c2\u00bf"+
		"\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\37\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\b\21\1\2\u00c8\u00c9\5\"\22"+
		"\2\u00c9\u00cf\3\2\2\2\u00ca\u00cb\f\3\2\2\u00cb\u00cc\7\30\2\2\u00cc"+
		"\u00ce\5\"\22\2\u00cd\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0!\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3"+
		"\b\22\1\2\u00d3\u00d4\5$\23\2\u00d4\u00e9\3\2\2\2\u00d5\u00d6\f\b\2\2"+
		"\u00d6\u00d7\7\22\2\2\u00d7\u00e8\5$\23\2\u00d8\u00d9\f\7\2\2\u00d9\u00da"+
		"\7\23\2\2\u00da\u00e8\5$\23\2\u00db\u00dc\f\6\2\2\u00dc\u00dd\7\25\2\2"+
		"\u00dd\u00e8\5$\23\2\u00de\u00df\f\5\2\2\u00df\u00e0\7\24\2\2\u00e0\u00e8"+
		"\5$\23\2\u00e1\u00e2\f\4\2\2\u00e2\u00e3\7\27\2\2\u00e3\u00e8\5$\23\2"+
		"\u00e4\u00e5\f\3\2\2\u00e5\u00e6\7\26\2\2\u00e6\u00e8\5$\23\2\u00e7\u00d5"+
		"\3\2\2\2\u00e7\u00d8\3\2\2\2\u00e7\u00db\3\2\2\2\u00e7\u00de\3\2\2\2\u00e7"+
		"\u00e1\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea#\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f4"+
		"\5\66\34\2\u00ed\u00f4\7#\2\2\u00ee\u00f4\7$\2\2\u00ef\u00f0\7\b\2\2\u00f0"+
		"\u00f1\5$\23\2\u00f1\u00f2\7\t\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00ec\3\2"+
		"\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f4"+
		"%\3\2\2\2\u00f5\u00f6\7\22\2\2\u00f6\'\3\2\2\2\u00f7\u00f8\7\23\2\2\u00f8"+
		")\3\2\2\2\u00f9\u00fa\7\25\2\2\u00fa+\3\2\2\2\u00fb\u00fc\7\24\2\2\u00fc"+
		"-\3\2\2\2\u00fd\u00fe\7\27\2\2\u00fe/\3\2\2\2\u00ff\u0100\7\26\2\2\u0100"+
		"\61\3\2\2\2\u0101\u0107\7\"\2\2\u0102\u0103\7\"\2\2\u0103\u0107\5\66\34"+
		"\2\u0104\u0105\7\"\2\2\u0105\u0107\5\34\17\2\u0106\u0101\3\2\2\2\u0106"+
		"\u0102\3\2\2\2\u0106\u0104\3\2\2\2\u0107\63\3\2\2\2\u0108\u010e\5\66\34"+
		"\2\u0109\u010a\5\66\34\2\u010a\u010b\7\7\2\2\u010b\u010c\5\64\33\2\u010c"+
		"\u010e\3\2\2\2\u010d\u0108\3\2\2\2\u010d\u0109\3\2\2\2\u010e\65\3\2\2"+
		"\2\u010f\u0110\5:\36\2\u0110\67\3\2\2\2\u0111\u0117\5T+\2\u0112\u0113"+
		"\5T+\2\u0113\u0114\7\7\2\2\u0114\u0115\58\35\2\u0115\u0117\3\2\2\2\u0116"+
		"\u0111\3\2\2\2\u0116\u0112\3\2\2\2\u01179\3\2\2\2\u0118\u0119\b\36\1\2"+
		"\u0119\u011a\5<\37\2\u011a\u0123\3\2\2\2\u011b\u011c\f\4\2\2\u011c\u011d"+
		"\7\r\2\2\u011d\u0122\5<\37\2\u011e\u011f\f\3\2\2\u011f\u0120\7\16\2\2"+
		"\u0120\u0122\5<\37\2\u0121\u011b\3\2\2\2\u0121\u011e\3\2\2\2\u0122\u0125"+
		"\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124;\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0126\u0127\b\37\1\2\u0127\u0128\5> \2\u0128\u0134\3\2"+
		"\2\2\u0129\u012a\f\5\2\2\u012a\u012b\7\17\2\2\u012b\u0133\5> \2\u012c"+
		"\u012d\f\4\2\2\u012d\u012e\7\20\2\2\u012e\u0133\5> \2\u012f\u0130\f\3"+
		"\2\2\u0130\u0131\7\21\2\2\u0131\u0133\5> \2\u0132\u0129\3\2\2\2\u0132"+
		"\u012c\3\2\2\2\u0132\u012f\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135=\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138"+
		"\7\16\2\2\u0138\u013b\5> \2\u0139\u013b\5@!\2\u013a\u0137\3\2\2\2\u013a"+
		"\u0139\3\2\2\2\u013b?\3\2\2\2\u013c\u0142\5B\"\2\u013d\u013e\7\b\2\2\u013e"+
		"\u013f\5:\36\2\u013f\u0140\7\t\2\2\u0140\u0142\3\2\2\2\u0141\u013c\3\2"+
		"\2\2\u0141\u013d\3\2\2\2\u0142A\3\2\2\2\u0143\u0147\5D#\2\u0144\u0147"+
		"\5T+\2\u0145\u0147\5\32\16\2\u0146\u0143\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0145\3\2\2\2\u0147C\3\2\2\2\u0148\u014b\5L\'\2\u0149\u014b\5R*\2\u014a"+
		"\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014bE\3\2\2\2\u014c\u014d\t\2\2\2"+
		"\u014dG\3\2\2\2\u014e\u0151\5F$\2\u014f\u0151\7\4\2\2\u0150\u014e\3\2"+
		"\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153I\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u015b\5F$\2\u0156"+
		"\u0157\5F$\2\u0157\u0158\5H%\2\u0158\u0159\5F$\2\u0159\u015b\3\2\2\2\u015a"+
		"\u0155\3\2\2\2\u015a\u0156\3\2\2\2\u015bK\3\2\2\2\u015c\u0160\7%\2\2\u015d"+
		"\u015e\7\3\2\2\u015e\u0160\5H%\2\u015f\u015c\3\2\2\2\u015f\u015d\3\2\2"+
		"\2\u0160M\3\2\2\2\u0161\u0162\7&\2\2\u0162\u0165\5L\'\2\u0163\u0165\5"+
		"L\'\2\u0164\u0161\3\2\2\2\u0164\u0163\3\2\2\2\u0165O\3\2\2\2\u0166\u0167"+
		"\7\'\2\2\u0167\u0168\5N(\2\u0168Q\3\2\2\2\u0169\u016b\5L\'\2\u016a\u0169"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\7\6\2\2\u016d"+
		"\u016f\5J&\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2"+
		"\2\u0170\u0172\5P)\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0180"+
		"\3\2\2\2\u0173\u0175\5L\'\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0179\u017a\7\6\2\2\u017a\u0180\5J&\2\u017b\u017d\5L\'\2\u017c\u017e"+
		"\5P)\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f"+
		"\u016a\3\2\2\2\u017f\u0176\3\2\2\2\u017f\u017b\3\2\2\2\u0180S\3\2\2\2"+
		"\u0181\u0187\t\3\2\2\u0182\u0186\7\4\2\2\u0183\u0186\7\5\2\2\u0184\u0186"+
		"\5F$\2\u0185\u0182\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186"+
		"\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188U\3\2\2\2"+
		"\u0189\u0187\3\2\2\2#j\u0080\u0092\u00a2\u00c4\u00cf\u00e7\u00e9\u00f3"+
		"\u0106\u010d\u0116\u0121\u0123\u0132\u0134\u013a\u0141\u0146\u014a\u0150"+
		"\u0152\u015a\u015f\u0164\u016a\u016e\u0171\u0176\u017d\u017f\u0185\u0187";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}