package com.company.task12;

/**
 * Created by student on 30.10.2017.
 */
public enum Seasons {
    WINTER(-10), SPRING(10), SUMMER(20), AUTUMN(8);

    private int temperature;

    Seasons(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
