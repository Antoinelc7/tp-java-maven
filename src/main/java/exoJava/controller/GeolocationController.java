package com.example.mvc.controller;

import com.example.mvc.model.GeolocationModel;

public class GeolocationController {
    private final GeolocationModel geolocationModel = new GeolocationModel();

    public void showLocation() {
        geolocationModel.getLocation();
    }
}
