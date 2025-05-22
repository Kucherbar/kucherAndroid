package com.example.kucherandroid;

import org.w3c.dom.Node;

import java.util.SortedSet;
import java.util.TreeSet;

public class MyBinaryTree<T extends Comparable<T>>  {
    private T value;
    private MyBinaryTree<T> lChild;
    private MyBinaryTree<T> rChild;
    public MyBinaryTree(T value) {
        this.value = value;
    }
    public MyBinaryTree() {}
    public MyBinaryTree insertNode(T newValue) {
        if(newValue == null) return null;
        if(this.value == null) {
            this.value = newValue;
            return this;
        }
        if (this.value.compareTo(newValue) < 0) {
            if (this.rChild == null) {
                return this.rChild = new MyBinaryTree<>(newValue);
            } else {
                return this.rChild.insertNode(newValue);
            }
        }
        if (this.value.compareTo(newValue) > 0) {
            if (this.lChild == null) {
                return this.lChild = new MyBinaryTree<>(newValue);
            } else {
                return this.lChild.insertNode(newValue);
            }
        }
        return null;
    }
    public static void print(MyBinaryTree tree) {
        print(tree, 0);
    }
    public static void print(MyBinaryTree tree, int level) {
        if(tree.rChild != null) print(tree.rChild, level + 1);
        for(int i = 0; i < level; i++) {
            System.out.print("  ");
        }
        System.out.println(tree.value);
        if(tree.lChild != null) print(tree.lChild, level + 1);
    }

    public static void main(String[] args) {
        MyBinaryTree<Integer> t = new MyBinaryTree<>();
        int[] a = {5, 2, 1, 3, 9, 7, 6, 10};
        for (int i = 0; i < a.length; i++) {
            t.insertNode(a[i]);
        }
        print(t);



        TreeSet<String> tree = new TreeSet<>();
        tree.add("abc");
        tree.add("aba");
        System.out.println("===== Tree =====");
        for (String s : tree) {
            System.out.println(s);
        }
        System.out.println(tree.remove("aaa"));
        System.out.println(tree.remove("abc"));
        System.out.println("===== Tree =====");
        for (String s : tree) {
            System.out.println(s);

        }
        System.out.println();
        tree.add("zzz");
        tree.add("xyz");
        tree.add("zca");
        System.out.println(tree.contains("xyz") + " " + tree.contains("aab"));
        System.out.println("ceiling = " + tree.ceiling("zyb"));
        for (String s : tree) {
            System.out.print(","+s);

        }
        System.out.println();
        System.out.println(tree.ceiling("zzzz"));
        System.out.println("floor = " + tree.floor("zyb"));
        System.out.println(tree.floor("a"));
        System.out.println("===== Subtree =====");
        SortedSet<String> subtree = tree.subSet("zaa", "zzzz");
        for (String s : subtree) {
            System.out.println(s);
        }
        System.out.println();
    }

    }

