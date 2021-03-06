package com.company.task8;

import java.util.Scanner;

/**
 * Created by Liza on 16.10.2017.
 */
public class MatrixMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matrix matrix = new Matrix();
        Matrix operand = new Matrix();
        Matrix result = new Matrix();
        boolean exit = false;
        while (!exit) {
            switch (menu(scanner)) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    break;
                case 2:
                    int n = 0, m = 0;
                    System.out.println("Введите размер для будущего массива");
                    n = Matrix.inInt(scanner);
                    m = Matrix.inInt(scanner);
                    matrix = new Matrix(n, m);
                    break;
                case 3:
                    matrix = Matrix.in(scanner);
                    break;
                case 4:
                    operand = new Matrix(matrix.strings, matrix.columns);
                    result = matrix.sum(operand);
                    matrix.print();
                    System.out.println("+");
                    operand.print();
                    System.out.println("=");
                    result.print();
                    break;
                case 5:
                    double a = 1;
                    System.out.println("Введите число");
                    if (scanner.hasNextDouble()) {
                        a = scanner.nextDouble();
                    } else {
                        System.out.println("Input Error");
                    }
                    result = matrix.multiplication(a);
                    matrix.print();
                    System.out.println("*\n" + a + "\n=");
                    result.print();
                    break;
                case 6:
                    matrix.print();
                    break;
                case 7:
                    operand = new Matrix(matrix.columns, matrix.strings);
                    result = matrix.multiplication(operand);
                    matrix.print();
                    System.out.println("*");
                    operand.print();
                    System.out.println("=");
                    result.print();
                    break;
            }
        }
    }

    public static int menu(Scanner scanner) {
        System.out.println("\nВыберите действие:");
        System.out.println("1 - создать пустую матрицу вещественных чисел (по умолчанию размер матрицы 2х2)");
        System.out.println("2 - создать матрицу вещественных чисел заданого размера (матрица заполниться случайными числами от 0 до 10)");
        System.out.println("3 - ввести матрицу с клавиатуры");
        System.out.println("4 - сложить две матрицы");
        System.out.println("5 - умножить матрицу на число");
        System.out.println("6 - распечатать матрицу");
        System.out.println("7 - умножить две матрицы");
        System.out.println("0 - выход из программы");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            return 0;
        }
    }
}
