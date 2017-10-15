package ru.spbau;


import org.jetbrains.annotations.NotNull;

abstract public class Token {

    protected Position position;

    public abstract @NotNull String getName();
    public abstract @NotNull String getProperties();

    public  @NotNull Position getPosition() {
        return position;
    }

    public @NotNull String toString() {
        return getName() + position.toString() + getProperties() + ';';
    }

    @Override
    public boolean equals(Object o) {
        if (getClass() != o.getClass()) {
            return false;
        }
        return toString().equals(o.toString());
    }

}
