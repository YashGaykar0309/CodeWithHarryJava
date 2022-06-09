package com.company;

import java.util.Scanner;

public class CWH_46_NestedTry {
    public static void main(String[] args) {
         int [] marks=new int[4];
         marks[0]=67;
         marks[1]=37;
         marks[2]=47;
         marks[3]=57;
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while (flag) {

            System.out.println("Enter the index required");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to video");
                try {
                    System.out.println(marks[ind]);
                    flag=false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry Entered Index does not exist");
                    System.out.println("Exception in level 2");
                }

            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }

        }

        System.out.println("Thanks for Using");



    }
}
