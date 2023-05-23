package com.creational.factory.pizza;

import com.creational.factory.pizza.simplefactory.SimplePizzaFactory;

public class PizzaStore {
    // Object composition allows us to change the behavior dynamically at runtime
    // because we can swap in and out implementations.
    private SimplePizzaFactory simplePizzaFactory;

    // PizzaStore gets the factory passed to it in the constructor
    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public IPizza orderPizza(String type) {
        IPizza pizza = simplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // other methods here
}
