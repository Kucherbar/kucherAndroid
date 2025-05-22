package com.example.kucherandroid;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BookService {

    @GET("/book/{bookId}")
    Call<Book> fetchBook(@Path("bookId") int bookId);

    @GET("/book/{bookId}/page/{pageId}")
    Call<Book.Page> fetchBookPage(@Path("bookId") int bookId, @Path("pageId") int pageId);

    @GET("/book")
    Call<Book.Page> searchBook(@Path("bookId") int bookId, @Path("pageId") int pageId);

    @GET("/book")
    @FormUrlEncoded
    Call<Book> addBook(@Field("title") String title);


}
