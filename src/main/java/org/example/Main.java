package org.example;

import dynamicPoly.Animal;
import dynamicPoly.Cat;
import dynamicPoly.Dog;
import polymorphism.Bike;
import polymorphism.Boat;
import polymorphism.Car;
import polymorphism.Vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};
        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }


        Scanner sc = new Scanner(System.in);
        System.out.print("What would you choose? (1=dog, 2=cat): ");
        int choice = sc.nextInt();
        Animal animal = null;
        if (choice == 1) {
            animal = new Dog();
            animal.sound();
        } else if (choice == 2) {
            animal = new Cat();
            animal.sound();
        }
        sc.close();
    }
}