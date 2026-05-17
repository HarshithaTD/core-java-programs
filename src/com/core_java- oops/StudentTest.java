package com.core_java;
class Student {
    int id;
    String name;
    String course;

    // Constructor 1 - id and name
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor 2 - id, name, and course (constructor chaining)
    Student(int id, String name, String course) {
        this(id, name); // calls the first constructor
        this.course = course;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Course: " + course);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        // Object creation using first constructor
        Student s1 = new Student(101, "Harshitha");
        s1.display();

        // Object creation using second constructor
        Student s2 = new Student(102, "Rahul", "Computer Science");
        s2.display();
    }
}

