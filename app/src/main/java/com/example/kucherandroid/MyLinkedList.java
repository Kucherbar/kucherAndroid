package com.example.kucherandroid;

import androidx.annotation.NonNull;
import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Node;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {

    private int size = 0;
    private MyNode<T> head;
    private MyNode<T> tail;
    public void add(T data) {
        if (size == 0) {
            this.head = new MyNode<>(data);
            this.tail = this.head;
            size = 1;
            return;
        }
        MyNode<T> newNode = new MyNode<>(data);
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.size++;
    }
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        MyNode<T> node = this.head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getValue();
    }
    public void remove(int index) {
        if (index < 0 || index >= size || this.size == 0) {
            return;
        }
        MyNode<T> prev = null;
        MyNode<T> node = this.head;
        if (index == 0) {
            this.head = this.head.getNext();
            if( this.head == this.tail) {
                this.tail = this.head;
            }
            this.size--;
            return;
        }
        for (int i = 0; i < index; i++) {
            prev = node;
            node = node.getNext();
        }
        prev.setNext(node.getNext());
        this.size--;
    }
    @NonNull
    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new MLLI();
    }
    public class MLLI implements Iterator<T> {
        private MyNode<T> cursor = head;

        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        @Override
        public T next() {
            T value = cursor.getValue();
            cursor = cursor.getNext();
            return value;
        }
    }
}
