package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(3,5,8,1));
        System.out.println(average(4,2,3));
    }
    public static double average(double... numbers){
        double result=0;
        if(numbers.length==0){
            return result = 0;
        }

        for(double number:numbers){
            result += number;
        }
        return result / numbers.length;
    }
    public static double sum(double... numbers){
        double result=0;
        if(numbers.length==0){
           return result = 0;
        }

        for(double number : numbers){
            result += number;
        }
        return result;
    }
}