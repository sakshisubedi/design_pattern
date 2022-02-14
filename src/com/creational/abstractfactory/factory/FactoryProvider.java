package com.creational.abstractfactory.factory;

import com.creational.abstractfactory.model.Location;

/**
 * The Abstract Factory interface declares a set of methods for creating each of the abstract products.
 */
public class FactoryProvider {
    public static AbstractFactory getFactory(Location location) {
        switch (location) {
            case NY:
                return new NYStoreFactory();
            case CHICAGO:
                return new ChicagoStoreFactory();
            default:
                throw new IllegalArgumentException("Location not supported yet");
        }
    }
}
