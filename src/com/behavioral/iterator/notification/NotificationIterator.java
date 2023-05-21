package com.behavioral.iterator.notification;

/**
 * Concrete Iterators implement specific algorithms for traversing a collection.
 * The iterator object should track the traversal progress on its own.
 * This allows several iterators to traverse the same collection independently of each other.
 */
public class NotificationIterator implements Iterator {
    private Notification[] notificationList;

    // maintains curr pos of iterator over the array
    int pos = 0;

    // Constructor takes the array of notificationList are going to iterate over.
    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext() {
        if (pos >= notificationList.length || notificationList[pos] == null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        // return next element in the array and increment pos
        Notification notification =  notificationList[pos];
        pos += 1;
        return notification;
    }
}
