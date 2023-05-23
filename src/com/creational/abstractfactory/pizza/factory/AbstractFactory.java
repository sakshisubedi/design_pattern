package com.creational.abstractfactory.pizza.factory;

import com.creational.abstractfactory.pizza.model.Coke;
import com.creational.abstractfactory.pizza.model.CokeType;
import com.creational.abstractfactory.pizza.model.Pizza;
import com.creational.abstractfactory.pizza.model.PizzaType;

public interface AbstractFactory {
    public Pizza createPizza(PizzaType type);
    public Coke createCoke(CokeType type);
}
