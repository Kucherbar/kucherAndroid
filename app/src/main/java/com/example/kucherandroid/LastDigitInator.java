package com.example.kucherandroid;

import java.util.Comparator;

public class LastDigitInator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        int d1 = i1 % 10;
        int d2 = i2 % 10;
        return d1 - d2;
    }
}
