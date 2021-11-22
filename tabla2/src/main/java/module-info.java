module com.example.tablatwo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tablatwo to javafx.fxml;
    exports com.example.tablatwo;
}