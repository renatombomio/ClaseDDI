package com.example.intents;

import static com.example.intents.MainActivity.MENSAJE;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SegundaActividad extends AppCompatActivity{

    private Button btVolver;
    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        btVolver=findViewById(R.id.boton2);
        text=findViewById(R.id.saludo2);

        Intent intent = getIntent();
        Bundle extra = intent.getExtras();
        String message = extra.getString(MENSAJE);
    }


    public void volver (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
