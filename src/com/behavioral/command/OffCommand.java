package com.behavioral.command;

/**
 * Concrete Commands implement various kinds of requests. 
   A concrete command isn’t supposed to perform the work on its own, 
   but rather to pass the call to one of the business logic objects (IDevice). 
   However, for the sake of simplifying the code, these classes can be merged.

 * Parameters required to execute a method on a receiving object can be declared as fields in the concrete command. 
   You can make command objects immutable by only allowing the initialization of these fields via the constructor.

 * A command is an object whose role is to store all the information required for executing an action, 
   including the method to call, the method arguments, and the object (known as the receiver) that implements the method.

 */
public class OffCommand implements Command{
    private IDevice device; // receiver

    public OffCommand(IDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        // method to call
        // in this case, no arguments are required
        device.off(); 
    }
}
