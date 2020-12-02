module service {
    requires javafx.controls;
    requires javafx.fxml;

    opens service to javafx.fxml;
    exports service;
}