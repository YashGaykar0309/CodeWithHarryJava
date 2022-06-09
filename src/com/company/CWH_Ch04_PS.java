package com.company;
import java.util.Scanner;
public class CWH_Ch04_PS {
    public static void main(String[] args) {


        //problem 1 what is out put
        /*int a=10;
        if(a=11) {
            System.out.println("i am 11");
        }
         else {
                System.out.println("i am not 11");

        }

        ans ---- Error
         */

        // problem 2
        /*System.out.println("problem no 2");



        int m1,m2,m3;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Marks of M1: ");
        m1=sc.nextInt();
        System.out.println("Enter the marks of M2: ");
        m2=sc.nextInt();
        System.out.println("Enter the marks of M3: ");
        m3=sc.nextInt();

        float avg=(m1+m2+m3)/3.0f;
        if (avg>=40 && m1>33 && m2>33 && m3>33){
            System.out.println("CONGRATULATIONS! ,You are pass with " + avg +  " Percentage.");
        }
        else{
            System.out.println("You are fail");
        }*/


        //provblem 3

        /*
        System.out.println("problem no 3");
        float tax =0;
        System.out.println("Enter your income in Rupees");
        Scanner sc = new Scanner(System.in);
        float input=sc.nextFloat();
        float income=input/100000.0f;
        if (income <= 2.5f){
            tax= tax +0;
        }
        else if (income <=5.0f && income> 2.5f){
            tax= (float) (tax+0.05*(income-2.5f));
        }
        else if (income <=10.0f && income> 5.0f){
            tax= (float) (tax+0.05*(5.0f-2.5f));
            tax= (float) (tax+0.20*(income-2.5f));
        }
        else if (income >10.0f){
            tax= (float) (tax+0.05*(5.0f-2.5f));
            tax= (float) (tax+0.2*(10.0f-5.0f));
            tax= (float) (tax+0.3*(income-10.0f));
        }
        System.out.println(tax*100000);




        */

        /*System.out.println(" problem no 4");

        Scanner sc = new Scanner(System.in);
        System.out.println("1:Monday\n2:Tuesday\n3:Wednesday\n4:Thursday\n5:Friday\n6:Saturday\nEnter the folloing input to select today's day");
        int day=sc.nextInt();

        switch (day){
            case 1->System.out.println(" Today is Monday");
            case 2->System.out.println(" Today is Tuesday");
            case 3->System.out.println(" Today is Wednesday");
            case 4->System.out.println(" Today is Thursday");
            case 5->System.out.println(" Today is Friday");
            case 6->System.out.println(" Today is Saturday");
            case 7->System.out.println(" Today is Sunday");
        }

         */
        //problem no 5
        /*

        Scanner sc = new Scanner(System.in);
        System.out.println(" To check the year is leap year or not");
        System.out.println("Enter the year");
        int year=sc.nextInt();
        if (year%4==0){
            System.out.println(year +" is a leap year");
        }
        else {
            System.out.println((year+" is not a leap year"));
        }
        */

        //problem no 6
        Scanner sc = new Scanner(System.in);
        System.out.println(" To identify type of website");
        System.out.println("Enter the website");
        String website=sc.next();
        if (website.endsWith(".org")){
            System.out.println("This is organizational website");
        }
        else if (website.endsWith(".com")){
            System.out.println("This is commercial website");
        }
        else if (website.endsWith(".in")){
            System.out.println("This is indian website");
        }
    }
}