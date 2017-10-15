package ru.spbau;

import org.jetbrains.annotations.NotNull;

public class Bool extends Token {
    private static final String name = "Bool";
    private boolean f;

    public Bool(@NotNull String fString, @NotNull Position position) {
        this.f = Boolean.parseBoolean(fString);
        this.position = position;
    }

    public Bool(boolean f, @NotNull Position position) {
        this.f = f;
        this.position = position;
    }

    @Override
    public @NotNull String getName() {
        return name;
    }

    @Override
    public @NotNull String getProperties() {
        return '(' + Boolean.toString(f) + ')';
    }
}
