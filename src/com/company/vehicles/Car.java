package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

/**
 * Создать класс Car в пакете com.company.vehicles
 * Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
 * Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать:
 * "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
 * А также метод printInfo(), который выводит полную информацию об автомобиле, ее водителе и моторе.
 *
 * Created by Liza on 21.10.2017
 */
public class Car {
    private String carMark;
    private String carClass;
    private int weigh;
    private Engine motor;
    private Driver driver;

    public Car() {
        this.carMark = "mark";
        this.carClass = "car class";
        this.weigh = 0;
        this.motor = new Engine();
        this.driver = new Driver();
    }

    public Car(String carMark, String carClass, int weigh, Engine motor, Driver driver) {
        this.carMark = carMark;
        this.carClass = carClass;
        this.weigh = weigh;
        this.motor = motor;
        this.driver = driver;
    }

    public Car(Car car) {
        this.carMark = car.getCarMark();
        this.carClass = car.getCarClass();
        this.weigh = car.getWeigh();
        this.motor = new Engine(car.getMotor());
        this.driver = new Driver(car.getDriver());
    }

    public String getCarMark() {
        return carMark;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String toString() {
        return "Car{" +
                "carMark='" + carMark + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weigh=" + weigh +
                ", " + motor.toString() +
                ", " + driver.toString() +
                '}';
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public void stop() {
        System.out.println("Останавливаемся!");
    }

    public void turnRight() {
        System.out.println("Поворот направо!");
    }

    public void turnLeft() {
        System.out.println("Поворот налево!");
    }
}
