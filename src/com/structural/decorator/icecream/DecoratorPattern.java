package com.structural.decorator.icecream;

/**
 * The Client can wrap components in multiple layers of decorators,
 * as long as it works with all objects via the component interface.
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Icecream icecream = new SimpleIcecream();
        System.out.println(icecream.makeIcecream());

        icecream = new HoneyDecorator(icecream);
        System.out.println(icecream.makeIcecream());

        icecream = new NuttyDecorator(icecream);
        System.out.println(icecream.makeIcecream());
    }
}
