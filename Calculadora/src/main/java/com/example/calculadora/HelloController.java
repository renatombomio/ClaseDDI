package com.example.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TextField entrada;

    @FXML
    private void evaluar (ActionEvent event) {
        String result = Evaluar.eval(entrada.getText());
        entrada.setText(result);
    }

    @FXML
    private void borrar (ActionEvent event){
        entrada.setText("");
    }

    @FXML
    private void otroBoton(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String nuevaEntrada = entrada.getText() + btn.getText();
        entrada.setText(nuevaEntrada);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }



}