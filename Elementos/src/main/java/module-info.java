module com.example.elements {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;


    opens com.example.elements to javafx.fxml;
    exports com.example.elements;
    exports com.example.elements.utils;
    opens com.example.elements.utils to javafx.fxml;
}