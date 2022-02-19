package com.structural.bridge;

/**
 * Concrete Implementations contain platform-specific code.
 */
public class GooglePayGateway implements IPaymentGateway {
    @Override
    public boolean processPayment() {
        System.out.println("Payment processed by " + getClass().getSimpleName());
        return true;
    }
}
