package org.example.Inheritence;

public class Derived extends Base {

    int value;

    //Overriding the setup method
    @Override
    void setup(){
        value = 42;
        System.out.println("Derived setup with value: " + value);
    }

    //Derived class constructor
    Derived(){
        System.out.println("Derived constructor");
    }

}
