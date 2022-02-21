package com.structural.facade.hotel;

public class NonVegHotel implements Hotel{
    @Override
    public Menu getMenus() {
        Menu nonVegMenu = new NonVegMenu();
        return nonVegMenu;
    }
}
