package com.company;
import java.util.Scanner;
import java.util.Random;

public class CWH_PROBLEM03_STONEPAPER {
    public static void main(String[] args) {
        int m=0,n=0;

        for (int i=1;i<=5;i++){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 0 for Rock \n 1 for Scissor \n 2 for Paper ");
            int userInput = sc.nextInt();

            Random random = new Random();
            int compInput = random.nextInt(3);

            if (userInput == compInput) {
                System.out.println("Round "+i+" Draw");

            } else if (userInput == 0 && compInput == 1 || userInput == 1 && compInput == 2 || userInput == 2 && compInput == 0) {
                System.out.println("You Won Round "+i);
                m++;
            } else {
                System.out.println("Computer Won Round "+i);
                n++;
            }

            if (compInput == 0) {
                System.out.println("Computer Choice was Rock");
            } else if (compInput == 1) {
                System.out.println("Computer Choice was Scissor");
            }
            if (compInput == 2) {
                System.out.println("Computer Choice was Paper");
            }


        }
        System.out.println();
        System.out.println();
        if (m>n){
            System.out.println("You Won The Game by "+m+":"+n);
        }else if (m<n){
            System.out.println("You Lost The Game by "+m+":"+n);
        }
        else{
            System.out.println("Match is Draw by "+m+":"+n);
        }
    }
}
