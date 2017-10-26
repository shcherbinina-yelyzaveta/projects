package com.company.task10;

/**
 * Created by Liza on 23.10.2017.
 */
public class Circle extends Shape {
    private double radius;
    private double x;
    private double y;

    public Circle() {
        this.radius = 1;
        this.x = 0;
        this.y = 0;
    }

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public Circle(String color, double radius, double x, double y) {
        super(color);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void draw() {
        System.out.println("Рисуем круг. Центр с координатами (" + x + ";" + y + "). Радиус = " + radius +
                " , цвет " + this.getColor());
    }
}
