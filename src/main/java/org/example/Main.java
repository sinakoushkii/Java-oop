package org.example;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("teddy", "white");
        Dog dog1 = new Dog("bob", "black");
        Fish fish1 = new Fish("nemo", "orange");
        Car car1 = new Car("red", 2025, "mustang");

        System.out.println(car1);


        Plant flower = new Plant();

        dog1.move();
        cat1.move();
        fish1.move();

        flower.photosenthysize();
        System.out.println("flower " + flower.isAlive);
        System.out.println(cat1.name + " " + dog1.name);
        System.out.println(cat1.isAlive);
        dog1.eat();
        cat1.eat();

    }
}