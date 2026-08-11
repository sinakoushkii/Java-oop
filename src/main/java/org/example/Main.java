package org.example;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("teddy", "white");
        Dog dog1 = new Dog("bob", "black");
        Plant flower = new Plant();

        flower.photosenthysize();
        System.out.println("flower " + flower.isAlive);
        System.out.println(cat1.name + " " + dog1.name);
        System.out.println(cat1.isAlive);
        dog1.eat();
        cat1.eat();

    }
}