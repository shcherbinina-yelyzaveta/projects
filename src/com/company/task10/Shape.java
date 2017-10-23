package com.company.task10;

/**
 * Created by Liza on 23.10.2017.
 */
abstract public class Shape {
    private String color;

    public Shape() {
        this.color = "color";
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract public void draw();
}
