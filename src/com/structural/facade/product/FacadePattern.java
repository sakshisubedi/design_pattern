package com.structural.facade.product;

public class FacadePattern {
    public static void main(String[] args) {
        //The Client will use the Facade Interface instead of calling the subsystem objects directly
        OrderFacade order = new OrderFacade();
        order.placeOrder();
    }
}
