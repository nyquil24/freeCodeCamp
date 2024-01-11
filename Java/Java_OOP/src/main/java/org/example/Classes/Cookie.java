package org.example.Classes;

public class Cookie {

    //Every cookie will have a shape and a flavor.
    String shape;
    String flavor;

    //Constructor to initialize the shape and flavor of  the cookie.
    public Cookie(String shape, String flavor){
        this.shape = shape;
        this.flavor = flavor;
    }

    //Method to describe the cookie.
    public void describe(){
        System.out.println("This is a " + flavor + " flavored "  + shape + " cookie.");
    }
}
