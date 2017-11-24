package com.company.task17.task10;

abstract public class Pet {
    int age;
    String color;

    public Pet() {
    }

    public Pet(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;

        Pet pet = (Pet) o;

        if (getAge() != pet.getAge()) return false;
        return getColor() != null ? getColor().equals(pet.getColor()) : pet.getColor() == null;
    }

    @Override
    public int hashCode() {
        int result = getAge();
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "age = " + age +
                ", color = " + color;
    }

    public abstract void noise();
}
