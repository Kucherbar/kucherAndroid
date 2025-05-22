package com.example.kucherandroid;

public class Book {
    public String title;
    public String author;
    public int pages;
    public static class Page {
        public String text;
        public int number;
        public Book book;
    }
}
