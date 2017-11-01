package com.company.task12.Sizes;

public class Skirt extends Clothes implements WomanClothes {
    public Skirt() {
    }

    public Skirt(Sizes size, int value, String color) {
        super(size, value, color);
    }

    @Override
    public void toDressWoman() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Skirt" + super.toString();
    }
}
