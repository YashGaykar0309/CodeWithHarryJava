package com.company;

class Mymainemployee{
    private int id;
    private String name;

    public Mymainemployee(String myname,int myid){
        id=myid;
        name=myname;

    }

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

public class CWH_24_Constructors {
    public static void main(String[] args) {
        Mymainemployee yash=new Mymainemployee("Yash Gaykar",77);
        Mymainemployee jay=new Mymainemployee("Jay Hande",76);
//        yash.setName("Yash Gaykar");
//        yash.setId(45);
        System.out.println("yash");
        System.out.println(yash.getId());
        System.out.println(yash.getName());
        System.out.println("jay");
        System.out.println(jay.getId());
        System.out.println(jay.getName());
    }

}