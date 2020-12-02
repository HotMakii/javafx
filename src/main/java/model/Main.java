package model;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //izkartojuma objekts
        VBox layout = new VBox();
        //iezimes lauks lietotajvardam
        Label lusername = new Label("Ievadiet lietotajvardu:");
        //ievades lauks lietotajvardam
        TextField tusername = new TextField();
        //iezimes lauks parolei
        Label lpassword = new Label("Ievadiet paroli:");
        //ievades lauks parolei
        PasswordField tpassword = new PasswordField();
        //poga
        Button button1 = new Button("Ienakt sistema");

        layout.getChildren().addAll(lusername, tusername, lpassword, tpassword, button1);

        //skata objekts
        Scene scene = new Scene(layout, 400, 600);
        primaryStage.setScene(scene);
        primaryStage.show();




    }
   
}
