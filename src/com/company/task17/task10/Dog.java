package com.company.task17.task10;

public class Dog extends Pet {
    @Override
    public void noise() {
        System.out.println("Гав гав");
    }

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + "}";
    }
}
