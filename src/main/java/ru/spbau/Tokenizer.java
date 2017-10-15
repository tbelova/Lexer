package ru.spbau;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer {

    public static @NotNull List<Token> getTokens(@NotNull String text) {
        List<Token> tokens = new ArrayList<>();
        TokenIterator iterator = new TokenIterator(text);
        while (iterator.hasNext()) {
            tokens.add(iterator.next());
        }
        return tokens;
    }

}
