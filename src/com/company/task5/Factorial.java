package com.company.task5;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println(n + "! = " + Factorial.factorial(n));
        } else {
            System.out.println("Error!");
        }
    }

    public static int factorial(int n) {
        int result = 1;
        if (n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
