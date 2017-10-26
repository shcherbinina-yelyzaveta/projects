package com.company.task10.animals;

public class Horse extends Animal {
    private int ponytailLength;

    public Horse() {
        this.ponytailLength = 50;
    }

    public Horse(int ponytailLength) {
        this.ponytailLength = ponytailLength;
    }

    public Horse(String food, String location, int ponytailLength) {
        super(food, location);
        this.ponytailLength = ponytailLength;
    }

    public int getPonytailLength() {
        return ponytailLength;
    }

    public void setPonytailLength(int ponytailLength) {
        this.ponytailLength = ponytailLength;
    }

    public void makeNoise() {
        System.out.println("IGOGO!");
    }

    public void eat() {
        System.out.println("Я люблю кушать травку!");
    }

    @Override
    public String toString() {
        return "Horse{" + super.toString() +
                ", ponytailLength=" + ponytailLength +
                '}';
    }
}
