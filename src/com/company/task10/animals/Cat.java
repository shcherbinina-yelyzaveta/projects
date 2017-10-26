package com.company.task10.animals;

public class Cat extends Animal {
    private int mustacheLength;

    public Cat() {
        this.mustacheLength = 10;
    }

    public Cat(int mustacheLength) {
        this.mustacheLength = mustacheLength;
    }

    public Cat(String food, String location, int mustacheLength) {
        super(food, location);
        this.mustacheLength = mustacheLength;
    }

    public int getMustacheLength() {
        return mustacheLength;
    }

    public void setMustacheLength(int mustacheLength) {
        this.mustacheLength = mustacheLength;
    }

    public void makeNoise() {
        System.out.println("MYAU MYAU MYAU!!!");
    }

    public void eat() {
        System.out.println("Я люблю кушать рыбку!");
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString() +
                ", mustacheLength=" + mustacheLength +
                '}';
    }
}
