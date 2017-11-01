package com.company.task12.Sizes;

abstract public class Clothes {
    private Sizes size;
    private int value;
    private String color;

    public Clothes() {
        this.size = Sizes.S;
        this.value = 300;
        this.color = "black";
    }

    public Clothes(Sizes size, int value, String color) {
        this.size = size;
        this.value = value;
        this.color = color;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clothes)) return false;

        Clothes clothes = (Clothes) o;

        if (getValue() != clothes.getValue()) return false;
        if (getSize() != clothes.getSize()) return false;
        return getColor() != null ? getColor().equals(clothes.getColor()) : clothes.getColor() == null;
    }

    @Override
    public int hashCode() {
        int result = getSize() != null ? getSize().hashCode() : 0;
        result = 31 * result + getValue();
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "size=" + size +
                ", value=" + value +
                ", color='" + color + '\'' +
                '}';
    }
}
