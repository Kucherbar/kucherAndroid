package com.example.kucherandroid;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Character c = new Character("Вася", 1, 100, 50);
        Story story = new Story(c, Situation.getWindow());
        while (!story.isEnd()) {
            System.out.println(story.current.getText());
            int a = sc.nextInt();
            story.go(a);
        }
    }
}