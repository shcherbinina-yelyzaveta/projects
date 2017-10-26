package com.company.task10.flowers;

abstract public class Flower {
    private String country;
    private int days;

    public Flower() {
        this.country = "country";
        this.days = 5;
    }

    public Flower(String country, int days) {
        this.country = country;
        this.days = days;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    abstract public int val();

    @Override
    public String toString() {
        return "country='" + country + '\'' +
                ", days=" + days;
    }
}
