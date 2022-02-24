package com.behavioral.strategy;

/**
 * Concrete Strategies implement different variations of an algorithm the context uses.
 */
public class RoadStrategy implements IRouteStrategy{
    @Override
    public Double calculateCost() {
        return 10D;
    }
}
