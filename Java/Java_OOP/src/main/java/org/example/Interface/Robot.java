package org.example.Interface;

import org.example.Walkable;

public class Robot implements Walkable, Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Robot is flying");
    }

    @Override
    public void swim() {
        System.out.println("Robot is swimming");
    }

    @Override
    public void walk() {
        System.out.println("Robot is walking");
    }
}
