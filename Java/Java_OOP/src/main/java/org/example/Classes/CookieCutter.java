package org.example.Classes;

public class CookieCutter {

    // Common shape for all cookies made using this cutter.
    String shape;

    // Constructor to initialize the shape of the cookie cutter.
    public CookieCutter(String shape){
        this.shape = shape;
    }

    //  Method to create a new cookie with the specified flavor using this cutter's shape.
    public Cookie makeCookie(String flavor){
        return new Cookie(this.shape, flavor);
    }

}
