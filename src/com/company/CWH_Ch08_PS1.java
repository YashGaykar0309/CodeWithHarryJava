package com.company;
class Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }

}
class Cellphone{
    public void ring(){
        System.out.println("Ringing.......");
    }
    public void vibrate(){
        System.out.println("Vibrating.......");
    }
    public void callfriend(){
        System.out.println("Calling Mukesh.......");
    }

}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Rectangle1 {
    int side1;
    int side2;
    public int area(){
        return side1*side2;
    }
    public int perimeter(){
        return 2*(side1+side2);

    }
}

class Tommy{
    public  void hit(){
        System.out.println("Hitting");
    }
    public  void run(){
        System.out.println("Running");
    }
    public  void fire(){
        System.out.println("Firing");
    }
}
class Circle {
    int radius;
    public float area(){
        return 3.14f*radius*radius;
    }
    public float perimeter(){
        return 2*3.14f*radius;
    }
}

public class CWH_Ch08_PS1 {
    public static void main(String[] args) {
        Employee yash= new Employee();
        yash.setName("Yash Gaykar");
        yash.salary=33333;
        System.out.println(yash.getSalary());
        System.out.println(yash.getName());
        System.out.println();


        Cellphone  asus = new Cellphone();
        asus.callfriend();
        asus.vibrate();
        asus.ring();
        System.out.println();


        Square sq=new Square();
        sq.side=3;
        System.out.println("Area of square: "+sq.area());
        System.out.println("Perimeter of square: "+sq.perimeter());
        System.out.println();


        Rectangle1 rect=new Rectangle1();
        rect.side1=3;
        rect.side2=5;
        System.out.println("Area of Rectangle: "+rect.area());
        System.out.println("Perimeter of Rectangle: "+rect.perimeter());
        System.out.println();


        Tommy tom=new Tommy();
        tom.hit();
        tom.run();
        tom.fire();
        System.out.println();

        Circle crl=new Circle();
        crl.radius=3;
        System.out.println("Area of Circle: "+crl.area());
        System.out.println("Perimeter of Circle: "+crl.perimeter());
        System.out.println();
    }
}
