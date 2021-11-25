package com.example.chisteschuck;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.collections.ObservableList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.json.JSONArray;
import org.json.JSONObject;

public class HelloController implements Initializable {

    @FXML
    private Button btn_chisteAleatorio;

    @FXML
    private ImageView img_chuck;

    @FXML
    private Button btn_chisteCategoria;

    @FXML
    private ChoiceBox<Object> choiceBox_lista;

    @FXML
    private ListView<Object> listview_GenerarChiste;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}


