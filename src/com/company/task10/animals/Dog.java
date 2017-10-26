package com.company.task10.animals;

public class Dog extends Animal {
    private boolean dogTraining;

    public Dog() {
        this.dogTraining = true;
    }

    public Dog(boolean dogTraining) {
        this.dogTraining = dogTraining;
    }

    public Dog(String food, String location, boolean dogTraining) {
        super(food, location);
        this.dogTraining = dogTraining;
    }

    public boolean isDogTraining() {
        return dogTraining;
    }

    public void setDogTraining(boolean dogTraining) {
        this.dogTraining = dogTraining;
    }

    public void makeNoise() {
        System.out.println("GAV GAV GAV!!!!");
    }

    public void eat() {
        System.out.println("Я люблю грызть кость!");
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() +
                ", dogTraining=" + dogTraining +
                '}';
    }
}
