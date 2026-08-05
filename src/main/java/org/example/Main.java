package org.example;

public class Main {
    public static void main(String[] args) {
        showNumberOfFriends();
        manageCars();

    }

    public static void manageCars() {

//        First approach to create array of objects
//        Car car1 = new Car("red", "corvetee");
//        Car car2 = new Car("blue", "charger");
//        Car car3 = new Car("green", "mustang");
//
//        Car[] cars = {car1, car2, car3};

//      Second approach to create array of objects
        Car[] cars = {
                new Car("red", "corvetee"),
                new Car("blue", "charger"),
                new Car("green", "mustang"),
        };
        for (Car car : cars) {
            car.color = "black";
        }

        for (Car car : cars) {
            car.move();
        }
    }

    public static void showNumberOfFriends() {
        Friend friend1 = new Friend("Reza");
        Friend friend2 = new Friend("Javad");
        Friend friend3 = new Friend("Naser");
        Friend friend4 = new Friend("Amir");

        Friend.totalFriends();
    }
}