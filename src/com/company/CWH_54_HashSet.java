package com.company;

import java.util.HashSet;

public class CWH_54_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> h1=new HashSet<>(6,0.5f);
        h1.add(6);
        h1.add(55);
        h1.add(44);
        h1.add(54);
        h1.add(55);
        h1.add(66);
        System.out.println(h1);
        System.out.println(h1.clone());



    }
}
