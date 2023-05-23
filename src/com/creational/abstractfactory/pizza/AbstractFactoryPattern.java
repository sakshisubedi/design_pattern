package com.creational.abstractfactory.pizza;

import com.creational.abstractfactory.pizza.factory.AbstractFactory;
import com.creational.abstractfactory.pizza.factory.FactoryProvider;
import com.creational.abstractfactory.pizza.model.CokeType;
import com.creational.abstractfactory.pizza.model.Location;
import com.creational.abstractfactory.pizza.model.PizzaType;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        System.out.println("Order 1 cheese pizza and sugar free coke for location " + Location.CHICAGO + " and type : " + PizzaType.CHEESE);
        AbstractFactory abstractFactory = FactoryProvider.getFactory(Location.CHICAGO);
        System.out.println("Pizza = " + abstractFactory.createPizza(PizzaType.CHEESE));
        System.out.println("Coke = " + abstractFactory.createCoke(CokeType.SUGAR_FREE));
    }
}
