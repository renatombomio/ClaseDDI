module com.example.proyectocalculadora {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectocalculadora to javafx.fxml;
    exports com.example.proyectocalculadora;
}