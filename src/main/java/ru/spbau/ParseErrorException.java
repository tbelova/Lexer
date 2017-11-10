package ru.spbau;

public class ParseErrorException extends RuntimeException {
    private Position position;

    ParseErrorException(Position position) {
        this.position = position;
    }

    Position getPosition() {
        return position;
    }
}
