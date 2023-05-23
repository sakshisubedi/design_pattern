package com.creational.abstractfactory.vehicle;

public class MicroCar extends Car{
    @Override
    public void setVehicleType() {
        carType = "Micro";
    }

    @Override
    public void setBaseCost() {
        baseCost = 50;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        chargesPerUnitDistance = 10;
    }
}
