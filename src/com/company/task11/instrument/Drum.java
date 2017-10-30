package com.company.task11.instrument;

/**
 * Created by student on 30.10.2017.
 */
public class Drum implements Instrument {
    private double size;

    public Drum() {
        size = 0;
    }

    public Drum(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Play " + this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drum drum = (Drum) o;

        return Double.compare(drum.size, size) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(size);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Drum{" +
                "size=" + size +
                '}';
    }
}
