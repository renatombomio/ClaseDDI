package com.example.comunicacionventanas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    TextField txt;

    @FXML
    Button bt;

    private Stage stage; //para la ventana numero 1

    public void Showview2 (ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/comunicacionventanas/view2.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        View2Controller controller = fxmlLoader.getController();
        Stage stage = new Stage(); //ventana numero dos
        stage.setScene(scene);
        stage.setTitle("Ventana numero 2");

        controller.init(txt.getText(), stage, this);

        stage.show();//al abrir la ventana mostramos ventana numero 2
        this.stage.close(); //a continuacion cerramos esta ventana numero 1
    }

    public void setStage(Stage stage) {this.stage = stage;}

    public void show (){stage.show();}
}