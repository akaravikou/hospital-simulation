package com.solvd.hospital2.personal_info;

public class AnswerException extends Exception {

    public AnswerException() {
    }

    public AnswerException(String message) {
        super(message);
    }

    public AnswerException(String message, Throwable cause) {
        super(message, cause);
    }

    public AnswerException(Throwable cause) {
        super(cause);
    }

    public AnswerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
