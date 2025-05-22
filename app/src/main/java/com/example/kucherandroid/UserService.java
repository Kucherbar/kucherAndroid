package com.example.kucherandroid;

import retrofit2.Call;
import retrofit2.http.*;

public interface UserService {

    @GET("/greeting/user")
    Call<User> fetchUser();
    @POST("/login")
    @FormUrlEncoded
    Call<User> login(@Field("email") String email, @Field("pwd") String pwd);
    @POST ("/registration")
    @FormUrlEncoded
    Call<User> createUser(@Body User user);

}
