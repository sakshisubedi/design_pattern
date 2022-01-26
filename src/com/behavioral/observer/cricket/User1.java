package com.behavioral.observer.cricket;

/**
 * Concrete Subscribers/Observer perform some actions in response to notifications issued by the publisher.
 * All of these classes must implement the same interface so the publisher isn’t coupled to concrete classes.
 *
 * Usually, subscribers need some contextual information to handle the update correctly.
 * For this reason, publishers often pass some context data as arguments of the notification(update) method.
 * The publisher can pass itself as an argument, letting subscriber fetch any required data directly.
 */
public class User1 implements Observer {

    String name;

    public User1(String name) {
        this.name = name;
    }

    @Override
    public void update(int runs, int wickets, float overs) {
        System.out.println("Hello " + this.name);
        System.out.println("The score has been updated");
        System.out.println("The updated score:");
        System.out.println("Runs - " + runs);
        System.out.println("Wickets - " + wickets);
        System.out.println("overs - " + overs + "\n");
    }
}
