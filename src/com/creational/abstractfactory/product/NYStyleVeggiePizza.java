package com.creational.abstractfactory.product;

import com.creational.abstractfactory.model.Pizza;

/**
 * Concrete Products are various implementations of abstract products, grouped by variants. 
   Each abstract product (pizza/coke) must be implemented in all given variants (NY/Chicago).
 */
public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        this.setName("NY Style Veggie Pizza");
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
