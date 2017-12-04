package com.company.task21;

/**
 * Created by student on 04.12.2017.
 */
public class MyThread2 extends Thread {
    private StringBuilder string;

    public MyThread2(StringBuilder string) {
        this.string = string;
    }

    @Override
    public void run() {
        synchronized (string) {
            for (int i = 0; i < 100; i++) {
                System.out.print(string);
            }
            System.out.println(" " + Thread.currentThread().getName());
            char c = string.charAt(0);
            string.setCharAt(0, ++c);
        }
    }
}
