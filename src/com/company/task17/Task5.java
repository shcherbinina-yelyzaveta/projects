package com.company.task17;

import java.util.HashSet;
import java.util.Set;

public class Task5 {
    public static void main(String[] args) {
        String string = "1, 2, 3, 4, 4, 5";
        Set<Character> set = new HashSet<>();
        for (Character c : string.toCharArray()) {
            set.add(c);
        }
        set.remove(',');
        set.remove(' ');
        System.out.println(set);
    }
}
