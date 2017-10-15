package com.company.task6;

/**
 * Created by Liza Shcherbinina on 09.10.2017.
 */
public class StringArray {
    public static void main(String[] args) {
        String[] days = new String[7];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";
        int last = days.length-1;
        System.out.println(days[last]);
    }
}
