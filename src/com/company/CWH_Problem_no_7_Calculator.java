package com.company;

class MaxMultiplyInputException extends Exception{
    @Override
    public String toString() {
        return "Multi Input Must Be Less than 7000";
    }
}


class  MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Input must be less than 1,00,000";
    }
}

class CannotDivideByZeroException extends Exception{
    @Override
    public String toString() {
        return "We Cannot Divide By Zero";
    }
}

class  InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Cannot Add 8 & 9";

    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}


class CustomCalculator {
    double add(double a ,double b)  throws InvalidInputException,MaxInputException {
        if(a>100000||b>100000) {
            throw new MaxInputException();
        }
        if(a==8&&b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double sub(double a ,double b)throws MaxInputException{
        if(a>100000||b>100000) {
            throw new MaxInputException();
        }
        return a-b;
    }
    double multi(double a ,double b)throws MaxInputException,MaxMultiplyInputException{
        if(a>100000||b>100000) {
            throw new MaxInputException();
        }
        else if (a>7000||b>7000){
            throw new MaxMultiplyInputException();
        }
        return a*b;
    }
    double div(double a ,double b) throws  CannotDivideByZeroException ,MaxInputException{
        if(a>100000||b>100000) {
            throw new MaxInputException();
        }
        if(b==0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}
public class CWH_Problem_no_7_Calculator {
    public static void main(String[] args)    throws InvalidInputException ,CannotDivideByZeroException,MaxInputException,MaxMultiplyInputException{
        CustomCalculator c1=new CustomCalculator();
//        c1.add(8,9);
//        c1.sub(1000000,2);
        c1.multi(70000,6);
//        c1.div(5,0);



    }
}
