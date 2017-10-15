package com.company.task7;

import java.util.Scanner;

/**
 * Реализовать задачу с гирляндой используя массивы.
 * Для реализации бегущей строки используйте метод System.arraycopy(...);
 *
 * Created by Liza on 15.10.2017
 */
public class Garland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] garland = new int[32];
        for (int i = 0; i < garland.length - 1; i++) {
            garland[i] = (int) (Math.random() * 2);
        }
        boolean temp = true;
        while (temp) {
            switch (Garland.menu(scanner)) {
                case 0:
                    temp = false;
                    break;
                case 1:
                    Garland.blum(garland);
                    break;
                case 2:
                    Garland.ticker(garland);
                    break;
                case 3:
                    Garland.firstOnOrOff(garland);
                    break;
                case 4:
                    Garland.print(garland);
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
        }
    }

    public static void blum(int[] garland) {
        int[] tmp = new int[32];
        for (int i = 0; i < garland.length; i++) {
            if (garland[i] == 0) {
                tmp[i] = 1;
            } else {
                tmp[i] = 0;
            }
        }
        for (int i = 0; i < 5; i++) {
            print(garland);
            print(tmp);
        }
    }

    public static void ticker(int[] garland) {
        for (int i = 0; i < garland.length; i++) {
            System.arraycopy(garland, 0, garland, 1, garland.length - 1);
            print(garland);
        }
    }

    public static void firstOnOrOff(int[] garland) {
        if (garland[garland.length - 1] == 1) {
            System.out.println("On!");
        } else {
            System.out.println("Off!");
        }
    }

    public static void print(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int menu(Scanner scanner) {
        System.out.println("\nВыберите какое действие хотите выполнить над герляндой:");
        System.out.println("1 - запустить мигание гирлянды");
        System.out.println("2 - запустить гирлянду в режим бегущей строки");
        System.out.println("3 - проверить, включена ли первая лампочка");
        System.out.println("4 - распечатать текущее состояние гирлянды");
        System.out.println("0 - завершить работу");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            return 0;
        }
    }
}
