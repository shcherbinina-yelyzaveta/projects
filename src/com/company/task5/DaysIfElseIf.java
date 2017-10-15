package com.company.task5;

public class DaysIfElseIf {
    public static void main(String[] args) {
        int i = 0;
        for (String str : args) {
            i = Integer.parseInt(str);
            if (i == 1) {
                System.out.println("Monday");
            } else if (i == 2) {
                System.out.println("Tuesday");
            } else if (i == 3) {
                System.out.println("Wednesday");
            } else if (i == 4) {
                System.out.println("Thursday");
            } else if (i == 5) {
                System.out.println("Friday");
            } else if (i == 6 || i == 7) {
                System.out.println("Weekend");
            } else {
                System.out.println("Error!");
            }
        }
    }
}
