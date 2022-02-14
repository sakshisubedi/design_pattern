package com.creational.abstractfactory.factory;

import com.creational.abstractfactory.model.Coke;
import com.creational.abstractfactory.model.CokeType;
import com.creational.abstractfactory.model.Pizza;
import com.creational.abstractfactory.model.PizzaType;

public interface AbstractFactory {
    public Pizza createPizza(PizzaType type);
    public Coke createCoke(CokeType type);
}
