package com.creational.singleton;

public class SingletonEager {
    /**
     * Early, instance will be created at load time
     *
     * Using this approach, we rely on the JVM to create the unique instance of the Singleton when
       the class is loaded.
     * The JVM guarantees that the instance will be created before any thread
       accesses the static singletonEager variable.
     */
    private static SingletonEager singletonEager = new SingletonEager();

    // private access modifier prevent object creation outside the SingletonEager class
    private SingletonEager() {

    }

    /**
     * Why did you use SingletonEager, instead of some object name?
     * Because, getInstance() is a static method;
     * in other words, it is a CLASS method.
     * You need to use the class name to reference a static method.
     *
     */
    public static SingletonEager getInstance() {
        return singletonEager;
    }
}
