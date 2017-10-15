package com.company.task3;

/**
 * Класс, реализующий методы проверки приведения типов
 *
 * @date 2017.10.05
 * @autor Liza Shcherbinina
 */
public class MethodsOfCast {
    /**
     * Точка входа в программу
     *
     * @param args - аргументы командой строки
     */
    public static void main(String[] args) {
        System.out.println("It's MethodsOfCast class!");
    }

    /**
     * Метод приведения byte к другим типам
     */
    public void fromByte() {
        byte a = 4;
        short b = a;
        char c = (char) a;
        int d = a;
        long e = a;
        float f = a;
        double g = a;
    }

    /**
     * Метод приведения short к другим типам
     */
    public void fromShort() {
        short a = 4;
        byte b = (byte) a;
        char c = (char) a;
        int d = a;
        long e = a;
        float f = a;
        double g = a;
    }

    /**
     * Метод приведения char к другим типам
     */
    public void fromChar() {
        char a = 'a';
        byte b = (byte) a;
        short c = (short) a;
        int d = a;
        long e = a;
        float f = a;
        double g = a;
    }

    /**
     * Метод приведения int к другим типам
     */
    public void fromInt() {
        int a = 4;
        byte b = (byte) a;
        short c = (short) a;
        char d = (char) a;
        long e = a;
        float f = a;
        double g = a;
    }

    /**
     * Метод приведения long к другим типам
     */
    public void fromLong() {
        long a = 4;
        byte b = (byte) a;
        short c = (short) a;
        char d = (char) a;
        int e = (int) a;
        float f = a;
        double g = a;
    }

    /**
     * Метод приведения float к другим типам
     */
    public void fromFloat() {
        float a = 4.0f;
        byte b = (byte) a;
        short c = (short) a;
        char d = (char) a;
        int e = (int) a;
        long f = (long) a;
        double g = a;
    }

    /**
     * Метод приведения double к другим типам
     */
    public void fromDouble() {
        double a = 4;
        byte b = (byte) a;
        short c = (short) a;
        char d = (char) a;
        int e = (int) a;
        long f = (long) a;
        float g = (float) a;
    }
}
