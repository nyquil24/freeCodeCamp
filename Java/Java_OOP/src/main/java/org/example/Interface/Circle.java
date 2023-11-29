package org.example.Interface;


// Class represnenting a Circle that implements the Drawable interface
public class Circle implements ModifiableShape{
    private double radius;
    private String color;

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;

    }

    @Override
    public void setSize(double width, double height){
        this.radius = Math.max(width, height) / 2;
    }

    @Override
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a Circle with radius " + radius + " and color " + color);
    }

}
