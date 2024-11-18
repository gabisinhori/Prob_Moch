module com.example.interfaceestoque {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;

    opens com.example.interfaceestoque to javafx.fxml;
    exports com.example.interfaceestoque;
}