package com.creational.singleton;

public class SingletonSynchronizedMethod {
    private static SingletonSynchronizedMethod singletonSynchronizedMethod;

    private SingletonSynchronizedMethod() {

    }
    
    // Only one thread can execute this at a time
    synchronized public static SingletonSynchronizedMethod getInstance() {
        if(singletonSynchronizedMethod == null) {
            singletonSynchronizedMethod = new SingletonSynchronizedMethod();
        }
        return singletonSynchronizedMethod;
    }
}
