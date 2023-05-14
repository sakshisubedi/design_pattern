package com.structural.bridge.payment;

/**
 * The Abstraction provides high-level control logic. It relies on the implementation object to do the actual low-level work.
 */
public abstract class PaymentSystem {
    // Payment System contains Payment Gateway
    IPaymentGateway paymentGateway;

    public PaymentSystem(IPaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public abstract boolean makePayment();
}
