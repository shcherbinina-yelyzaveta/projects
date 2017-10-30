package com.company.task11.instrument;

/**
 * Created by student on 30.10.2017.
 */
public class Tube implements Instrument {
    private double diameter;

    public Tube() {
        diameter = 0;
    }

    public Tube(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Play " + this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tube tube = (Tube) o;

        return Double.compare(tube.diameter, diameter) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(diameter);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Tube{" +
                "diameter=" + diameter +
                '}';
    }
}
