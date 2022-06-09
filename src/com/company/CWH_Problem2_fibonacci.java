package com.company;

public class CWH_Problem2_fibonacci {
    static int n1=0,n2=1,n3=0;
    static void fibo(int n){
        if (n>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            fibo(n-1);

        }

    }

    public static void main(String[] args) {
        int a=10;
        System.out.print(n1 +" "+n2);
        fibo(a-2);
    }

//    public static void main(String[] args) {
//        int n1=0,n2=1,n3=0,n=15;
//        System.out.print(n1+" "+n2+" ");
//            for (int i=2;i<n;i++){
//                n3=n2+n1;
//                n1=n2;
//                n2=n3;
//                System.out.print(n3+" ");
//
//            }
//
//    }
}
