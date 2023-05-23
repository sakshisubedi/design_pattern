package com.structural.proxy.internet;

import java.util.ArrayList;
import java.util.List;

/**
 * The Proxy class has a reference field that points to a service object.
 * After the proxy finishes its processing (e.g., lazy initialization, logging, access control, caching, etc.),
 * it passes the request to the service object.
 *
 * Usually, proxies manage the full lifecycle of their service objects.
 */
public class ProxyInternet implements Internet{
    private Internet realInternet;
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }

    public ProxyInternet() {
        realInternet = new RealInternet();
    }


    @Override
    public void connectTo(String serverhost) throws Exception {
        if(bannedSites.contains(serverhost.toLowerCase())) {
            throw new Exception("Access Denied");
        }
        realInternet.connectTo(serverhost);
    }
}
