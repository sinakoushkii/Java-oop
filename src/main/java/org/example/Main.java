package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Student.showStudentCodes();
        ArrayList<String> food = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of food you would like : ");
        int numberOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfFood; i++) {
            System.out.print("Enter food number " + i + " : ");
            String selectedFood = scanner.nextLine();
            food.add(selectedFood);
        }
        scanner.close();

        System.out.println(food);

    }
}