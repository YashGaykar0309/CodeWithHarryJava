package com.company;

import java.util.Scanner;

public class CWH_problem1_percentage {
    public static void main(String[] args) {
        System.out.println("To Calculate Percentage Of a Student" );
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks of physics:");
        int a = sc.nextInt();
        System.out.println("Enter marks of chemistry:");
        int b = sc.nextInt();
        System.out.println("Enter marks of biology:");
        int c = sc.nextInt();
        System.out.println("Enter marks of mathematics:");
        int d = sc.nextInt();
        System.out.println("Enter marks of english:");
        int e= sc.nextInt();
        System.out.print("Percentage: ");
        float f= (a+b+c+d+e);
        float g= f/5;


        System.out.println(g);


    }
}
