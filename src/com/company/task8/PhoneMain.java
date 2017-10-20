package com.company.task8;

/**
 * Created by Liza on 16.10.2017.
 */
public class PhoneMain {
    public static void main(String[] args) {
        Phone obj1 = new Phone();
        Phone obj2 = new Phone();
        Phone obj3 = new Phone();

        obj1.setNumber("5152544");
        obj1.setModel("Lenovo K5");
        obj1.setWeight(35);
        obj1.receiveCall("Liza");
        System.out.println(obj1.getNumber());

        obj2.setNumber("4445442");
        obj2.setModel("Iphone 5s");
        obj2.setWeight(20);
        obj2.receiveCall("Vitya");
        System.out.println(obj2.getNumber());

        obj3.setNumber("7745895");
        obj3.setModel("Iphone 6s");
        obj3.setWeight(25);
        obj3.receiveCall("Bogdan");
        System.out.println(obj3.getNumber());

        Phone obj4 = new Phone();
        System.out.println(obj4.getModel() + " " + obj4.getNumber());

        Phone obj5 = new Phone("7254489", "Samsung S8", 25);
        obj5.receiveCall("Alex", obj5.getNumber());
        obj5.sendMassage(obj1.getNumber(), obj2.getNumber(), obj3.getNumber(), obj4.getNumber());

        System.out.println("Количество объектов класса Phone = " + Phone.getCount());
    }
}
