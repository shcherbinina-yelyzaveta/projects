package com.company.task21;

/**
 * Created by student on 04.12.2017.
 */
public class MyThread2Demo {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("A");
        MyThread2 th1 = new MyThread2(s);
        MyThread2 th2 = new MyThread2(s);
        MyThread2 th3 = new MyThread2(s);

        th1.start();
        th2.start();
        th3.start();
    }
}
