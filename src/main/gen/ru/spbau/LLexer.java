package ru.spbau;// Generated from /home/tanya/AU/5thTerm/FL/hw04/Lexer/src/main/antlr/L.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PositiveDigit", "Underscore", "Letter", "Dot", "Comma", "LeftBrace", 
		"RightBrace", "LeftFigureBrace", "RightFigureBrace", "Semicolon", "PLUS", 
		"MINUS", "MULT", "DIV", "REM", "EQ", "NEQ", "GE", "G", "LE", "L", "AND", 
		"OR", "AS", "If", "Then", "Else", "While", "Write", "Read", "Do", "Return", 
		"True", "False", "Zero", "Sign", "E", "Comment", "LineTerminator", "WhiteSpace"
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


	public LLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "L.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00d9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'"+
		"\3\'\7\'\u00c8\n\'\f\'\16\'\u00cb\13\'\3\'\3\'\3(\3(\3(\5(\u00d2\n(\3"+
		"(\3(\3)\3)\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\6\4\2--//\4\2GGgg\4\2"+
		"\f\f\17\17\5\2\13\13\16\16\"\"\2\u00da\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13"+
		"[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27"+
		"g\3\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#t"+
		"\3\2\2\2%w\3\2\2\2\'z\3\2\2\2)|\3\2\2\2+\177\3\2\2\2-\u0081\3\2\2\2/\u0084"+
		"\3\2\2\2\61\u0087\3\2\2\2\63\u008a\3\2\2\2\65\u008d\3\2\2\2\67\u0092\3"+
		"\2\2\29\u0097\3\2\2\2;\u009d\3\2\2\2=\u00a3\3\2\2\2?\u00a8\3\2\2\2A\u00ab"+
		"\3\2\2\2C\u00b2\3\2\2\2E\u00b7\3\2\2\2G\u00bd\3\2\2\2I\u00bf\3\2\2\2K"+
		"\u00c1\3\2\2\2M\u00c3\3\2\2\2O\u00d1\3\2\2\2Q\u00d5\3\2\2\2ST\4\63;\2"+
		"T\4\3\2\2\2UV\7a\2\2V\6\3\2\2\2WX\4c|\2X\b\3\2\2\2YZ\7\60\2\2Z\n\3\2\2"+
		"\2[\\\7.\2\2\\\f\3\2\2\2]^\7*\2\2^\16\3\2\2\2_`\7+\2\2`\20\3\2\2\2ab\7"+
		"}\2\2b\22\3\2\2\2cd\7\177\2\2d\24\3\2\2\2ef\7=\2\2f\26\3\2\2\2gh\7-\2"+
		"\2h\30\3\2\2\2ij\7/\2\2j\32\3\2\2\2kl\7,\2\2l\34\3\2\2\2mn\7\61\2\2n\36"+
		"\3\2\2\2op\7\'\2\2p \3\2\2\2qr\7?\2\2rs\7?\2\2s\"\3\2\2\2tu\7#\2\2uv\7"+
		"?\2\2v$\3\2\2\2wx\7@\2\2xy\7?\2\2y&\3\2\2\2z{\7@\2\2{(\3\2\2\2|}\7>\2"+
		"\2}~\7?\2\2~*\3\2\2\2\177\u0080\7>\2\2\u0080,\3\2\2\2\u0081\u0082\7(\2"+
		"\2\u0082\u0083\7(\2\2\u0083.\3\2\2\2\u0084\u0085\7~\2\2\u0085\u0086\7"+
		"~\2\2\u0086\60\3\2\2\2\u0087\u0088\7<\2\2\u0088\u0089\7?\2\2\u0089\62"+
		"\3\2\2\2\u008a\u008b\7k\2\2\u008b\u008c\7h\2\2\u008c\64\3\2\2\2\u008d"+
		"\u008e\7v\2\2\u008e\u008f\7j\2\2\u008f\u0090\7g\2\2\u0090\u0091\7p\2\2"+
		"\u0091\66\3\2\2\2\u0092\u0093\7g\2\2\u0093\u0094\7n\2\2\u0094\u0095\7"+
		"u\2\2\u0095\u0096\7g\2\2\u00968\3\2\2\2\u0097\u0098\7y\2\2\u0098\u0099"+
		"\7j\2\2\u0099\u009a\7k\2\2\u009a\u009b\7n\2\2\u009b\u009c\7g\2\2\u009c"+
		":\3\2\2\2\u009d\u009e\7y\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7k\2\2\u00a0"+
		"\u00a1\7v\2\2\u00a1\u00a2\7g\2\2\u00a2<\3\2\2\2\u00a3\u00a4\7t\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7f\2\2\u00a7>\3\2\2\2\u00a8"+
		"\u00a9\7f\2\2\u00a9\u00aa\7q\2\2\u00aa@\3\2\2\2\u00ab\u00ac\7t\2\2\u00ac"+
		"\u00ad\7g\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7t\2\2"+
		"\u00b0\u00b1\7p\2\2\u00b1B\3\2\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7t\2"+
		"\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7g\2\2\u00b6D\3\2\2\2\u00b7\u00b8\7"+
		"h\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc"+
		"\7g\2\2\u00bcF\3\2\2\2\u00bd\u00be\7\62\2\2\u00beH\3\2\2\2\u00bf\u00c0"+
		"\t\2\2\2\u00c0J\3\2\2\2\u00c1\u00c2\t\3\2\2\u00c2L\3\2\2\2\u00c3\u00c4"+
		"\7\61\2\2\u00c4\u00c5\7\61\2\2\u00c5\u00c9\3\2\2\2\u00c6\u00c8\n\4\2\2"+
		"\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca"+
		"\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\b\'\2\2\u00cd"+
		"N\3\2\2\2\u00ce\u00d2\t\4\2\2\u00cf\u00d0\7\17\2\2\u00d0\u00d2\7\f\2\2"+
		"\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4"+
		"\b(\2\2\u00d4P\3\2\2\2\u00d5\u00d6\t\5\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8"+
		"\b)\2\2\u00d8R\3\2\2\2\5\2\u00c9\u00d1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}