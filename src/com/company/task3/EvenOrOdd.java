package com.company.task3;

import java.util.Scanner;

/**
 * Класс, содержащий реализацию проверки введенного числа на четность
 *
 * @date 2017.10.05
 * @autor Liza Shcherbinina
 */
public class EvenOrOdd {
    /**
     * Точка входа в программу
     *
     * @param args - аргументы командой строки
     */
    public static void main(String[] args) {
        EvenOrOdd obj = new EvenOrOdd();
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        System.out.println("Введите число на проверку или несколько чисел через пробел " +
                "(в случае нажатия Enter следующее число Вы сможетемввести после отображения предыдущих результатов!)");
        while (scanner.hasNextInt()) {
            value = scanner.nextInt();
            if (obj.evenOrOdd(value))
                System.out.println("Число " + value +" четное");
            else System.out.println("Число " + value +" нечетное");
        }

    }

    /**
     * Метод, производящий проверку переданного числа на четность
     *
     * @param value - число, которое проверяется на четность
     * @return результат проверки
     */
    public boolean evenOrOdd(int value) {
        boolean tmp = false;
        if (value % 2 == 0)
            tmp = true;
        return tmp;
    }

}
