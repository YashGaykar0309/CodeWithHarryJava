package com.company;


class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i =0;
        while(i<30) {
            System.out.println("I am a Thread1");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i =0;
        while(i<30) {
            System.out.println("I am a Thread2");
            i++;
        }
    }
}


public class CWH_39_runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 r1=new MyThreadRunnable1();
        Thread Th1=new Thread(r1);
        MyThreadRunnable2 r2=new MyThreadRunnable2();
        Thread Th2=new Thread(r2);
        Th1.start();
        Th2.start();


    }
}
