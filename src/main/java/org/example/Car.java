package org.example;

public class Car {
    String color;
    int year;
    String name;

    Car(String color, int year, String name) {
        this.color = color;
        this.year = year;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.year + " " + this.color + " " + this.name;
    }
}
