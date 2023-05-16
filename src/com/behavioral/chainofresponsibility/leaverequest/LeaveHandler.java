package com.behavioral.chainofresponsibility.leaverequest;

/*
* The Handler declares the interface, common for all concrete handlers.
* It usually contains just a single method for handling requests, but sometimes it may also have another method
* for setting the next handler on the chain.
*
* The Base Handler is an optional class where you can put the boilerplate code that’s common to all handler classes.
* Usually, this class defines a field for storing a reference to the next handler.
* The clients can build a chain by passing a handler to the constructor or setter of the previous handler.
* The class may also implement the default handling behavior:
* it can pass execution to the next handler after checking for its existence.
* */
public abstract class LeaveHandler {
    protected LeaveHandler supervisor; // next

    public void setSupervisor(LeaveHandler supervisor) { // setNext
        this.supervisor = supervisor;
    }

    public abstract String applyLeave(LeaveInfo leaveInfo);
}
