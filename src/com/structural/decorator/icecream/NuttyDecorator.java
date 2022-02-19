package com.structural.decorator.icecream;

/**
 * Concrete Decorators define extra behaviors that can be added to components dynamically.
 * Concrete decorators override methods of the base decorator
 * and execute their behavior either before or after calling the parent method.
 */
public class NuttyDecorator extends IcecreamDecorator{
    public NuttyDecorator(Icecream specialIcecream) {
        super(specialIcecream);
    }

    @Override
    public String makeIcecream() {
        return super.makeIcecream() + addNuts();
    }

    private String addNuts() {
        return " + crunchy nuts";
    }
}
