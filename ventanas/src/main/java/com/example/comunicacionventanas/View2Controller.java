package com.example.comunicacionventanas;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class View2Controller {
    private HelloController helloController;
    private Stage stage;
    private Label label2;

    Button bt2;

    public void showview1 (ActionEvent actionEvent){
        helloController.show(); //metodo propio creado en HelloController
        this.stage.close(); //cerrar ventana 2
    }


    public void init(String text, Stage stage, HelloController helloController) {
        label2.setText(text);
        this.helloController = helloController;
        this.stage = stage;
    }

}