package com.company.task17.task4;

public class Product {
    private String name;
    private int value;
    private int rating;

    public Product() {
        this.name = "----";
        this.value = 0;
        this.rating = 0;
    }

    public Product(String name, int value, int rating) {
        this.name = name;
        this.value = value;
        this.rating = rating;
    }

    public Product(Product product) {
        this.name = product.name;
        this.value = product.value;
        this.rating = product.rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (getValue() != product.getValue()) return false;
        if (getRating() != product.getRating()) return false;
        return getName() != null ? getName().equals(product.getName()) : product.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getValue();
        result = 31 * result + getRating();
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", rating=" + rating +
                '}';
    }

    public int compareName(String name) {
        return this.getName().compareTo(name);
    }

    public int compareValue(int value) {
        return this.getValue() - value;
    }

    public int compareRating(int rating) {
        return this.getRating() - rating;
    }
}
