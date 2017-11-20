package com.company.task17.task8;

/**
 * Created by student on 20.11.2017.
 */
public class Toy {
    private String name;
    private int сost;

    public Toy(String name, int сost) {
        this(name);
        this.сost = сost;
    }

    public Toy(String name) {
        this();
        this.name = name;
    }

    public Toy() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getСost() {
        return сost;
    }

    public void setСost(int сost) {
        this.сost = сost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Toy toy = (Toy) o;

        if (сost != toy.сost) return false;
        return name != null ? name.equals(toy.name) : toy.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + сost;
        return result;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", сost=" + сost +
                '}';
    }
}
