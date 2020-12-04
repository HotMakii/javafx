module VeA {
    requires javafx.controls;
    requires javafx.fxml;

    opens controllers to javafx.fxml;
    exports controllers;

    opens service to javafx.fxml;
    exports service;
}