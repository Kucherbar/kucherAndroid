package com.example.kucherandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class WorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        findViewById(R.id.uiThred).setOnClickListener((v) -> {
            try { Thread.sleep(10000); }
            catch (InterruptedException e)
            { e.printStackTrace(); }
        });
    }

}