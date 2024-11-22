package com.example.mvc.model;

import java.net.InetAddress;

public class GeolocationModel {
    public void getLocation() {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Latitude: 48.8566, Longitude: 2.3522 (Paris)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
