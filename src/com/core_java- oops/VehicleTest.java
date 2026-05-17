package com.core_java;
class Vehicle {
    String brand;
    double price;

    // Constructor to initialize both fields
    Vehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }
}

class Car extends Vehicle {
    int seatingCapacity;

    // Constructor of Car uses super() to initialize Vehicle fields
    Car(String brand, double price, int seatingCapacity) {
        super(brand, price); // calling parent constructor
        this.seatingCapacity = seatingCapacity;
    }

    void display() {
        super.display();
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Hyundai", 850000, 5);
        car.display();
    }
}


