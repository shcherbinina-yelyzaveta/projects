package com.company.task8;

/**
 * Created by Liza on 16.10.2017.
 */
public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Liza Shcherbinina", 19);
        System.out.println(person1.fullName + " " + person1.age);
        System.out.println(person2.fullName + " " + person2.age);
        person1.move();
        person2.move();
        person1.talk();
        person2.talk();
    }
}
