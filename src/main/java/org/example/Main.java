package org.example;

import polymorphism.Bike;
import polymorphism.Boat;
import polymorphism.Car;
import polymorphism.Vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};
        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }

    }
}