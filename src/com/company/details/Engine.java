package com.company.details;

/**
 * Создать класс Engine в пакете com.company.details
 * Класс Engine содержит поля - мощность, производитель.
 *
 * Created by Liza on 21.10.2017
 */
public class Engine {
    private int power;
    private String company;

    public Engine() {
        this.power = 0;
        this.company = "company";
    }

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    public Engine(Engine engine) {
        this.power = engine.getPower();
        this.company = engine.getCompany();
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", company='" + company + '\'' +
                '}';
    }
}
