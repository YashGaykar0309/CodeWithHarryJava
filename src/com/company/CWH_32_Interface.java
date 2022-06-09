package com.company;

interface bicycle{
    int a=5;
    void applyBrake(int decrement);
    void applySpeedUP(int increment);
}
interface horn{
    void horn1();
}
class Cycle implements bicycle,horn{
    public void blowhorn(){
        System.out.println("peeee......");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void applySpeedUP(int increment){
        System.out.println("Applying SpeedUP");
    }
    public void horn1(){
        System.out.println("poooooom......");
    }

}

public class CWH_32_Interface {
    public static void main(String[] args) {
        Cycle c1 =new Cycle();
        c1.applyBrake(3);
        c1.applySpeedUP(5);
        c1.blowhorn();
        c1.horn1();
        System.out.println(c1.a);

    }
}
