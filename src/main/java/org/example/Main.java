package org.example;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\co.koshki\\Desktop\\testFile.txt";
        String fileContent = """
                hello 
                this file has been written using java .
                """;
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(fileContent);
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate the file");
        } catch (IOException e) {
            System.out.println("Couldn't write the file");
        } finally {
            System.out.println("File writing process ended.");
        }

    }
}