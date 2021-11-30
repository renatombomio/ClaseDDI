package com.example.json;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;

public class HelloController implements Initializable{

        @FXML
        private Button btn_lista;

        @FXML
        private ImageView img_Imagen;

        @FXML
        private ListView listView;

        ObservableList<Pelicula> listaPelicula;

        @FXML
        private Label txt_episodios;

        @FXML
        private Label txt_sinopsis;

        @FXML
        private Label txt_tipo;

        @FXML
        private Label txt_titulo;





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        instancias();
        asociarElementos();
        lecturaJSON();
        acciones();




}

    private void asociarElementos() {
        listView.setItems(listaPelicula);
    }

    private void acciones() {
        btn_lista.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(Thread.currentThread());
                        lecturaJSON();
                    }
                });
            }
        });

    }

    private void lecturaJSON() {
        String url = "https://api.jikan.moe/v3/search/anime?q=naruto";
        InputStream input;
        try {
            input = new URL(url).openStream();
            BufferedReader bis = new BufferedReader(new InputStreamReader(input));
            String respuesta = bis.readLine();
            JSONObject jsonGeneral = new JSONObject(respuesta);
            JSONArray arrayGenero = jsonGeneral.getJSONArray("results");


            for (int i = 0; i < arrayGenero.length(); i++) {
                JSONObject genero = arrayGenero.getJSONObject(i);
                String titulo = genero.getString("title");
                

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void instancias() {

        listView = (ListView) FXCollections.observableArrayList();
        listView.setItems(listaPelicula);
    }
}