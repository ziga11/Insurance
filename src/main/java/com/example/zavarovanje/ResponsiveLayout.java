package com.example.zavarovanje;

import javafx.application.Application;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ResponsiveLayout extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)  {
        HBox hBox = new HBox();
        hBox.setSpacing(8);
        hBox.getChildren().addAll();
    }
}
