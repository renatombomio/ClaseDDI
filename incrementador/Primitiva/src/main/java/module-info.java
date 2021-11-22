module com.example.aumentadortexto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aumentadortexto to javafx.fxml;
    exports com.example.aumentadortexto;
}