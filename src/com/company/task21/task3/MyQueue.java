package com.company.task21.task3;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue {
    private Queue<Integer> n = new ArrayDeque<>();

    public MyQueue(Queue<Integer> n) {
        this.n = n;
    }

    public Queue<Integer> getN() {
        return n;
    }

    public synchronized Integer get() {
        while (n.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Пoлyчeнo: %s потоком %s%n", n.peek(), Thread.currentThread().getName());
        return n.poll();
    }

    public synchronized void put(int n) {
        this.n.add(n);
        System.out.println("Oтпpaвлeнo: " + n);
        notifyAll();
    }
}
