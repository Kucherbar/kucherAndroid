package com.example.kucherandroid;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class L44 {
    public static void main(String[] args) {
        Queue people = new LinkedList();
        people.offer("John");
        people.offer("Jane");
        people.offer("Doe");
        while (!people.isEmpty()) {
            System.out.println(people.poll());
        }
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        while (!numbers.isEmpty()) {
            System.out.println(numbers.pop());
        }


    }
}
