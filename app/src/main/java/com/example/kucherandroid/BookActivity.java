package com.example.kucherandroid;

import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        BookService bs = RetrofitHelper.instance().create(BookService.class);
        Call<Book> bookCall = bs.fetchBook(5);
        Call<Book.Page> bookPageCall = bs.fetchBookPage(5,20);
        bookCall.enqueue(new Callback<Book>() {

            @Override
            public void onResponse(Call<Book> call, Response<Book> response) {
                Book b = response.body();
                Toast.makeText(BookActivity.this,"Book:" + b.title,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<Book> call, Throwable throwable) {
                throwable.printStackTrace();
                finish();
            }
        });
        bookPageCall.enqueue(new Callback<Book.Page>() {

            @Override
            public void onResponse(Call<Book.Page> call, Response<Book.Page> response) {
                Book.Page p = response.body();
                Toast.makeText(BookActivity.this, "page " + p.number + " of book " + p.book.title, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<Book.Page> call, Throwable throwable) {
                throwable.printStackTrace();
            }
        });
    }
}