package com.behavioral.strategy;

/**
 * Concrete Strategies implement different variations of an algorithm the context uses.
 */
public class AirwayStrategy implements IRouteStrategy{
    @Override
    public Double calculateCost() {
        return 100D;
    }
}
