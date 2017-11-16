package com.company.task16;

public class Calculator {
    public static <T extends Number, V extends Number> double sum(T x, V y) {
        return x.doubleValue() + y.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T x, V y) {
        return x.doubleValue() * y.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T x, V y) {
        return x.doubleValue() / y.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T x, V y) {
        return x.doubleValue() - y.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("2+3.5=" + sum(2, 3.5));
        System.out.println("9/4.5=" + divide(9, 4.5));
        System.out.println("5.5*1.2=" + multiply(5.5, 1.2));
        System.out.println("2-1=" + subtraction(2, 1));
    }
}
