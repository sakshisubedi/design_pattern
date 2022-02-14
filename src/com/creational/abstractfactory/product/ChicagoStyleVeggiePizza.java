package com.creational.abstractfactory.product;

import com.creational.abstractfactory.model.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        this.setName("Chicago Style Veggie Pizza");
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
