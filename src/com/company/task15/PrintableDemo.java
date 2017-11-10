package com.company.task15;

import com.company.task11.printable.Printable;

/**
 * Created by student on 10.11.2017.
 */
public class PrintableDemo {
    public static void main(String[] args) {
        Printable p = new Printable() {
            @Override
            public void print() {
                System.out.println("PRINT");
            }
        };
        p.print();
    }
}
