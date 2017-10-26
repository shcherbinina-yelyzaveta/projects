package com.company.professions;

import com.company.task8.Person;

/**
 * Создать класс Driver в пакете com.company.professions.
 * Класс Driver содержит поля - ФИО, стаж вождения.
 * Пусть класс Driver расширяет класс Person.
 *
 * Created by Liza on 21.10.2017
 */
public class Driver extends Person {
    private int experience;

    public Driver() {
        this.experience = 0;
    }

    public Driver(int experience) {
        this.experience = experience;
    }

    public Driver(String fullName, int age, int experience) {
        super(fullName, age);
        this.experience = experience;
    }

    public Driver(String fullName, int age) {
        super(fullName, age);
        this.experience = 0;
    }

    public Driver(Driver driver) {
        super(driver.getFullName(), driver.getAge());
        this.experience = driver.getExperience();
    }

    public Driver(Person person, int experience) {
        super(person);
        this.experience = experience;
    }

    public Driver(Person person) {
        super(person);
        this.experience = 0;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String toString() {
        return super.toString() + "Driver{" +
                "experience=" + experience +
                '}';
    }
}
