package com.company;

import java.util.ArrayDeque;

public class CWH_53_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer>d1=new ArrayDeque<>();
        d1.add(4);

        d1.add(7);
        d1.add(77);
        d1.add(70);
        d1.add(99);
        System.out.println(d1.getFirst());
        System.out.println(d1.getLast());
        d1.addFirst(5555);
        System.out.println(d1);



    }
}
