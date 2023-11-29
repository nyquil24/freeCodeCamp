package org.example.Interface;

import org.w3c.dom.css.Rect;

// Class representing a Rectangle that implements the Drawable interface
public class Rectangle implements ModifiableShape {

    private double width;
    private double height;
    private String color;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void setSize(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {

    }
}