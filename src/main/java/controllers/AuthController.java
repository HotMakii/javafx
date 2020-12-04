package controllers;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AuthController {

    @FXML
    private Label label1;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button button1;

    @FXML
    public void buttonClicked(Event event){
        System.out.println(username.getText() + " " + password.getText());
    }



    
}
