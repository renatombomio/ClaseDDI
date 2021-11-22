package com.example.incrementador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelo.Operaciones;

import java.net.URL;
import java.util.ResourceBundle;

public class OperacionesController implements Initializable {
    @FXML
    private Button btInc;

    @FXML
    private Button btDec;

    @FXML
    private TextField txtResult ;




    public void increase(ActionEvent actionEvent) {
        int resultado = Integer.parseInt(txtResult.getText());
        Operaciones op = new Operaciones(resultado);
        txtResult.setText(op.incrementar()+"");

        /*
        resultado ++;
        txtResult.setText(resultado + "");*/

    }

    public void decrease(ActionEvent actionEvent) {

        int resultado = Integer.parseInt(txtResult.getText());
        Operaciones op = new Operaciones(resultado);
        txtResult.setText(Integer.toString(op.decrementar())); // cambiar valor del campo textField

        /*
        resultado --;
        txtResult.setText(resultado + "");*/
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        this.txtResult.setText("0");
    }
}