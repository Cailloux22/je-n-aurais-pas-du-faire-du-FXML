module com.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx to javafx.fxml;
    exports com.example.javafx;
    exports com.example.javafx.controller;
    opens com.example.javafx.controller to javafx.fxml;
    exports com.example.javafx.classes;
    opens com.example.javafx.classes to javafx.fxml;
}