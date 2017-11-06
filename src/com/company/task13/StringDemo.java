package com.company.task13;

/**
 * Created by student on 03.11.2017.
 */
public class StringDemo {
    public static void main(String[] args) {
        String str1 = "I like Java!!!";
        System.out.println(str1);
        method(str1);
    }

    public static void method(String str) {
        System.out.println("last character = " + str.charAt(str.length()-1));
        System.out.println("ends with !!! = " + str.endsWith("!!!"));
        System.out.println("starts with I like = " + str.startsWith("I like"));
        System.out.println("position Java = " + str.indexOf("Java"));
        System.out.println("replace a and o = " + str.replace('a','o'));
        System.out.println("to upper case = " + str.toUpperCase());
        System.out.println("to lower case = " + str.toLowerCase());
        System.out.println("-Java = " + str.substring(0,6)+str.substring(11));
    }
}
