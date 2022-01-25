package com.structural.decorator.pizza;

/**
 * Concrete Decorators define extra behaviors that can be added to components dynamically.
 * Concrete decorators override methods of the base decorator
 * and execute their behavior either before or after calling the parent method.
 */
public class ExtraCheeseTopping extends ToppingDecorator{
    public ExtraCheeseTopping(Pizza toppingPizza) {
        super(toppingPizza);
    }

    @Override
    public int getPrice() {
        return this.toppingPizza.getPrice() + 20;
    }
}
