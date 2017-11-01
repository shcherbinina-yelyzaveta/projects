package com.company.task12.Sizes;

public class Atelier {
    public static void toDressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes clothing : clothes) {
            if (clothing instanceof WomanClothes) {
                ((WomanClothes) clothing).toDressWoman();
            }
        }
    }

    public static void toDressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes clothing : clothes) {
            if (clothing instanceof ManClothes) {
                ((ManClothes) clothing).toDressMan();
            }
        }
    }
}
