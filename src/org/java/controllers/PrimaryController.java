package org.java.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class PrimaryController {

    public AnchorPane action;

    public void getNetworkTools(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/resources/layouts/networkTools.fxml"));
        AnchorPane root = loader.load();
        action.getChildren().clear();
        action.getChildren().add(root);



    }

    public void getCRM(ActionEvent event) {
    }

    public void getEmployeeControll(ActionEvent event) {
    }

    public void getClients(ActionEvent event) {
    }

    public void getLinks(ActionEvent event) {
    }
}
