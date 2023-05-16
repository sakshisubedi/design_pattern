package com.behavioral.chainofresponsibility.processor;

/*
 * Concrete Handlers contain the actual code for processing requests.
 * Upon receiving a request, each handler must decide whether to process it and, additionally,
 * whether to pass it along the chain.
 * Handlers are usually self-contained and immutable, accepting all necessary data just once via the constructor.
 * */
public class ZeroProcessor extends Processor{
    public ZeroProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void process(Number request) {
        if(request.getNum() == 0) {
            System.out.println("ZeroProcessor : " + request.getNum());
        } else {
            if(nextProcessor != null) {
                nextProcessor.process(request);
            } else {
                System.out.println("No more handler (processor) to process it");
            }
        }
    }
}
