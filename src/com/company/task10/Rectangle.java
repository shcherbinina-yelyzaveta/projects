package com.company.task10;

/**
 * Created by Liza on 23.10.2017.
 */
public class Rectangle extends Shape {
    private double x1, y1, x2, y2;

    public Rectangle() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 1;
        this.y2 = 2;
    }

    public Rectangle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Rectangle(String color, double x1, double y1, double x2, double y2) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void draw() {
        System.out.println("Рисуем прямоугольник с координатами: левый нижний угол (" + x1 + ";" + y1 +
                "), правый верхний угол (" + x2 + ";" + y2 + ")" + ". Цвет " + this.getColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.getX1(), getX1()) != 0) return false;
        if (Double.compare(rectangle.getY1(), getY1()) != 0) return false;
        if (Double.compare(rectangle.getX2(), getX2()) != 0) return false;
        return Double.compare(rectangle.getY2(), getY2()) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getX1());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getY1());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getX2());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getY2());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }
}
