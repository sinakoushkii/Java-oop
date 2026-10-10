package org.example;

import dog.Dog;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        // This is a anonymous class for one time usage
        Dog dog2 = new Dog() {
            @Override
            public void speak() {
                System.out.println("Hi, my name is rex....");
            }
        };

        dog1.speak();
        dog2.speak();
    }
}