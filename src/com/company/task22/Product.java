package com.company.task22;

/**
 * Класс, описывающий продукт
 * @author Shcherbinina
 * @date 22.12.2017
 */
public class Product {
    /** Название продукта */
    private String name;
    /** Цена подукта */
    private int value;
    /** Рейтинг */
    private int rating;

    /**
     * Конструктор без параметров
     */
    public Product() {
        this.name = "----";
        this.value = 0;
        this.rating = 0;
    }

    /**
     * Конструктор с параметрами
     * @param name устанавливаемое название продукта
     * @param value устанавливаемая цена продукта
     * @param rating устанавливаемый рейтинг
     */
    public Product(String name, int value, int rating) {
        this.name = name;
        this.value = value;
        this.rating = rating;
    }

    /**
     * Конструктор копирования
     * @param product копируемый объект
     */
    public Product(Product product) {
        this.name = product.name;
        this.value = product.value;
        this.rating = product.rating;
    }

    /**
     * Геттер названия
     * @return название продукта
     */
    public String getName() {
        return name;
    }

    /**
     * Сеттер названия
     * @param name устанавливаемое значение
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Геттер цены
     * @return цена продукта
     */
    public int getValue() {
        return value;
    }

    /**
     * Сеттер цены
     * @param value устанавливаемое значение
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Геттер рейтинга
     * @return рейтинг
     */
    public int getRating() {
        return rating;
    }

    /**
     * Сеттер рейтинга
     * @param rating устанавливаемое значение
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (getValue() != product.getValue()) return false;
        if (getRating() != product.getRating()) return false;
        return getName() != null ? getName().equals(product.getName()) : product.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getValue();
        result = 31 * result + getRating();
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", rating=" + rating +
                '}';
    }
}
