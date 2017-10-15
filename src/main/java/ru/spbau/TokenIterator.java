package ru.spbau;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Iterator;

public class TokenIterator implements Iterator<Token> {
    private MyLexer lexer = new MyLexer(null);
    private Token nextToken = null;

    public TokenIterator(@NotNull String text) {
        lexer.reset(text, 0, text.length(), 0);
        tryNext();
    }

    @Override
    public boolean hasNext() {
        return (nextToken != null);
    }

    @Override
    public Token next() {
        Token prev = nextToken;
        tryNext();
        return prev;
    }

    private void tryNext() {
        try {
            nextToken = lexer.yylex();
        } catch (IOException e) {
        }
    }
}
