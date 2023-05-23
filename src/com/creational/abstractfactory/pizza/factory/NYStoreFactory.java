package com.creational.abstractfactory.pizza.factory;

import com.creational.abstractfactory.pizza.model.Coke;
import com.creational.abstractfactory.pizza.model.CokeType;
import com.creational.abstractfactory.pizza.model.Pizza;
import com.creational.abstractfactory.pizza.model.PizzaType;
import com.creational.abstractfactory.pizza.product.*;

/**
 * Concrete Factories implement creation methods of the abstract factory. 
   Each concrete factory corresponds to a specific variant of products and creates only those product variants.

 * Although concrete factories instantiate concrete products,
   signatures of their creation methods must return corresponding abstract products. 
   This way the client code that uses a factory doesn’t get coupled to the specific variant of the product it gets from a factory. 
   The Client can work with any concrete factory/product variant, as long as it communicates with their objects via abstract interfaces.
 */
public class NYStoreFactory implements AbstractFactory {

    @Override
    public Pizza createPizza(PizzaType type) {
        if(type.equals(PizzaType.CHEESE)) {
            return new NYStyleCheesePizza();
        } else if(type.equals(PizzaType.VEGGIE)) {
            return new NYStyleVeggiePizza();
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
