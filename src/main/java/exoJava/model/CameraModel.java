package com.example.mvc.model;

import com.github.sarxos.webcam.Webcam;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CameraModel {

    public void capturePhoto() {
        String outputPath = System.getProperty("user.dir") + "/src/main/ressources/images/photo.png";
        File outputFile = new File(outputPath);

        try {
            File outputDirectory = outputFile.getParentFile();
            if (!outputDirectory.exists() && !outputDirectory.mkdirs()) {
                System.out.println("Erreur : Impossible de créer le dossier " + outputDirectory.getAbsolutePath());
                return;
            }

            Webcam webcam = Webcam.getDefault();
            if (webcam == null) {
                System.out.println("Erreur : Aucune webcam détectée.");
                return;
            }

            webcam.open();
            BufferedImage image = webcam.getImage();
            webcam.close();

            if (image == null) {
                System.out.println("Erreur : Impossible de capturer une image depuis la webcam.");
                return;
            }

            ImageIO.write(image, "PNG", outputFile);
            System.out.println("Photo capturée et sauvegardée à : " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture de l'image : " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Erreur inattendue : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
