package com.creational.abstractfactory.vehicle;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        int distance = 10;

        AbstractVehicleFactory carFactory = FactoryProvider.getVehicleFactory("Car");
        AbstractVehicleFactory autoFactory = FactoryProvider.getVehicleFactory("Auto");
        AbstractVehicleFactory bikeFactory = FactoryProvider.getVehicleFactory("Bike");

        Vehicle miniCar = carFactory.getVehicle("Mini");
        miniCar.book(distance);

        Vehicle sharedAuto = autoFactory.getVehicle("Shared");
        sharedAuto.book(distance);

        Vehicle sportsBike = bikeFactory.getVehicle("Sports");
        sportsBike.book(distance);
    }
}
