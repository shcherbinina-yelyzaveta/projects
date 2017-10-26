package com.company.task10;

import com.company.task10.animals.*;

public class AnimalsMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Wiskas", "Квартира", 10);
        animals[1] = new Dog("Кости", "Частный дом", true);
        animals[2] = new Horse("Трава", "Ферма", 75);

        for (Animal animal : animals) {
            Vet.treatAnimal(animal);
        }
    }
}
