package com.company;

class Thr1 extends Thread{
    public Thr1(String name1) {
        super(name1);
    }
    public void run(){
        while (true){
            System.out.println("My name is "+getName());
        }
    }
}

public class CWH_41_Thread_Priorities {
    public static void main(String[] args) {
        Thr1 t1=new Thr1("Yash 1");
        Thr1 t2=new Thr1("Yash 2");
        Thr1 t3=new Thr1("Yash 3");
        Thr1 t4=new Thr1("Yash 4");
        Thr1 t5=new Thr1("Yash 5(Most Priority)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
