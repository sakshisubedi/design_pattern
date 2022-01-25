package com.structural.decorator.icecream;

/**
 * Concrete Decorators define extra behaviors that can be added to components dynamically.
 * Concrete decorators override methods of the base decorator
 * and execute their behavior either before or after calling the parent method.
 */
public class HoneyDecorator extends IcecreamDecorator{
    public HoneyDecorator(Icecream specialIcecream) {
        super(specialIcecream);
    }

    @Override
    public String makeIcecream() {
        return super.makeIcecream() + addHoney();
    }

    public String addHoney() {
        return " + sweet honey";
    }
}
