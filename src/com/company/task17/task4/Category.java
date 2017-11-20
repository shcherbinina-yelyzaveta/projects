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
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(products, category.products);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(products);
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
                ", products=" + Arrays.toString(products) +
                '}';
    }

    public int scanOption(Scanner scanner) {
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

    public void sort(Scanner scanner) {
        int option = scanOption(scanner);
        switch (option) {
            case 1:
                for (int i = 0; i < products.length - 1; i++) {
                    for (int j = 0; j < products.length - i - 1; j++) {
                        if (products[j].compareName(products[j + 1].getName()) == -1) {
                            swap(j, j + 1);
                        }
                    }
                }
                break;
            case 2:
                for (int i = 0; i < products.length - 1; i++) {
                    for (int j = 0; j < products.length - i - 1; j++) {
                        if (products[j].compareValue(products[j + 1].getValue()) > 0) {
                            swap(j, j + 1);
                        }
                    }
                }
                break;
            case 3:
                for (int i = 0; i < products.length - 1; i++) {
                    for (int j = 0; j < products.length - i - 1; j++) {
                        if (products[j].compareRating(products[j + 1].getRating()) > 0) {
                            swap(j, j + 1);
                        }
                    }
                }
                break;
            default:
                break;
        }
    }

    public void swap(int i, int j) {
        Product tmp = new Product(this.products[i]);
        products[i] = products[j];
        products[j] = tmp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
            c.sort(scanner);
            c.print();
        }
    }
}
