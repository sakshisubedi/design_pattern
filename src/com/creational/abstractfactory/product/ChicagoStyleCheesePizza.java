package com.creational.abstractfactory.product;

import com.creational.abstractfactory.model.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        this.setName("Chicago Style Cheese Pizza");
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
