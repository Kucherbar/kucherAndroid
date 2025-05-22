package com.example.kucherandroid;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class MyListActivity extends AppCompatActivity {
ListView lv;
ArrayList<MyMonth> list = new ArrayList<>();
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);
        lv = findViewById(R.id.lv);
        String[] arr = getResources().getStringArray(R.array.month);
        for(String next : arr) {
//            MyMonth m = new MyMonth(
//                    next,
//                                (new Random()).nextDouble() -15,
//                    (new Random()).nextInt(2) + 20
//                        );
//            list.add(m);
        }
        ArrayAdapter<MyMonth> adapter = new MyMonthAdapt(this, list);
        lv.setAdapter(adapter);
        btn = findViewById(R.id.button4);

    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}