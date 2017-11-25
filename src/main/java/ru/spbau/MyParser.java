package ru.spbau;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.jetbrains.annotations.NotNull;

public class MyParser {

    private LLexer lexer = null;
    private LParser parser = null;
    private Visitor visitor = new Visitor();

    public MyParser(@NotNull String text) {
        lexer = new LLexer(CharStreams.fromString(text));
        parser = new LParser(new BufferedTokenStream(lexer));
    }

    public @NotNull String printTree() {
        return parser.program().accept(visitor);
    }

}
