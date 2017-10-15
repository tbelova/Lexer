package ru.spbau;

import org.jetbrains.annotations.NotNull;

public class KeyWord extends  Token {

    private static final String name = "KW";
    private KeyWordType type;

    public KeyWord(@NotNull KeyWordType type, @NotNull Position position) {
        this.type = type;
        this.position = position;
    }

    @Override
    public @NotNull String getName() {
        return name + '_' + type.toString();
    }

    @Override
    public @NotNull String getProperties() {
        return "";
    }
}
