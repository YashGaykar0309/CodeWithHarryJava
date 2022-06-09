package com.company;
import java.util.Scanner;

public class CWH_11_elseif {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();

        if (age>56){
            System.out.println("You are experinced");
        }
        else if (age>46){
                System.out.println("You are semi experienced");

            }

        else if (age > 36) {
                System.out.println("You are semi semi experienced");
            }
        else{
            System.out.println(" You are not experienced");
        }
        if (age>2){
            System.out.println("You are not a baby");
        }


        switch (age) {
            case 18:
                System.out.println("You are going to be an adult");
                System.out.println("You are going to be an adult");
                System.out.println("You are going to be an adult");
                break;
            case 21:
                System.out.println("You are going to join a job");
                break;
            case 68:
                System.out.println("YOu are going to retiered");
                break;
            default:
                System.out.println("Enjoy your life");
                break;
        }







/*
        if (age>56){
            System.out.println("You are Experienced");
        }
        else if (age>46){
            System.out.println("You are Semi Experience");
        }
        else if (age>36){
            System.out.println("You are Semi Semi Experienced");
        }
        else{
            if (age<15){
                System.out.println("You are baby");
            }
            else{
                System.out.println("you are not experienced");
        }*/



    }
}
