package com.example.kucherandroid;

import java.util.ArrayList;

public class HashSet<T> {
    ArrayList<T>[] table;

    public HashSet(int n) {
        table = new ArrayList[n];
        for(int i = 0; i < table.length; i++) {
            table[i] = new ArrayList<>();
        }
    }

    public boolean add(T item) {
        int hash = item.hashCode();
        int col =hash % table.length;

        if(!table[col].contains(item)) return table[col].add(item);

        return false;
    }
    public void clear() {
        for(ArrayList<T> column : table) {
            column.clear();
        }
    }

    public boolean contains(T item) {
        int col = item.hashCode() % table.length;
        return table[Math.abs(col)].contains(item);
    }
    public boolean remove(T item) {
        int col = item.hashCode() % table.length;
        return table[col].remove(item);
    }


    public static void main(String[] args) {
        MyMonth m = new MyMonth(31, 20, "Aug");
        MyMonth m2 = new MyMonth(20, 31, "Aug");

        HashSet<MyMonth> set = new HashSet<>(8);
        set.add(m);
        System.out.println(set.contains(m));
        System.out.println(set.contains(m2));
    }
}
