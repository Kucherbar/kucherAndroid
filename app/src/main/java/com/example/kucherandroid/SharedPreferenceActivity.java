    package com.example.kucherandroid;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SharedPreferenceActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editTextStr, editTextNum;
    private SharedPreferences sharedPreferences;
    final String SAVED_TEXT = "TEXT";
    final String SAVED_NUM = "NUMBER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);
        editTextStr = findViewById(R.id.editTextStr);
        editTextNum = findViewById(R.id.editTextNum);
        Button btnSave = findViewById(R.id.save);
        btnSave.setOnClickListener(this);
        Button btnLoad = findViewById(R.id.load);
        btnLoad.setOnClickListener( (view -> {
            loadData();
        }));
    }

    @Override
    public void onClick(View view) {
        saveData();
    }
    void saveData() {
        sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(editTextNum.getText().toString() , editTextStr.getText().toString());
        editor.apply();
        Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
    }
    void loadData() {
        sharedPreferences = getPreferences(MODE_PRIVATE);
        String savedText = sharedPreferences.getString(editTextNum.getText().toString(), "");
        editTextStr.setText((savedText));
        Toast.makeText(this, "Loaded", Toast.LENGTH_SHORT).show();
    }

}