package com.example.mvc.controller;

import com.example.mvc.model.AudioModel;

public class AudioController {
    private final AudioModel audioModel = new AudioModel();

    public void startRecording() {
        audioModel.startRecording();
    }

    public void stopRecording() {
        audioModel.stopRecording();
    }
}
