package com.structural.facade.product;

public class Payment {
/*
* Subsystem 2
  The Subsystem can accept requests either from the facade or from the client directly.
  In this case, from the Subsystem, the Facade is also a client
  Facade is not a part of the Subsystem.
* */
    public void makePayment() {
        System.out.println("Payment Done Successfully");
    }
}
