module com.example.prueba01 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.prueba01 to javafx.fxml;
    exports com.example.prueba01;
}