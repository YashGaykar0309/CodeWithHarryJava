package com.company;

import java.sql.SQLOutput;

public class CWH_10_logical {
    public static void main(String[] args) {

            System.out.println("For logical AND ...");
            boolean a = true;
            boolean b = false;
            boolean c = true;
            if (a && b) {
                System.out.println("Y");
            }

            else{
                System.out.println("N");
            }

            System.out.println(" For Logical OR ...");
            if (a||b){
                System.out.println("Y");
            }
            else{
                System.out.println("N");
            }


            System.out.println(" For Logical OR ...");
            if (a&&b&&c){
                 System.out.println("Y");
            }
            else{
                 System.out.println("N");
            }
        System.out.println("not a is "+!a);
        System.out.println("not b is "+!b);


    }
}
