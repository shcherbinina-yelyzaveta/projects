package com.company.task12.Sizes;

public class Tie extends Clothes implements ManClothes {
    public Tie() {
    }

    public Tie(Sizes size, int value, String color) {
        super(size, value, color);
    }

    @Override
    public void toDressMan() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Tie" + super.toString();
    }
}
