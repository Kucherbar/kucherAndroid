package com.example.kucherandroid;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MatchAddActivity2 extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_add2);
        lv = findViewById(R.id.lv);
        DBMatches db = new DBMatches(this);
        ArrayList<Match> list = db.selectAll();
        ArrayAdapter<Match> e = new ArrayAdapter<Match>(this,
                android.R.layout.simple_list_item_1, list);
        lv.setAdapter(e);
    }
}