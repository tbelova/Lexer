package ru.spbau;

import org.jetbrains.annotations.NotNull;

public class Float extends Token {
    private static final String name = "Float";
    private double number;

    public Float(@NotNull String numberString, @NotNull Position position) {
        this.number = Double.parseDouble(numberString.replace("_", ""));
        this.position = position;
    }

    public Float(double number, @NotNull Position position) {
        this.number = number;
        this.position = position;
    }

    @Override
    public @NotNull String getName() {
        return name;
    }

    public double getNumber() {
        return number;
    }

    @Override
    public @NotNull String getProperties() {
        return '(' + Double.toString(number) + ')';
    }
}
