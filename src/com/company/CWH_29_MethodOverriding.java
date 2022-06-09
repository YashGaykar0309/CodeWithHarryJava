package com.company;

class A{
    public int yash(){
        return 5;
    }
    public void meth2(){
        System.out.println("I am in Method 2 of class A");
    }

}
class B extends  A{
    public void meth3(){
        System.out.println("I am in Method 3 of class B");
    }
}

public class CWH_29_MethodOverriding {
    public static void main(String[] args) {


        A a=new A();
        a.meth2();
        B b=new B();
        b.meth2();
            }

}
