package com.structural.facade.product;

public interface ICart {
    Object addItemToCart(Object item);
    Object removeItemFromCart(Object item);

    // for ADMIN use
    Object getPendingCartItemsForNotification();
}
