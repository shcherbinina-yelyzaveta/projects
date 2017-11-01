package com.company.task12;

import com.company.task12.Sizes.*;

public class ClothesMain {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new Tie();
        clothes[1] = new Pants(Sizes.valueOf("M"), 600, "black");
        clothes[2] = new Skirt();
        clothes[3] = new TShirt(Sizes.valueOf("M"), 450, "green");
        Atelier.toDressMan(clothes);
        Atelier.toDressWomen(clothes);
    }
}
