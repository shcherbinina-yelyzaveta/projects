package com.company.task4;

/**
 * Вычислить среднее значение вещественных чисел передаваемых на вход программы в качестве аргументов. Используйте цикл for
 *
 * @author Liza Shcherbinina
 * @date 2017.10.07
 */
public class Mean {
    public static void main(String[] args) {
        double result = 0;
        int count = 0;
        for (String str : args) {
            result += Double.parseDouble(str);
            count++;
        }
        result /= count;
        System.out.println("Среднее значение = " + result);
    }
}
