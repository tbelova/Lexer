package ru.spbau;

import org.jetbrains.annotations.NotNull;

public class Commentary extends Token {
    private static final String name = "Commentary";

    public Commentary(@NotNull Position position) {
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
