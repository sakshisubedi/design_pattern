package com.creational.abstractfactory.product;

import com.creational.abstractfactory.model.Coke;

public class SugarFreeCoke extends Coke {
    public SugarFreeCoke() {
        this.setName("Sugar free coke");
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
