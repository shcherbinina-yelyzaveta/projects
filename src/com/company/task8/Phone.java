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
 * Вызвать этот метод.
 *
 * Created by Liza on 16.10.2017.
 */
public class Phone {
    String number;
    String model;
    int weight;

    Phone() {
        this.number = "0000";
        this.model = "something";
        this.weight = 10;
    }

    Phone(String number, String model, int weight) {
        this();
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    String getPhoneNumber() {
        return this.number;
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " номер: " + number);
    }
}
