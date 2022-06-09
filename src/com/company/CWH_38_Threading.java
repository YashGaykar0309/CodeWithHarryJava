package com.company;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<300) {
            System.out.println("My thread1 is Running");
            System.out.println("I am happy");
            i++;

        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;

        while (i<300) {
            System.out.println("My thread2 is Running");
            System.out.println("I am sad");
            i++;
        }
    }
}
public class CWH_38_Threading {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();


    }
}
