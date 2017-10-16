package com.company.task8;

import java.util.Scanner;

/**
 * Создать класс "Матрица". Класс должен иметь следующие поля:
 * 1) двумерный массив вещественных чисел;
 * 2) количество строк и столбцов в матрице.
 * <p>
 * Класс должен иметь следующие методы:
 * 1) сложение с другой матрицей;
 * 2) умножение на число;
 * 3) вывод на печать.
 * <p>
 * Created by Liza on 16.10.2017.
 */
public class Matrix {
    double[][] matrix;
    int strings, columns;

    Matrix() {
        strings = 2;
        columns = 2;
        matrix = new double[strings][columns];
    }

    Matrix(int strings, int columns) {
        this.strings = strings;
        this.columns = columns;
        matrix = new double[strings][columns];
        for (int i = 0; i < strings; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = Math.random() * 20;
            }
        }
    }

    Matrix(double[][] matrix) {
        this.strings = matrix.length;
        this.columns = matrix[0].length;
        this.matrix = matrix;
    }

    void sum(double[][] matrix1) {
        for (int i = 0; i < matrix.length & i < matrix1.length; i++) {
            for (int j = 0; j < matrix[i].length & j < matrix1[i].length; j++) {
                matrix[i][j] += matrix1[i][j];
            }
        }
    }

    void multiplication(double a) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= a;
            }
        }
    }

    void print() {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    static double[][] in(Scanner scanner) {
        System.out.println("Введите размер массива");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            double[][] tmp = new double[n][m];
            System.out.println("Введите матрицу");
            in:
            {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (scanner.hasNextDouble()) {
                            tmp[i][j] = scanner.nextDouble();
                        } else {
                            System.out.println("Input Error!");
                            break in;
                        }
                    }
                }
            }
            return tmp;
        } else {
            System.out.println("Input Error!");
        }
        return null;
    }
}
