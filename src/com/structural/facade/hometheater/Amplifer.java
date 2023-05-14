package com.structural.facade.hometheater;

public class Amplifer {
    public void on() {
        System.out.println("Amplifer on");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Amplifer set dvd");
    }

    public void setSurroundSound() {
        System.out.println("Amplifer set surround sound");
    }

    public void setVolume(int volume) {
        System.out.println("Amplifer set volume at " + volume);
    }

    public void off() {
        System.out.println("Amplifer off");
    }
}
