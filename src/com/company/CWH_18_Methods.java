package com.company;

public class CWH_18_Methods {
    static int logic(int x,int y)
    {
        int z;
        if (x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
//        object method invocation using object creation
//        CWH_18_Methods obj=new CWH_18_Methods();
//        int c=obj.logic(4,7);
        int c=logic(7,5);
        int d=logic(5,7);
        System.out.println(c);
        System.out.println(d);
    }
}
