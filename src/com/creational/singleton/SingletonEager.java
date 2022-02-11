package com.creational.singleton;

public class SingletonEager {
    // Early, instance will be created at load time 
    private static SingletonEager singletonEager = new SingletonEager();

    // private access modifier prevent object creation outside the SingletonEager class
    private SingletonEager() {

    }

    public static SingletonEager getInstance() {
        return singletonEager;
    }
}
