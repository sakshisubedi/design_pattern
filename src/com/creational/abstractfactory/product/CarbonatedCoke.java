package com.creational.abstractfactory.product;

import com.creational.abstractfactory.model.Coke;

public class CarbonatedCoke extends Coke {
    public CarbonatedCoke() {
        this.setName("Carbonated Coke");
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
