package com.company.task10;

import com.company.task10.flowers.*;

public class FlowersMain {
    public static void main(String[] args) {
        Flower[] bouquet1 = new Flower[5];
        bouquet1[0] = new Rose("Голандия", 7);
        bouquet1[1] = new Chamomile("Украина", 6);
        bouquet1[2] = new Rose("Голандия", 7);
        bouquet1[3] = new Chamomile("Украина", 6);
        bouquet1[4] = new Rose("Голандия", 7);

        Flower[] bouquet2 = new Flower[3];
        bouquet2[0] = new Tulip("Голандия", 5);
        bouquet2[1] = new Tulip("Голандия", 5);
        bouquet2[2] = new Tulip("Голандия", 5);

        Flower[] bouquet3 = new Flower[1];
        bouquet3[0] = new Carnation("Россия", 10);

        Flower[][] bouquets = {bouquet1,bouquet2,bouquet3};
        for (int i = 0; i<bouquets.length;i++){
            System.out.println("Букет №" + (i+1));
            int val = 0;
            for(int j = 0;j<bouquets[i].length;j++){
                val+=bouquets[i][j].val();
                System.out.println(bouquets[i][j]);
            }
            System.out.println("Стоимость: " + val + " грн");
        }
    }
}
