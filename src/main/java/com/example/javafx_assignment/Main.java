package com.example.javafx_assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage Primarystage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("Application.css").toExternalForm());
        Primarystage.setScene(scene);
        Primarystage.setTitle("JavaFX Assignment");
        Primarystage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

