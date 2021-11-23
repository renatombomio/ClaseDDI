package com.example.elements;

import com.example.elements.utils.CuentaCorriente;
import com.example.elements.utils.Pelicula;
import com.example.elements.utils.Personaje;
import com.example.elements.HelloApplication;
import com.example.elements.utils.CuentaCorriente;
import com.example.elements.utils.DetalleController;
import com.example.elements.utils.Pelicula;
import com.example.elements.utils.Personaje;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ToggleButton btnToggle;

    @FXML
    private RadioButton radioUno, radioDos, radioTres;

    @FXML
    private Button btnComprobar, btnImagen, btnListas, btnDetalle;

    @FXML
    private BorderPane ventanaGeneral;

    @FXML
    private GridPane gridAdicional, panelBotones;

    @FXML
    CheckBox checkUno, checkDos, checkTres;

    @FXML
    HBox panelCheck;

    @FXML
    private ComboBox<Personaje> combo;

    @FXML
    private ChoiceBox<Personaje> choice;

    @FXML
    private ListView<Pelicula> listView;

    @FXML
    private ProgressBar barraProgreso;

    @FXML ImageView imagenPelicula;

    private ObservableList<Personaje> listaCombo, listaChoice;

    private ObservableList<Pelicula> listaListView;

    private ToggleGroup grupoRadios;

    private ObservableList<Personaje> listaPersonajes;

    private Task tareaJson;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // System.out.println(Thread.currentThread().getName());
        instancias();
        //lecturaJSON();
        iniciarListas();
        asociarElementos();
        iniciarElementos();
        acciones();
    }

    private void iniciarListas() {
        listaPersonajes.addAll(new Personaje("Spiderman", "Telas", 12, 23, 53)
                , new Personaje("Venom", "Otro", 123, 32, 5)
                , new Personaje("CapitanAmerica", "Loquesea", 123, 56, 765));

        listaCombo = listaPersonajes;
        listaChoice = listaPersonajes;

        /*listaListView.addAll(new Personaje("Spiderman", "Telas", 12, 23, 53)
                , new Personaje("Venom", "Otro", 123, 32, 5)
                , new Personaje("CapitanAmerica", "Loquesea", 123, 56, 765), new Personaje("Spiderman", "Telas", 12, 23, 53)
                , new Personaje("Venom", "Otro", 123, 32, 5)
                , new Personaje("CapitanAmerica", "Loquesea", 123, 56, 765), new Personaje("Spiderman", "Telas", 12, 23, 53)
                , new Personaje("Venom", "Otro", 123, 32, 5)
                , new Personaje("CapitanAmerica", "Loquesea", 123, 56, 765), new Personaje("Spiderman", "Telas", 12, 23, 53)
                , new Personaje("Venom", "Otro", 123, 32, 5)
                , new Personaje("CapitanAmerica", "Loquesea", 123, 56, 765), new Personaje("Spiderman", "Telas", 12, 23, 53)
                , new Personaje("Venom", "Otro", 123, 32, 5)
                , new Personaje("CapitanAmerica", "Loquesea", 123, 56, 765));*/

    }

    private void lecturaJSON() {




        String url = "https://api.themoviedb.org/3/movie/now_playing?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1";

        InputStream input;
        try {
            input = new URL(url).openStream();
            BufferedReader bis = new BufferedReader(new InputStreamReader(input));
            String respuesta = bis.readLine();
            JSONObject jsonGeneral = new JSONObject(respuesta);
            JSONArray arrayPeliculas = jsonGeneral.getJSONArray("results");

            for (int i = 0; i < arrayPeliculas.length(); i++) {
                //System.out.println(Thread.currentThread().getName());
                JSONObject pelicula = arrayPeliculas.getJSONObject(i);
                String titulo = pelicula.getString("original_title");
                String imagen = pelicula.getString("poster_path");
                int id = pelicula.getInt("id");
                //Thread.sleep(100);
                barraProgreso.setProgress((double) i/(double) arrayPeliculas.length());
                //System.out.println(titulo);


                listaListView.add(new Pelicula(titulo, imagen, id));
            }
            barraProgreso.setProgress(1);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    private void asociarElementos() {

        combo.setItems(listaCombo);
        choice.setItems(listaChoice);
        listView.setItems(listaListView);
        int contador = 0;
        for (Node itemNode : panelCheck.getChildren()) {
            itemNode.setUserData(listaPersonajes.get(contador));
            ((CheckBox) itemNode).setText(listaPersonajes.get(contador).getNombre());
            ((CheckBox) itemNode).setTooltip(new Tooltip(listaPersonajes.get(contador).getPoder()));
            contador++;
        }
        radioUno.setUserData(new CuentaCorriente("1234A", "Paypal", "Borja Martin"));
        radioDos.setUserData(new CuentaCorriente("2345A", "Internacional", "Pedro Martin"));
        radioTres.setUserData(new CuentaCorriente("3456A", "Tarjeta", "Juan Martin"));
    }

    private void instancias() {
        grupoRadios = new ToggleGroup();
        listaPersonajes = FXCollections.observableArrayList();
        listaCombo = FXCollections.observableArrayList();
        listaChoice = FXCollections.observableArrayList();
        listaListView = FXCollections.observableArrayList();
        grupoRadios.getToggles().addAll(radioUno, radioDos, radioTres);
    }

    private void iniciarElementos() {

        btnToggle.setSelected(false);
        ventanaGeneral.getChildren().remove(gridAdicional);
        btnToggle.setBackground(null);
        btnToggle.setText("");
        btnToggle.setBorder(null);
        btnToggle.setGraphic(new ImageView(new Image(HelloController.class.getResourceAsStream("power_off.png"))));

    }

    private void acciones() {
        /*btnComprobar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                /*boolean activado = btnToggle.isSelected();
                System.out.println(activado);
                ObservableList<Node> listaNodos = panelCheck.getChildren();
                for (Node itemNode : listaNodos) {
                    if (((CheckBox) itemNode).isSelected()) {
                        // lo añado a la lista de personajes
                        //System.out.println(((CheckBox)itemNode).getText());
                        Personaje seleccionado = (Personaje) itemNode.getUserData();
                        System.out.println(seleccionado.getNombre());
                        System.out.println(seleccionado.getPoder());
                        System.out.println(seleccionado.getAtaque());
                        System.out.println(seleccionado.getDefensa());
                        System.out.println(seleccionado.getConcetracion());
                    }
                    System.out.println();
                }
            }
        });*/


        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Pelicula>() {
            @Override
            public void changed(ObservableValue<? extends Pelicula> observableValue, Pelicula pelicula, Pelicula t1) {
                System.out.println("https://image.tmdb.org/t/p/w500"+t1.getImagen());
                imagenPelicula.setImage(new Image("https://image.tmdb.org/t/p/w500/"+t1.getImagen()));
            }
        });

        btnToggle.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean oldValue, Boolean newValue) {
                if (newValue) {
                    ventanaGeneral.setLeft(gridAdicional);
                    btnToggle.setGraphic(new ImageView(new Image(HelloController.class.getResourceAsStream("power_on.png"))));
                } else {
                    ventanaGeneral.getChildren().remove(gridAdicional);
                    btnToggle.setGraphic(new ImageView(new Image(HelloController.class.getResourceAsStream("power_off.png"))));
                }
            }
        });
        grupoRadios.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observableValue, Toggle oldValue, Toggle newValue) {
                String titular = ((CuentaCorriente) newValue.getUserData()).getTitular();
                System.out.println(titular);
            }
        });
        ObservableList<Node> listaElementos = panelBotones.getChildren();
        btnListas.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(Thread.currentThread());
                //System.out.println(combo.getSelectionModel().getSelectedItem().getNombre());
                //System.out.println(choice.getSelectionModel().getSelectedItem().getNombre());
                //System.out.println(Thread.currentThread().getName());
                //new Thread(tareaJson).start();
                //barraProgreso.setProgress(0.6);
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(Thread.currentThread());
                        lecturaJSON();
                    }
                });
            }
        });
        for (Node elemento : listaElementos) {
            if (elemento instanceof Button) {
                //((Button) elemento).setOnAction(new ManejoPulsaciones());
                ((Button) elemento).addEventHandler(ActionEvent.ACTION, new ManejoPulsaciones());
            }
        }
        combo.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Personaje>() {
            @Override
            public void changed(ObservableValue<? extends Personaje> observableValue,
                                Personaje personaje, Personaje t1) {
                /*if (t1.getNombre().equals("Venom")){
                }*/
                System.out.println(t1.getNombre());
            }
        });
        btnDetalle.setOnAction(new ManejoPulsaciones());
    }

    class ManejoPulsaciones implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            Button bAux = (Button) actionEvent.getSource();

            if (bAux != btnImagen) {
                // textfield.appedText(bAux.getText())
                System.out.println(bAux.getText());
            }

            if (actionEvent.getSource() == btnDetalle){
                // abrir una ventana nueva con el detalle de la pelicula
                Stage ventanaDetalle = new Stage();
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("detalle-view.fxml"));
                Scene scene = null;
                Parent root = null;
                try {
                    root =  fxmlLoader.load();
                    scene = new Scene(root,400,400);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                if (listView.getSelectionModel().getSelectedIndex()>-1){
                    ventanaDetalle.setScene(scene);
                    DetalleController detalleController = fxmlLoader.getController();
                    detalleController.setearPelicula(listView.getSelectionModel().getSelectedItem());
                    ventanaDetalle.setTitle("Detalle de la pelicula");
                    ventanaDetalle.show();
                }

            }


        }
    }
}