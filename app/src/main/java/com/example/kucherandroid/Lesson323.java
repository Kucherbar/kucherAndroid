package com.example.kucherandroid;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Lesson323 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("a.txt");
        File file2 = new File("b.txt");
        FileOutputStream io = new FileOutputStream(file);
        FileOutputStream out = new FileOutputStream("b.txt");

    }

}
