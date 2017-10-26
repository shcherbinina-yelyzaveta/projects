package com.company.task10.flowers;

public class Carnation extends Flower {
    static public int count = 0;

    public Carnation() {
        count++;
    }

    public Carnation(String country, int days) {
        super(country, days);
        count++;
    }

    public int val() {
        return 15;
    }

    @Override
    public String toString() {
        return "Carnation{ " + super.toString() + "}";
    }
}
