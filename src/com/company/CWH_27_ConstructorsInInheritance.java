package com.company;


class Base1{
    public Base1(){
        System.out.println("i am a constructor");
    }
    public Base1(int a){
        System.out.println("i am an overloaded constructor with value of a as: "+ a);
    }
}
class Derieved1 extends Base1{
    Derieved1(){
//        super(0);
        System.out.println("i am a Derieved Constructor");
    }
    Derieved1(int b){
        System.out.println("i am an overloaded constructor of Derieved class wih value b :"+ b);

    }
}

class ChildOfDerived extends Derieved1{
    ChildOfDerived(){
        System.out.println("i am child of derieved Constructor");
    }
    ChildOfDerived(int d,int e ,int f){
        super(4);
        System.out.println("i am child of derieved Constructor with values "+ d+" "+e+" "+f);
    }
}
public class CWH_27_ConstructorsInInheritance {
    public static void main(String[] args) {
//        Base1 b=new Base1();
//
//
//
//
//        Derieved1 d=new Derieved1();

        ChildOfDerived c=new ChildOfDerived(7,5,3);

    }
}
