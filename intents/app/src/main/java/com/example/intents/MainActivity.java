package com.example.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

     private Button bt;
     private EditText texto;
     public static final String MENSAJE = "texto de saludo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = findViewById(R.id.boton1);
        texto=findViewById(R.id.saludar);
    }

    public void saludar (View view){
        Intent intent = new Intent(this,SegundaActividad.class);
        String mensaje = texto.getText().toString();
        intent.putExtra(MENSAJE,mensaje);
        startActivity(intent);
    }
}