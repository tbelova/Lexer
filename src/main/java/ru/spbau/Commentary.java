package ru.spbau;

import org.jetbrains.annotations.NotNull;

public class Commentary extends Token {
    private static final String name = "Commentary";
    private @NotNull String commentary;

    public Commentary(@NotNull String commentary, @NotNull Position position) {
        this.commentary = commentary.substring(2);
        this.position = position;
    }

    @Override
    public @NotNull String getName() {
        return name;
    }

    @Override
    public @NotNull String getProperties() {
        return '(' + commentary + ')';
    }
}
