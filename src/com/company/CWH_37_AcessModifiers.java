package com.company;

class c1{
    public int w=4;
    protected int x=5;
    int y=6;
    private int z=7;
    public void meth1(){
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}


public class CWH_37_AcessModifiers {
    public static void main(String[] args) {

        c1 c=new c1();
        c.meth1();

    }
}
