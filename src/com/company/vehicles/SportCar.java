package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

/**
 * Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью.
 *
 * Created by Liza on 21.10.2017
 */
public class SportCar extends Car {
    private double speed;

    public SportCar() {
        super();
        this.speed = 0;
    }

    public SportCar(double speed) {
        super();
        this.speed = speed;
    }

    public SportCar(String carMark, String carClass, int weigh, Engine motor, Driver driver) {
        super(carMark, carClass, weigh, motor, driver);
        this.speed = 0;
    }

    public SportCar(String carMark, String carClass, int weigh, Engine motor, Driver driver, double speed) {
        super(carMark, carClass, weigh, motor, driver);
        this.speed = speed;
    }

    public SportCar(Car car, double speed) {
        super(car);
        this.speed = speed;
    }

    public SportCar(Car car) {
        super(car);
        this.speed = 0;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String toString() {
        return super.toString() + "SportCar{" +
                "speed=" + speed +
                '}';
    }
}
