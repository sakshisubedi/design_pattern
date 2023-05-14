package com.structural.facade.product;

/*
* The Facade class provides a simple interface to the complex logic of one
  or several subsystems. The Facade delegates the client requests to the
  appropriate objects within the subsystem.
* */
public class OrderFacade {
    Product product;
    Payment payment;
    Invoice invoice;

    public OrderFacade() {
        product = new Product();
        payment = new Payment();
        invoice = new Invoice();
    }

    public void placeOrder() {
        System.out.println("Place Order Started");
        product.getProductDetails();
        payment.makePayment();
        invoice.sendInvoice();
        System.out.println("Order Placed Successfully");
    }
}
