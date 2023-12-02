package org.example.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {
        // Demonstrating Checked Exception
        // Checked Exception are anticipated by the compiler and we are required to handle

        try{
            // Attempting to read a file that may not exist
            Scanner fileScanner = new Scanner(new File("somefile.txt"));

        } catch (FileNotFoundException e){
            //FileNotFoundException is a checked exception
            System.out.println("Checked Exception: file not found.");
        }

        // Demonstrating Unchecked Exception
        //Unchecked Exceptions usually result from logical flaws and manifest during runtime
        try{
            //dividing by zero - a logical flaw
            int result = 10/0;

        } catch (ArithmeticException e){
            //ArithmeticException is an unchecked exception
            System.out.println("Unchecked Exception: Cannot divide by zero.");
        }

    }
}
