package com.behavioral.observer.cricket;

/**
 * The Client creates publisher and subscriber objects separately and then registers subscribers for publisher updates.
 */
public class ObserverPattern {
    public static void main(String[] args) {
        CricketData cricketData = new CricketData();
        User1 user1 = new User1("abc");
        User2 user2 = new User2("xyz");

        cricketData.scoreChanged(4, 0, 0.1f);

        cricketData.subscribe(user1);
        cricketData.scoreChanged(6, 0, 0.2f);

        cricketData.subscribe(user2);
        cricketData.scoreChanged(7, 0, 0.3f);

        cricketData.unsubscribe(user1);
        cricketData.scoreChanged(7, 1, 0.4f);

    }
}
