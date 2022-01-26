package com.behavioral.observer.cricket;

/**
 * The Publisher/Subject issues events of interest to other objects.
 * These events occur when the publisher changes its state or executes some behaviors.
 * Publishers contain a subscription infrastructure that lets new subscribers join and current subscribers leave the list.
 *
 * When a new event happens, the publisher goes over the subscription list and
 * calls the notification(update) method declared in the subscriber interface on each subscriber object.
 */
public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObserver();
}
