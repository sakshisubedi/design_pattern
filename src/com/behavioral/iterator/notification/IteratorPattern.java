package com.behavioral.iterator.notification;

/**
 * The Client works with both collections and iterators via their interfaces.
 * This way the client isn’t coupled to concrete classes,
 * allowing you to use various collections and iterators with the same client code.
 *
 * Typically, clients don’t create iterators on their own, but instead get them from collections.
 * Yet, in certain cases, the client can create one directly; for example, when the client defines its own special iterator.
 */
public class IteratorPattern {
    public static void main(String[] args) {
        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);
        nb.printNotifications();
    }
}
