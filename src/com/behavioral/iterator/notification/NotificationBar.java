package com.behavioral.iterator.notification;

// Contains collection of notifications as an object of NotificationCollection
public class NotificationBar {
    private NotificationCollection notificationCollection;

    public NotificationBar(NotificationCollection notificationCollection) {
        this.notificationCollection = notificationCollection;
    }

    public void printNotifications() {
        Iterator iterator = notificationCollection.createIterator();
        System.out.println("-------NOTIFICATION BAR------------");
        while (iterator.hasNext())
        {
            Notification n = (Notification)iterator.next();
            System.out.println(n.getNotification());
        }
    }
}
