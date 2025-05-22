package com.example.kucherandroid;

import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TreadActivity2 extends AppCompatActivity {
    TextView textView;
    Handler handler = new Handler(){
        public void handleMessage(Message msg){
            String s = msg.obj.toString();
            textView.setText(s);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MyThread mt = new MyThread(handler);
        mt.start();
        textView = findViewById(R.id.textView);
        (new Thread(new ScreenUpdater())).start();
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
    }
    class ScreenUpdater implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                runOnUiThread(() -> textView.append("A"));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}