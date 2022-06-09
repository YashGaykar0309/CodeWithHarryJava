package com.company;

public class CWH_20_varArgs {
    static int sum(int ...arr){
//        available as int [] a
        int result=0;
        for(int x:arr){
            result+=x;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to varargs Tutorial");

        System.out.println("sum of numbers is " + sum( 5,6));
        System.out.println("sum of numbers is " + sum( 5,6,7));
        System.out.println("sum of numbers is " + sum( 5,6,7,8));
        System.out.println("sum of numbers is " + sum( 5,6,7,8,9));

    }
}
