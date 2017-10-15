package ru.spbau;

import org.jetbrains.annotations.NotNull;

public class Identifier extends Token {

    private static final String name = "Ident";
    private String idName;

    public Identifier(@NotNull String idName, @NotNull Position position) {
        this.idName = idName;
        this.position = position;
    }

    @Override
    public @NotNull String getName() {
        return name;
    }

    @Override
    public @NotNull String getProperties() {
        return '(' + idName + ')';
    }
}
