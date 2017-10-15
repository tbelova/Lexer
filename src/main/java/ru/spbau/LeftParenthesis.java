package ru.spbau;

import org.jetbrains.annotations.NotNull;

public class LeftParenthesis extends Token {
    private static final String name = "LeftParenthesis";

    public LeftParenthesis(@NotNull Position position) {
        this.position = position;
    }

    @Override
    public @NotNull String getName() {
        return name;
    }

    @Override
    public @NotNull String getProperties() {
        return "";
    }
}
