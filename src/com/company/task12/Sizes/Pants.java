package com.company.task12.Sizes;

public class Pants extends Clothes implements ManClothes, WomanClothes {
    public Pants() {
    }

    public Pants(Sizes size, int value, String color) {
        super(size, value, color);
    }

    @Override
    public void toDressMan() {
        System.out.println(this);
    }

    @Override
    public void toDressWoman() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Pants" + super.toString();
    }
}
