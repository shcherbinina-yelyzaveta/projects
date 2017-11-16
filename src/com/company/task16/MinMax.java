package com.company.task16;

import java.util.Arrays;

public class MinMax<T extends Number> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T min() {
        T min = this.array[0];
        for (T t : array) {
            if (min.doubleValue() > t.doubleValue()) {
                min = t;
            }
        }
        return min;
    }

    public T max() {
        T max = this.array[0];
        for (T t : array) {
            if (max.doubleValue() < t.doubleValue()) {
                max = t;
            }
        }
        return max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MinMax)) return false;

        MinMax<?> minMax = (MinMax<?>) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(getArray(), minMax.getArray());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getArray());
    }

    @Override
    public String toString() {
        return "MinMax{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public static void main(String[] args) {
        MinMax<Integer> m1 = new MinMax<>(new Integer[]{1, 2, 3, 0, 5, 3, 4, -1});
        System.out.println("min = " + m1.min());
        System.out.println("max = " + m1.max());
    }
}
