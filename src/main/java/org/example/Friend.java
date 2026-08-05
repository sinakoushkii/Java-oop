package org.example;

public class Friend {
    public static int numberOfFriends = 0;
    String name;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    public static void totalFriends() {
        System.out.println("You have " + numberOfFriends + " friends");
    }

}
