package com.company;
import java.util.Scanner;

public class CWH_07_strings {
    public static void main(String[] args) {

        String name = new String("yash");
        System.out.println(name);

        String names=  "shreyas";
        System.out.println(names);

        int a=6;
        float b= 5.6575f;
        System.out.printf("the value of a is %d and value of b is %9.2f",a,b);


        System.out.println("              enter your name: ");
        Scanner sc=new Scanner(System.in);
        String st =sc.nextLine();
        System.out.println(st);


    }
}
