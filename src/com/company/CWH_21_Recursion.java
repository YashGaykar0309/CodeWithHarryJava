package com.company;

public class CWH_21_Recursion {

//    static int factorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            int product=1;
//            for (int i=1;i<=n;i++){
//                product *=i;
//            }
//            return product;
//        }
//
//    }
  static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }
    public static void main(String[] args) {

        System.out.println(factorial(6));

    }
}