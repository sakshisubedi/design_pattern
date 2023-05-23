package com.structural.proxy.internet;

/**
 * The Service Interface declares the interface of the Service.
 * The proxy must follow this interface to be able to disguise itself as a service object.
 */
public interface Internet {
    public void connectTo(String serverhost) throws Exception;
}
