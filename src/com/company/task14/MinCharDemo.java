package com.company.task14;

public class MinCharDemo {
    public static void main(String[] args) {
        System.out.println("Min: " + min("My name is Liza.I'm 19 years old.I have 3 years study."));
    }

    public static String min(String str) {
        String[] words = str.split("\\s|,|\\.");
        String min = words[0];
        for (String string : words) {
            if (min.length() > string.length()) {
                min = string;
            }
        }
        return min;
    }
}
