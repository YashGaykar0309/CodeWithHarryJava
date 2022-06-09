package com.company;

import java.util.Scanner;

public class CWH_45_specificError {
    public static void main(String[] args) {
        int [] array1=new int[3];
        array1[0]=74;
        array1[1]=44;
        array1[2]=57;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array Index");
        int ind=sc.nextInt();


        System.out.println("Enter the No you want to divide the value with ");
        int number=sc.nextInt();
        try{
            System.out.println("The value at array index entered is "+array1[ind]);
            System.out.println("ANS ="+array1[ind]/number);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured");
            System.out.println(e);

        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
