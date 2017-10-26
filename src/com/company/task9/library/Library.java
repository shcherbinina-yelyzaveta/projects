package com.company.task9.library;

import java.util.Arrays;
import java.util.Scanner;

public class Library extends LibraryUser {
    private LibraryUser[] users;
    private Book[] books;

    public Library() {
        this.books = new Book[1];
        this.users = new LibraryUser[1];
    }

    public Library(LibraryUser[] users, Book[] books) {
        this.users = users;
        this.books = books;
    }

    public Library(String fullName, String readerTickerNumber, String faculty, String birthday, String phoneNumber) {
        super(fullName, readerTickerNumber, faculty, birthday, phoneNumber);
        this.books = new Book[1];
        this.users = new LibraryUser[1];
    }

    public Library(String fullName, String readerTickerNumber, String faculty, String birthday, String phoneNumber, Book[] books) {
        super(fullName, readerTickerNumber, faculty, birthday, phoneNumber);
        this.books = books;
    }

    public Library(String fullName, String readerTickerNumber, String faculty, String birthday, String phoneNumber, LibraryUser[] users, Book[] books) {
        super(fullName, readerTickerNumber, faculty, birthday, phoneNumber);
        this.users = users;
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void takeBook(int a) {
        System.out.println("Взято книг - " + a);
    }

    public void returnBook(int a) {
        System.out.println("Вернули книг - " + a);
    }


    public void takeBook(String... bookNames) {
        System.out.println("Взяли такие книги:");
        for (String str : bookNames) {
            System.out.println(str);
        }
    }

    public void takeBook(Book... books) {
        System.out.println("Взяли такие книги:");
        for (Book book : books) {
            System.out.println(book);
        }
    }


    public void returnBook(String... bookNames) {
        System.out.println("Вернули такие книги:");
        for (String str : bookNames) {
            System.out.println(str);
        }
    }

    public void returnBook(Book... books) {
        System.out.println("Вернули такие книги:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public LibraryUser[] getUsers() {
        return users;
    }

    public void setUsers(LibraryUser[] users) {
        this.users = users;
    }

    public String inString(Scanner scanner) {
        String str = "";
        if (scanner.hasNext()) {
            str = scanner.next();
        }
        return str;
    }

    public int inInt(Scanner scanner) {
        int i = 0;
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
        }
        return i;
    }

    public void inUsers(Scanner scanner) {
        System.out.println("Кол-во пользователей:");
        this.users = new LibraryUser[inInt(scanner)];
        for (int i = 0; i < this.users.length; i++) {
            System.out.println("ФИО:");
            this.users[i].setFullName(inString(scanner));
            System.out.println("Номер читательского билета:");
            this.users[i].setReaderTickerNumber(inString(scanner));
            System.out.println("Факультет:");
            this.users[i].setFaculty(inString(scanner));
            System.out.println("Дата рождения:");
            this.users[i].setBirthday(inString(scanner));
            System.out.println("Номер телефона:");
            this.users[i].setPhoneNumber(inString(scanner));
        }
    }

    public void inBooks(Scanner scanner) {
        System.out.println("Кол-во книг");
        this.books = new Book[inInt(scanner)];
        for (int i = 0; i < this.books.length; i++) {
            System.out.println("Название книги:");
            this.books[i].setBookName(inString(scanner));
            System.out.println("Автор:");
            this.books[i].setAuthor(inString(scanner));
        }
    }

    public void in(Scanner scanner) {
        inUsers(scanner);
        inBooks(scanner);
    }

    public void print() {
        System.out.println("Пользователи библиотеки");
        for (LibraryUser user : this.users) {
            System.out.println(user);
        }
        System.out.println("Книги библиотеки");
        for (Book book : this.books) {
            System.out.println(book);
        }
    }
}
