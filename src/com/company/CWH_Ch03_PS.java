package com.company;

import java.util.Locale;

public class CWH_Ch03_PS {
    public static void main(String[] args) {
        // Problem 1
        String name = "YaSh";
        name=name.toLowerCase();
        System.out.println(name);


        //problem 2
        String text ="To Lower Case";
        text= text.replace(" ","_");
        System.out.println(text);

        //problem 3


        String letter = "Dear <|name|>, Thanks a lot";
        letter= letter.replace("<|name|>","Harry");
        System.out.println(letter);



        //problem 4
        String myString = "This string contains  double and triple spaces ";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));



        //problem 5
        String letter1="Dear Harry,\n\t This Java Course Is Nice.\n\n\t Thanks!";
        System.out.println(letter1);

    }
}
