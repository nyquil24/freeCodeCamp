package org.example;

public class Child extends Parent{
    Child(){
        super("Parent's constructor called with a message."); // Explicitly calling parent
        System.out.println("child's constructor called.");
    }

}
