package com.company.task11.printable;

/**
 * Created by student on 27.10.2017.
 */
public class Book implements Printable {
    private String bookName;

    public Book() {
        this.bookName = "smth book";
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void print() {
        System.out.println("Это книга!");
    }

    public static void printBooks(Printable[] printable) {
        for (Printable printable1 : printable) {
            if (printable1 instanceof Book) {
                printable1.print();
                System.out.println(((Book) printable1).getBookName());
            }
        }
    }
}
