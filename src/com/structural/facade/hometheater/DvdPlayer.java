package com.structural.facade.hometheater;

public class DvdPlayer {
    public void on() {
        System.out.println("DvdPlayer on");
    }

    public void play(String movie) {
        System.out.println("DvdPlayer play movie " + movie);
    }

    public void stop() {
        System.out.println("DvdPlayer stop");
    }

    public void eject() {
        System.out.println("DvdPlayer eject");
    }

    public void off() {
        System.out.println("DvdPlayer off");
    }
}
