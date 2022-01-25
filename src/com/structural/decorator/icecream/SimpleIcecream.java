package com.structural.decorator.icecream;

/**
 * Concrete Component is a class of objects being wrapped. It defines the basic behavior, which can be altered by decorators.
 */
public class SimpleIcecream implements Icecream{
    @Override
    public String makeIcecream() {
        return "Simple Icecream";
    }
}
