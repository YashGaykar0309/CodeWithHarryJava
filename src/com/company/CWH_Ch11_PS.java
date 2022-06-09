package com.company;

abstract class Pen{
    abstract void write();
    abstract void refil();
}

class FountainPen extends Pen{
    void changeNib(){
        System.out.println("Changing the Nib");
    }
    void write(){
        System.out.println("writing...");
    }
    void refil(){
        System.out.println("Refil");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}
class Human extends Monkey implements BasicAnimal {
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }


}
//class TelePhone{
//    void ring (){
//
//    }
//    void
//}
public class CWH_Ch11_PS {
    public static void main(String[] args) {
        FountainPen p1=new FountainPen();
//        Problem No 1
        System.out.println("Problem no 1");
        p1.write();
        p1.refil();
        System.out.println("\n");

//        Problem 2
        System.out.println("Problem no 2");
        p1.changeNib();
        System.out.println("\n");

//        Problem no 3
        System.out.println("Problem no 3");
         Human h1=new Human();
         h1.eat();
         h1.sleep();
         h1.bite();
         h1.jump();
        System.out.println("\n");

        System.out.println("problem no 5");
        Monkey m1=new Human();
//       m1.speak();----->not in Monkey
        m1.bite();
        m1.jump();

        BasicAnimal b1=new Human();
//        b1.speak();--> not in BasicAnimal
        b1.eat();
        b1.sleep();



    }
}
