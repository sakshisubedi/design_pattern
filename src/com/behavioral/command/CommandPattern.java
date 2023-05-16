package com.behavioral.command;

/**
 * The Client creates and configures concrete command objects. 
   The client must pass all the request parameters, including a receiver instance, into the command’s constructor.
   After that, the resulting command may be associated with one or multiple senders.
 */
public class CommandPattern {
    public static void main(String[] args) {
        RemoteControlDevice remoteControlDevice = new RemoteControlDevice();

        remoteControlDevice.onTvButton().pressButton();
        remoteControlDevice.offTvButton().pressButton();

        remoteControlDevice.onSetTopBoxButton().pressButton();
        remoteControlDevice.offSetTopBoxButton().pressButton();
    }
}
