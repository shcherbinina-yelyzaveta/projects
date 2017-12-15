package com.company.task17.task10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PetsDemo {
    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<>();
        pets.put("Cat1", new Cat(4, "grey"));
        pets.put("Dog", new Dog(6, "black"));
        pets.put("Cat2", new Cat(5, "white"));
        pets.put("Parrot", new Parrot(4, "white"));

        printMap(pets);
        printKeys(pets);
        printValues(pets);
    }

    public static void printValues(Map<String, Pet> map) {
        System.out.println("-------Values:-------");
        Collection<Pet> values = map.values();
        for (Pet t : values) {
            System.out.println(t);
        }
    }

    public static void printKeys(Map<String, Pet> map) {
        System.out.println("--------Keys:--------");
        Set<String> keys = map.keySet();
        for (String s : keys) {
            System.out.println(s);
        }
    }

    public static void printMap(Map<String, Pet> map) {
        System.out.println("--------Map:----------");
        Set<Map.Entry<String, Pet>> set = map.entrySet();
        for (Map.Entry<String, Pet> m : set) {
            System.out.println(m.getKey() + " - " + m.getValue());
        }
    }
}
