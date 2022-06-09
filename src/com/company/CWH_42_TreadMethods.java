package com.company;


class MyNewThread1 extends Thread{
    public void run(){
        int i=0;

        while(i<766){
            System.out.println("I am a New Thread      1");
            try {
                Thread.sleep(455);          //SLEEP METHOD

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class MyNewThread2 extends Thread{
    public void run(){
        int i=0;

        while(i<766){
            System.out.println("I am a New Thread      2");
            i++;
        }
    }
}

public class CWH_42_TreadMethods {
    public static void main(String[] args) {
        MyNewThread1 n1=new MyNewThread1();
        MyNewThread2 n2=new MyNewThread2();
        n1.start();
          try {
            n1.join();         //JOIN METHOD
        }
        catch (Exception e){
            System.out.println(e);
        }
        n2.start();        //START METHOD

    }
}
