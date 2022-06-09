package com.company;

public class CWH_19_MethodOverloading {
    static void favAnimal() {
        System.out.println("My favourite animal is cat");
    }
        static void foo(){
            System.out.println("good morning");
        }
        static void foo(int x){
            System.out.println("good morning "+ x);
        }
        static void foo(int x,int y){
            System.out.println("good morning "+x);
            System.out.println("good morning "+y);
        }


    public static void main(String[] args) {
//        favAnimal();
//       method overloading
        foo();
        foo(9);
        foo(8,10);

    }
}
