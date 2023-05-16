package com.behavioral.chainofresponsibility.processor;

/*
 * The Client may compose chains just once or compose them dynamically, depending on the application’s logic.
 * Note that a request can be sent to any handler in the chain—it doesn’t have to be the first one.
 * */
public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        Chain chain =  new Chain();
        chain.process(new Number(12));
        chain.process(new Number(-12));
        chain.process(new Number(0));
    }
}
