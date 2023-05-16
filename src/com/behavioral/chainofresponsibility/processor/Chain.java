package com.behavioral.chainofresponsibility.processor;

/*
 * The Base Handler is an optional class where you can put the boilerplate code that’s common to all handler classes.
 * Usually, this class defines a field for storing a reference to the next handler.
 * The clients can build a chain by passing a handler to the constructor or setter of the previous handler.
 * The class may also implement the default handling behavior:
 * it can pass execution to the next handler after checking for its existence.
 * */
public class Chain {
    Processor chain;

    public Chain() {
        buildChain();
    }

    public void buildChain() {
        chain = new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null)));
    }

    public void process(Number request) {
        chain.process(request);
    }
}
