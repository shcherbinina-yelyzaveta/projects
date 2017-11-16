package com.company.task14;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CalendarHolidays {
    public static void main(String[] args) throws ParseException {
        holidaysInfo("New Year", "01.01.2017");
        holidaysInfo("Christmas", "07.01.2017");
        holidaysInfo("Valentine's day", "14.02.2017");
        holidaysInfo("Women day", "08.03.2017");
        holidaysInfo("Children day", "01.06.2017");
        holidaysInfo("Kharkiv day", "23.08.2017");
        holidaysInfo("Students day", "17.11.2017");


    }

    public static void holidaysInfo(String holiday, String date) throws ParseException {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat df1 = new SimpleDateFormat("dd.MM.YYYY - ");
        System.out.println(df1.format(df.parse(date)) + holiday);
    }
}
