package com.example.kucherandroid;

import java.util.Scanner;

public class L46 {
    public static double pow(int x, int n)
    {
        if(n < 0) {
            return 1. / pow(x, -n);
        }
        if (n == 0) {
            return 1;
        }
        long prev = (int) pow(x, n - 1);
        long result = x * prev;
        return result;
    }
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        int x = 2;
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Result: " + result);
        System.out.println(pow(x, n));
        System.out.println(fib(9));
    }
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = fib(n - 1) + fib(n - 2);
        return result;
    }

}
