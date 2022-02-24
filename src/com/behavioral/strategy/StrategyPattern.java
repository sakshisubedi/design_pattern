package com.behavioral.strategy;

/**
 * The Client creates a specific strategy object and passes it to the context. 
   The context exposes a setter which lets clients replace the strategy associated with the context at runtime.
 */
public class StrategyPattern {
    public static void main(String[] args) {
        ContextProvider contextProvider = new ContextProvider();

        contextProvider.setStrategy(new AirwayStrategy());
        System.out.println("Total cost from airway - " + contextProvider.calculateTotalCost("x", "y"));

        contextProvider.setStrategy(new RoadStrategy());
        System.out.println("Total cost from roadway - " + contextProvider.calculateTotalCost("x", "y"));
    }
}
