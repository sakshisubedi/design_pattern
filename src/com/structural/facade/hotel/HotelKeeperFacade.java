package com.structural.facade.hotel;

/**
 * the hotel keeper acts as the facade, as he hides the complexities of the system hotel.
 
 * The Facade provides convenient access to a particular part of the subsystem’s functionality. 
   It knows where to direct the client’s request and how to operate all the moving parts.

 * Also, an Additional Facade class can be created to prevent polluting a single facade 
   with unrelated features that might make it yet another complex structure. 
   Additional facades can be used by both clients and other facades.
 */
public class HotelKeeperFacade {
    public Menu getVegMenu() {
        Hotel vegHotel = new VegHotel();
        Menu vegMenu = vegHotel.getMenus();
        return vegMenu;
    }

    public Menu getNonVegMenu() {
        Hotel nonVegHotel = new NonVegHotel();
        Menu nonVegMenu = nonVegHotel.getMenus();
        return nonVegMenu;
    }

    public Menu getVegNonBothMenu() {
        Hotel vegNonBothHotel = new VegNonBothHotel();
        Menu vegNonBothMenu = vegNonBothHotel.getMenus();
        return vegNonBothMenu;
    }
}
