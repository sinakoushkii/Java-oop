package org.example;

import org.example.ineritance.Fish;
import org.example.ineritance.Hawk;
import org.example.ineritance.Rabbit;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(2.5);
        Triangle triangle = new Triangle(3, 6);

        Fish fish = new Fish();
        Hawk hawk = new Hawk();
        Rabbit rabbit = new Rabbit();

        fish.hunt();
        fish.flee();

        hawk.hunt();
        rabbit.flee();

        System.out.println(triangle.area());
        System.out.println(circle.area());
        System.out.println(rectangle.area());

        triangle.display();
        rectangle.display();
        circle.display();
    }
}