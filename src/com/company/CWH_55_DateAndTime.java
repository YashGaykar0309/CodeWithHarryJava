package com.company;
//import java.time.*;
import java.util.*;
public class CWH_55_DateAndTime {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis() );
//        System.out.println(System.currentTimeMillis()/1000/3600/24/365+" years completed");
//        System.out.println(System.currentTimeMillis()/1000+" seconds completed");
//        System.out.println(System.currentTimeMillis()/1000/60+" minutes completed");
//        System.out.println(System.currentTimeMillis()/1000/3600+" hours completed");
//        System.out.println(System.currentTimeMillis()/1000/3600/24+" days completed");
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear()+1900);

    }
}
