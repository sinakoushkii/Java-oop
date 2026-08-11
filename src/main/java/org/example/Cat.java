package org.example;

public class Cat extends Animal {

    Cat(String name, String color) {
        super(name, color);
    }

    public void makeSound() {
        System.out.println("Cat goes meow");
    }
}
