package com.example.kucherandroid;

import java.util.LinkedList;

public class L48 {
    public static void sort(int[] a, int low, int high) {
        if (a.length == 0) return;
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        int op = a[mid];
        int i = low, j = high;
        while (i <= j) {
            while (a[i] < op) {
                i++;
            }
            while (a[j] > op) {
                j--;
            }
            if (i <= j) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
                j--;
                for (int next: a) {
                    System.out.print("\t" + next);
                }
                System.out.println();
            }
        }
        sort(a, low, j);
        sort(a, i, high);
    }

    public static void main(String[] args) {

        LinkedList<MyMonth> list = new LinkedList<>();
        list.add(new MyMonth(31,-15,"Jan"));
        list.add(new MyMonth(28,-20,"Feb"));
        list.add(new MyMonth(31,-5,"Mart"));
        list.add(new MyMonth(30,+5,"Apr"));
        list.add(new MyMonth(31,+20,"May"));
        list.add(new MyMonth(30,+25,"June"));
        list.add(new MyMonth(31,+20,"Jule"));
        list.add(new MyMonth(31,+15,"Aug"));
        list.sort(new MyMonth.MonthDayComparator());
        System.out.println(list.toString());
        list.sort(new MyMonth.MonthTempComparator());
        System.out.println(list.toString());



    }
}
