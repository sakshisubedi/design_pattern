package com.structural.adapter.speed;

/**
 * The Adapter is a class that’s able to work with both the client and the service: 
   it implements the client interface, while wrapping the service object. 
   The adapter receives calls from the client via the adapter interface and 
   translates them into calls to the wrapped service object in a format it can understand.
 */
public class MovableAdapter implements IMovableAdapter{
    private IMovable car;

    public MovableAdapter(IMovable car) {
        this.car = car;
    }

    @Override
    public double getSpeed() {
        double speedInKMH = convertMPHtoKMH(car.getSpeed());
        return speedInKMH;
    }

    // converts speed from MPH to KM/H
    private double convertMPHtoKMH(double speed) {
        return speed * 1.60934;
    }
}
