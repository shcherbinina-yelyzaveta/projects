package com.company.task17;

import com.company.task17.task4.Product;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by student on 20.11.2017.
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<Product> queue = new ArrayDeque<>();
        queue.offer(new Product());
        queue.offer(new Product("banana", 25, 10));
        queue.offer(new Product("apple", 15, 10));

        while (queue.size() > 0) {
            System.out.print(queue.poll() + " ");
        }

    }
}
