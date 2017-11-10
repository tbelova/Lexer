package ru.spbau;

import java.io.IOException;

public class ParseErrorException extends IOException {
    private Position position;

    ParseErrorException(Position position) {
        this.position = position;
    }

    Position getPosition() {
        return position;
    }
}
