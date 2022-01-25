package com.creational.factory.transport;

public class Train implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivered cargo by land - Train");
    }
}
