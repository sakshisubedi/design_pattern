package com.creational.factory.transport;

/**
 * The Creator class declares the factory method that returns new product objects.
 * It’s important that the return type of this method matches the product interface.
 *
 * You can declare the factory method as abstract to force all subclasses to implement their own versions of the method.
 * As an alternative, the base factory method can return some default product type.
 *
 * Note, despite its name, product creation is not the primary responsibility of the creator.
 * Usually, the creator class already has some core business logic related to products.
 * The factory method helps to decouple this logic from the concrete product classes.
 * Here is an analogy: a large software development company can have a training department for programmers.
 * However, the primary function of the company as a whole is still writing code, not producing programmers.
 *
 * Note that the factory method doesn’t have to create new instances all the time.
 * It can also return existing objects from a cache, an object pool, or another source.
 */
public abstract class LogisticsFactory {
    abstract Transport createTransport();

    void help() {
        System.out.println("Call xxx");
    }
}
