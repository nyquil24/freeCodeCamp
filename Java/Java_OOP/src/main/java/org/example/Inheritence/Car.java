package org.example.Inheritence;

public class Car extends Vehicle {
    @Override
    void description(){
        super.description(); // Calling the parent class's description method
        System.out.println("More specifically, this is a car.");
    }
}
