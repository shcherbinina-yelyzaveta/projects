package com.company.task17.task8;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Liza Shcherbinina on 24.11.2017.
 */
public class ToyTreeMap {
    public static void main(String[] args) {
        Map<String, Toy> map = new TreeMap<>();
        map.put("Car", new Toy("Car", 50));
        map.put("Toy", new Toy());
        map.put("Doll", new Toy("Doll", 50));

        printMap(map);
        printKeys(map);
        printValues(map);
    }

    public static void printValues(Map<String, Toy> map) {
        System.out.println("-------Values:-------");
        Collection<Toy> values = map.values();
        for (Toy t : values) {
            System.out.println(t);
        }
    }

    public static void printKeys(Map<String, Toy> map) {
        System.out.println("--------Keys:--------");
        Set<String> keys = map.keySet();
        for (String s : keys) {
            System.out.println(s);
        }
    }

    public static void printMap(Map<String, Toy> map) {
        System.out.println("--------Map:----------");
        Set<Map.Entry<String, Toy>> set = map.entrySet();
        for (Map.Entry<String, Toy> m : set) {
            System.out.println(m.getKey() + " - " + m.getValue());
        }
    }
}
