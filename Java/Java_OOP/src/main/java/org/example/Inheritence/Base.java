package org.example.Inheritence;

public class Base {

    void setup(){
        System.out.println("Base setup");
    }

    //Base constructor
    Base(){
        System.out.println("Base constructor");
        //Calling overridable method inside constructor
        setup();
    }

}
