package com.company.task8;

/**
 * Created by student on 16.10.2017.
 */
public class Phone {
    String number;
    String model;
    int weight;

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    String getPhoneNumber() {
        return this.number;
    }
}
