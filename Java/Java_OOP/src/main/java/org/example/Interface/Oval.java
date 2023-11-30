package org.example.Interface;

// Class representing a Circle that implements the Shape interface
public class Oval implements Shape{

    private double radius;

    public Oval(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
