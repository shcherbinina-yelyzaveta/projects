package com.company.task10;

import com.company.task10.fruits.Apple;
import com.company.task10.fruits.Apricot;
import com.company.task10.fruits.Fruit;
import com.company.task10.fruits.Pear;

public class FruitsMain {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[10];
        fruits[0] = new Apple(10);
        fruits[1] = new Pear(2);
        fruits[2] = new Apple();
        fruits[3] = new Apricot(3.4);
        fruits[4] = new Pear(3.1);
        fruits[5] = new Pear(1.5);
        fruits[6] = new Apple(5);
        fruits[7] = new Apricot(4.3);
        fruits[8] = new Apricot(8);
        fruits[9] = new Pear(1.5);

        int val = 0;
        for (Fruit f : fruits) {
            val += f.val();
        }

        System.out.println("Проданно фруктов: яблок на " + Apple.count * Apple.VAL + " грн, груш на " + Pear.count * Pear.VAL +
                " грн, абрикос на " + Apricot.count * Apricot.VAL + " грн.");
        System.out.println("Всего проданного фруктов на " + val + " грн.");
    }
}
