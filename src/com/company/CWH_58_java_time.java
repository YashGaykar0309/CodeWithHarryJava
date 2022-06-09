package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CWH_58_java_time {
    public static void main(String[] args) {
        LocalTime d=LocalTime.now();
        System.out.println(d);
        LocalDate d1=LocalDate.now();
        System.out.println(d1);
        LocalDateTime d2=LocalDateTime.now();
        System.out.println(d2);
    }
}
