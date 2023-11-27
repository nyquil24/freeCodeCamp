package org.example;

public class Person {

    //Attibutes of the Person class
    String name;
    int age;

    //Static variable to keep count of the number of Person object created.
    static int personCount = 0;

    // Default constructor
    public Person(){
        personCount++; //Incrment the count whenever a new Person object is created.
    }

    //Parameterized contructor using the 'this' keyword to initialize the attributes.
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        personCount++; // Increment the count whenever a new Person object is created.
    }
    //speak() method to let the person introduce themselves.
    public void speak(){
        System.out.println("Hello! My name is " + name + " and I am " + age + " years old.");
    }

    //Static method to display the number of Person object created.
    public static void displayCount(){
        System.out.println("Total number of persons: " + personCount);
    }

}
