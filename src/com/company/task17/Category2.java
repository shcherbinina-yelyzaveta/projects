package com.company.task17;

import com.company.task17.task4.Category;
import com.company.task17.task4.Product;

import java.util.*;

public class Category2 {
    private String name;
    private List<Product> products;

    public Category2() {
        this.name = "name";
        this.products = new ArrayList<>();
    }

    public Category2(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category2 category = (Category2) o;

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

    public static void sort(List<Product> products, Scanner scanner) {
        int option = scanOption(scanner);
        switch (option) {
            case 1:
                Collections.sort(products, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });
                break;
            case 2:
                Collections.sort(products, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return o1.getValue() - o2.getValue();
                    }
                });
                break;
            case 3:
            default:
                Collections.sort(products, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return o1.getRating() - o2.getRating();
                    }
                });
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> list1 = new ArrayList<>();
        list1.add(new Product("banana", 25, 5));
        list1.add(new Product("apple", 15, 7));
        sort(list1,scanner);
        List<Product> list2 = new ArrayList<>();
        list2.add(new Product("Iphone 10", 30000, 10));
        list2.add(new Product("Lenovo K5", 4000, 6));
        list2.add(new Product("Iphone 8", 24500, 9));
        sort(list2,scanner);
        Category2[] categories = new Category2[2];
        categories[0] = new Category2("meal", list1);
        categories[1] = new Category2("phones", list2);
        for (Category2 c : categories) {
            c.print();
        }
    }
}
