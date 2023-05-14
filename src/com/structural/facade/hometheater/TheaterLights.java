package com.structural.facade.hometheater;

public class TheaterLights {
    public void dim(int dimLight) {
        System.out.println("TheaterLights dim by " + dimLight);
    }

    public void on() {
        System.out.println("TheaterLights on");
    }
}
