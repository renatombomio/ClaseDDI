package com.example.proyectocalculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import javafx.scene.control.TextField;
import java.lang.String;


import java.net.URL;
import java.util.ResourceBundle;

public class calculadoraController implements Initializable {

    @FXML
    private TextField textField;

    @FXML
    private Button btn_borrar;

    @FXML
    private Button btn_cero;

    @FXML
    private Button btn_cinco;

    @FXML
    private Button btn_cuatro;

    @FXML
    private Button btn_divi;

    @FXML
    private Button btn_dos;

    @FXML
    private Button btn_igual;

    @FXML
    private Button btn_multi;

    @FXML
    private Button btn_nueve;

    @FXML
    private Button btn_ocho;

    @FXML
    private Button btn_porcen;

    @FXML
    private Button btn_punto;

    @FXML
    private Button btn_resta;

    @FXML
    private Button btn_seis;

    @FXML
    private Button btn_siete;

    @FXML
    private Button btn_suma;

    @FXML
    private Button btn_tres;

    @FXML
    private Button btn_uno;

    @FXML
    private GridPane gridPantalla;

    @FXML
    void click_borrar(ActionEvent event) {

    }

    @FXML
    void click_cero(ActionEvent event) {

    }

    @FXML
    void click_cinco(ActionEvent event) {

    }

    @FXML
    void click_cuatro(ActionEvent event) {

    }

    @FXML
    void click_divi(ActionEvent event) {

    }

    @FXML
    void click_dos(ActionEvent event) {

    }

    @FXML
    void click_igual(ActionEvent event) {

    }

    @FXML
    void click_multi(ActionEvent event) {

    }

    @FXML
    void click_nueve(ActionEvent event) {

    }

    @FXML
    void click_ocho(ActionEvent event) {

    }

    @FXML
    void click_porcen(ActionEvent event) {

    }

    @FXML
    void click_punto(ActionEvent event) {

    }

    @FXML
    void click_resta(ActionEvent event) {

    }

    @FXML
    void click_seis(ActionEvent event) {

    }

    @FXML
    void click_siete(ActionEvent event) {

    }

    @FXML
    void click_suma(ActionEvent event) {

    }

    @FXML
    void click_tres(ActionEvent event) {

    }

    @FXML
    void click_uno(ActionEvent event) {

    }

    private boolean Numero = false;
    private boolean Punto= false;
    private int numOperandos=0;
    private double Operando1, Operando2;
    private char Operador= 0;

    private void numeroPantalla (String numero){
        if (!Numero && numero.equals("0"))
            return;
        if (!Numero){
            gridPantalla.setText("");
            Punto = false;
        }

        String valorActual = gridPantalla.getText();
        gridPantalla.setText(valorActual + numero);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public calculadoraController() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
