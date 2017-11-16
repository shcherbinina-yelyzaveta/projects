package com.company.task15;

public class CookableMain {
    public static void main(String[] args) {
        Food f = new Food();
        Cookable c = new Cookable() {
            @Override
            public void cook() {
                System.out.println("I'm cooking anonymously!");
            }
        };
        f.prepare(c);
    }
}
