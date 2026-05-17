package com.core_java;
class Employee1{
    int empId;
    String empName;
    double salary;

    // Constructor 1 - only empId
    Employee1(int empId) {
        this.empId = empId;
    }

    // Constructor 2 - empId and empName
    Employee1(int empId, String empName) {
        this(empId); // calls first constructor
        this.empName = empName;
    }

    // Constructor 3 - empId, empName, and salary
    Employee1(int empId, String empName, double salary) {
        this(empId, empName); // calls second constructor
        this.salary = salary;
    }

    void display() {
        System.out.println("EmpID: " + empId );
        System.out.println(" Name: " + empName );
        if (salary!= 0) {
        	System.out.println("Salary: " + salary);
    }
    }
}



public class EmployeeTest {
	 public static void main(String[] args) {
	        Employee1 e1 = new Employee1(1);
	        e1.display();

	        Employee1 e2 = new Employee1(2, "Harshitha");
	        e2.display();

	        Employee1 e3 = new Employee1(3, "Rahul", 45000);
	        e3.display();
	    }
}
