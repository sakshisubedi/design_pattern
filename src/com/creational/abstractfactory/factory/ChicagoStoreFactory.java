package com.creational.abstractfactory.factory;

import com.creational.abstractfactory.model.Coke;
import com.creational.abstractfactory.model.CokeType;
import com.creational.abstractfactory.model.Pizza;
import com.creational.abstractfactory.model.PizzaType;
import com.creational.abstractfactory.product.CarbonatedCoke;
import com.creational.abstractfactory.product.ChicagoStyleCheesePizza;
import com.creational.abstractfactory.product.ChicagoStyleVeggiePizza;
import com.creational.abstractfactory.product.SugarFreeCoke;

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
