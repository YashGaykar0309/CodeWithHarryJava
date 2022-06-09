package com.company;

class MyThr extends Thread  {
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<40){
            System.out.println("Thank You");
            i++;
        }
    }
}

public class CWH_40_thread_constructors {
    public static void main(String[] args) {
        MyThr m1=new MyThr("Yash");
        MyThr m2=new MyThr("Jay");
        m1.start();
        m2.start();
        System.out.println("I am thread of "+m1.getName());
        System.out.println("id of thread is "+m1.getId());
        System.out.println("I am thread of "+m2.getName());
        System.out.println("id of thread is "+m2.getId());


    }
}
