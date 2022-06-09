package com.company;
class Circle1 {

    public int radius;

    Circle1(int r){
        System.out.println("I am Circle parameterised Constructor");
        this.radius=r;
    }


    public double area(){
        return (this.radius*this.radius*Math.PI);
    }
}

class Cylinder1 extends Circle1{
    public int height;

    Cylinder1 (int r,int h){

        super(2);
        this.height=h;
        System.out.println("I am Cylinder Parameterised Constructors");
    }

    public double Volume(){

        return (Math.PI*this.radius*this.radius*this.height);
    }
}


public class CWH_Ch10_PS {
    public static void main(String[] args) {
        //PROBLEM 1
//        Circle1 obj1=new Circle1(5);
//        System.out.println("Area of Circle is " +obj1.area());

        Cylinder1 obj2=new Cylinder1(1 ,2);
        System.out.println(obj2.area());
        System.out.println(obj2.Volume());







//       cylinder1 obj2=new cylinder1();
//       obj2.area();
//       obj2.Volume();


    }
}
