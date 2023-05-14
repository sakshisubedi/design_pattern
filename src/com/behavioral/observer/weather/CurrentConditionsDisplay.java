package com.behavioral.observer.weather;

/**
 * Concrete Subscribers/Observer perform some actions in response to notifications issued by the publisher.
 * All of these classes must implement the same interface so the publisher isn’t coupled to concrete classes.
 *
 * Usually, subscribers need some contextual information to handle the update correctly.
 * For this reason, publishers often pass some context data as arguments of the notification(update) method.
 * The publisher can pass itself as an argument, letting subscriber fetch any required data directly.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature, humidity;
//    private Subject weatherData;

//    public CurrentConditionsDisplay(Subject weatherData) {
//        this.weatherData = weatherData;
//        weatherData.subscribe(this);
//    }

    @Override
    public void display() {
        // Display current measurements
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
