package com.company;

public class CWH_04_operators {
    public static void main(String[] args) {
        int a = 6;
        int b = 3 + a;
        System.out.println(b);
        b += 9;
        System.out.println(b);
        System.out.println(6 == a);
        System.out.println(64 > 6);
        System.out.println(64 <= 6);// comparison operator

        System.out.println(64 > 6 && 64 > 8);
        System.out.println(64 > 6 || 64 > 99);

        System.out.println(3 & 2); // bitwise operator
        System.out.println(4.8 % 4);

    }

}
