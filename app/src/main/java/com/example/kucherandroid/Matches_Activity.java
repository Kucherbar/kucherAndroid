package com.example.kucherandroid;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;

public class Matches_Activity extends AppCompatActivity implements View.OnClickListener {
    EditText mI1;
    EditText mI2;
    EditText mI3;
    EditText mI4;
    DBMatches dbMatches;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matches);
        dbMatches  = new DBMatches(this);
        mI1 = findViewById(R.id.InfoET1);
        mI2 = findViewById(R.id.InfoET2);
        mI3 = findViewById(R.id.InfoET3);
        mI4 = findViewById(R.id.InfoET4);

        Button b = findViewById(R.id.addBut);
        b.setText("Add Matches");
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String t1 = mI1.getText().toString();
        String t2 = mI2.getText().toString();
        int p1 = Integer.parseInt(mI3.getText().toString());
        int p2 = Integer.parseInt(mI4.getText().toString());
        Match m = new Match(t1, t2, p1, p2);
        mI1.setText("");
        mI3.setText("");
        mI2.setText("");
        mI4.setText("");
        dbMatches.Insert(m);
    }
}