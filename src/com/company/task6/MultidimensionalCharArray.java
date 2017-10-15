package com.company.task6;

import java.util.Arrays;

/**
 * Created by Liza Shcherbinina on 09.10.2017.
 */
public class MultidimensionalCharArray {
    public static void main(String[] args) {
        char[][] array = {
                {'a','b'},
                {'c','d'},
                {'e','f'},
                {'g','h'}
        };
        System.out.println(Arrays.deepToString(array));
    }
}
