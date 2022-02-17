package com.structural.adapter.speed;

public class AdapterPattern {
    public static void main(String[] args) {
        IMovable car = new Audi();
        System.out.println("Car speed in MPH(Miles per Hour) - " + car.getSpeed());

        // Using adapter to get speed in KM/H (km per hour)
        IMovableAdapter carAdapter = new MovableAdapter(car);
        System.out.println("Car speed in KM/H (km per hour) - " + carAdapter.getSpeed());
    }
}
