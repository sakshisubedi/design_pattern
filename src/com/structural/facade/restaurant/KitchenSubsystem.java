package com.structural.facade.restaurant;

/**
 * The Complex Subsystem consists of dozens of various objects. 
   To make them all do something meaningful, you have to dive deep into the subsystem’s implementation details, 
   such as initializing objects in the correct order and supplying them with data in the proper format. 
   Subsystem classes aren’t aware of the facade’s existence. 
   They operate within the system and work with each other directly.
 */
public class KitchenSubsystem {
    public void prepareFood() {
        System.out.println("Cook food");
    }

    public void callWaiter() {
        System.out.println("Call Waiter");
    }

    public void washDishes() {
        System.out.println("Wash the dishes");
    }
}
