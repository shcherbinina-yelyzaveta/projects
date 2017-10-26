package com.company.task10.flowers;

public class Tulip extends Flower {
    static public int count = 0;

    public Tulip() {
        count++;
    }

    public Tulip(String country, int days) {
        super(country, days);
        count++;
    }

    public int val() {
        return 30;
    }

    @Override
    public String toString() {
        return "Tulip{ " + super.toString() + "}";
    }
}
