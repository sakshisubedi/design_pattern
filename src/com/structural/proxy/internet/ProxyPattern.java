package com.structural.proxy.internet;

/**
 * The Client should work with both services and proxies via the same interface.
 * This way you can pass a proxy into any code that expects a service object.
 */
public class ProxyPattern {
    public static void main(String[] args) {
        /**
         * A very simple real life scenario is our college internet, which restricts few site access.
         * The proxy first checks the host you are connecting to,
         * if it is not part of restricted site list,
         * then it connects to the real internet.
         * This example is based on Protection proxies.
         */
        Internet proxyInternet = new ProxyInternet();
        try {
            proxyInternet.connectTo("geeksforgeeks.org");
            proxyInternet.connectTo("abc.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
