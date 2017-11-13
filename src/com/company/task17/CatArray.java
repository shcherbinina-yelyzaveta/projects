package com.company.task17;

import com.company.task10.animals.Cat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 13.11.2017.
 */
public class CatArray {
    public static void main(String[] args) {
        List<Cat> array = new ArrayList<>();
        array.add(new Cat(4));
        array.add(new Cat("meat", "home", 15));
        array.add(new Cat());

        for (Cat c : array) {
            System.out.println(c);
        }
    }
}
