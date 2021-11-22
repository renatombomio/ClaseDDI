package com.example.table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtEdad;

    @FXML
    private TableView<Persona> tb1Personas;

    @FXML
    private TableColumn colNombre;

    @FXML
    private TableColumn colApellidos;

    @FXML
    private TableColumn colEdad;

    @FXML
    private Button btAgregar;

    @FXML
    private ObservableList<Persona> personas;

    public void agregarPersona(ActionEvent actionEvent) {
        try{
            String nombre = this.txtNombre.getText();
            String apellidos = this.txtApellido.getText();
            int edad = Integer.parseInt(this.txtEdad.getText());
            //instanciamos la persona
            Persona p = new Persona(nombre, apellidos,edad);
            personas.add(p);
            tb1Personas.setItems(personas);
            


        }catch (NumberFormatException exception){
            Alert alert = new Alert (Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Edad incorrecta");
            alert.showAndWait();
        }

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        personas = FXCollections.observableArrayList();

        this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.colApellidos.setCellValueFactory(new PropertyValueFactory("apellidos"));
        this.colEdad.setCellValueFactory(new PropertyValueFactory("edad"));
    }
}