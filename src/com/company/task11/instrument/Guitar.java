package com.company.task11.instrument;

/**
 * Created by student on 30.10.2017.
 */
public class Guitar implements Instrument {
    private int qualityStrings;

    public Guitar() {
        qualityStrings = 5;
    }

    public Guitar(int qualityStrings) {
        this.qualityStrings = qualityStrings;
    }

    public int getQualityStrings() {
        return qualityStrings;
    }

    public void setQualityStrings(int qualityStrings) {
        this.qualityStrings = qualityStrings;
    }

    @Override
    public void play() {
        System.out.println("Play " + this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guitar guitar = (Guitar) o;

        return qualityStrings == guitar.qualityStrings;
    }

    @Override
    public int hashCode() {
        return qualityStrings;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "qualityStrings=" + qualityStrings +
                '}';
    }
}
