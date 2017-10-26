package com.company.task10.fruits;

public class Apple extends Fruit {
    static final public int VAL = 15;
    static public double count = 0;

    public Apple() {
        count+=this.getWeight();
    }

    public Apple(double weight) {
        super(weight);
        count+=this.getWeight();
    }

    public double val() {
        return VAL * this.getWeight();
    }
}
