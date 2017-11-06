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
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "Somebody";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person(Person person) {
        this.fullName = person.getFullName();
        this.age = person.getAge();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void move() {
        System.out.println(this.fullName + " move");
    }

    void talk() {
        System.out.println(this.fullName + " talk");
    }

    @Override
    public String toString() {
        String s = String.format("%s is %d years old!", fullName, age);
        return s;
    }
}
