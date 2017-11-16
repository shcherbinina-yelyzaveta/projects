package com.company.task17.task4;

import java.util.*;

public class Category {
    private String name;
    private Product[] products;

    public Category() {
        this.name = "name";
        this.products = new Product[1];
    }

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;

        Category category = (Category) o;

        if (getName() != null ? !getName().equals(category.getName()) : category.getName() != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(getProducts(), category.getProducts());
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + Arrays.hashCode(getProducts());
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }

    public void print() {
        Set<Product> set = new TreeSet<>();
        set.addAll(Arrays.asList(this.products));
        System.out.println(this.name);
        for (Product p : set) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        Product[] products = new Product[2];
        products[0] = new Product("banana", 25, 5);
        products[1] = new Product("apple", 15, 7);
        Product[] products1 = new Product[3];
        products1[0] = new Product("Iphone 10", 30000, 10);
        products1[1] = new Product("Lenovo K5", 4000, 6);
        products1[2] = new Product("Iphone 8", 24500, 9);
        Category[] categories = new Category[2];
        categories[0] = new Category("meal", products);
        categories[1] = new Category("phones", products1);
        for (Category c : categories) {
            c.print();
        }
    }
}
