package com.behavioral.command;

/**
 * The "Receiver" class contains some business logic. 
   Almost any object may act as a receiver. 
   Most commands only handle the details of how a request is passed to the receiver, 
   while the receiver itself does the actual work (here, on and off the device).

 * A receiver is an object that performs a set of cohesive actions.
   It's the component that performs the actual action when the command's execute() method is called.
 */
public interface IDevice {
    public void on();
    public void off();
}
