package com.structural.bridge.payment;

/**
 * Usually, the Client is only interested in working with the abstraction. 
   However, it’s the client’s job to link the abstraction object with one of the implementation objects.
 */
public class BridgePattern {
    public static void main(String[] args) {
        IPaymentGateway paymentGateway = new GooglePayGateway();
        // user chooses netbanking option
        // set the gateway based on the availabilty of default gateway
        PaymentSystem paymentSystem = new NetBankingPaymentSystem(paymentGateway);
        paymentSystem.makePayment();
    }
}
