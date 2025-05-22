package com.example.kucherandroid;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHelper {
    public static Retrofit retrofit = null;
    public static Retrofit instance() {
    if (retrofit == null) {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.38:8080")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        ;
    }
    return retrofit;
    }
}
