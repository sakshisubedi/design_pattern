package com.structural.facade.hotel;

/**
 * The Client uses the facade instead of calling the subsystem objects directly.
 */
public class FacadePattern {
    public static void main(String[] args) {
        HotelKeeperFacade hotelKeeperFacade = new HotelKeeperFacade();

        Menu vegMenu = hotelKeeperFacade.getVegMenu();
        System.out.println("Veg Menu - " + vegMenu);
        Menu nonVegMenu = hotelKeeperFacade.getNonVegMenu();
        System.out.println("Non Veg Menu - " + nonVegMenu);
        Menu vegNonBothMenu = hotelKeeperFacade.getVegNonBothMenu();
        System.out.println("Veg and Non Veg Menu - " + vegNonBothMenu);
    }
}
