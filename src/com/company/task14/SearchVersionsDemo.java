package com.company.task14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by student on 06.11.2017.
 */
public class SearchVersionsDemo {
    public static void main(String[] args) {
        String str = "Version: Java5, Java 6, Java  7, Java 8";
        Pattern pattern = Pattern.compile("Java\\s*\\d+");
        Matcher m = pattern.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
