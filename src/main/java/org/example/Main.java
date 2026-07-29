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
        result = Math.pow(2,3);
        result = Math.sqrt(9);
        result = Math.round(4.18);
        result = Math.ceil(4.18);
        result = Math.floor(4.99);
        result = Math.max(10,20);
        result = Math.min(10,20);


        System.out.println(result);



    }
}