package ru.spbau;

import org.jetbrains.annotations.NotNull;

public class RightParenthesis extends Token {
    private static final String name = "RightParenthesis";

    public RightParenthesis(@NotNull Position position) {
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
