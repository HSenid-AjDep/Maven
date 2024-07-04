package org.example;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
public class Student {
    private int id;
    private String name;
    private int age;
    private List<String> subjects;

    //**** In order to Test lombok getters and Setters in the main method these commented***//

// Constructor
//    public Student(int id, String name, int age, List<String> subjects) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.subjects = subjects;
//    }

//Passing the ToString from Lombok

//    @Override
//    public String toString() {
//        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", subjects=" + subjects + '}';
//    }
}
