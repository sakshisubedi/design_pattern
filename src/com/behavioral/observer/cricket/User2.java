package com.behavioral.observer.cricket;

public class User2 implements Observer {

    String name;

    public User2(String name) {
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
