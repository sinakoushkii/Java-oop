package org.example;

public class Box<T> {
    T item;

    Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}
