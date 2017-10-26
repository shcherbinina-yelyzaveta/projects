package com.company.task9;

public class Circle {
    private double radius;
    static final double PI = 3.1415;

    public Circle() {
        this.radius = 5;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * Math.pow(radius, 2);
    }

    public double circumference() {
        return 2 * PI * radius;
    }

    public void print() {
        System.out.println("R = " + radius);
        System.out.println("Площадь круга = " + area());
        System.out.println("Длина окружности = " + circumference());
    }

    public static void main(String[] args) {
        Circle[] array = new Circle[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Circle((i+1)* 5);
            array[i].print();
        }
    }
}
