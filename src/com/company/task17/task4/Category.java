package com.company.task17.task4;

import java.util.Comparator;
import java.util.*;

public class Category {
    private String name;
    private Set<Product> products;

    public Category() {
        this.name = "name";
        this.products = new HashSet<>();
    }

    public Category(String name, Set<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        return products != null ? products.equals(category.products) : category.products == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (products != null ? products.hashCode() : 0);
        return result;
    }

    public void print() {
        System.out.println(this.name);
        for (Product p : products) {
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }

    public static int scanOption(Scanner scanner) {
        int result = 0;
        System.out.println("Сортировать по:");
        System.out.println("1 - по имени");
        System.out.println("2 - по цене");
        System.out.println("3 - по рейтингу");
        if (scanner.hasNextInt()) {
            result = scanner.nextInt();
        }
        return result;
    }

    public static SortedSet<Product> sort(Scanner scanner) {
        SortedSet<Product> sorted;
        int option = scanOption(scanner);
        switch (option) {
            case 1:
                sorted = new TreeSet<>(new Comparator<Product>() {
                    @Override
                    public int compare(Product p1, Product p2) {
                        return p1.getName().compareTo(p2.getName());
                    }
                });
                break;
            case 2:
                sorted = new TreeSet<>(new Comparator<Product>() {
                    @Override
                    public int compare(Product p1, Product p2) {
                        return p1.getValue() - p2.getValue();
                    }
                });
                break;
            case 3:
            default:
                sorted = new TreeSet<>(new Comparator<Product>() {
                    @Override
                    public int compare(Product p1, Product p2) {
                        return p1.getRating() - p2.getRating();
                    }
                });
                break;
        }
        return sorted;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortedSet<Product> set1 = sort(scanner);
        set1.add(new Product("banana", 25, 5));
        set1.add(new Product("apple", 15, 7));
        SortedSet<Product> set2 = sort(scanner);
        set2.add(new Product("Iphone 10", 30000, 10));
        set2.add(new Product("Lenovo K5", 4000, 6));
        set2.add(new Product("Iphone 8", 24500, 9));
        Category[] categories = new Category[2];
        categories[0] = new Category("meal", set1);
        categories[1] = new Category("phones", set2);
        for (Category c : categories) {
            c.print();
        }
    }
}
