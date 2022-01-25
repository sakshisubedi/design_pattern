package com.creational.factory.transport;

/**
 * "Concrete Products" are different implementations of the product interface.
 */
public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivered cargo by sea");
    }
}
