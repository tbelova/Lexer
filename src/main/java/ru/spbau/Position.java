package ru.spbau;

import org.jetbrains.annotations.NotNull;

public class Position {

    private int line;
    private int startPos;
    private int endPos;

    public Position(int line, int startPos, int endPos) {
        this.line = line;
        this.startPos = startPos;
        this.endPos = endPos;
    }

    public @NotNull String toString() {
        return "[" + Integer.toString(line) + ',' +
                     Integer.toString(startPos) + ',' +
                     Integer.toString(endPos) +
                ']';
    }

}
