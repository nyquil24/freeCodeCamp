package org.example.Inheritence;

import org.example.Inheritence.PaymentMethod;

public class Paypal extends PaymentMethod {
    @Override
    void pay(double amount){
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}
