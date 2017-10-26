package com.company.task10.fruits;

public class Apricot extends Fruit{
    static final public int VAL = 40;
    static public double count = 0;

    public Apricot() {
        count+=this.getWeight();
    }

    public Apricot(double weight) {
        super(weight);
        count+=this.getWeight();
    }

    public double val() {
        return VAL * this.getWeight();
    }
}
