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
                matrix[i][j] = Math.random() * 10;
            }
        }
    }

    Matrix(double[][] matrix) {
        this.strings = matrix.length;
        this.columns = matrix[0].length;
        this.matrix = new double[strings][columns];
        for (int i = 0; i < this.strings; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.matrix[i][j] = matrix[i][j];
            }
        }
    }

    Matrix sum(Matrix matrix1) {
        if (matrix.length == matrix1.strings && matrix[0].length == matrix1.columns) {
            Matrix sum = new Matrix(matrix1.strings, matrix1.columns);
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sum.matrix[i][j] = matrix[i][j] + matrix1.matrix[i][j];
                }
            }
            return sum;
        } else {
            System.out.println("Матрицы невозможно просумировать");
            return null;
        }
    }

    Matrix multiplication(double a) {
        Matrix result = new Matrix(this.matrix);
        for (int i = 0; i < this.strings; i++) {
            for (int j = 0; j < this.columns; j++) {
                result.matrix[i][j] *= a;
            }
        }
        return result;
    }

    Matrix multiplication(Matrix operand) {
        if (this.columns == operand.strings) {
            Matrix result = new Matrix(this.strings, operand.columns);
            for (int i = 0; i < this.strings; i++) {
                for (int j = 0; j < operand.columns; j++) {
                    for (int r = 0; r < operand.strings; r++) {
                        result.matrix[i][j] += this.matrix[i][r] * operand.matrix[r][j];
                    }
                }
            }
            return result;
        } else {
            return null;
        }
    }

    void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static Matrix in(Scanner scanner) {
        Matrix in = new Matrix();
        System.out.println("Введите размеры матрицы");
        in.strings = inInt(scanner);
        in.columns = inInt(scanner);
        System.out.println("Введите матрицу (каждый элемент с новой строки (Enter))");
        in:
        {
            for (int i = 0; i < in.strings; i++) {
                for (int j = 0; j < in.columns; j++) {
                    if (scanner.hasNextDouble()) {
                        in.matrix[i][j] = scanner.nextDouble();
                    } else {
                        System.out.println("Input Error!");
                        break in;
                    }
                }
            }
        }
        return in;
    }

    static int inInt(Scanner scanner) {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Input Error");
            return 0;
        }
    }
}
