package com.example.mvc.model;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AudioModel {
    private TargetDataLine line;

    public void startRecording() {
        try {
            AudioFormat format = new AudioFormat(44100, 16, 2, true, true);
            DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
            line = (TargetDataLine) AudioSystem.getLine(info);
            line.open(format);
            line.start();

            String outputPath = "src/main/resources/audio/recording.wav";
            File file = new File(outputPath);

            File parentDir = file.getParentFile();
            if (!parentDir.exists() && !parentDir.mkdirs()) {
                System.err.println("Erreur : Impossible de créer le répertoire " + parentDir.getAbsolutePath());
                return;
            }

            System.out.println("Enregistrement en cours...");
            AudioSystem.write(new AudioInputStream(line), AudioFileFormat.Type.WAVE, file);
            System.out.println("Enregistrement terminé. Fichier sauvegardé à : " + file.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stopRecording() {
        if (line != null && line.isOpen()) {
            line.stop();
            line.close();
            System.out.println("Enregistrement arrêté.");
        }
    }
}
