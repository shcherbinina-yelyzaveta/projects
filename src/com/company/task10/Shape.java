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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;

        Shape shape = (Shape) o;

        return getColor().equals(shape.getColor());
    }

    @Override
    public int hashCode() {
        return getColor().hashCode();
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
