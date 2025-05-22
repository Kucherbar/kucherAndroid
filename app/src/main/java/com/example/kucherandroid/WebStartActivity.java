package com.example.kucherandroid;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Text;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

public class WebStartActivity extends AppCompatActivity {
    TextView tv1;
    EditText email;
    EditText password;
    Button sendBut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv1 = findViewById(R.id.textView5);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        sendBut = findViewById(R.id.send);
        sendBut.setOnClickListener((view -> sendPost()));

    }
    private void sendPost() {
        UserService userService = RetrofitHelper.instance().create(UserService.class);
        Call<User> call = userService.login(email.getText().toString(), password.getText().toString());
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                User user = Storage.user = response.body();
                runOnUiThread(() -> {
                    tv1.setText(user.getFirstName() + " " + user.getLastName());
                });
            }

            @Override
            public void onFailure(Call<User> call, Throwable throwable) {
                Toast.makeText(WebStartActivity.this, "Сетевая ошибка", Toast.LENGTH_LONG).show();
            }
        });
    }
}