package com.behavioral.strategy;

/**
 * The Context maintains a reference to one of the concrete strategies and communicates with this object only via the strategy interface.
 
 * The context calls the execution method on the linked strategy object each time it needs to run the algorithm. 
   The context doesn’t know what type of strategy it works with or how the algorithm is executed.
  
 * Context is optional. But if it is present, it acts as single point of contact for client. 

   Multiple uses of Context
   1. It can populate data to execute an operation of strategy
   2. It can take independent decision on Strategy creation. 
   3. In absence of Context, client should be aware of concrete strategies. Context acts a wrapper and hides internals
   4. Code re-factoring will become easy
 */
public class ContextProvider {
    IRouteStrategy routeStrategy;

    /*
     Strategy can also be set using parameterized constructor.
     public ContextProvider(IRouteStrategy routeStrategy) {
       this.routeStrategy = routeStrategy;
     }
    */

    public void setStrategy(IRouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public Double calculateTotalCost(String source, String destination) {
        // determine the src and dest location
        // .....X steps
        // use strategy to calculate cost
        // ......Y steps

        // can do bunch of other things like before and after the routeStrategy.calculateCost() method is called

        return routeStrategy.calculateCost();
    }
}
