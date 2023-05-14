package com.behavioral.observer.weather;

/**
 * Concrete Subscribers/Observer perform some actions in response to notifications issued by the publisher.
 * All of these classes must implement the same interface so the publisher isn’t coupled to concrete classes.
 *
 * Usually, subscribers need some contextual information to handle the update correctly.
 * For this reason, publishers often pass some context data as arguments of the notification(update) method.
 * The publisher can pass itself as an argument, letting subscriber fetch any required data directly.
 */
public class StatisticsDisplay implements Observer, DisplayElement{

    @Override
    public void display() {
        // Display avg, min and max measurements
        System.out.println("StatisticsDisplay");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        display();
    }
}
