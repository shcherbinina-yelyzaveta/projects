package com.company.task6;

/**
 * Created by Liza Shcherbinina on 09.10.2017.
 */
public class MultidimensionalStringArray {
    public static void main(String[] args) {
        String[][] array = new String[3][6];
        array = MultidimensionalStringArray.identification(array);
        MultidimensionalStringArray.print(array);

    }

    public static String[][] identification(String[][] array) {
        char a = 'a';
        String str = null;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                str = a + Integer.toString(j + 1);
                array[i][j] = str;
            }
            a++;
        }
        return array;
    }

    public static void print(String[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
