package com.company.task14;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by student on 06.11.2017.
 */
public class LocalDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Locale current = Locale.getDefault();
        print("ru", "RUS");
        print("en", "US");
    }

    public static void print(String language, String country) throws UnsupportedEncodingException {
        Locale l = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("base", l);
        for (int i = 1; i <= 6; i++) {
            String s1 = rb.getString(Integer.toString(i));
            s1 = new String(s1.getBytes("ISO-8859-1"), "UTF-8");
            System.out.printf("\nTask %d - %s", i, s1);
        }
    }

}
