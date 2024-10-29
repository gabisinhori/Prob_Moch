module com.example.interfaceestoque {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.interfaceestoque to javafx.fxml;
    exports com.example.interfaceestoque;
}