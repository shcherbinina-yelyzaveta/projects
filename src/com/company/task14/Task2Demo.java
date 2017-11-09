package com.company.task14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2Demo {
    public static void main(String[] args) {
        String string = "My name is Liza. I'm 19 years old. Конец";
        System.out.println("Result: " + method(string));
    }

    public static int method(String string) {
        int result = 0;
        Pattern p = Pattern.compile("[A-Z]?[a-z]*\\W?[a-z]*");
        String[] words = string.split("\\s|,|(\\.\\s)");
        for (String s : words) {
            Matcher m = p.matcher(s);
            if (m.matches()) {
                result++;
            }
        }
        return result;
    }
}
