// package exoJava;

// /**
//  * Hello world!
//  */
// public class App {
//     public static void main(String[] args) {
//         System.out.println("Hello World!");
//     }
// }

// package com.example.mvc;
package exoJava;

import com.example.mvc.view.MainView;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        MainView mainView = new MainView();
        mainView.show(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
