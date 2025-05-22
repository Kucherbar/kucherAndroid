package com.example.kucherandroid;

public class Character {
    private String name;
    private int k;
    private int a;
    private int r;
    public Character(String name, int k, int a, int r) {
        this.name = name;
        this.k = k;
        this.a = a;
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

}
