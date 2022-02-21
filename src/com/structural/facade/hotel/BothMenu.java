package com.structural.facade.hotel;

import java.util.ArrayList;
import java.util.List;

public class BothMenu implements Menu{
    private List<String> menuList;

    public BothMenu() {
        menuList = new ArrayList<>();
        menuList.add("Chicken Tikka");
        menuList.add("Prawns Curry");
        menuList.add("Paneer Tikka");
        menuList.add("Biryani");
    }

    @Override
    public List<String> getMenu() {
        return menuList;
    }

    @Override
    public String toString() {
        String menu = "";
        int n = menuList.size();
        for(int i=0; i<n; i++) {
            menu += menuList.get(i);
            if(i != n-1) {
                menu += ", ";
            }
        }
        return menu;
    }
}