package com.example.kucherandroid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class L43 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();

        l.add(0);
        l.remove(0);
        l.add(12);
        l.add(12);
        l.add(123);
        l.add(1234);

        l.add(12345);
        l.add(123456);
        l.add(1234567);
        LinkedList<Integer> l2 = (LinkedList<Integer>) l.clone();
        l.add(12345678);
        l.add(10);
        l.add(0);
        l.add(2);
        l.add(3,12344);
        l.remove(Integer.valueOf(12345));
        for (Integer next:l2) {
            System.out.print(next + " ");
        }
        System.out.println("12345678 - " + ((l.contains(12345678))? "yes" : "no") );

        Integer item = (Integer) l.poll();
        item = item + item;
        System.out.println(item);
        Integer[] fromList = new Integer[5];
        fromList = l.toArray(fromList);
        System.out.println(Arrays.toString(fromList));



        LinkedList<MyNode<String>> nodes = new LinkedList<>();


        nodes.add(new MyNode<>("string"));
        LinkedList<MyNode<String>> nodes2 = (LinkedList<MyNode<String>>) nodes.clone();
        System.out.println(nodes2.peekFirst());
        nodes.get(0).setValue("string2");
        System.out.println(nodes2.peekFirst());
    }


}
