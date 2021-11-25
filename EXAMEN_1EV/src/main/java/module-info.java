module com.example.chisteschuck {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chisteschuck to javafx.fxml;
    exports com.example.chisteschuck;
}