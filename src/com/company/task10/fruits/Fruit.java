package com.company.task10.fruits;

abstract public class Fruit {
    private double weight;

    public Fruit() {
        this.weight = 1;
    }

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    abstract public double val();

    final public void printManufactureInfo() {
        System.out.println("Made In Ukraine!");
    }
}
