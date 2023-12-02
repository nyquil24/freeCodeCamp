package org.example.Exceptions;

import java.io.IOException;

public class RethrowingExample {
    public static void main(String[] args) {
        try{
            testRethrow();

        } catch (IOException | RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    static void testRethrow() throws IOException, RuntimeException{
        try{
            //Some code that throws an exception
            throw new IOException("IO exception");

        } catch (Exception e){
            // Re-throwing the exception with enhanced type-chekcing
            throw e;
        }
    }
}
