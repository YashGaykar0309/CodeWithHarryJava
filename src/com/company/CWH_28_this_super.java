package com.company;

class Ekclass{


    int a;
    public int getA() {
        return a;
    }

    Ekclass(int v){
        this.a=v;
    }

    public int returnone(){
        return 1;
    }

}
class Doclass extends Ekclass {
    Doclass(int c){
        super(c);
        System.out.println("i am a constructor");
    }

}
public class CWH_28_this_super {
    public static void main(String[] args) {
        Ekclass c1=new Ekclass(5);
        Doclass c2=new Doclass(6);
        System.out.println(c1.getA());

    }


}
