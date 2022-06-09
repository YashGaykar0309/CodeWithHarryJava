package com.company;


abstract class Base2{
    public Base2(){
        System.out.println("I am constructor of Base 2");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract  public void greet();
    abstract  public void greet1();
}

class Child2 extends  Base2{
    @Override
    public void greet() {
        System.out.println("good Morning");
    }

    @Override
    public void greet1() {
        System.out.println("Good Afternoon");
    }
}
abstract class Child3 extends Base2{
    public void th(){
        System.out.println("i m Good");
    }
}
public class CWH_31_Abstract {
    public static void main(String[] args) {
//        Base2 b =new Base2();

        Child2 c=new Child2();
        c.greet();
        c.greet1();
//        Child3 d=new Child3();

    }



}
