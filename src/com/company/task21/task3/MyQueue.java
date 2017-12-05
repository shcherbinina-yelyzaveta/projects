package com.company.task21.task3;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue<T> {
    private Queue<T> n = new ArrayDeque<>();
    boolean valueSet = false;

    public MyQueue(Queue<T> n) {
        this.n = n;
    }

    public Queue<T> getN() {
        return n;
    }

    public synchronized T get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Пoлyчeнo: %s потоком %s%n", n.peek(), Thread.currentThread().getName());
        valueSet = false;
        notify();
        return n.poll();
    }

    public synchronized void put(T n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valueSet = true;
        this.n.offer(n);
        System.out.println("Oтпpaвлeнo: " + n);
        notifyAll();
    }
}
