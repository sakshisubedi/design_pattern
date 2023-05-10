package com.structural.adapter.speed;

/**
 * The Service is some useful class (usually 3rd-party or legacy).
 * The client can’t use this class directly because it has an incompatible interface.
 */
public class Audi implements IMovable{
    @Override
    public double getSpeed() {
        return 268;
    }
}
