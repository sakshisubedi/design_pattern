package com.creational.abstractfactory.pizza.product;

import com.creational.abstractfactory.pizza.model.Coke;

public class CarbonatedCoke extends Coke {
    public CarbonatedCoke() {
        this.setName("Carbonated Coke");
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
