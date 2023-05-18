package com.behavioral.templatemethod.employee;

/**
 * Concrete Classes can override all the steps, but not the template method itself.
 * It implements all the operations required by the templateMethod that were defined as abstract in the parent class.
 * There can be many different ConcreteClasses.
 */
public class Lumberjack extends Worker{
    @Override
    protected void getUp() {
        System.out.println("Get up at half past seven a.m. Flax...");
    }

    @Override
    protected void eatBreakfast() {
        System.out.println("Eat during work...");
    }

    @Override
    protected void relax() {
        System.out.println("Take a break at sixteen p.m. Not very ambitious...");
    }

    @Override
    protected void sleep() {
        System.out.println("Go sleep at eight p.m");
    }
}
