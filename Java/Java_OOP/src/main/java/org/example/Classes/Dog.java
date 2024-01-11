package org.example.Classes;

public class Dog {

    public String name;
    public int age;

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

    public int getAge(int i){
        return this.age;
    }
}
