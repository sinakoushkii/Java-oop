package org.example;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(2.5);
        Triangle triangle = new Triangle(3, 6);

        System.out.println(triangle.area());
        System.out.println(circle.area());
        System.out.println(rectangle.area());

        triangle.display();
        rectangle.display();
        circle.display();
    }
}