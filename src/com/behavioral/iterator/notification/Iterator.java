package com.behavioral.iterator.notification;

/**
 * The Iterator interface declares the operations required for traversing a collection: fetching the next element, retrieving the current position, restarting iteration, etc.
 *
 * We could also use Java.Util.Iterator
 */
public interface Iterator {
    // indicates whether there are more elements to iterate over
    public boolean hasNext();

    // returns the next element
    public Object next();
}
