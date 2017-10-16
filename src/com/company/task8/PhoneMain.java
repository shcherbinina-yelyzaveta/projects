package com.company.task8;

/**
 * Created by Liza on 16.10.2017.
 */
public class PhoneMain {
    public static void main(String[] args) {
        Phone obj1 = new Phone();
        Phone obj2 = new Phone();
        Phone obj3 = new Phone();

        obj1.number = "5152544";
        obj1.model = "Lenovo K5";
        obj1.weight = 35;
        obj1.receiveCall("Liza");
        System.out.println(obj1.getPhoneNumber());

        obj2.number = "4445442";
        obj2.model = "Iphone 5s";
        obj3.weight = 20;
        obj2.receiveCall("Vitya");
        System.out.println(obj2.getPhoneNumber());

        obj3.number = "7745895";
        obj3.model = "Iphone 6s";
        obj3.weight = 25;
        obj3.receiveCall("Bogdan");
        System.out.println(obj3.getPhoneNumber());

        Phone obj4 = new Phone();
        System.out.println(obj4.model + " " + obj4.getPhoneNumber());

        Phone obj5 = new Phone("7254489", "Samsung S8", 25);
        obj5.receiveCall("Alex", obj5.getPhoneNumber());
    }
}
