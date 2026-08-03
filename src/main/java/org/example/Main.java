package org.example;

public class Main {
    public static void main(String[] args) {
        Student student1= new Student("sina",27,18.5);
        Student student2= new Student("amir",17,20);

        student1.study();
        student1.takeExam();
        student2.takeExam();
    }
}