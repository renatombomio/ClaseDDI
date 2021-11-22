module com.example.operando {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.operando to javafx.fxml;
    exports com.example.operando;
}