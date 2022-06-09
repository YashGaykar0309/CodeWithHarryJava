package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CWH_56_Calender {
    public static void main(String[] args) {
//        Calendar c1=Calendar.getInstance();
//        System.out.println(c1.getCalendarType());
//        System.out.println(c1.getTimeZone());

        Calendar c2=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c2.getCalendarType());
        System.out.println(c2.getTimeZone().getID());


    }
}
