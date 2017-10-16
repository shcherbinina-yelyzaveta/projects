package com.company.task8;

/**
 * Создать класс Person, который содержит:
 * a) поля fullName, age.
 * б) методы move() и talk().
 * в) Добавьте два конструктора  - Person() и Person(fullName, age).
 * Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
 * <p>
 * Created by Liza on 16.10.2017.
 */
public class Person {
    String fullName;
    int age;

    Person() {
        this.fullName = "Somebody";
        this.age = 30;
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void move() {
        System.out.println(this.fullName + " move");
    }

    void talk() {
        System.out.println(this.fullName + " talk");
    }


}
