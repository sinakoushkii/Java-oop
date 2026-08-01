package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        searchInArray();
    }


    public static void createArray() {
        String[] fruit = {"apple", "orange", "banana", "coconut"};
        Arrays.sort(fruit);

        System.out.print("What number of food do you want? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] food = new String[size];

        scanner.nextLine();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter a food: ");
            food[i] = scanner.nextLine();
        }
        scanner.close();

        for (String Food : food) {
            System.out.println(Food);
        }

//        for (String frui : fruit) {
//            System.out.println(frui.toLowerCase());
//        }

    }

    public static void searchInArray() {
        System.out.print("What food do you want? ");
        Scanner scanner = new Scanner(System.in);
        String target = scanner.nextLine();
        boolean isFound = false;

        String[] foods = {"pizza", "kebab", "sushi", "french frise"};

        for (String food : foods) {
            if (food.equals(target)) {
                System.out.println("Food found :)");
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Food not found :(");
        }

    }
}