package com.company.task10.flowers;

public class Rose extends Flower {
    static public int count = 0;

    public Rose() {
        count++;
    }

    public Rose(String country, int days) {
        super(country, days);
        count++;
    }

    public int val() {
        return 40;
    }

    @Override
    public String toString() {
        return "Rose{ " + super.toString() + "}";
    }
}
