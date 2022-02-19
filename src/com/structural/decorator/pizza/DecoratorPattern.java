package com.structural.decorator.pizza;

/**
 * The Client can wrap components in multiple layers of decorators,
 * as long as it works with all objects via the component interface.
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println("Plain Pizza = Rs."+ pizza.getPrice());

        pizza = new ChickenTopping(pizza);
        System.out.println("Pizza with Chicken Topping = Rs."+ pizza.getPrice());

        pizza = new ChickenTopping(pizza);
        System.out.println("Pizza with twice Chicken Topping = Rs."+ pizza.getPrice());

        pizza = new ExtraCheeseTopping(pizza);
        System.out.println("Pizza with twice Chicken Topping & Extra Cheese Topping = Rs."+ pizza.getPrice());

        /**
         * Computation
         
            super(2 chicken topping) + 20
            super(1 chicken topping) + 25 + 20
            super(plain pizza) + 25 + 25 + 20
            50 + 25 + 25 + 20 = 120
         
         */
    }
}
