package com.example.kucherandroid;

public class MyHouse {
    private boolean pizzaArrived = false;

    public synchronized void pizzaGuy() {
        pizzaArrived = true;
        notifyAll();

    }

    public synchronized void eatPizza() {
        while (!pizzaArrived) {
            System.out.println();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }

        System.out.println("yum-yum");
    }

    public static void main(String[] args) {
        MyHouse house = new MyHouse();
        Thread thread = new Thread(new Runnable() {
            public void run() {
                house.eatPizza();
            }
        });
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        house.pizzaGuy();
    }

}
