package com.company.task8;

/**
 * Класс Phone. (Задание с урока)
 * a) Создайте класс Phone, который содержит переменные number, model и weight.
 * б) Создайте три экземпляра этого класса.
 * в) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
 * Выводит на консоль сообщение “Звонит {name}”. getPhoneNumber – возвращает номер телефона.
 * Вызвать эти методы для каждого из объектов.
 * г) Добавить конструктор в класс Phone, который принимает на вход параметры для инициализации переменных класса.
 * д) Добавить конструктор без параметров.
 * е) Вызвать из конструктора с параметрами конструктор по умолчанию.
 * ж) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
 * з) Создать метод sendMessage  с аргументами переменной длины. Данный метод принимает на вход номера телефонов,
 *    которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
 * и) Изменить класс Phone в соответствии с концепцией JavaBean.
 * к) Реализовать подсчет количества созданных телефонов с помощью статической переменной.
 * Вызвать этот метод.
 * <p>
 * Created by Liza on 16.10.2017.
 */
public class Phone {
    private String number;
    private String model;
    private int weight;
    private static int count = 0;

    Phone() {
        this.number = "0000";
        this.model = "something";
        this.weight = 10;
        count++;
    }

    Phone(String number, String model, int weight) {
        this();
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " номер: " + number);
    }

    void sendMassage(String... number) {
        System.out.println("Отправить сообщение:");
        for (String tmp : number) {
            System.out.println(tmp);
        }
    }
}
