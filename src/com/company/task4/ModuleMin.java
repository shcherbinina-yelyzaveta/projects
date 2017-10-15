package com.company.task4;

import java.util.Scanner;

/**
 * Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел.
 * Для вычисления модуля используйте тернарную условную операцию.
 *
 * @author Liza Shcherbinina
 * @date 2017.10.07
 */
public class ModuleMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int value1 = ModuleMin.input(scanner);
        System.out.println("Введите второе число");
        int value2 = ModuleMin.input(scanner);
        System.out.println("Введите третье число");
        int value3 = ModuleMin.input(scanner);
        System.out.println("Меньшее по модулю число: " + ModuleMin.moduleMin(value1, value2, value3));
    }

    public static int input(Scanner scanner) {
        int tmp = 0;
        if (scanner.hasNextInt()) {
            tmp = scanner.nextInt();
        }
        return tmp;
    }

    public static int moduleMin(int value1, int value2, int value3) {
        int temp = Math.abs(value1) < Math.abs(value2) ? value1 : value2;
        int result = Math.abs(value3) < Math.abs(temp) ? value3 : temp;
        return result;
    }
}
