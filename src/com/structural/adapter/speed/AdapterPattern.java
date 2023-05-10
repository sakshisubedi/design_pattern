package com.structural.adapter.speed;

/**
 * The Client is a class that contains the existing business logic of the program.
 * The client code doesn’t get coupled to the concrete adapter class as long as it works with the adapter via the client interface.
 * Thanks to this, you can introduce new types of adapters into the program without breaking the existing client code.
 * This can be useful when the interface of the service class gets changed or replaced: you can just create a new adapter class without changing the client code.
 *
 * Client and Adaptee (Sort Array) are decoupled - neither knows about the other
 * */
public class AdapterPattern {
    public static void main(String[] args) {
        IMovable car = new Audi();
        System.out.println("Car speed in MPH(Miles per Hour) - " + car.getSpeed());

        // Using adapter to get speed in KM/H (km per hour)
        IMovableAdapter carAdapter = new MovableAdapter(car);
        System.out.println("Car speed in KM/H (km per hour) - " + carAdapter.getSpeed());
    }
}
