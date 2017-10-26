package com.company.task9;

import com.company.task9.library.Book;
import com.company.task9.library.Library;
import com.company.task9.library.LibraryUser;

public class LibraryMain {
    public static void main(String[] args) {
        LibraryUser[] array = new LibraryUser[3];
        array[0] = new LibraryUser();
        array[1] = new LibraryUser("Щербинина Е.Н.", "123456", "КИТ", "03.01.1998", "+3805067633325");
        array[2] = new LibraryUser("Ященко А.В.", "7891011", "КИТ", "08.07.1996", "+380991235566");

        Book[] books1 = new Book[3];
        books1[0] = new Book();
        books1[1] = new Book("До встречи с тобой", "Джоджо Мойес");
        books1[2] = new Book("Ярмарка ночных ужасов", "Стивен Кинг");

        Book[] books2 = new Book[2];
        books2[0] = new Book("Java", "Шилд");
        books2[1] = new Book("Первая кулинарная книга", "Эктор Хименес-Браво");

        Library library = new Library(array, books1);
        library.print();
        library.takeBook(books2);
    }
}
