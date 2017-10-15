package com.company.task5;

/**
 * Created by Liza on 06.10.2017.
 */
public class TaskDoWhile {
    public static void main(String[] args) {
        func();
    }

    public static void func() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);
    }

}
