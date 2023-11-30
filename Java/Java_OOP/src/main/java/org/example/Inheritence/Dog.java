package org.example.Inheritence;

public class Dog extends Animal {

    //constructor
    public Dog(String name, String species){
        super(name, species);
    }

    void bark(){
        System.out.println(name + " is barking! ");
    }

}
