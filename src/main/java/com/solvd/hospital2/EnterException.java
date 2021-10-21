package com.solvd.hospital2;

public class EnterException extends RuntimeException {

    public EnterException() {
    }

    public EnterException(String message) {
        super(message);
    }

    public EnterException(String message, Throwable cause) {
        super(message, cause);
    }

    public EnterException(Throwable cause) {
        super(cause);
    }

    public EnterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
