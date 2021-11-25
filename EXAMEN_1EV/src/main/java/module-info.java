module com.example.chisteschuck {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;


    opens com.example.chisteschuck to javafx.fxml;
    exports com.example.chisteschuck;
}