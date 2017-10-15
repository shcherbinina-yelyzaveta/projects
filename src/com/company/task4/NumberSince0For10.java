package com.company.task4;

import java.util.Scanner;

/**
 * Created by Liza on 06.10.2017.
 */
public class NumberSince0For10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i >= 0 && i < 10) {
                System.out.println("Число положительное меньше 10");
            } else {
                System.out.println("Число положительное больше 10 или отрицательное");
            }
        } else {
            System.out.println("Вы ввели не число");
        }
    }
}
