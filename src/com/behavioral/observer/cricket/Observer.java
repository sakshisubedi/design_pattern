package com.behavioral.observer.cricket;

/**
 * The Subscriber/Observer interface declares the notification interface.
 * In most cases, it consists of a single update method.
 * The method may have several parameters that let the publisher pass some event details along with the update.
 */
public interface Observer {
    void update(int runs, int wickets, float overs);
}
