package com.company;

public class CWH_44_Try {
    public static void main(String[] args) {
        int a=6000;
        int b=0;
        try{
            int c=a/b;
            System.out.println("The Division is "+ c);
        }
        catch (Exception e){
            System.out.println("We could not DIVIDE. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
