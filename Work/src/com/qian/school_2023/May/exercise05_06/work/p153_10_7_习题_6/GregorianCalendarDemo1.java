package com.qian.school_2023.May.exercise05_06.work.p153_10_7_习题_6;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo1 {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();

        System.out.println(c);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int week = c.get(Calendar.DAY_OF_WEEK);
        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + ", " + month + ", " + date + ", " + week);


        System.out.println("-----------------------------");
        c.set(Calendar.YEAR, 2000);
        c.set(Calendar.MONTH, 1);
        c.set(Calendar.DAY_OF_MONTH, 1);

        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        week = c.get(Calendar.DAY_OF_WEEK);
        date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + ", " + month + ", " + date + ", " + week);

    }
}
