package com.example.kucherandroid;

public class Lesson322 {


    public static void m1() throws MyException {
        MyException e = new MyException("ME");
        throw e;
    }
    public static void m2() throws MyException {
        try {
            m1();
        } catch (MyException e) {
            System.out.println("handler 1");
            throw e;
        }
    }
    public static void m3() throws MyException {
        try {
            m2();
        } catch (MyException e) {
            System.out.println("handler 2");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            m3();
        } catch (MyException e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }
}
