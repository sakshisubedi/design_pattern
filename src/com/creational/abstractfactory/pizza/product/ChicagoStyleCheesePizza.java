package com.creational.abstractfactory.pizza.product;

import com.creational.abstractfactory.pizza.model.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        this.setName("Chicago Style Cheese Pizza");
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
