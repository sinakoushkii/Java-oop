package org.example;

import java.util.Random;

public class Main {
//    change git config
    public static void main(String[] args) {
        Random random=new Random();

        int number1=random.nextInt(1,11);

        double number2=random.nextDouble(1,5);
        number2 = Math.round(number2 * 100.0) / 100.0;

        double result;
        result = Math.pow(2, 3);      // Raises 2 to the power of 3 (2³ = 8)
        result = Math.sqrt(9);        // Calculates the square root of 9 (3)
        result = Math.round(4.18);    // Rounds 4.18 to the nearest whole number (4)
        result = Math.ceil(4.18);     // Rounds up to the next whole number (5.0)
        result = Math.floor(4.99);    // Rounds down to the previous whole number (4.0)
        result = Math.max(10, 20);    // Returns the larger value (20)
        result = Math.min(10, 20);    // Returns the smaller value (10)

        System.out.println(result);

        double price= 10000.69005;
        System.out.printf("%,.2f",price);



    }
}