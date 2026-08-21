package polymorphism;

public class Car extends Vehicle {

    @Override
    public void go() {
        System.out.println("You're driving the car.");
    }
}
