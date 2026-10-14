package org.example;

import animal.Animal;
import animal.Cat;
import animal.Dog;
import animal.Duck;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Duck duck = new Duck();
        duck.fly();
        duck.swimm();


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);

        for (Animal animal : animals) {
            animal.speak();
        }
    }
}