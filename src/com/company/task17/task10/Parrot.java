package com.company.task17.task10;

public class Parrot extends Pet {
    @Override
    public void noise() {
        System.out.println("фыр фыр фыр");
    }

    public Parrot() {
    }

    public Parrot(int age, String color) {
        super(age, color);
    }

    @Override
    public String toString() {
        return "Parrot{" + super.toString() + "}";
    }
}
