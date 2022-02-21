package com.structural.facade.product;

// The ConsumerFacade exposes only client related APIs/methods and not of admin
public class ConsumerFacade {
    private IOrder orderService;
    private ICart cartService;
    private ICatalog catalogService;

    public Object addItemToCart(Object item) {
        return cartService.addItemToCart(item);
    }

    public Object searchItem(String item){
        return catalogService.searchItem(item);
    }

    public Object placeOrder(Object item){
        return orderService.placeOrder(item);
    }

}
