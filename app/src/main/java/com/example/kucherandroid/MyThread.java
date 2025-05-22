package com.example.kucherandroid;

import android.os.Handler;
import android.os.Message;

import java.util.HashMap;


public class MyThread extends Thread {
    Handler handler;
    public MyThread(Handler handler) {
        this.handler = handler;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(10000);
            Message msg = new Message();
            msg.what = 1;
            msg.obj = "End my thread object thread";

            handler.sendMessage(msg);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
