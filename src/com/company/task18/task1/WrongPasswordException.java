package com.company.task18.task1;

/**
 * Created by student on 24.11.2017.
 */
public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongPasswordException{}";
    }
}
