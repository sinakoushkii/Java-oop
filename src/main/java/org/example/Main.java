package org.example;

public class Main {
    public static void main(String[] args) {
//      generic : is a concept that you write class, methods or interfaces that are compatible
//      with different data types
//      <T> type parameter (placeholder that get replaced with real type)
//      <String> type argument (specifies the type)
//      we send argument to parameters

        Box<String> box = new Box<>("cup");
        System.out.println(box.getItem());

        Product<String, Integer> product1 = new Product<>("shirt", 17);
        Product<String, Double> product2 = new Product<>("watch", 24.9);

        System.out.println(product1.getPrice());
        System.out.println(product2.getPrice());

    }
}