package com.structural.facade.product;

import java.util.List;

public interface IOrder {
    Object placeOrder(Object order);
    Object cancelOrder(Object order);
    Object trackOrder(Object order);

    // for ADMIN use
    Object getBulkOrder();
    Object sendBulkOrder(List<Object> orders);
}
