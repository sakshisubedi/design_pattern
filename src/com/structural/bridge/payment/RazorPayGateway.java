package com.structural.bridge.payment;

/**
 * Concrete Implementations contain platform-specific code.
 */
public class RazorPayGateway implements IPaymentGateway{
    @Override
    public boolean processPayment() {
        System.out.println("Payment processed by " + getClass().getSimpleName());
        return true;
    }
}
