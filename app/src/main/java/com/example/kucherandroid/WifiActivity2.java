package com.example.kucherandroid;

import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.lifecycle.Observer;

public class WifiActivity2 extends AppCompatActivity implements Observer<String> {
    private TextView networkName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi2);
        networkName = (TextView) findViewById(R.id.network_name);
        NetworkLiveData.getInstance(this).observe(this,this);
        //NetworkLiveData.getInstance(this).observeForever(this);
    }

    @Override
    public void onChanged(@Nullable String s) {
        networkName.setText(s);
    }
}