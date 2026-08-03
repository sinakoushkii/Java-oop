package org.example;

public class Student {
    String name;
    int age;
    double gpa;

    Student(String name,int age,double gpa){
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }


    void study(){
        System.out.println(this.name + " is studying");
    }

    void takeExam(){
        System.out.println(this.name + " is taking the exam...");
    }
}
