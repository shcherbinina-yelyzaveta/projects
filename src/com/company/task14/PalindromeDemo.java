package com.company.task14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PalindromeDemo {
    public static void main(String[] args) {
        String string = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";
        method(string);
    }

    public static void method(String string) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher m = pattern.matcher(string);
        while (m.find()) {
            if (m.group().equals(new StringBuilder(m.group()).reverse().toString())) {
                System.out.println(m.group() + " полиндром");
            }
        }
    }
}
