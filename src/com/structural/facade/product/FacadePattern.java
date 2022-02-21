package com.structural.facade.product;

/**
 * The Client uses the facade instead of calling the subsystem objects directly.
 */
public class FacadePattern {
    public static void main(String[] args) {
        // here client does not need to interact with 3 different service. Client only calls one single facade service
        ConsumerFacade consumerFacade = new ConsumerFacade();

        Object item = consumerFacade.searchItem("book");
        item = consumerFacade.addItemToCart(item);
        item = consumerFacade.placeOrder(item);
        System.out.println("Placed order = " + item);
    }
}
