package com.company.task4;

import java.util.Scanner;

/**
 * Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена.
 * В начале работы программы случайным образом задайте какие лампочки будут включены. Напишите следующие методы:
 * a) метод который будет мигать лампочками гирлянды заданное количество раз (операция ~);
 * б) метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>);
 * в) метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &);
 * г) метод который будет распечатывать текущее состояние гирлянды.
 * Используйте побитовые операции. Для получения двоичного формата числа используйте метод Integer.toBinaryString(a).
 *
 * @author Liza Shcherbinina
 * @date 2017.10.07
 */
public class Garland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 454645455;
        Garland obj = new Garland();
        boolean temp = true;
        while (temp) {
            switch (obj.menu(scanner)) {
                case 0:
                    temp = false;
                    break;
                case 1:
                    obj.blum(a);
                    break;
                case 2:
                    obj.ticker(a);
                    break;
                case 3:
                    obj.firstOnOrOff(a);
                    break;
                case 4:
                    obj.print(a);
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
        }
    }

    /**
     * a) метод который будет мигать лампочками гирлянды заданное количество раз (операция ~)
     *
     * @param a - число, задающее состояние гирлянды
     */
    public void blum(int a) {
        for (int i = 0; i < 5; i++) {
            print(a);
            System.out.println(Integer.toBinaryString(~a));
        }
    }

    /**
     * Метод, обеспечивающий отображения 32 битов числа
     *
     * @param a - число, задающее состояние гирлянды
     * @return гирлянда из 32 лампочек
     */
    public String toString(int a) {
        String str = Integer.toBinaryString(a);
        int b = str.length();
        for (int i = 0; i < (32 - b); i++) {
            str = "0" + str;
        }
        return str;
    }

    /**
     * б) метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>)
     *
     * @param a - число, задающее состояние гирлянды
     */
    public void ticker(int a) {
        for (int i = 0; i < 10; i++) {
            a >>= 1;
            print(a);
        }
    }

    /**
     * в) метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &)
     *
     * @param a - число, задающее состояние гирлянды
     */
    public void firstOnOrOff(int a) {
        int mask = 1;
        switch (a & mask) {
            case 1:
                System.out.println("Первая лампочка включена");
                break;
            case 0:
                System.out.println("Первая лампочка выключена");
                break;
        }

    }

    /**
     * г) метод который будет распечатывать текущее состояние гирлянды.
     *
     * @param a - сщстояние гирлянды
     */
    public void print(int a) {
        System.out.println(toString(a));
    }

    /**
     * Меню запуска
     *
     * @param scanner - сканер
     * @return выбор пользователя
     */
    public int menu(Scanner scanner) {
        System.out.println("Выберите какое действие хотите выполнить над герляндой:");
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
