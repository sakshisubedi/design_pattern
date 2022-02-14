package com.creational.abstractfactory.product;

import com.creational.abstractfactory.model.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        this.setName("NY Style Veggie Pizza");
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
