package com.behavioral.observer.cricket;

import java.util.ArrayList;
import java.util.List;

public class CricketData implements Subject{
    int runs, wickets;
    float overs;
    List<Observer> observerList = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer o: observerList) {
            o.update(runs, wickets, overs);
        }
    }

    public void scoreChanged(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;

        notifyObserver();
    }
}
