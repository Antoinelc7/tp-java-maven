package com.example.mvc.controller;

import com.example.mvc.model.CameraModel;

public class CameraController {
    private final CameraModel cameraModel = new CameraModel();

    public void capturePhoto() {
        cameraModel.capturePhoto();
    }
}
