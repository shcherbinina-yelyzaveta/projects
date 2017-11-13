package com.company.task17;

import com.company.task8.Person;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by student on 13.11.2017.
 */
public class PersonTreeSet {
    public static void main(String[] args) {
        SortedSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("Щербинина Елизавета Николаевна", 19));
        treeSet.add(new Person("Ященко Александр Владимирович", 21));
        treeSet.add(new Person("Щербинина Ольга Александовна", 48));
        treeSet.add(new Person("Маценюк Богдан Вячеславович", 20));

        for (Person p : treeSet) {
            System.out.println(p);
        }
    }
}
