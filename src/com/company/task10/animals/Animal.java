package com.company.task10.animals;

import java.io.Serializable;

abstract public class Animal implements Serializable {
    private String food;
    private String location;

    public Animal() {
        this.food = "---";
        this.location = "---";
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    abstract public void makeNoise();

    abstract public void eat();

    public void sleep() {
        System.out.println("Zzzzzz");
    }

    @Override
    public String toString() {
        return "food='" + food + '\'' +
                ", location='" + location + '\'';
    }
}
