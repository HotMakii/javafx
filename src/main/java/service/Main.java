package service;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);



    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = FXMLLoader.load(getClass().getResource("/Auth.fxml"));
        



        primaryStage.setScene(scene);
        primaryStage.show();
    }

}