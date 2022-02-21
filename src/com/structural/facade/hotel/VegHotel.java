package com.structural.facade.hotel;

public class VegHotel implements Hotel{
    @Override
    public Menu getMenus() {
        Menu vegMenu = new VegMenu();
        return vegMenu;
    }
}
