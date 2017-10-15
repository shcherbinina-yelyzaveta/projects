package com.company.task7;

import java.util.Arrays;

/**
 * Изменить программу сортировки пузырьком:
 * а) добавить возможность досрочного окончания сортировки;
 * б) программа написана таким образом, что минимальный элемент "всплывает" в начало массива.
 * Измените программу так чтобы минимальный элемент "всплывал" в конец массива
 * (внутренний цикл for должен перебирать элементы не с конца, а с начала).
 *
 * Created by Liza on 15.10.2017
 */
public class BubbleSorter {
    public static void main(String[] args) {
        BubbleSorter.sort(new int[]{9, 7, 8, 5, 4, 6, 3, 2, 0, 1});
    }

    public static void sort(int[] array) {
        boolean swap = false;
        for (int i = 0; i < array.length; i++) {
            swap = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] > array[j]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    swap = true;
                }
                if (!swap) {
                    System.out.println(i + " " + j);
                }
            }
            if (!swap) {
                System.out.println(i + " ");
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
