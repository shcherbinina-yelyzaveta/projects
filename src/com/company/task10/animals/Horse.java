package com.company.task10.animals;

import com.company.task20.Halter;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {
    private Halter halter;
    private int ponytailLength;

    public Horse() {
        this.ponytailLength = 50;
        halter = new Halter("smth");
    }

    public Horse(int ponytailLength) {
        this.ponytailLength = ponytailLength;
        halter = new Halter("smth");
    }

    public Horse(String food, String location, int ponytailLength, Halter halter) {
        super(food, location);
        this.ponytailLength = ponytailLength;
        this.halter = halter;
    }

    public Halter getHalter() {
        return halter;
    }

    public void setHalter(Halter halter) {
        this.halter = halter;
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
                ", halter=" + halter +
                ", ponytailLength=" + ponytailLength +
                '}';
    }
}
