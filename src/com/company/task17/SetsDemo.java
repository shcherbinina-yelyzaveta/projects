package com.company.task17;

import java.util.*;

public class SetsDemo {
    public static Set union(Set<?> set1, Set<?> set2) {
        Set<Object> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }

    public static Set intersect(Set<?> set1, Set<?> set2) {
        Set<Object> result = new HashSet<>();
        result.addAll(set1);
        result.retainAll(set2);
        return result;
    }

    public static void print(Set<?> set) {
        System.out.print("{ ");
        for (Object o : set) {
            System.out.print(o + " ");
        }
        System.out.print("}\n");
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(2);
        System.out.println("Объединение двух множеств");
        print(union(set1, set2));
        System.out.println("Пересечение двух мнужеств");
        print(intersect(set1, set2));
    }
}
