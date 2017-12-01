package com.company.task20;

import java.io.Serializable;

/**
 * Created by student on 01.12.2017.
 */
public class Halter implements Serializable{
    private String smth;

    public Halter(String smth) {
        this.smth = smth;
    }

    public String getSmth() {
        return smth;
    }

    public void setSmth(String smth) {
        this.smth = smth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Halter halter = (Halter) o;

        return smth != null ? smth.equals(halter.smth) : halter.smth == null;
    }

    @Override
    public int hashCode() {
        return smth != null ? smth.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Halter{" +
                "smth='" + smth + '\'' +
                '}';
    }
}
