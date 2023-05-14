package com.behavioral.observer.cricket;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private float temperature, humidity, pressure;
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer o: observerList) {
            o.update(temperature, humidity, pressure);
        }
    }

    /*
    * This method gets called whenever the weather measurements have been updated
    * */
    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        System.out.println("Setting Measurements");
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
