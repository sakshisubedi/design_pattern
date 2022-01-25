package com.structural.decorator.icecream;

/**
 * The Base Decorator class has a field for referencing a wrapped object(decorated object).
 * The field’s type should be declared as the component interface so it can contain both concrete components and decorators.
 * The base decorator delegates all operations to the wrapped object.
 */
public class IcecreamDecorator implements Icecream{
    public Icecream specialIcecream;

    public IcecreamDecorator(Icecream specialIcecream) {
        this.specialIcecream = specialIcecream;
    }

    @Override
    public String makeIcecream() {
        return specialIcecream.makeIcecream();
    }
}
