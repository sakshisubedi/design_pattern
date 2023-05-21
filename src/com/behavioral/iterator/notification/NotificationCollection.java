package com.behavioral.iterator.notification;

// Collection of notifications

/**
 * Concrete Collections return new instances of a particular concrete iterator class each time the client requests one.
 */
public class NotificationCollection implements Collection{
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    Notification[] notificationList;

    public NotificationCollection() {
        this.notificationList = new Notification[MAX_ITEMS];

        // Let us add some dummy notifications
        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    public void addItem(String str) {
        Notification notification = new Notification(str);
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Full");
        else
        {
            notificationList[numberOfItems] = notification;
            numberOfItems = numberOfItems + 1;
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }
}
