package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] fruit = {"apple", "orange", "banana", "coconut"};
        Arrays.sort(fruit);

        System.out.print("What number of food do you want? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] food = new String[size];
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
}