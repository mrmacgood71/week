package org.java.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.java.entyties.User;
import org.java.services.LoginService;

import java.net.URL;
import java.util.ResourceBundle;

public class PrimaryController implements Initializable {
    public PasswordField password;
    public TextField login;

    LoginService service = new LoginService();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void singIn(ActionEvent event) {
        boolean isExist = service.signIn(login.getText(), password.getText());

        if(isExist) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.showAndWait();
        }


    }
}
