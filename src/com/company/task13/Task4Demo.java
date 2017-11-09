package com.company.task13;

public class Task4Demo {
    public static void main(String[] args) {
        System.out.println("for string 'string': " + method("string"));
        System.out.println("for string 'mother': " + method("mother"));
    }

    public static String method(String string) {
        String str = "";
        if (string.length() % 2 == 0) {
            str = string.substring((string.length() / 2) - 1, (string.length() / 2) + 1);
        }
        return str;
    }
}
