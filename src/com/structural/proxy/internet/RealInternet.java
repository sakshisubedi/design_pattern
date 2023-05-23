package com.structural.proxy.internet;

/**
 * The Service is a class that provides some useful business logic.
 */
public class RealInternet implements Internet{
    @Override
    public void connectTo(String serverhost) throws Exception{
        System.out.println("Connecting to "+ serverhost);
    }
}
