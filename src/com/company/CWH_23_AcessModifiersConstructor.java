package com.company;

class Myemployee{
    private int id;
    private String name;


    public  void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}


class MyCircle{
    private  float A;

    public void  setA(int r){
        A =3.14f * r * r;
    }
    public float getA(){
        return A;
    }
}

public class CWH_23_AcessModifiersConstructor {
    public static void main(String[] args) {
        Myemployee yash=new Myemployee();
//        yash.id=45;
//        yash.name="yash gaykar";

        yash.setName("Yash Gaykar");
        yash.setId(45);
        System.out.println(yash.getId());
        System.out.println(yash.getName());

        MyCircle area=new MyCircle();
        area.setA(5);
        System.out.println(area.getA());
    }
}
