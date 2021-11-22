module com.example.incrementador {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.incrementador to javafx.fxml;
    exports com.example.incrementador;
}