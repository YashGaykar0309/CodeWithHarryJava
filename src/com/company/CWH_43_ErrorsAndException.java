package com.company;

import java.util.Scanner;

public class CWH_43_ErrorsAndException {
    public static void main(String[] args) {
        //Syntax Error
//        int a=0      No Semicolon

//        b=8          Not Declared

        //Logical Error Demo
        //Prime No.
        System.out.println("2");
        for (int i=1;i<5;i++)
            System.out.println(2*i+1);





//          RUNTIME ERROR
        int k;
        Scanner sc =new Scanner(System.in);
        k=sc.nextInt();
        System.out.println("Integer Part Of 1000 Divided by k is "+1000/k);




    }

}
