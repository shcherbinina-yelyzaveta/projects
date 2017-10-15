package com.company.task4;

/**
 * Created by Liza on 06.10.2017.
 */
public class EvenOrAdd {
    public static void main(String[] args) {
        int i = 0;
        for (String str : args) {
            i = Integer.parseInt(str);
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
