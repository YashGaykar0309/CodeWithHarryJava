package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;

public class CWH_57_gregorian {
    public static void main(String[] args) {
//        Calendar c= Calendar.getInstance();
//        System.out.println(c.getTime());
//        System.out.println(c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR)+"/"+c.get(Calendar.DAY_OF_WEEK));
//        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        GregorianCalendar c2=new GregorianCalendar();
        System.out.println(c2.isLeapYear(2020));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println(TimeZone.getAvailableIDs()[66]);
    }
}
