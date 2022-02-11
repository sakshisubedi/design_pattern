package com.creational.singleton;

public class SingletonSynchronizedBlock {
    private static SingletonSynchronizedBlock singletonSynchronizedBlock;

    private SingletonSynchronizedBlock() {

    }

    // Lazy initialization with Double Checked Locking
     public static SingletonSynchronizedBlock getInstance() {
        if(singletonSynchronizedBlock == null) {
            // To make thread safe
            synchronized (SingletonSynchronizedBlock.class) {
                // check again as multiple threads
                // can reach above step
                if(singletonSynchronizedBlock == null) {
                    singletonSynchronizedBlock = new SingletonSynchronizedBlock();
                }
            }
        }
        return singletonSynchronizedBlock;
    }
}
