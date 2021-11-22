module com.example.comunicacionventanas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comunicacionventanas to javafx.fxml;
    exports com.example.comunicacionventanas;
}