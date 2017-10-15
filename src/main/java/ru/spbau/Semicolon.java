package ru.spbau;

import org.jetbrains.annotations.NotNull;

public class Semicolon extends Token {
    private static final String name = "Semicolon";

    public Semicolon(@NotNull Position position) {
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
