package org.example;

public class Main {
    public static void main(String[] args) {
        String email = "sinak1@gmail.com";
        String name = " Sina Koushki   ";
        String modifiedName;

        char characterAt = name.charAt(2);                  // Returns the character at index 2
        int indexOF = name.indexOf('K');                    // Returns the index of the first occurrence of 'K' (-1 if not found)
        int nameLength = name.length();                     // Returns the number of characters in the string
        name = name.toUpperCase();                          // Converts all characters to uppercase
        name = name.toLowerCase();                          // Converts all characters to lowercase
        name = name.trim();                                 // Removes leading and trailing whitespace
        boolean hasTheChar = name.contains("a");            // Checks if the string contains "a"
        boolean isEqual = name.equals("amir");              // Checks if the string is exactly equal to "amir"
        String userName = email.substring(0, email.indexOf('@')); // Extracts the username part before '@'
        String domain = email.substring(email.indexOf('@') + 1);  // Extracts the domain part after '@';
        System.out.println(domain);

    }
}