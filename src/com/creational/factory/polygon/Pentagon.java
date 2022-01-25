package com.creational.factory.polygon;

/**
 * "Concrete Products" are different implementations of the product interface.
 */
public class Pentagon implements Polygon {
    @Override
    public void print() {
        System.out.println("This is 5-D polygon - Pentagon");
    }
}
