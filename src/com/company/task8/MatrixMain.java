package com.company.task8;

import java.util.Scanner;

/**
 * Created by Liza on 16.10.2017.
 */
public class MatrixMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            switch (menu(scanner)) {
                case 0:
                    break;
                case 1:
                    Matrix matrix = new Matrix();
                    break;
                case 2:
                    System.out.println("Введите размер для будущего массива");
                    if (scanner.hasNextInt()){
                        int n = scanner.nextInt();
                        int m = scanner.nextInt();
                    } else {
                        System.out.println("Input Error!");
                    }
                    break;
                case 3:
                    Matrix matrix1 = new Matrix(Matrix.in(scanner));
                    break;
                case 4:


            }
        }
    }

    public static int menu(Scanner scanner) {
        System.out.println("Выберите действие:");
        System.out.println("1 - создать пустой массив вещественных чисел (по умолчанию размер массива 2х2)");
        System.out.println("2 - создать массив вещественных чисел заданого размера (массив заполниться случайными числами)");
        System.out.println("3 - создать массив вещественных чисел на основе уже имеющегося");
        System.out.println("4 - сложить два массива");
        System.out.println("5 - умножить массив на число");
        System.out.println("0 - выход из программы");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            return 0;
        }
    }
}
