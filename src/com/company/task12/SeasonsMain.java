package com.company.task12;

/**
 * Created by student on 30.10.2017.
 */
public class SeasonsMain {
    public static void main(String[] args) {
        Seasons myFavoriteSeason = Seasons.valueOf("SUMMER");
        printFavoriteSeason(myFavoriteSeason);
        printAll();
    }

    public static void printAll() {
        System.out.println("Seasons:");
        Seasons[] seasons = Seasons.values();
        for (Seasons season : seasons) {
            System.out.println(season + " " + season.getDescription() + " " + season.getTemperature() + "\u00B0C");
        }
    }

    public static void printFavoriteSeason(Seasons myFavoriteSeason) {
        switch (myFavoriteSeason) {
            case WINTER:
                System.out.println("I like winter!");
                break;
            case AUTUMN:
                System.out.println("I like autumn!");
                break;
            case SPRING:
                System.out.println("I like spring!");
                break;
            case SUMMER:
                System.out.println("I like summer!");
                break;
        }
        System.out.println(myFavoriteSeason + " " + myFavoriteSeason.getDescription() + " " +
                myFavoriteSeason.getTemperature() + "\u00B0C");
    }
}
