package com.company.task21.task3;

public class Consumer implements Runnable {
    private MyQueue myQueue;

    public Consumer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        while (true) {
            myQueue.get();
        }
    }
}
