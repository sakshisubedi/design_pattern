package com.creational.abstractfactory.pizza.factory;

import com.creational.abstractfactory.pizza.model.Coke;
import com.creational.abstractfactory.pizza.model.CokeType;
import com.creational.abstractfactory.pizza.model.Pizza;
import com.creational.abstractfactory.pizza.model.PizzaType;
import com.creational.abstractfactory.pizza.product.CarbonatedCoke;
import com.creational.abstractfactory.pizza.product.ChicagoStyleCheesePizza;
import com.creational.abstractfactory.pizza.product.ChicagoStyleVeggiePizza;
import com.creational.abstractfactory.pizza.product.SugarFreeCoke;

public class ChicagoStoreFactory implements AbstractFactory {

    @Override
    public Pizza createPizza(PizzaType type) {
        if(type.equals(PizzaType.CHEESE)) {
            return new ChicagoStyleCheesePizza();
        } else if(type.equals(PizzaType.VEGGIE)) {
            return new ChicagoStyleVeggiePizza();
        }
        return null;
    }

    @Override
    public Coke createCoke(CokeType type) {
        if(type.equals(CokeType.CARBONATED)) {
            return new CarbonatedCoke();
        } else if(type.equals(CokeType.SUGAR_FREE)) {
            return new SugarFreeCoke();
        }
        return null;
    }
}
