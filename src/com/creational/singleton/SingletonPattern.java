package com.creational.singleton;

public class SingletonPattern {
    public static void main(String[] args) {
        /**
         * SingletonEager singletonEager = new SingletonEager();
            throws error stating
            a) The constructor SingletonEager() is not visible
            b) SingletonEager() has private access in com.creational.singleton.SingletonEager
         */

        System.out.println("Singleton Eager");
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println("created object early");
        System.out.println("Both the object should be same");
        System.out.println("singletonEager1 " + singletonEager1);
        System.out.println("singletonEager2 " + singletonEager2);


        /**************Singleton Lazy***********/
        System.out.println("\nSingleton Lazy");
//        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
//        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
//        System.out.println("created object lazily");
//        System.out.println("Both the object should be same");
//        System.out.println("singletonLazy1 " + singletonLazy1);
//        System.out.println("singletonLazy2 " + singletonLazy2);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonLazy singletonLazy = SingletonLazy.getInstance();
                System.out.println("SingletonLazy Instance: " + singletonLazy);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonLazy singletonLazy = SingletonLazy.getInstance();
                System.out.println("SingletonLazy Instance: " + singletonLazy);
            }
        });

        thread1.start();
        thread2.start();


        /**************Singleton Synchronized Method***********/
        System.out.println("\nSingleton Synchronized Method");
        SingletonSynchronizedMethod singletonSynchronizedMethod1 = SingletonSynchronizedMethod.getInstance();
        SingletonSynchronizedMethod singletonSynchronizedMethod2 = SingletonSynchronizedMethod.getInstance();
        System.out.println("created object lazily using Singleton Synchronized Method");
        System.out.println("Both the object should be same");
        System.out.println("SingletonSynchronizedMethod1 " + singletonSynchronizedMethod1);
        System.out.println("SingletonSynchronizedMethod2 " + singletonSynchronizedMethod2);


        /**************Singleton Synchronized Block***********/
        System.out.println("\nSingleton Synchronized Block");
        SingletonSynchronizedBlock singletonSynchronizedBlock1 = SingletonSynchronizedBlock.getInstance();
        SingletonSynchronizedBlock singletonSynchronizedBlock2 = SingletonSynchronizedBlock.getInstance();
        System.out.println("created object lazily using Singleton Synchronized Block");
        System.out.println("Both the object should be same");
        System.out.println("SingletonSynchronizedBlock1 " + singletonSynchronizedBlock1);
        System.out.println("SingletonSynchronizedBlock2 " + singletonSynchronizedBlock2);
    }
}
