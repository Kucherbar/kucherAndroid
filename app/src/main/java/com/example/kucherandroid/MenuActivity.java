package com.example.kucherandroid;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MenuActivity extends AppCompatActivity {
    Button watch;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        watch = findViewById(R.id.watch);
        add = findViewById(R.id.add);
        watch.setOnClickListener((view -> {
            Intent intent = new Intent(MenuActivity.this,MatchAddActivity2.class);
            startActivity(intent);
        }));
        add.setOnClickListener((view -> {
            Intent intent = new Intent(MenuActivity.this,Matches_Activity.class);
            startActivity(intent);
        }));
    }
}