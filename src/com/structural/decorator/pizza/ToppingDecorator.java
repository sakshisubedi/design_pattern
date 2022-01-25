package com.structural.decorator.pizza;

/**
 * The Base Decorator class has a field for referencing a wrapped object(decorated object).
 * The field’s type should be declared as the component interface so it can contain both concrete components and decorators.
 * The base decorator delegates all operations to the wrapped object.
 */
public abstract class ToppingDecorator implements Pizza{
    Pizza toppingPizza;

    public ToppingDecorator(Pizza toppingPizza) {
        this.toppingPizza = toppingPizza;
    }
}
