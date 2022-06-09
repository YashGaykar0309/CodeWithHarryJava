package com.company;

import java.util.ArrayList;
import java.util.*;

public class CWH_51_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>(10);

        ArrayList<Integer> l2=new ArrayList<>();
        l1.add(4);
        l1.add(7);
        l1.add(4);
        l1.add(8);
        l1.add(9);
        l1.add(4);

        l2.add(66);
        l2.add(88);
        l2.add(46);
        l2.add(96);
        l1.add(3,88);
        l1.addAll(l2);
        l1.addAll(3,l2);
//        l2.clear();
        System.out.println(l1.clone());
        System.out.println(l1.contains(88));
        l1.ensureCapacity(50);
        System.out.println(l1.get(5));
        System.out.println(l1.indexOf(88));
        System.out.println(l1.lastIndexOf(88));
        System.out.println(l2.isEmpty());
        System.out.println(l1.isEmpty());
        System.out.println(l1.iterator());


        System.out.println(l1.listIterator());
        System.out.println(l1.listIterator(3));
        System.out.println(l1.remove(5));
        System.out.println(l1.removeAll(l2));
        l1.ensureCapacity(50);
        System.out.println(l1.subList(1,4));

        System.out.println(l1.toArray());
        System.out.println(l1.size());
        l1.trimToSize();
        System.out.println(l1.size());



        for (int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
}
