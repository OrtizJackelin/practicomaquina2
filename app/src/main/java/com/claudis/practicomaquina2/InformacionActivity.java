package com.claudis.practicomaquina2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InformacionActivity extends AppCompatActivity {
    private TextView tvInformacion, tvInicio;
    //Botón para volver a la actividad principal
    private Button btnMusica, btnInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        tvInformacion = (TextView) findViewById(R.id.tvInformacion);
        tvInicio = (TextView) findViewById(R.id.tvInicioInformacion);
        btnMusica = (Button) findViewById(R.id.btnMusicaInformacion);
        btnInicio = (Button) findViewById(R.id.btnInicioInformacion);

        //Recuperamos la información pasada en el intent
        Bundle b = this.getIntent().getExtras();

        // Concatenamos los datos en un solo string
        String informacionCompleta = "Alumno: Claudis Ortíz\n "+"\nCarrera: TU WEB\n "+"\nHerramienta: Android Studio Jellyfish | 2023.3.1\n ";

        // Mostramos los datos concatenados en el TextView
        tvInformacion.setText(informacionCompleta);

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent. Esto crea una nueva instancia de la activida principal, por lo que solo se debe finalizar
                Intent intent = new Intent(InformacionActivity.this, MainActivity.class);

                //Iniciamos la nueva actividad
                startActivity(intent);
                finish();
            }
        });

        tvInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent. Esto crea una nueva instancia de la activida principal, por lo que solo se debe finalizar
                Intent intent = new Intent(InformacionActivity.this, MainActivity.class);

                //Iniciamos la nueva actividad
                startActivity(intent);
                finish();
            }
        });

        btnMusica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent. Esto crea una nueva instancia de la activida principal, por lo que solo se debe finalizar
                Intent intent = new Intent(InformacionActivity.this, GenerosActivity.class);

                //Iniciamos la nueva actividad
                startActivity(intent);
                finish();
            }
        });
    }
}