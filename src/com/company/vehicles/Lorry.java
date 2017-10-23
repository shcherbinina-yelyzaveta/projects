package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

/**
 * Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
 *
 * Created by Liza on 21.10.2017
 */
public class Lorry extends Car {
    private int carrying;

    public Lorry() {
        this.carrying = 0;
    }

    public Lorry(int carrying) {
        this.carrying = carrying;
    }

    public Lorry(String carMark, String carClass, int weigh, Engine motor, Driver driver, int carrying) {
        super(carMark, carClass, weigh, motor, driver);
        this.carrying = carrying;
    }

    public Lorry(String carMark, String carClass, int weigh, Engine motor, Driver driver) {
        super(carMark, carClass, weigh, motor, driver);
        this.carrying = 0;
    }

    public Lorry(Car car, int carrying) {
        super(car);
        this.carrying = carrying;
    }

    public Lorry(Car car) {
        super(car);
        this.carrying = 0;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public String toString() {
        return super.toString() + "Lorry{" +
                "carrying=" + carrying +
                '}';
    }
}
