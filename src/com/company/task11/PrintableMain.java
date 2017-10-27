package com.company.task11;

import com.company.task11.printable.Book;
import com.company.task11.printable.Magazine;
import com.company.task11.printable.Printable;

/**
 * Created by student on 27.10.2017.
 */
public class PrintableMain {
    public static void main(String[] args) {
        Printable[] objs = new Printable[4];
        objs[0] = new Book();
        objs[1] = new Magazine("Джулия");
        objs[2] = new Magazine();
        objs[3] = new Book("До встречи с тобой");

        for (Printable printable : objs) {
            printable.print();
        }

        Book.printBooks(objs);
        Magazine.printMagazines(objs);
    }
}
