package ru.spbau;

import org.jetbrains.annotations.NotNull;

public class Operator extends Token {
    private static final String name = "Op";
    private OperatorType type;

    public Operator(@NotNull OperatorType type, @NotNull Position position) {
        this.type = type;
        this.position = position;
    }

    @Override
    public @NotNull String getName() {
        return name;
    }

    @Override
    public @NotNull String getProperties() {
        return '(' + type.toString() + ')';
    }
}
