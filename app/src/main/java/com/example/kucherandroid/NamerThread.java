package com.example.kucherandroid;

public class NamerThread extends Thread {
    String name;
    public NamerThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        NamerThread nt1 = new NamerThread("A");
        NamerThread nt2 = new NamerThread("B");
        NamerThread nt3 = new NamerThread("C");
        nt1.start();nt2.start();nt3.start();
        System.out.println("Finish main");
    }
}
