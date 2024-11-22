package com.example.mvc.view;

import com.example.mvc.controller.AudioController;
import com.example.mvc.controller.CameraController;
import com.example.mvc.controller.GeolocationController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainView {

    public void show(Stage primaryStage) {
        // Buttons
        Button btnAudio = new Button("Enregistrer Audio");
        Button btnStopAudio = new Button("Arrêter Enregistrement");
        Button btnCamera = new Button("Prendre Photo");
        Button btnGeolocation = new Button("Géolocalisation");

        // Controllers
        AudioController audioController = new AudioController();
        CameraController cameraController = new CameraController();
        GeolocationController geolocationController = new GeolocationController();

        // Event Handlers
        btnAudio.setOnAction(e -> audioController.startRecording());
        btnStopAudio.setOnAction(e -> audioController.stopRecording());
        btnCamera.setOnAction(e -> cameraController.capturePhoto());
        btnGeolocation.setOnAction(e -> geolocationController.showLocation());

        // Layout
        VBox root = new VBox(10, btnAudio, btnStopAudio, btnCamera, btnGeolocation);

        // Scene
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("MVC App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
