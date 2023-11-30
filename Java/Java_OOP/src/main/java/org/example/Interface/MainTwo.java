package org.example.Interface;

public class MainTwo {
    public static void main(String[] args) {

//        Drawable circle = new Circle();
//        Drawable rectangle = new Rectangle();
//
//        circle.draw();
//        rectangle.draw();

        //Create instance of Circle and Rectangle
//        ModifiableShape circle = new Circle(5.0, "Red");
//        ModifiableShape rectangle = new Rectangle(4.0,6.0,"Blue");
//
//        // Modify and draw shapes without knowing thier specific implementations
//        circle.setSize(8.0,8.0);
//        circle.setColor("Green");
//        circle.draw();
//
//        rectangle.setSize(5.0,7.0);
//    rectangle.setColor("Yellow");
//    rectangle.draw();


        Robot robot = new Robot();

        // Demonstrate the robot's capabilities

        robot.walk();
        robot.fly();
        robot.swim();
    }
}
