package com.example.operando;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import modelo.Operaciones;

import java.net.URL;
import java.util.ResourceBundle;

public class OperacionesController implements Initializable {
    @FXML
    private TextField txt1;
    @FXML
    private TextField txt2;
    @FXML
    private TextField txtResult;

    @FXML
    private RadioButton rdbSuma;

    @FXML
    private RadioButton rdbResta;

    @FXML
    private RadioButton rdbMult;

    @FXML
    private RadioButton rdbDiv;

    @FXML
    public void operar(ActionEvent actionEvent) {
        try {
            int number1 = Integer.parseInt(this.txt1.getText());
            int number2 = Integer.parseInt(this.txt2.getText());

            Operaciones op = new Operaciones(number1, number2);

            if (this.rdbSuma.isSelected()) {
                this.txtResult.setText(op.sumar() + "");
            } else if (this.rdbResta.isSelected()) {
                this.txtResult.setText(op.restar() + "");
            } else if (this.rdbMult.isSelected()) {
                this.txtResult.setText(op.multiplicar() + "");
            } else if (this.rdbDiv.isSelected()) {
                if (number2 == 0) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error de división");
                    alert.setContentText("El operando dos no puede ser 0");
                    alert.showAndWait();

                } else {
                    this.txtResult.setText(op.dividir() + "");
                }
            }

        }catch(NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error de división");
            alert.setContentText("formato incorrecto");
            alert.showAndWait();

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ToggleGroup tg = new ToggleGroup();
        this.rdbDiv.setToggleGroup(tg);
        this.rdbSuma.setToggleGroup(tg);
        this.rdbResta.setToggleGroup(tg);
        this.rdbMult.setToggleGroup(tg);
    }


}