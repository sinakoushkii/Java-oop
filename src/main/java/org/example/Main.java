package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a your mobile number: ");
            int mobileNumber = scanner.nextInt();
        } catch (ArithmeticException e) {
            System.out.println("you can't divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("You inserted a wrong value");
        } catch (Exception e) {
            System.out.println("Something went wrong :(");
        } finally {
            scanner.close();
        }
    }
}