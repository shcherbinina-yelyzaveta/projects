package com.company.task7;

import java.util.Arrays;

/**
 * Изменить сортировку выбором - исключите обмен значений, если найденный минимальный элемент равен array[i].
 *
 * Created by Liza on 15.10.2017
 */
public class SelectionSorter {
    public static void main(String[] args) {
        SelectionSorter.sort(new int[]{4, 2, 6, 1, 2, 8});
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));// i - номер текущего шага
            int k = i;
            int x = array[i];
            for (int j = i + 1; j < array.length; j++) {    // цикл выбора наименьшего элемента
                if (array[j] < x) {
                    k = j;    // k - индекс наименьшего элемента
                    x = array[j];
                }
            }
            if (array[k] == array[i]) {
                System.out.println(i);
                continue;
            }
            array[k] = array[i];
            array[i] = x; // меняем местами наименьший с array[i]
        }
        System.out.println(Arrays.toString(array));
    }
}
