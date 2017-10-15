package ru.spbau;

import org.jetbrains.annotations.NotNull;

public class Int extends Token {
    private static final String name = "Int";
    private int number;

    public Int(@NotNull String numberString, @NotNull Position position) {
        this.number = Integer.parseInt(numberString.replace("_", ""));
        this.position = position;
    }

    public Int(int number, @NotNull Position position) {
        this.number = number;
        this.position = position;
    }

    @Override
    public @NotNull String getName() {
        return name;
    }

    @Override
    public @NotNull String getProperties() {
        return '(' + Integer.toString(number) + ')';
    }
}
