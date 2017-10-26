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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.getRadius(), getRadius()) != 0) return false;
        if (Double.compare(circle.getX(), getX()) != 0) return false;
        return Double.compare(circle.getY(), getY()) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getRadius());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getX());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getY());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
