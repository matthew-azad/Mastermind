package com.example.project2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @SuppressWarnings("ConstantConditions")
    @Override
    public void start(Stage stage) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(HelloApplication.class.getResource("hello-view.fxml"));
        stage.setTitle("Mastermind");
        stage.setScene(new Scene(fxmlLoader, 300, 500));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}