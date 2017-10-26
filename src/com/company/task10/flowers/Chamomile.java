package com.company.task10.flowers;

public class Chamomile extends Flower {
    static public int count = 0;

    public Chamomile() {
        count++;
    }

    public Chamomile(String country, int days) {
        super(country, days);
        count++;
    }

    public int val() {
        return 20;
    }

    @Override
    public String toString() {
        return "Chamomile{ " + super.toString() + "}";
    }
}
