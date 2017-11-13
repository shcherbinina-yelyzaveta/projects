package com.company.task16;

import com.company.task10.animals.Animal;
import com.company.task10.animals.Cat;

import java.io.Serializable;

/**
 * Created by student on 10.11.2017.
 */
public class Task1Demo<T extends Comparable, V extends Animal & Serializable, M extends Number> {
    private T type1;
    private V type2;
    private M type3;

    public Task1Demo(T type1, V type2, M type3) {
        this.type1 = type1;
        this.type2 = type2;
        this.type3 = type3;
    }

    public T getType1() {
        return type1;
    }

    public V getType2() {
        return type2;
    }

    public M getType3() {
        return type3;
    }

    public void showInfo() {
        System.out.println("Type 1 - " + type1.getClass().getName());
        System.out.println("Type 2 - " + type2.getClass().getName());
        System.out.println("Type 3 - " + type3.getClass().getName());
    }

    public static void main(String[] args) {
        Task1Demo<String, Animal, Integer> obj = new Task1Demo<>("Hello", new Cat(), 5);
        obj.showInfo();

        System.out.println("Type 1 - " + obj.getType1());
        System.out.println("Type 2 - " + obj.getType2());
        System.out.println("Type 3 - " + obj.getType3());
    }
}
