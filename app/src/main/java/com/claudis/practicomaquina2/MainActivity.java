package com.claudis.practicomaquina2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnInformacion, btnMusica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenemos una referencia a los controles de la interfaz
        btnInformacion = (Button)findViewById(R.id.btnInformacion);
        btnMusica = (Button)findViewById(R.id.btnMusica);


        //Implementamos el evento click del botón
        btnInformacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent = new Intent(MainActivity.this, InformacionActivity.class);

                //Creamos la información a pasar entre actividades
                Bundle b = new Bundle();
                b.putString("ALUMNO", "Claudis Ortiz");
                b.putString("CARRERA", "Técnicatura Universitaria WEB");
                // Añadimos la información al intent
                intent.putExtras(b);

                // Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

        btnMusica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent = new Intent(MainActivity.this, GenerosActivity.class);
                // Iniciamos la nueva actividad
                startActivity(intent);
            }
        });
    }
}