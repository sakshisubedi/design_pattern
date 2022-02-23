package com.behavioral.command;

/**
 * The Sender class (aka invoker) is responsible for initiating requests. 
   This class must have a field for storing a reference to a command object. 
   The sender triggers that command instead of sending the request directly to the receiver (here IDevice). 
   Note that the sender isn’t responsible for creating the command object. 
   Usually, it gets a pre-created command from the client via the constructor.

 * An invoker is an object that knows how to execute a given command but doesn't know how the command has been implemented. 
   It only knows the command's interface.
 */
public class RemoteButton {
    private Command command;

    public RemoteButton(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
