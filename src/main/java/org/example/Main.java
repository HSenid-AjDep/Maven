package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a Student object and set values
        Student student = new Student();
        student.setId(1);
        student.setAge(20);
        student.setName("Jane Doe");
        student.setSubjects(Arrays.asList("Mathematics", "English", "History"));



        // Print the Student object
        System.out.println(student);
    }
}
