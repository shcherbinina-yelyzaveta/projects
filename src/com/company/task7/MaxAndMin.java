package com.company.task7;

import java.util.Arrays;

/**
 * Создать двухмерный массив 5х8 и инициализировать его с помощью блока для инициализации.
 * Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
 * Распечатать оба массива.
 *
 * Created by Liza on 15.10.2017
 */
public class MaxAndMin {
    public static void main(String[] args) {
        int[][] array = {
                {0, 5, 4, 20, 6, 9, 2, 3},
                {2, 25, 14, 3, 13, 8, 1, 7},
                {5, 0, 9, 6, 5, 4, 8, 3},
                {5, 4, 78, 6, 3, 14, 8, 11},
                {8, 14, 65, 2, 70, 4, 0, 1}
        };
        System.out.println(Arrays.deepToString(array));
        MaxAndMin.maxAndMin(array);
    }

    public static void maxAndMin(int[][] array) {
        int[][] resultArray = new int[5][2];
        int max = 0, min = 0;
        for (int i = 0; i < array.length; i++) {
            max = array[i][0];
            min = array[i][0];
            for (int j = 0; j < array[i].length - 1; j++) {
                if (max < array[i][j + 1]) {
                    max = array[i][j + 1];
                }
                if (min > array[i][j + 1]) {
                    min = array[i][j + 1];
                }
            }
            resultArray[i][0] = max;
            resultArray[i][1] = min;
        }
        System.out.println(Arrays.deepToString(resultArray));
    }
}
