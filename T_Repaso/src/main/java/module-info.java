module com.example.t_repaso {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.t_repaso to javafx.fxml;
    exports com.example.t_repaso;
}