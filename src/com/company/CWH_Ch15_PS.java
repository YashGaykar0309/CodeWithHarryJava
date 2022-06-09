package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CWH_Ch15_PS {
    public static void main(String[] args) {

        //        Practice set 1
        ArrayList ar=new ArrayList();

        ar.add("Karan");
        ar.add("Jay");
        ar.add("Vivek");
        ar.add("Ajinkya");
        ar.add("Shreyas");
        ar.add("Ganu");
        ar.add("Yash");
        ar.add("Akshay");
        ar.add("Rahul");
        ar.add("Rohit");
        for(Object o:ar) {
            System.out.println(o);
        }

//       Problem set 2
        HashSet<Integer> s=new HashSet<>();
        s.add(55);
        s.add(66);
        s.add(77);
        s.add(88);
        s.add(99);
        s.add(66);
        System.out.println(s);


//        Problem Set 3
        Date d=new Date();


        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
//        Problem Set 4
        Calendar c1=new GregorianCalendar();
        System.out.println(c1.get(Calendar.HOUR_OF_DAY)+":"+c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.SECOND));

//        Problem Set 5
        LocalDateTime dt1=LocalDateTime.now();

        DateTimeFormatter df=DateTimeFormatter.ofPattern("HH:mm:ss");
        String myDate1=dt1.format(df);
        System.out.println(myDate1);








    }
}
