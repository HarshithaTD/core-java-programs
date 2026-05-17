package com.core_java;
//Parent Class - Person
class Person {
 private String name;
 private int age;

 // Constructor to initialize name and age
 Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getters
 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 // Setters
 public void setName(String name) {
     this.name = name;
 }

 public void setAge(int age) {
     this.age = age;
 }
}

//Child Class - Employee
class Employe extends Person {
 private int empId;
 private double salary;

 // Constructor with super()
 Employe(String name, int age, int empId, double salary) {
     super(name, age);  // calling parent constructor
     this.empId = empId;
     this.salary = salary;
 }

 // Getters
 public int getEmpId() {
     return empId;
 }

 public double getSalary() {
     return salary;
 }

 // Setters
 public void setEmpId(int empId) {
     this.empId = empId;
 }

 public void setSalary(double salary) {
     this.salary = salary;
 }
}

//Main class to test
public class PersonTest {
 public static void main(String[] args) {
     // Creating Employee object using constructor
     Employe emp = new Employe("Harshitha", 22, 101, 50000);

     // Display details using getters
     System.out.println("Employee Details:");
     System.out.println("Name: " + emp.getName());
     System.out.println("Age: " + emp.getAge());
     System.out.println("Employee ID: " + emp.getEmpId());
     System.out.println("Salary: " + emp.getSalary());
 }
}
