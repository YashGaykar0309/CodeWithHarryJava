package com.company;


import java.util.Scanner;

class CustonException extends Exception{
    @Override
    public String toString() {
        return "No. of Entries Finished";
    }
}

public class CWH_CH14_PS {
    public static void main(String[] args) {
//        Problem no 1
//         int a=6  STNTAX ERROR
int age=78;
int year_born=2000-age;   //LOGICAL ERROR
//        System.out.println(6/0);


//        Problem no 2
        try{
            int a=666/0;
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("haha");
        }
        catch(ArithmeticException e){
            System.out.println("hehe");
        }

//        Problem no 3
        int [] marks12=new int[3];
        marks12[0]=44;
        marks12[1]=66;
        marks12[2]=55;
//        boolean flag=true;
        Scanner sc=new Scanner(System.in);
         int i=0;
        while(i<5){
            try {
                System.out.println("Enter the index");
                int Index = sc.nextInt();
                System.out.println("Required Value " + marks12[Index]);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid Index");
                i++;

            }
            if (i>5){
                System.out.println("Error");
            }





        }


    }
}
