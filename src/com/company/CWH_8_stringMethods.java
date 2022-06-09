package com.company;

import java.sql.SQLOutput;
import java.util.Locale;

public class CWH_8_stringMethods {
    public static void main(String[] args) {
        String a="Harry";
        System.out.println(a);
        System.out.println(a.length());
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        String nonTrimmed = "        Harry      ";
        System.out.println(nonTrimmed);
        String trimmed = nonTrimmed.trim();
        System.out.println(trimmed);


        System.out.println(a.substring(3));
        System.out.println(a.substring(2,4 ));
        System.out.println(a.replace("r","p"));
        System.out.println(a.replace("rry","ir"));
        System.out.println(a.startsWith("Har"));
        System.out.println(a.endsWith("Har"));
        System.out.println(a.charAt(3));
        System.out.println(a.indexOf('r'));
        System.out.println(a.indexOf("H",4));
        System.out.println(a.lastIndexOf('r'));
        System.out.println(a.lastIndexOf('r',2));

        System.out.println(a.equals("harry"));
        System.out.println(a.equalsIgnoreCase("haRry"));

        System.out.println("my name is \"yash\" ");
        System.out.println("my name is \n yash ");
        System.out.println("my name is \t  yash ");










    }
}
