package org.example;

import java.util.ArrayList;

public class Student {
    public static void showStudentCodes(){
        ArrayList<Integer> studentCodes=new ArrayList<>();
        studentCodes.add(401);
        studentCodes.add(201);
        studentCodes.add(301);
        studentCodes.add(101);

//        studentCodes.remove(1);
//        System.out.println(studentCodes.get(1));
//        studentCodes.set(0,701);
//        Collections.sort(studentCodes);

        System.out.println(studentCodes);

        for(int code : studentCodes){
            System.out.println(code);
        }
    }
}
