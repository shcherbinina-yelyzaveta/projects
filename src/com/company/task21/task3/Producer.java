package com.company.task21.task3;

public class Producer implements Runnable {
    private MyQueue myQueue;

    public Producer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }


    @Override
    public void run() {
        int i = 0;
        while (true) {
            myQueue.put(i++);
        }
    }
}
