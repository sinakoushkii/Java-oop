package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();

        int number1=random.nextInt(1,11);
        double number2=random.nextDouble(1,5);


        System.out.println(number2);

    }
}