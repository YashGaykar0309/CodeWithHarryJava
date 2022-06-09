package com.company;

class Phone {
    public void showtime(){
        System.out.println("The time is 8:00");
    }
    public void on(){
        System.out.println("Phone is turning ON");
    }

}
class Smartphone extends Phone {
    public void on(){
        System.out.println("Smartphone is turning ON");
    }
    public void song(){
        System.out.println("Smartphone is Playing a song");
    }
}

public class CWH_30_Dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone ph=new Smartphone();
        ph.on();
        ph.showtime();
//        ph.song();         gives an error


    }
}
