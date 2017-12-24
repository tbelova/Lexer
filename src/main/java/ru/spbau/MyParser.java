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
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ErrorListener());

        parser = new LParser(new BufferedTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorListener());
    }

    public @NotNull String printTree() {
        try {
            return parser.program().accept(visitor);
        } catch (CancelException e) {
            return e.getMessage();
        }
    }

}
