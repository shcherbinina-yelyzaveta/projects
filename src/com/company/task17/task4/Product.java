package com.company.task17.task4;

public class Product implements Comparable<Product> {
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

    @Override
    public int compareTo(Product o) {
        int result = this.getName().compareTo(o.getName());
        if (result != 0) {
            return result;
        }
        result = this.getRating() - o.getRating();
        if (result != 0) {
            return result;
        }
        return this.getValue() - o.getValue();
    }
}
