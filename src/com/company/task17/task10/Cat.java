package com.company.task17.task10;

public class Cat extends Pet {
    @Override
    public void noise() {
        System.out.println("Mяяу");
    }

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString() + "}";
    }
}
