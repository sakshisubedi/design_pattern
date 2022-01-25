package com.creational.factory.polygon;

/**
 * "Concrete Products" are different implementations of the product interface.
 */
public class Rectangle implements Polygon {
    @Override
    public void print() {
        System.out.println("This is 4-D polygon - Rectangle");
    }
}
