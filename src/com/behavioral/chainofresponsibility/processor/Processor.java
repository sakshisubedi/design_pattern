package com.behavioral.chainofresponsibility.processor;

/*
* The Handler declares the interface, common for all concrete handlers.
 * It usually contains just a single method for handling requests, but sometimes it may also have another method
 * for setting the next handler on the chain.
* */
public abstract class Processor {
    protected Processor nextProcessor;

    public Processor(Processor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract void process(Number request);
}
