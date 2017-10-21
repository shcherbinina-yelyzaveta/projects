package com.company.task9;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

/**
 * Created by Liza on 21.10.2017
 */
public class CarMain {
    public static void main(String[] args) {
        Engine motor = new Engine(1500, "Company1");
        Driver driver = new Driver("Liza Shcherbinina", 19, 2);
        Car car1 = new Car("BMW X6","business", 1500, motor, driver);
        Car car2 = new SportCar(car1,250);
        Car car3 = new Lorry(car1,1000);
        System.out.println("Car1:\n" + car1.toString());
        System.out.println("Car2:\n" + car2.toString());
        System.out.println("Car3:\n" + car3.toString());
    }
}
