package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class OperacionesController {
    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private TextField txtResult;



    @FXML
    public void Sumar(ActionEvent actionEvent) {
        try {
            int number1 = Integer.parseInt(txt1.getText());
            int number2 = Integer.parseInt(txt2.getText());
            txtResult.setText(Integer.toString(number1 + number2));
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("formato incorrecto");
            alert.showAndWait();
        }
    }


}