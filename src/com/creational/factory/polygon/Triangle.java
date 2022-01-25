package com.creational.factory.polygon;

/**
 * "Concrete Products" are different implementations of the product interface.
 */
public class Triangle implements Polygon {
    @Override
    public void print() {
        System.out.println("This is 3-D polygon - Triangle");
    }
}
