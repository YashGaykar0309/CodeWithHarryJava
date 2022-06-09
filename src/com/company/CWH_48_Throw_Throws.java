package com.company;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be Negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be Negative!";
    }
}


public class CWH_48_Throw_Throws {
    public static double Area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }

        double result =Math.PI*r*r;
        return  result;
    }
    public static int divde(int a,int b)throws ArithmeticException {
//        Made by Harry
        int result=a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
            int  c = divde(6, 2);
            double ar= Area(-1);
            System.out.println(c);
            System.out.println(ar);

        }
        catch(Exception e)
        {
            System.out.println("Exception found! Please Enter valid numbers");
        }







    }
}
