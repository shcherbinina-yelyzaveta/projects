package com.company.task3;

import java.util.Scanner;

/**
 * Класс, содержащий реализацию нахождения суммы двух введенных чисел
 *
 * @date 2017.10.05
 * @autor Liza Shcherbinina
 */
public class Sum {
    /**
     * Точка входа в программу
     *
     * @param args - аргументы командрой строки
     */
    public static void main(String[] args) {
        Sum obj = new Sum();
        int value1, value2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для начала работы введите что-нибудь");
        while (scanner.hasNext()) {
            System.out.println("Вводите числа через Enter");
            value1 = obj.scan();
            value2 = obj.scan();
            System.out.println("Сумма чисел " + value1 + " и " + value2 + " равна " + obj.sum(value1, value2));
        }

    }

    /**
     * Метод нахождения суммы
     *
     * @param value1 первый аргумент
     * @param value2 второй агрумент
     * @return сумма аргументов
     */
    public int sum(int value1, int value2) {
        return value1 + value2;
    }

    /**
     * Метод считывания чисел
     *
     * @return введенное пользователем число
     */
    public int scan() {
        int tmp = 0;
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt())
            tmp = scanner.nextInt();
        else System.out.println("Ошибка! Введенные данные расцениваются как 0");
        return tmp;
    }
}
