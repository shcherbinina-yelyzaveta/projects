package com.company.task2;

/**
 * Создать программу, в которой вывести на консоль литералы следующих видов:
 * а) логический литерал
 * б) строковый
 * в) символьный
 * г) целочисленный 2-й
 * д) целочисленный 8-й
 * е) целочисленный 10-й
 * ж) целочисленный 16-й
 * з) литерал типа float
 * е) литерал типа double.
 *
 * @author Liza Shcherbinina
 * @date 2017.10.02
 */
public class PrintLiterals {
    public static void main(String[] args) {
        PrintLiterals.print();
    }

    public static void print() {
        System.out.println("Hello!\u2764");
        System.out.println("boolean- " + true);
        System.out.println("It's string");
        System.out.println("char- " + '\u2713');
        System.out.println("int 2- " + 0b001);
        System.out.println("int 8- " + 013);
        System.out.println("int 10- " + 500);
        System.out.println("int 16- " + 0xAC);
        System.out.println("float- " + 5.45f);
        System.out.println("double- " + 1.111);
        System.out.println("Done!");

    }
}

