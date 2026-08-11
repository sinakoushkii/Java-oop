package org.example;

public class Fish extends Animal {
    Fish(String name, String color) {
        super(name, color);
    }

    @Override
    public void move() {
        System.out.println("Fish is swimming...");
    }
}
