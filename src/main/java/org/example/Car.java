package org.example;

public class Car {
    String color;
    String name;

    Car(String color, String name) {
        this.color = color;
        this.name = name;
    }

    void move() {
        System.out.println("You are driving the " + this.color + " " + this.name);
    }
}
