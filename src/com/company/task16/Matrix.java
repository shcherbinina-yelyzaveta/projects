package com.company.task16;

import java.util.Arrays;

public class Matrix<T extends Number> {
    private T[][] matrix;
    private int strings, columns;

    Matrix(T[][] matrix) {
        this.strings = matrix.length;
        this.columns = matrix[0].length;
        this.matrix = matrix;
    }

    public T[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    Matrix<T> sum(Matrix<? extends Number> matrix1) {
        if (matrix.length == matrix1.strings && matrix[0].length == matrix1.columns) {
            Number[][] sum = new Number[this.strings][this.columns];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sum[i][j] = this.matrix[i][j].doubleValue() + matrix1.matrix[i][j].doubleValue();
                }
            }
            Matrix<T> m = new Matrix(sum);
            return m;
        } else {
            System.out.println("Матрицы невозможно просумировать");
            return null;
        }
    }

    Matrix<T> multiplication(int a) {
        Number[][] result = new Number[this.strings][this.columns];
        for (int i = 0; i < this.strings; i++) {
            for (int j = 0; j < this.columns; j++) {
                result[i][j] = this.matrix[i][j].doubleValue() * a;
            }
        }
        Matrix<T> m = new Matrix(result);
        return m;
    }

    Matrix<T> multiplication(Matrix<? extends Number> operand) {
        if (this.columns == operand.strings) {
            Number[][] result = new Number[this.strings][operand.columns];
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    result[i][j] = 0;
                }
            }
            for (int i = 0; i < this.strings; i++) {
                for (int j = 0; j < operand.columns; j++) {
                    for (int r = 0; r < operand.strings; r++) {
                        result[i][j] = result[i][j].doubleValue() + this.matrix[i][r].doubleValue() * operand.matrix[r][j].doubleValue();
                    }
                }
            }
            Matrix<T> m = new Matrix(result);
            return m;
        } else {
            return null;
        }
    }

    void print() {
        if (this.matrix == null) {
            System.out.println("null");
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Matrix)) return false;

        Matrix<?> matrix1 = (Matrix<?>) o;

        if (getStrings() != matrix1.getStrings()) return false;
        if (getColumns() != matrix1.getColumns()) return false;
        return Arrays.deepEquals(getMatrix(), matrix1.getMatrix());
    }

    @Override
    public int hashCode() {
        int result = Arrays.deepHashCode(getMatrix());
        result = 31 * result + getStrings();
        result = 31 * result + getColumns();
        return result;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "matrix=" + Arrays.toString(matrix) +
                ", strings=" + strings +
                ", columns=" + columns +
                '}';
    }

    public static void main(String[] args) {
        Matrix<Double> m1 = new Matrix<>(new Double[][]{{1.0, 0.2, 4.5}, {5.0, 1.0, 3.5}, {4.2, 6.3, 1.2}});
        Matrix<Integer> m2 = new Matrix<>(new Integer[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}});
        Matrix<Double> m3 = m1.multiplication(2);
        System.out.println("m1*2=");
        m3.print();
        System.out.println("m1+m2=");
        m3 = m1.sum(m2);
        m3.print();
        System.out.println("m1*m2=");
        m3 = m1.multiplication(m2);
        m3.print();
    }
}
