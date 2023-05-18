package com.behavioral.templatemethod.employee;

/**
 * The Abstract Class declares methods that act as steps of an algorithm,
 * as well as the actual template method which calls these methods in a specific order.
 *
 * The templateMethod() should be made final so that it cannot be overridden.
 * This template method makes use of other operations (methods) available in order to run the algorithm
 * but is decoupled for the actual implementation of these methods.
 *
 * The steps may either be declared abstract so their implementation is deferred to subclasses or have some default implementation.
 */
public abstract class Worker {
    protected void goToWork() {
        System.out.println("Go to work at eight a.m");
    }

    protected void work() {
        System.out.println("Work for eight hours");
    }

    protected void returnToHome() {
        System.out.println("Return from work at sixteen p.m");
    }

    protected abstract void getUp();
    protected abstract void eatBreakfast();
    protected abstract void relax();
    protected abstract void sleep();

    public final void dailyRoutine() {
        goToWork();
        work();
        returnToHome();
        getUp();
        eatBreakfast();
        relax();
        sleep();
    }
}
