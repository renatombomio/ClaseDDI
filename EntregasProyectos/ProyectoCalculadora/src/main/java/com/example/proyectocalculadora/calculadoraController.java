package com.example.proyectocalculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import javafx.scene.control.TextField;
import java.lang.String;


import java.net.URL;
import java.util.ResourceBundle;

public class calculadoraController implements Initializable {


    private boolean numero = false;
    private boolean punto = false;
    private int numOperandos = 0;
    private double Operando1, Operando2;
    private char Operador = ' ';


    @FXML
    private Label labPantalla;


    @FXML
    void click_borrar(ActionEvent event){
        numero = false;
        punto = false;
        numOperandos = 0;
        Operando1= 0;
        Operando2= 0;
        Operador= ' ';
        labPantalla.setText(" ");
    }

    @FXML
    void click_Valor(ActionEvent event){
        if (numero)
            labPantalla.setText("-" +labPantalla.getText());
    }

    @FXML
    void click_porciento(ActionEvent event){
        if (numOperandos == 0){
            labPantalla.setText("0");
            return;
        }
        double valor= Double.parseDouble(labPantalla.getText());
        double porcentaje = (Operando1 * valor) / 100;
        labPantalla.setText(String.valueOf(porcentaje));
        numero = true;
        punto = true;
    }

    @FXML
    void click_division(ActionEvent event){
        evalOperador("/");
    }

    @FXML
    void click_multiplicar(ActionEvent event){
        evalOperador("*");
    }

    @FXML
    void click_resta(ActionEvent event){
        evalOperador("-");
    }

    @FXML
    void click_suma(ActionEvent event){
        evalOperador("+");
    }

    @FXML
    void click_igual(ActionEvent event){
        evalOperador("=");
    }

    private void evalOperador (String Operador){
        if (numero){
            numOperandos ++;

            if (numOperandos ==1)
                Operando1= Double.parseDouble(labPantalla.getText());

            if (numOperandos ==2)
                Operando2 = Double.parseDouble(labPantalla.getText());

            switch (this.Operador){
                case '+':
                    Operando1 = Operando1 + Operando2;
                    break;
                case '-':
                    Operando1 = Operando1 - Operando2;
                    break;
                case '/':
                    Operando1 = Operando1 / Operando2;
                    break;
                case '*':
                    Operando1 = Operando1 * Operando2;
                    break;
                case '=':
                    Operando1 = Operando2;
            }
            labPantalla.setText(String.valueOf(Operando1));
            numOperandos = 1;
            punto = false;
        }
        numero = false;
        this.Operador = Operador.charAt(0);
    }

    @FXML
    void click_cero(ActionEvent event) {
        numeroPantalla("0");
    }

    @FXML
    void click_cinco(ActionEvent event) {
        numeroPantalla("5");
    }

    @FXML
    void click_cuatro(ActionEvent event) {
        numeroPantalla("4");
    }


    @FXML
    void click_dos(ActionEvent event) {
        numeroPantalla("2");
    }


    @FXML
    void click_nueve(ActionEvent event) {
        numeroPantalla("9");
    }

    @FXML
    void click_ocho(ActionEvent event) {
        numeroPantalla("8");
    }


    @FXML
    void click_punto(ActionEvent event) {
       if (!punto && !numero) {
           labPantalla.setText("0.");
           numero = true;
       }else if (!punto){
           String valorActual= labPantalla.getText();
           labPantalla.setText(valorActual + ".");
       }
       punto = true;
    }


    @FXML
    void click_seis(ActionEvent event) {
        numeroPantalla("6");
    }

    @FXML
    void click_siete(ActionEvent event) {
        numeroPantalla("7");
    }

    @FXML
    void click_tres(ActionEvent event) {
        numeroPantalla("3");
    }

    @FXML
    void click_uno(ActionEvent event) {
        numeroPantalla("1");
    }

    private void numeroPantalla(String numeros) {
        if (!numero && numeros.equals("0"))
            return;
        if (!numero) {

            labPantalla.setText(" ");
            punto = false;
        }

        String valorActual = labPantalla.getText();
        labPantalla.setText(valorActual + numeros);
        numero = true;
    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
