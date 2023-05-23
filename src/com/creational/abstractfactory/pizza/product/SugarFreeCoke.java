package com.creational.abstractfactory.pizza.product;

import com.creational.abstractfactory.pizza.model.Coke;

public class SugarFreeCoke extends Coke {
    public SugarFreeCoke() {
        this.setName("Sugar free coke");
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
