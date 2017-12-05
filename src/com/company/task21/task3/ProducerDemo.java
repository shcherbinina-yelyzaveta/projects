package com.company.task21.task3;

import java.util.ArrayDeque;
import java.util.Queue;

public class ProducerDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i = 0; i < 100;i++) {
            queue.add(i);
        }
        MyQueue<Integer> myQueue = new MyQueue<>(queue);

        Consumer<Integer> consumer = new Consumer<>(myQueue);
        Producer<Integer> producer = new Producer<>(myQueue);

        Thread t1 = new Thread(consumer);
        Thread t2 = new Thread(producer);
        Thread t3 = new Thread(consumer);

        t1.start();
        t2.start();
        t3.start();
    }
}
