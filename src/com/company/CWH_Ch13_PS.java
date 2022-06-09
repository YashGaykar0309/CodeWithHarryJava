package com.company;

class Practice13A extends  Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }
}
class Practice13B implements  Runnable{
    public void run(){
        while (true)
        {
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
            System.out.println("Welcome");
        }
    }
}


public class CWH_Ch13_PS {
    public static void main(String[] args) {


        Practice13A p1=new Practice13A();
//        p1.setPriority(6);
//        System.out.println(p1.getPriority());
//        p1.start();

        Practice13B p2=new Practice13B();
        Thread Th1 =new Thread(p2);
//        Th1.setPriority(9);
//        System.out.println(Th1.getPriority());
//        Th1.start();
        System.out.println(Th1.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
