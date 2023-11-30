package org.example.Inheritence;



public class CreditCard extends PaymentMethod {
    @Override
    void pay(double amount){
        System.out.println("Paid $" + amount + " using Credit Card");
    }
}
