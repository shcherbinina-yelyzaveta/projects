package com.company.task13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchOOPDemo {
    public static void main(String[] args) {
        String string = "I like object oriented programming. Object oriented programming is cool!";
        System.out.println("After replace: " + replaceOOP(string));
    }

    private static String replaceOOP(String string) {
        String str = "(O|o)bject oriented programming";
        Pattern pattern = Pattern.compile(str);
        Matcher m = pattern.matcher(string);
        while (m.find()) {
            string = m.replaceAll("OOP");
        }
        return string;
    }
}
