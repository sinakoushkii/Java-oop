package org.example;

public class Animal extends Organism {

    String name;
    String color;

    Animal(String name, String color) {
        this.name = name;
        this.color = color;

    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void move() {
        System.out.println("Animal is running");
    }
}
