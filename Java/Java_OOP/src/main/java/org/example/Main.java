package org.example;

import org.example.Classes.Cat;
import org.example.Classes.Dog;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        //creating a heart-shaped cookie cutter.
//        CookieCutter heartShapedCutter = new CookieCutter("heart");
//
//        //Using the heart-shaped cutter to create cookies with different flavors.
//        Cookie chocolateHeartCookie = heartShapedCutter.makeCookie("chocolate");
//        Cookie vanillaHeartCookie = heartShapedCutter.makeCookie("vanilla");
//
//        chocolateHeartCookie.describe();
//        vanillaHeartCookie.describe();

//        //Instantiating three different Person objects
//        Person person1 = new Person("Alice",25);
//        Person person2 = new Person("Ali",28);
//        Person person3 = new Person("Aline",30);
//
//        // Calling the speak() method for each Person object
//
//        person1.speak();
//        person2.speak();
//        person3.speak();
//
//        Person.displayCount();

//        Derived d = new Derived();
//        System.out.println("Derived object value: " + d.value);

//        Dog myDog = new Dog("Buddy", "Frenchie");

//        new Child(); // This will print both messages: one from the Parent's constructor

//        Car car = new Car();
//        car.description();

//        PaymentMethod p; // Referenc of type PaymentMethod
//
//        p = new CreditCard(); //p njow refers to a CreditCard ovject
//        p.pay(100.50);
//
//        p = new Paypal(); // p now refers to a PayPal object
//        p.pay(200.75); //calls PayPal's implementation of pay()

// Create instances of Circle and Rectangle

//        Map m = new HashMap();
//        String str = "hello my name is tim and I am cool ";
//
//        for(char x:str.toCharArray()){
//            if m.containsKey(x){
//                int old = (int) m.get(x);
//                m.put(x, old+1);
//            }else{
//                m.put(x,1);
//            }
//        }
//        System.out.println(m);

//    int[] x = {-99,5,6,3,2,1,7};
//
//        Arrays.sort(x, 1, 7);
//        for(int i : x){
//            System.out.println(i + ",");
//        }
//        Dog tim = new Dog("tim", 4);
//        tim.speak();

        /*
        A Set is a colleciton of unordered elements that are unique,meaning that a Set
        cannot contain the same element twice, and it doesn't know where that element exists
         */
        /*
        The elements in a TreeSet are ordered ina tree data structure.
         */
//        Set<Integer> t = new TreeSet<>();
//        t.add(5);
//        t.add(7);
//        t.add(5);
//        t.add(9);
//        t.add(-9);
//
//        boolean x = t.contains(5);
//        System.out.println(x);
//
//        System.out.println(t);
//
//        t.remove(9);
//        System.out.println(t);

        /*
        An ArrayList can change sizes,we can add things to it, and we can remove things form it
         */
//ArrayList<Integer> t = new ArrayList<Integer>();
//
//t.add(1);
//t.add(2);
//t.get(0);
//        System.out.println(t);
//t.set(1,5);
//
//        System.out.println(t);


/*
Maps use a key:value pair

3 different types of maps: hashmaps, tree maps, and linked hashmaps
 */

        Map m = new HashMap();
//        m.put("tim", 5);
//        m.put("joe","x");
//        m.put(11,999);
//
//        System.out.println(m);
//
//        String str = "hello my name is tim and i am cool";
//
//        for(char x:str.toCharArray()){
//            if (m.containsKey(x)){
//                int old = (int) m.get(x);
//                m.put(x, old+1);
//            } else{
//                m.put(x,1);
//            }
//        }

//        int[] x = {-99, 5, 6, 3, 2, 1, 7, 8, 0};
//
//        Arrays.sort(x, 3,6);
//
//        for(int i:x){
//            System.out.print(i + ",");
//        }


        Dog tim = new Dog("tim", 4);
        tim.speak();

        tim.getAge(10);
        tim.speak();

        Cat timothy = new Cat("timothy", 18, 100);
        timothy.speak();

    }

}