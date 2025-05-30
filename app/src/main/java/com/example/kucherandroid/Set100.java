package com.example.kucherandroid;

public class Set100 {
    boolean[] array = new boolean[100];
    public boolean add (int y) {
        if (y < 0 || y >= 100) {
            return false;
        }
        return array[y] = true;
    }


    public boolean contains (int y) {
        if (y < 0 || y >= 100) {
            return false;
        }
        return array[y];
    }

    public boolean remove(int y) {
        if (y < 0 || y >= 100) {
            return false;
        }
        array[y] = false;
        return true;
    }
    public static void main(String[] args) {
        Set100 set = new Set100();
        set.add(1234);
        System.out.println(set.add(1234));
        System.out.println(set.add(88));
        System.out.println(set.contains(66));
        System.out.println(set.contains(88));
        System.out.println(set.remove(88));
        System.out.println(set.contains(88));
        int x = (int)Math.pow(2,16);
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x >>>2;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
    }

}
