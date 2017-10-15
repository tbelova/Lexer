package ru.spbau;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TokenizerTest {

    @Test
    public void emptyTest() throws Exception {
        assertTrue(Tokenizer.getTokens("").size() == 0);
    }

    @Test
    public void emptyTestWithSpaces() throws Exception {
        assertTrue(Tokenizer.getTokens("  \n  \n   \t\n\r  \f ").size() == 0);
    }

    @Test
    public void parenthesesTest() throws Exception {
        List<Token> tokens = new ArrayList<>();

        tokens.add(new LeftParenthesis(new Position(0, 0, 0)));
        tokens.add(new RightParenthesis(new Position(0, 1, 1)));

        List<Token> answer = Tokenizer.getTokens("()");

        assertEquals(tokens, answer);
    }

    @Test
    public void moreParenthesesTest() throws Exception {
        List<Token> tokens = new ArrayList<>();

        tokens.add(new LeftParenthesis(new Position(0, 0, 0)));
        tokens.add(new RightParenthesis(new Position(0, 1, 1)));

        tokens.add(new LeftParenthesis(new Position(0, 3, 3)));
        tokens.add(new LeftParenthesis(new Position(0, 4, 4)));
        tokens.add(new RightParenthesis(new Position(0, 5, 5)));
        tokens.add(new RightParenthesis(new Position(0, 6, 6)));

        assertEquals(tokens, Tokenizer.getTokens("() (())"));
    }

    @Test
    public void keyWordsTest() throws Exception {
        String test = "if then else while do read write begin end";

        List<Token> tokens = new ArrayList<>();

        tokens.add(new KeyWord(KeyWordType.IF, new Position(0, 0, 1)));
        tokens.add(new KeyWord(KeyWordType.THEN, new Position(0, 3, 6)));
        tokens.add(new KeyWord(KeyWordType.ELSE, new Position(0, 8, 11)));
        tokens.add(new KeyWord(KeyWordType.WHILE, new Position(0, 13, 17)));
        tokens.add(new KeyWord(KeyWordType.DO, new Position(0, 19, 20)));
        tokens.add(new KeyWord(KeyWordType.READ, new Position(0, 22, 25)));
        tokens.add(new KeyWord(KeyWordType.WRITE, new Position(0, 27, 31)));
        tokens.add(new KeyWord(KeyWordType.BEGIN, new Position(0, 33, 37)));
        tokens.add(new KeyWord(KeyWordType.END, new Position(0, 39, 41)));

        assertEquals(tokens, Tokenizer.getTokens(test));
    }

    @Test
    public void booleanTest() throws Exception {
        String test = "true false";

        List<Token> tokens = new ArrayList<>();

        tokens.add(new Bool(true, new Position(0, 0, 3)));
        tokens.add(new Bool(false, new Position(0, 5, 9)));

        assertEquals(tokens, Tokenizer.getTokens(test));
    }

    @Test
    public void integerTest() throws Exception {
        String test = "0 1 -12 123";

        List<Token> tokens = new ArrayList<>();

        tokens.add(new Int(0, new Position(0, 0, 0)));
        tokens.add(new Int(1, new Position(0, 2, 2)));
        tokens.add(new Int(-12, new Position(0, 4, 6)));
        tokens.add(new Int(123, new Position(0, 8, 10)));

        assertEquals(tokens, Tokenizer.getTokens(test));
    }

    @Test
    public void integerTestWithUnderscores() throws Exception {
        String test = "0 1 -1_2 1_2_3";

        List<Token> tokens = new ArrayList<>();

        tokens.add(new Int(0, new Position(0, 0, 0)));
        tokens.add(new Int(1, new Position(0, 2, 2)));
        tokens.add(new Int(-12, new Position(0, 4, 7)));
        tokens.add(new Int(123, new Position(0, 9, 13)));

        assertEquals(tokens, Tokenizer.getTokens(test));
    }

    @Test
    public void floatTest() throws Exception {
        String test = "0.01 1.2 12.e-3 12.3e4 -10.01e-100 .05";

        List<Token> tokens = new ArrayList<>();

        tokens.add(new Float(0.01, new Position(0, 0, 3)));
        tokens.add(new Float(1.2, new Position(0, 5, 7)));
        tokens.add(new Float(12.e-3, new Position(0, 9, 14)));
        tokens.add(new Float(12.3e4, new Position(0, 16, 21)));
        tokens.add(new Float(-10.01e-100, new Position(0, 23, 33)));
        tokens.add(new Float(0.05, new Position(0, 35, 37)));

        assertEquals(tokens, Tokenizer.getTokens(test));
    }

    @Test
    public void floatTestWithUnderscores() throws Exception {
        String test = "0.0_1 1.2 1_2.e-3 1_2.3e4 -1_0.01e-1_0_0 .0_5";

        List<Token> tokens = new ArrayList<>();
        tokens.add(new Float(0.01, new Position(0, 0, 4)));
        tokens.add(new Float(1.2, new Position(0, 6, 8)));
        tokens.add(new Float(12.e-3, new Position(0, 10, 16)));
        tokens.add(new Float(12.3e4, new Position(0, 18, 24)));
        tokens.add(new Float(-10.01e-100, new Position(0, 26, 39)));
        tokens.add(new Float(0.05, new Position(0, 41, 44)));

        assertEquals(tokens, Tokenizer.getTokens(test));
    }

    @Test
    public void operatorTest() throws Exception {
        String test = "+ - * / % == != > >= < <= && ||";

        List<Token> tokens = new ArrayList<>();

        tokens.add(new Operator(OperatorType.PLUS, new Position(0, 0, 0)));
        tokens.add(new Operator(OperatorType.MINUS, new Position(0, 2, 2)));
        tokens.add(new Operator(OperatorType.MULT, new Position(0, 4, 4)));
        tokens.add(new Operator(OperatorType.DIV, new Position(0, 6, 6)));
        tokens.add(new Operator(OperatorType.REM, new Position(0, 8, 8)));
        tokens.add(new Operator(OperatorType.EQ, new Position(0, 10, 11)));
        tokens.add(new Operator(OperatorType.NEQ, new Position(0, 13, 14)));
        tokens.add(new Operator(OperatorType.G, new Position(0, 16, 16)));
        tokens.add(new Operator(OperatorType.GE, new Position(0, 18, 19)));
        tokens.add(new Operator(OperatorType.L, new Position(0, 21, 21)));
        tokens.add(new Operator(OperatorType.LE, new Position(0, 23, 24)));
        tokens.add(new Operator(OperatorType.AND, new Position(0, 26, 27)));
        tokens.add(new Operator(OperatorType.OR, new Position(0, 29, 30)));

        assertEquals(tokens, Tokenizer.getTokens(test));
    }

    @Test
    public void oneLineTest() throws Exception {
        String test = "read x; if y + 1 == x then write y else write x";

        List<Token>  tokens = new ArrayList<>();
        tokens.add(new KeyWord(KeyWordType.READ, new Position(0, 0, 3)));
        tokens.add(new Identifier("x", new Position(0, 5, 5)));
        tokens.add(new Semicolon(new Position(0, 6, 6)));
        tokens.add(new KeyWord(KeyWordType.IF, new Position(0, 8, 9)));
        tokens.add(new Identifier("y", new Position(0, 11, 11)));
        tokens.add(new Operator(OperatorType.PLUS, new Position(0, 13, 13)));
        tokens.add(new Int(1, new Position(0, 15, 15)));
        tokens.add(new Operator(OperatorType.EQ, new Position(0, 17, 18)));
        tokens.add(new Identifier("x", new Position(0, 20, 20)));
        tokens.add(new KeyWord(KeyWordType.THEN, new Position(0, 22, 25)));
        tokens.add(new KeyWord(KeyWordType.WRITE, new Position(0, 27, 31)));
        tokens.add(new Identifier("y", new Position(0, 33, 33)));
        tokens.add(new KeyWord(KeyWordType.ELSE, new Position(0, 35, 38)));
        tokens.add(new KeyWord(KeyWordType.WRITE, new Position(0, 40, 44)));
        tokens.add(new Identifier("x", new Position(0, 46, 46)));

        assertEquals(tokens, Tokenizer.getTokens(test));
    }

    @Test
    public void severalLinesTest() throws Exception {
        String test = "read x; \nif y + 1 == x \n\tthen write y \n\telse write x";

        List<Token>  tokens = new ArrayList<>();
        tokens.add(new KeyWord(KeyWordType.READ, new Position(0, 0, 3)));
        tokens.add(new Identifier("x", new Position(0, 5, 5)));
        tokens.add(new Semicolon(new Position(0, 6, 6)));
        tokens.add(new KeyWord(KeyWordType.IF, new Position(1, 0, 1)));
        tokens.add(new Identifier("y", new Position(1, 3, 3)));
        tokens.add(new Operator(OperatorType.PLUS, new Position(1, 5, 5)));
        tokens.add(new Int(1, new Position(1, 7, 7)));
        tokens.add(new Operator(OperatorType.EQ, new Position(1, 9, 10)));
        tokens.add(new Identifier("x", new Position(1, 12, 12)));
        tokens.add(new KeyWord(KeyWordType.THEN, new Position(2, 1, 4)));
        tokens.add(new KeyWord(KeyWordType.WRITE, new Position(2, 6, 10)));
        tokens.add(new Identifier("y", new Position(2, 12, 12)));
        tokens.add(new KeyWord(KeyWordType.ELSE, new Position(3, 1, 4)));
        tokens.add(new KeyWord(KeyWordType.WRITE, new Position(3, 6, 10)));
        tokens.add(new Identifier("x", new Position(3, 12, 12)));

        assertEquals(tokens, Tokenizer.getTokens(test));
    }

    @Test
    public void severalLinesTestWithComments() throws Exception {
        String test = "read x; //read x\nif y + 1 == x \n\tthen write y \n\telse write x //end of the program";

        List<Token>  tokens = new ArrayList<>();
        tokens.add(new KeyWord(KeyWordType.READ, new Position(0, 0, 3)));
        tokens.add(new Identifier("x", new Position(0, 5, 5)));
        tokens.add(new Semicolon(new Position(0, 6, 6)));
        tokens.add(new Commentary(new Position(0, 8, 15)));
        tokens.add(new KeyWord(KeyWordType.IF, new Position(1, 0, 1)));
        tokens.add(new Identifier("y", new Position(1, 3, 3)));
        tokens.add(new Operator(OperatorType.PLUS, new Position(1, 5, 5)));
        tokens.add(new Int(1, new Position(1, 7, 7)));
        tokens.add(new Operator(OperatorType.EQ, new Position(1, 9, 10)));
        tokens.add(new Identifier("x", new Position(1, 12, 12)));
        tokens.add(new KeyWord(KeyWordType.THEN, new Position(2, 1, 4)));
        tokens.add(new KeyWord(KeyWordType.WRITE, new Position(2, 6, 10)));
        tokens.add(new Identifier("y", new Position(2, 12, 12)));
        tokens.add(new KeyWord(KeyWordType.ELSE, new Position(3, 1, 4)));
        tokens.add(new KeyWord(KeyWordType.WRITE, new Position(3, 6, 10)));
        tokens.add(new Identifier("x", new Position(3, 12, 12)));
        tokens.add(new Commentary(new Position(3, 14, 33)));

        assertEquals(tokens, Tokenizer.getTokens(test));
    }



}
