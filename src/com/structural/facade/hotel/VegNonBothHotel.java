package com.structural.facade.hotel;

public class VegNonBothHotel implements Hotel{
    @Override
    public Menu getMenus() {
        Menu bothMenu = new BothMenu();
        return bothMenu;
    }
}
