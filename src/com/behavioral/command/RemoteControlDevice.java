package com.behavioral.command;

/**
 * The Client creates and configures concrete command objects. 
   The client must pass all of the request parameters, including a receiver instance, into the command’s constructor. 
   After that, the resulting command may be associated with one or multiple senders.

   Flow:- 
   Invoker --> Command --> Receiver
   Instead of, Invoker --> Receiver

 */
public class RemoteControlDevice {
    // Remote Control Device will have multiple buttons (remote button) for each operation.
    // We are trying to make Universal remote which can operate TV, SetTopBox and many more.
    private RemoteButton tvOnButton;
    private RemoteButton tvOffButton;
    private RemoteButton setUpBoxOnButton;
    private RemoteButton setUpBoxOffButton;

    public RemoteControlDevice() {
        this.tvOnButton = new RemoteButton(new OnCommand(new TV()));
        this.tvOffButton = new RemoteButton(new OffCommand(new TV()));
        this.setUpBoxOnButton = new RemoteButton(new OnCommand(new SetTopBox()));
        this.setUpBoxOffButton = new RemoteButton(new OffCommand(new SetTopBox()));
    }

    //As remote can have multiple buttons you can have multiple such commands
    public RemoteButton onTvButton() {
        return tvOnButton;
    }

    public RemoteButton offTvButton() {
        return tvOffButton;
    }

    public RemoteButton onSetTopBoxButton() {
        return setUpBoxOnButton;
    }

    public RemoteButton offSetTopBoxButton() {
        return setUpBoxOffButton;
    }
}
