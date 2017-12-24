package ru.spbau;

import org.jetbrains.annotations.NotNull;

public class CancelException extends RuntimeException {
    private String message;

    CancelException(@NotNull String s) {
        message = s;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
