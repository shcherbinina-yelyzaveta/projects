package com.company.task14;

import java.util.HashSet;
import java.util.Set;

public class MinCharDemo {
    public static void main(String[] args) {
        System.out.println("Min: " + min("My name is Liza.I'm 19 years old.IIIII have 3 years study."));
    }

    public static String min(String str) {
        String[] words = str.split("\\s|,|\\.");
        String min = words[0];
        for (String string : words) {
            if (size(min) > size(string)) {
                min = string;
            }
        }
        return min;
    }

    public static int size(String str) {
        Set<Character> c = new
                HashSet<>();
        for (Character character : str.toCharArray()) {
            c.add(character);
        }
        return c.size();
    }
}
