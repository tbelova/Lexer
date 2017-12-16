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
		RULE_a = 14, RULE_b = 15, RULE_c = 16, RULE_d = 17, RULE_e = 18, RULE_eq = 19, 
		RULE_neq = 20, RULE_g = 21, RULE_ge = 22, RULE_l = 23, RULE_le = 24, RULE_returnStatement = 25, 
		RULE_expressions = 26, RULE_expression = 27, RULE_idents = 28, RULE_p = 29, 
		RULE_m = 30, RULE_u = 31, RULE_z = 32, RULE_smth = 33, RULE_number = 34, 
		RULE_digit = 35, RULE_digitsAndUnderscores = 36, RULE_digits = 37, RULE_r_integer = 38, 
		RULE_signedInteger = 39, RULE_exp = 40, RULE_r_float = 41, RULE_ident = 42;
	public static final String[] ruleNames = {
		"program", "block", "statements", "statement", "ifstatement", "readStatement", 
		"writeStatement", "assignment", "whileStatement", "thenStatement", "elseStatement", 
		"function", "functionCall", "booleanExpression", "a", "b", "c", "d", "e", 
		"eq", "neq", "g", "ge", "l", "le", "returnStatement", "expressions", "expression", 
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
			setState(86);
			statements();
			setState(87);
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
			setState(89);
			match(LeftFigureBrace);
			setState(90);
			statements();
			setState(91);
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
			setState(106);
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
				setState(94);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				function();
				setState(98);
				statements();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				statement();
				setState(101);
				statements();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				block();
				setState(104);
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
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				functionCall();
				setState(109);
				match(Semicolon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				assignment();
				setState(112);
				match(Semicolon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				ifstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				returnStatement();
				setState(117);
				match(Semicolon);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				readStatement();
				setState(120);
				match(Semicolon);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				writeStatement();
				setState(123);
				match(Semicolon);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(125);
				expression();
				setState(126);
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
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(If);
				setState(131);
				match(LeftBrace);
				setState(132);
				booleanExpression();
				setState(133);
				match(RightBrace);
				setState(134);
				match(Then);
				setState(135);
				thenStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(If);
				setState(138);
				match(LeftBrace);
				setState(139);
				booleanExpression();
				setState(140);
				match(RightBrace);
				setState(141);
				match(Then);
				setState(142);
				thenStatement();
				setState(143);
				match(Else);
				setState(144);
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
			setState(148);
			match(Read);
			setState(149);
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
			setState(151);
			match(Write);
			setState(152);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				ident();
				setState(155);
				match(AS);
				setState(156);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				ident();
				setState(159);
				match(AS);
				setState(160);
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
			setState(164);
			match(While);
			setState(165);
			match(LeftBrace);
			setState(166);
			booleanExpression();
			setState(167);
			match(RightBrace);
			setState(168);
			match(Do);
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
			setState(173);
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
			setState(175);
			ident();
			setState(176);
			match(LeftBrace);
			setState(177);
			idents();
			setState(178);
			match(RightBrace);
			setState(179);
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
			setState(181);
			ident();
			setState(182);
			match(LeftBrace);
			setState(183);
			expressions();
			setState(184);
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
			setState(186);
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
			setState(189);
			b(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
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
					setState(191);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(192);
					match(OR);
					setState(193);
					b(0);
					}
					} 
				}
				setState(198);
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
			setState(200);
			c();
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
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
					setState(202);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(203);
					match(AND);
					setState(204);
					c();
					}
					} 
				}
				setState(209);
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
		public DContext r_eq;
		public DContext r_neq;
		public DContext r_g;
		public DContext r_ge;
		public DContext r_l;
		public DContext r_le;
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode EQ() { return getToken(LParser.EQ, 0); }
		public List<DContext> d() {
			return getRuleContexts(DContext.class);
		}
		public DContext d(int i) {
			return getRuleContext(DContext.class,i);
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
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_c);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				e();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				((CContext)_localctx).r_eq = d();
				setState(212);
				match(EQ);
				setState(213);
				d();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				((CContext)_localctx).r_neq = d();
				setState(216);
				match(NEQ);
				setState(217);
				d();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				((CContext)_localctx).r_g = d();
				setState(220);
				match(G);
				setState(221);
				d();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				((CContext)_localctx).r_ge = d();
				setState(224);
				match(GE);
				setState(225);
				d();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(227);
				((CContext)_localctx).r_l = d();
				setState(228);
				match(L);
				setState(229);
				d();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(231);
				((CContext)_localctx).r_le = d();
				setState(232);
				match(LE);
				setState(233);
				d();
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

	public static class DContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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

	public static class EContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(LParser.True, 0); }
		public TerminalNode False() { return getToken(LParser.False, 0); }
		public TerminalNode LeftBrace() { return getToken(LParser.LeftBrace, 0); }
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(LParser.RightBrace, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LListener ) ((LListener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LVisitor ) return ((LVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_e);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(True);
				}
				break;
			case False:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(False);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(LeftBrace);
				setState(242);
				a(0);
				setState(243);
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
		enterRule(_localctx, 38, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		enterRule(_localctx, 40, RULE_neq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		enterRule(_localctx, 42, RULE_g);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
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
		enterRule(_localctx, 44, RULE_ge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
		enterRule(_localctx, 46, RULE_l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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
		enterRule(_localctx, 48, RULE_le);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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
		enterRule(_localctx, 50, RULE_returnStatement);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(Return);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(Return);
				setState(261);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(Return);
				setState(263);
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
		enterRule(_localctx, 52, RULE_expressions);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				expression();
				setState(268);
				match(Comma);
				setState(269);
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
		enterRule(_localctx, 54, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		enterRule(_localctx, 56, RULE_idents);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				ident();
				setState(277);
				match(Comma);
				setState(278);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_p, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(283);
			m(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(291);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new PContext(_parentctx, _parentState);
						_localctx.sum = _prevctx;
						_localctx.sum = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_p);
						setState(285);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(286);
						match(PLUS);
						setState(287);
						m(0);
						}
						break;
					case 2:
						{
						_localctx = new PContext(_parentctx, _parentState);
						_localctx.sub = _prevctx;
						_localctx.sub = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_p);
						setState(288);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(289);
						match(MINUS);
						setState(290);
						m(0);
						}
						break;
					}
					} 
				}
				setState(295);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_m, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(297);
			u();
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(308);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MContext(_parentctx, _parentState);
						_localctx.mult = _prevctx;
						_localctx.mult = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_m);
						setState(299);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(300);
						match(MULT);
						setState(301);
						u();
						}
						break;
					case 2:
						{
						_localctx = new MContext(_parentctx, _parentState);
						_localctx.div = _prevctx;
						_localctx.div = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_m);
						setState(302);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(303);
						match(DIV);
						setState(304);
						u();
						}
						break;
					case 3:
						{
						_localctx = new MContext(_parentctx, _parentState);
						_localctx.rem = _prevctx;
						_localctx.rem = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_m);
						setState(305);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(306);
						match(REM);
						setState(307);
						u();
						}
						break;
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 62, RULE_u);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				((UContext)_localctx).unary_minus = match(MINUS);
				setState(314);
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
				setState(315);
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
		enterRule(_localctx, 64, RULE_z);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PositiveDigit:
			case Underscore:
			case Letter:
			case Dot:
			case Zero:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				smth();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(LeftBrace);
				setState(320);
				p(0);
				setState(321);
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
		enterRule(_localctx, 66, RULE_smth);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
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
		enterRule(_localctx, 68, RULE_number);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				r_integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
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
		enterRule(_localctx, 70, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		enterRule(_localctx, 72, RULE_digitsAndUnderscores);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(338);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PositiveDigit:
					case Zero:
						{
						setState(336);
						digit();
						}
						break;
					case Underscore:
						{
						setState(337);
						match(Underscore);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 74, RULE_digits);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				digit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				digit();
				setState(345);
				digitsAndUnderscores();
				setState(346);
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
		enterRule(_localctx, 76, RULE_r_integer);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(Zero);
				}
				break;
			case PositiveDigit:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(PositiveDigit);
				setState(352);
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
		enterRule(_localctx, 78, RULE_signedInteger);
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Sign:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(Sign);
				setState(356);
				r_integer();
				}
				break;
			case PositiveDigit:
			case Zero:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
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
		enterRule(_localctx, 80, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(E);
			setState(361);
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
		enterRule(_localctx, 82, RULE_r_float);
		int _la;
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PositiveDigit || _la==Zero) {
					{
					setState(363);
					r_integer();
					}
				}

				setState(366);
				match(Dot);
				setState(368);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(367);
					digits();
					}
					break;
				}
				setState(371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(370);
					exp();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PositiveDigit || _la==Zero) {
					{
					{
					setState(373);
					r_integer();
					}
					}
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(379);
				match(Dot);
				setState(380);
				digits();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				r_integer();
				setState(383);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(382);
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
		enterRule(_localctx, 84, RULE_ident);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_la = _input.LA(1);
			if ( !(_la==Underscore || _la==Letter) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)== Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(391);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Underscore:
						{
						setState(388);
						match(Underscore);
						}
						break;
					case Letter:
						{
						setState(389);
						match(Letter);
						}
						break;
					case PositiveDigit:
					case Zero:
						{
						setState(390);
						digit();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		case 29:
			return p_sempred((PContext)_localctx, predIndex);
		case 30:
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
	private boolean p_sempred(PContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean m_sempred(MContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u018f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4m\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0083\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0095\n\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a5\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00c5\n\20\f\20"+
		"\16\20\u00c8\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00d0\n\21\f\21"+
		"\16\21\u00d3\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\5\22\u00ee\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f8"+
		"\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u010b\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u0112"+
		"\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u011b\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0126\n\37\f\37\16\37\u0129\13\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0137\n \f \16 \u013a\13 \3!\3"+
		"!\3!\5!\u013f\n!\3\"\3\"\3\"\3\"\3\"\5\"\u0146\n\"\3#\3#\3#\5#\u014b\n"+
		"#\3$\3$\5$\u014f\n$\3%\3%\3&\3&\7&\u0155\n&\f&\16&\u0158\13&\3\'\3\'\3"+
		"\'\3\'\3\'\5\'\u015f\n\'\3(\3(\3(\5(\u0164\n(\3)\3)\3)\5)\u0169\n)\3*"+
		"\3*\3*\3+\5+\u016f\n+\3+\3+\5+\u0173\n+\3+\5+\u0176\n+\3+\7+\u0179\n+"+
		"\f+\16+\u017c\13+\3+\3+\3+\3+\5+\u0182\n+\5+\u0184\n+\3,\3,\3,\3,\7,\u018a"+
		"\n,\f,\16,\u018d\13,\3,\2\6\36 <>-\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\4\4\2\3\3%%\3\2\4\5\2\u0199"+
		"\2X\3\2\2\2\4[\3\2\2\2\6l\3\2\2\2\b\u0082\3\2\2\2\n\u0094\3\2\2\2\f\u0096"+
		"\3\2\2\2\16\u0099\3\2\2\2\20\u00a4\3\2\2\2\22\u00a6\3\2\2\2\24\u00ad\3"+
		"\2\2\2\26\u00af\3\2\2\2\30\u00b1\3\2\2\2\32\u00b7\3\2\2\2\34\u00bc\3\2"+
		"\2\2\36\u00be\3\2\2\2 \u00c9\3\2\2\2\"\u00ed\3\2\2\2$\u00ef\3\2\2\2&\u00f7"+
		"\3\2\2\2(\u00f9\3\2\2\2*\u00fb\3\2\2\2,\u00fd\3\2\2\2.\u00ff\3\2\2\2\60"+
		"\u0101\3\2\2\2\62\u0103\3\2\2\2\64\u010a\3\2\2\2\66\u0111\3\2\2\28\u0113"+
		"\3\2\2\2:\u011a\3\2\2\2<\u011c\3\2\2\2>\u012a\3\2\2\2@\u013e\3\2\2\2B"+
		"\u0145\3\2\2\2D\u014a\3\2\2\2F\u014e\3\2\2\2H\u0150\3\2\2\2J\u0156\3\2"+
		"\2\2L\u015e\3\2\2\2N\u0163\3\2\2\2P\u0168\3\2\2\2R\u016a\3\2\2\2T\u0183"+
		"\3\2\2\2V\u0185\3\2\2\2XY\5\6\4\2YZ\7\2\2\3Z\3\3\2\2\2[\\\7\n\2\2\\]\5"+
		"\6\4\2]^\7\13\2\2^\5\3\2\2\2_m\3\2\2\2`m\5\30\r\2am\5\b\5\2bm\5\4\3\2"+
		"cd\5\30\r\2de\5\6\4\2em\3\2\2\2fg\5\b\5\2gh\5\6\4\2hm\3\2\2\2ij\5\4\3"+
		"\2jk\5\6\4\2km\3\2\2\2l_\3\2\2\2l`\3\2\2\2la\3\2\2\2lb\3\2\2\2lc\3\2\2"+
		"\2lf\3\2\2\2li\3\2\2\2m\7\3\2\2\2no\5\32\16\2op\7\f\2\2p\u0083\3\2\2\2"+
		"qr\5\20\t\2rs\7\f\2\2s\u0083\3\2\2\2t\u0083\5\22\n\2u\u0083\5\n\6\2vw"+
		"\5\64\33\2wx\7\f\2\2x\u0083\3\2\2\2yz\5\f\7\2z{\7\f\2\2{\u0083\3\2\2\2"+
		"|}\5\16\b\2}~\7\f\2\2~\u0083\3\2\2\2\177\u0080\58\35\2\u0080\u0081\7\f"+
		"\2\2\u0081\u0083\3\2\2\2\u0082n\3\2\2\2\u0082q\3\2\2\2\u0082t\3\2\2\2"+
		"\u0082u\3\2\2\2\u0082v\3\2\2\2\u0082y\3\2\2\2\u0082|\3\2\2\2\u0082\177"+
		"\3\2\2\2\u0083\t\3\2\2\2\u0084\u0085\7\33\2\2\u0085\u0086\7\b\2\2\u0086"+
		"\u0087\5\34\17\2\u0087\u0088\7\t\2\2\u0088\u0089\7\34\2\2\u0089\u008a"+
		"\5\24\13\2\u008a\u0095\3\2\2\2\u008b\u008c\7\33\2\2\u008c\u008d\7\b\2"+
		"\2\u008d\u008e\5\34\17\2\u008e\u008f\7\t\2\2\u008f\u0090\7\34\2\2\u0090"+
		"\u0091\5\24\13\2\u0091\u0092\7\35\2\2\u0092\u0093\5\26\f\2\u0093\u0095"+
		"\3\2\2\2\u0094\u0084\3\2\2\2\u0094\u008b\3\2\2\2\u0095\13\3\2\2\2\u0096"+
		"\u0097\7 \2\2\u0097\u0098\5V,\2\u0098\r\3\2\2\2\u0099\u009a\7\37\2\2\u009a"+
		"\u009b\58\35\2\u009b\17\3\2\2\2\u009c\u009d\5V,\2\u009d\u009e\7\32\2\2"+
		"\u009e\u009f\58\35\2\u009f\u00a5\3\2\2\2\u00a0\u00a1\5V,\2\u00a1\u00a2"+
		"\7\32\2\2\u00a2\u00a3\5\34\17\2\u00a3\u00a5\3\2\2\2\u00a4\u009c\3\2\2"+
		"\2\u00a4\u00a0\3\2\2\2\u00a5\21\3\2\2\2\u00a6\u00a7\7\36\2\2\u00a7\u00a8"+
		"\7\b\2\2\u00a8\u00a9\5\34\17\2\u00a9\u00aa\7\t\2\2\u00aa\u00ab\7!\2\2"+
		"\u00ab\u00ac\5\4\3\2\u00ac\23\3\2\2\2\u00ad\u00ae\5\4\3\2\u00ae\25\3\2"+
		"\2\2\u00af\u00b0\5\4\3\2\u00b0\27\3\2\2\2\u00b1\u00b2\5V,\2\u00b2\u00b3"+
		"\7\b\2\2\u00b3\u00b4\5:\36\2\u00b4\u00b5\7\t\2\2\u00b5\u00b6\5\4\3\2\u00b6"+
		"\31\3\2\2\2\u00b7\u00b8\5V,\2\u00b8\u00b9\7\b\2\2\u00b9\u00ba\5\66\34"+
		"\2\u00ba\u00bb\7\t\2\2\u00bb\33\3\2\2\2\u00bc\u00bd\5\36\20\2\u00bd\35"+
		"\3\2\2\2\u00be\u00bf\b\20\1\2\u00bf\u00c0\5 \21\2\u00c0\u00c6\3\2\2\2"+
		"\u00c1\u00c2\f\3\2\2\u00c2\u00c3\7\31\2\2\u00c3\u00c5\5 \21\2\u00c4\u00c1"+
		"\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\37\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\b\21\1\2\u00ca\u00cb\5\"\22"+
		"\2\u00cb\u00d1\3\2\2\2\u00cc\u00cd\f\3\2\2\u00cd\u00ce\7\30\2\2\u00ce"+
		"\u00d0\5\"\22\2\u00cf\u00cc\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2!\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00ee"+
		"\5&\24\2\u00d5\u00d6\5$\23\2\u00d6\u00d7\7\22\2\2\u00d7\u00d8\5$\23\2"+
		"\u00d8\u00ee\3\2\2\2\u00d9\u00da\5$\23\2\u00da\u00db\7\23\2\2\u00db\u00dc"+
		"\5$\23\2\u00dc\u00ee\3\2\2\2\u00dd\u00de\5$\23\2\u00de\u00df\7\25\2\2"+
		"\u00df\u00e0\5$\23\2\u00e0\u00ee\3\2\2\2\u00e1\u00e2\5$\23\2\u00e2\u00e3"+
		"\7\24\2\2\u00e3\u00e4\5$\23\2\u00e4\u00ee\3\2\2\2\u00e5\u00e6\5$\23\2"+
		"\u00e6\u00e7\7\27\2\2\u00e7\u00e8\5$\23\2\u00e8\u00ee\3\2\2\2\u00e9\u00ea"+
		"\5$\23\2\u00ea\u00eb\7\26\2\2\u00eb\u00ec\5$\23\2\u00ec\u00ee\3\2\2\2"+
		"\u00ed\u00d4\3\2\2\2\u00ed\u00d5\3\2\2\2\u00ed\u00d9\3\2\2\2\u00ed\u00dd"+
		"\3\2\2\2\u00ed\u00e1\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee"+
		"#\3\2\2\2\u00ef\u00f0\58\35\2\u00f0%\3\2\2\2\u00f1\u00f8\7#\2\2\u00f2"+
		"\u00f8\7$\2\2\u00f3\u00f4\7\b\2\2\u00f4\u00f5\5\36\20\2\u00f5\u00f6\7"+
		"\t\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f7"+
		"\u00f3\3\2\2\2\u00f8\'\3\2\2\2\u00f9\u00fa\7\22\2\2\u00fa)\3\2\2\2\u00fb"+
		"\u00fc\7\23\2\2\u00fc+\3\2\2\2\u00fd\u00fe\7\25\2\2\u00fe-\3\2\2\2\u00ff"+
		"\u0100\7\24\2\2\u0100/\3\2\2\2\u0101\u0102\7\27\2\2\u0102\61\3\2\2\2\u0103"+
		"\u0104\7\26\2\2\u0104\63\3\2\2\2\u0105\u010b\7\"\2\2\u0106\u0107\7\"\2"+
		"\2\u0107\u010b\58\35\2\u0108\u0109\7\"\2\2\u0109\u010b\5\34\17\2\u010a"+
		"\u0105\3\2\2\2\u010a\u0106\3\2\2\2\u010a\u0108\3\2\2\2\u010b\65\3\2\2"+
		"\2\u010c\u0112\58\35\2\u010d\u010e\58\35\2\u010e\u010f\7\7\2\2\u010f\u0110"+
		"\5\66\34\2\u0110\u0112\3\2\2\2\u0111\u010c\3\2\2\2\u0111\u010d\3\2\2\2"+
		"\u0112\67\3\2\2\2\u0113\u0114\5<\37\2\u01149\3\2\2\2\u0115\u011b\5V,\2"+
		"\u0116\u0117\5V,\2\u0117\u0118\7\7\2\2\u0118\u0119\5:\36\2\u0119\u011b"+
		"\3\2\2\2\u011a\u0115\3\2\2\2\u011a\u0116\3\2\2\2\u011b;\3\2\2\2\u011c"+
		"\u011d\b\37\1\2\u011d\u011e\5> \2\u011e\u0127\3\2\2\2\u011f\u0120\f\4"+
		"\2\2\u0120\u0121\7\r\2\2\u0121\u0126\5> \2\u0122\u0123\f\3\2\2\u0123\u0124"+
		"\7\16\2\2\u0124\u0126\5> \2\u0125\u011f\3\2\2\2\u0125\u0122\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128=\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u012a\u012b\b \1\2\u012b\u012c\5@!\2\u012c\u0138"+
		"\3\2\2\2\u012d\u012e\f\5\2\2\u012e\u012f\7\17\2\2\u012f\u0137\5@!\2\u0130"+
		"\u0131\f\4\2\2\u0131\u0132\7\20\2\2\u0132\u0137\5@!\2\u0133\u0134\f\3"+
		"\2\2\u0134\u0135\7\21\2\2\u0135\u0137\5@!\2\u0136\u012d\3\2\2\2\u0136"+
		"\u0130\3\2\2\2\u0136\u0133\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139?\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c"+
		"\7\16\2\2\u013c\u013f\5@!\2\u013d\u013f\5B\"\2\u013e\u013b\3\2\2\2\u013e"+
		"\u013d\3\2\2\2\u013fA\3\2\2\2\u0140\u0146\5D#\2\u0141\u0142\7\b\2\2\u0142"+
		"\u0143\5<\37\2\u0143\u0144\7\t\2\2\u0144\u0146\3\2\2\2\u0145\u0140\3\2"+
		"\2\2\u0145\u0141\3\2\2\2\u0146C\3\2\2\2\u0147\u014b\5F$\2\u0148\u014b"+
		"\5V,\2\u0149\u014b\5\32\16\2\u014a\u0147\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u0149\3\2\2\2\u014bE\3\2\2\2\u014c\u014f\5N(\2\u014d\u014f\5T+\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014fG\3\2\2\2\u0150\u0151\t\2\2\2"+
		"\u0151I\3\2\2\2\u0152\u0155\5H%\2\u0153\u0155\7\4\2\2\u0154\u0152\3\2"+
		"\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157K\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015f\5H%\2\u015a"+
		"\u015b\5H%\2\u015b\u015c\5J&\2\u015c\u015d\5H%\2\u015d\u015f\3\2\2\2\u015e"+
		"\u0159\3\2\2\2\u015e\u015a\3\2\2\2\u015fM\3\2\2\2\u0160\u0164\7%\2\2\u0161"+
		"\u0162\7\3\2\2\u0162\u0164\5J&\2\u0163\u0160\3\2\2\2\u0163\u0161\3\2\2"+
		"\2\u0164O\3\2\2\2\u0165\u0166\7&\2\2\u0166\u0169\5N(\2\u0167\u0169\5N"+
		"(\2\u0168\u0165\3\2\2\2\u0168\u0167\3\2\2\2\u0169Q\3\2\2\2\u016a\u016b"+
		"\7\'\2\2\u016b\u016c\5P)\2\u016cS\3\2\2\2\u016d\u016f\5N(\2\u016e\u016d"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\7\6\2\2\u0171"+
		"\u0173\5L\'\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2"+
		"\2\2\u0174\u0176\5R*\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0184"+
		"\3\2\2\2\u0177\u0179\5N(\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017d\u017e\7\6\2\2\u017e\u0184\5L\'\2\u017f\u0181\5N(\2\u0180\u0182"+
		"\5R*\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183"+
		"\u016e\3\2\2\2\u0183\u017a\3\2\2\2\u0183\u017f\3\2\2\2\u0184U\3\2\2\2"+
		"\u0185\u018b\t\3\2\2\u0186\u018a\7\4\2\2\u0187\u018a\7\5\2\2\u0188\u018a"+
		"\5H%\2\u0189\u0186\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018a"+
		"\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018cW\3\2\2\2"+
		"\u018d\u018b\3\2\2\2\"l\u0082\u0094\u00a4\u00c6\u00d1\u00ed\u00f7\u010a"+
		"\u0111\u011a\u0125\u0127\u0136\u0138\u013e\u0145\u014a\u014e\u0154\u0156"+
		"\u015e\u0163\u0168\u016e\u0172\u0175\u017a\u0181\u0183\u0189\u018b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}