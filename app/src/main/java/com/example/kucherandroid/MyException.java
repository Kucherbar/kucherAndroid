package com.example.kucherandroid;

public class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }

    public static void main(String[] args)  {
        int a = 1000;
        int b = 0;
        try {
            a -= 100;
            int error = 1/0;
            b += 100;
            System.out.println("1000 == (a+b)");
        }catch(Exception e) {
            System.out.println("Произошла ошибка " + e.getMessage());
            a += 100;
            throw e;
        } finally {
            System.out.println(1000 == (a+b));
        }
        System.out.println("End");
    }

}
