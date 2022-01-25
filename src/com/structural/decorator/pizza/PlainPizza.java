package com.structural.decorator.pizza;

/**
 * Concrete Component is a class of objects being wrapped. It defines the basic behavior, which can be altered by decorators.
 */
public class PlainPizza implements Pizza{
    @Override
    public int getPrice() {
        return 50;
    }
}
