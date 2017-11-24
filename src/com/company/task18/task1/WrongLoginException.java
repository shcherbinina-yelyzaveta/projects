package com.company.task18.task1;

/**
 * Created by student on 24.11.2017.
 */
public class WrongLoginException extends Exception {
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongLoginException{}";
    }
}
