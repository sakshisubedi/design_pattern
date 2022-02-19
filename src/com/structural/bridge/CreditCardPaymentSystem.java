package com.structural.bridge;

/**
 * Refined Abstractions provide variants of control logic. Like their parent, they work with different implementations via the general implementation interface.
 */
public class CreditCardPaymentSystem extends PaymentSystem{

    public CreditCardPaymentSystem(IPaymentGateway paymentGateway) {
        super(paymentGateway);
    }

    @Override
    public boolean makePayment() {
        if(this.paymentGateway.processPayment()) {
            System.out.println("Payment made by " + getClass().getSimpleName());
            return true;
        }

        System.out.println("Payment cannot be made by " + getClass().getSimpleName() + " due to the error in " + paymentGateway.getClass().getSimpleName());
        return false;
    }
}
