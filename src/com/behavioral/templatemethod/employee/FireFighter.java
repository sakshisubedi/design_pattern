package com.behavioral.templatemethod.employee;

/**
 * Concrete Classes can override all the steps, but not the template method itself.
 * It implements all the operations required by the templateMethod that were defined as abstract in the parent class.
 * There can be many different ConcreteClasses.
 */
public class FireFighter extends Worker{
    @Override
    protected void getUp() {
        System.out.println("Get up at five a.m");
    }

    @Override
    protected void eatBreakfast() {
        System.out.println("Eat breakfast at six a.m");
    }

    @Override
    protected void relax() {
        System.out.println("Take a break at eight p.m");
    }

    @Override
    protected void sleep() {
        System.out.println("Go sleep at twelve p.m");
    }
}
