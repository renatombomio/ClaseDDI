package com.example.aumentadortexto;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button bt;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private TextField txt3;
    @FXML
    private TextField txt4;
    @FXML
    private TextField txt5;
    @FXML
    private TextField txt6;
    @FXML
    private TextField txtReintegro;
    private double contador = 10;
    ArrayList<Integer> lista = new ArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }



    public void generar(ActionEvent actionEvent) {


        ArrayList<Integer> lista = new ArrayList();
        for (int i = 1; i <=6 ; i++) {
            int valorDado = (int) Math.floor(Math.random() * 49 + 1);

            if (!lista.contains(valorDado)) {
                lista.add(valorDado);
            } else {
                i--;
            }

        }
        txt1.setText(String.valueOf(lista.get(0)));
        txt2.setText(String.valueOf(lista.get(1)));
        txt3.setText(String.valueOf(lista.get(2)));
        txt4.setText(String.valueOf(lista.get(3)));
        txt5.setText(String.valueOf(lista.get(4)));
        txt6.setText(String.valueOf(lista.get(5)));
        txtReintegro.setText(String.valueOf((int) Math.floor(Math.random() * 9 + 1)));


    }
    public void aumentar (ActionEvent actionEvent){

        txt1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, contador +2));
        txt2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, contador +2));
        txt3.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, contador +2));
        txt4.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, contador +2));
        txt5.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, contador +2));
        txt6.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, contador +2));
        txtReintegro.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, contador +2));
        contador = contador+2;

    }
    public void decrementar (ActionEvent actionEvent){

        txt1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, contador -2));
        txt2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, contador -2));
        txt3.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, contador -2));
        txt4.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, contador -2));
        txt5.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, contador -2));
        txt6.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, contador -2));
        txtReintegro.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, contador -2));
        contador = contador-2;
    }
}