package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of week: ");
        String response = scanner.nextLine().toUpperCase();

        scanner.close();


        try {
            Day day = Day.valueOf(response);
            switch (day) {
                case MONDAY,
                        THURSDAY -> System.out.println("Its weekDay");
                case SATURDAY, SUNDAY -> System.out.println("Its weekEnd");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Enter a valid weekday !!!!");
        }
    }
}