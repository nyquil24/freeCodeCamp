package org.example;

public class Dog {

    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void speak(){
        System.out.println("I am " + this.name + " and I am " + this.age + "years old ");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
