package com.creational.abstractfactory.pizza.product;

import com.creational.abstractfactory.pizza.model.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        this.setName("NY Style Veggie Pizza");
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
