package com.company.task17;

import com.company.task17.task4.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by student on 20.11.2017.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<Product> products1 = new ArrayList<>();
        products1.add(new Product());
        products1.add(new Product("banana", 25, 10));
        products1.add(new Product("apple", 15, 10));

        System.out.println("new collection:");
        print(getProductsWithNullValue(products1));
        System.out.println("old collection:");
        print(products1);
    }

    public static List<Product> getProductsWithNullValue(List<Product> products1) {
        List<Product> products2 = new ArrayList<>();
        Iterator<Product> iterator = products1.iterator();
        while (iterator.hasNext()) {
            Product p = iterator.next();
            if (p.getValue() == 0) {
                products2.add(p);
                iterator.remove();
            }
        }
        return products2;
    }

    public static void print(List<Product> list) {
        Iterator<Product> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
