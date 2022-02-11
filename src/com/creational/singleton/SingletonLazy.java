package com.creational.singleton;

/**
 * The Singleton class declares the static method getInstance (any name) that returns the same instance of its own class.
   The Singleton’s constructor should be hidden from the client code. 
   Calling the getInstance method should be the only way of getting the Singleton object.
 */
public class SingletonLazy {
    // It gets memory only once because of static and it contains the instance of the Singleton class.
    private static SingletonLazy singletonLazy;

    // private access modifier prevent object creation outside the SingletonLazy class
    private SingletonLazy() {

    }

    /**
     * act as a constructor as "new SingletonLazy()" calls private constructor to create an object and saves it in a static field - "singletonLazy"
     * 
     * This provides the global point of access to the Singleton object and returns the instance to the caller.
     */
    public static SingletonLazy getInstance() {
        if(singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}
