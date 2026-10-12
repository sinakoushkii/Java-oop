package org.example;

import zoo.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("wild");
        dog.bark();
        dog.showDogType();
//        System.out.println(dog.name); its ok because name is public
//        System.out.println(dog.id); you are not allowed because id is private
    }
}