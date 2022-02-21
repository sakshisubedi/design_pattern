package com.structural.facade.restaurant;

/**
 * The Client uses the facade instead of calling the subsystem objects directly.
 */
public class FacadePattern {
    public static void main(String[] args) {
        // Simple for the client
        // no need to know the order or the
        // dependencies among various subsystems.
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.orderFood();
    }
}
