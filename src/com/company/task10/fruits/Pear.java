package com.company.task10.fruits;

public class Pear extends Fruit{
    static final public int VAL = 25;
    static public double count = 0;

    public Pear() {
        count+=this.getWeight();
    }

    public Pear(double weight) {
        super(weight);
        count+=this.getWeight();
    }

    public double val() {
        return VAL * this.getWeight();
    }
}
