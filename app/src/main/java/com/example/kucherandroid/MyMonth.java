package com.example.kucherandroid;

import java.util.Comparator;
import java.util.Objects;

public class MyMonth {
    String m;
    double t;
    int d;
    boolean l;


    public MyMonth(int d, int t, String m) {
        this.m = m;
        this.t = t;
        this.d = d;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }


    public boolean isL() {
        return l;
    }

    public void setL(boolean l) {
        this.l = l;
    }

    public static class MonthDayComparator implements Comparator<MyMonth> {
        public int compare(MyMonth t1, MyMonth t2) {
            return (int)(t1.d - t2.d);
        }
    }
    public static class MonthTempComparator implements Comparator<MyMonth> {
        public int compare(MyMonth t1, MyMonth t2) {
            return (int)t1.t - (int)t2.t;
        }
    }
    public String toString() {
        return m + " " + d + " " + t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyMonth myMonth = (MyMonth) o;
        return Double.compare(t, myMonth.t) == 0 && d == myMonth.d && l == myMonth.l && Objects.equals(m, myMonth.m);
    }

    @Override
    public int hashCode() {
        return Objects.hash(m, t, d, l);
    }
}
