package org.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/resources/layouts/primary.fxml"));
        AnchorPane root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image("/org/resources/images/icons8-network-64.png"));
        primaryStage.setResizable(false);
        primaryStage.setTitle("Нева Сети");

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
