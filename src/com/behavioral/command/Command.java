package com.behavioral.command;

/**
 * The Command interface usually declares just a single method for executing the command.
 * 
 * A command is an object whose role is to store all the information required for executing an action,
   including the method to call, the method arguments, and the object (known as the receiver) that implements the method.
 */
public interface Command {
    public void execute();
    // can have unexecute() or undo() or redo() methods too
}
