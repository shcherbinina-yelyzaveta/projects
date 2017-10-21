package com.company.task9;

import java.util.Scanner;

/**
 * Даны два целых числа A и В.
 * Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или в порядке убывания в противном случае.
 * Использовать рекурсию.
 */
public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число А");
        int a = Recursion.in(scanner);
        System.out.println("Введите число В");
        int b = Recursion.in(scanner);
        System.out.println(Recursion.method(a,b));

    }

    public static int in(Scanner scanner) {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            return 0;
        }
    }

    public static String method(int a, int b) {
        String result = "";
        if (a > b) {
            result = a + method((a - 1), b);
        } else if (a < b) {
            result = a + method((a + 1), b);
        } else {
            return "" + a;
        }
        return result;
    }
}
