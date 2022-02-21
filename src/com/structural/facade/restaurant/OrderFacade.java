package com.structural.facade.restaurant;

/** 
 * the order system acts as the facade, as it hides the complexities of the food preparation which involves waiter and kitchen's chef.

 * The Facade provides convenient access to a particular part of the subsystem’s functionality. 
   It knows where to direct the client’s request and how to operate all the moving parts.

 * Also, an Additional Facade class can be created to prevent polluting a single facade 
   with unrelated features that might make it yet another complex structure. 
   Additional facades can be used by both clients and other facades.
 */
public class OrderFacade {
    private WaiterSubsystem waiterSubsystem;
    private KitchenSubsystem kitchenSubsystem;

    public OrderFacade() {
        this.waiterSubsystem = new WaiterSubsystem();
        this.kitchenSubsystem = new KitchenSubsystem();
    }

    void orderFood() {
        waiterSubsystem.writeOrder();
        waiterSubsystem.sendToKitchen();
        kitchenSubsystem.prepareFood();
        kitchenSubsystem.callWaiter();
        waiterSubsystem.serveCustomer();
        kitchenSubsystem.washDishes();
    }
}
