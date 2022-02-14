package com.creational.abstractfactory;

import com.creational.abstractfactory.factory.AbstractFactory;
import com.creational.abstractfactory.factory.FactoryProvider;
import com.creational.abstractfactory.model.CokeType;
import com.creational.abstractfactory.model.Location;
import com.creational.abstractfactory.model.PizzaType;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        System.out.println("Order 1 cheese pizza and sugar free coke for location " + Location.CHICAGO + " and type : " + PizzaType.CHEESE);
        AbstractFactory abstractFactory = FactoryProvider.getFactory(Location.CHICAGO);
        System.out.println("Pizza = " + abstractFactory.createPizza(PizzaType.CHEESE));
        System.out.println("Coke = " + abstractFactory.createCoke(CokeType.SUGAR_FREE));
    }
}
