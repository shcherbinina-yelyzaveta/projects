package com.company.task21.task3;

public class Producer<T> implements Runnable {
    private MyQueue<T> myQueue;

    public Producer(MyQueue<T> myQueue) {
        this.myQueue = myQueue;
    }


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            myQueue.put(this.myQueue.getN().element());
        }
    }
}
