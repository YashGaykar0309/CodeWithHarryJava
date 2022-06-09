package com.company;
import java.util.*;
import java.util.LinkedList;

public class CWH_52_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();

        LinkedList<Integer> l2=new LinkedList<>();
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
        l1.addFirst(788);
        l1.addLast(676);
        l1.offer(56);
        l1.offerFirst(44);

        System.out.println(l1.clone());
        System.out.println(l1.contains(88));
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
        System.out.println(l1.subList(1,4));

        System.out.println(l1.toArray());
        System.out.println(l1.size());
        System.out.println(l1.size());
        System.out.println(l1.peek());
        System.out.println(l1.peekLast());
        l1.poll();



        for (int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
