package com.claudis.practicomaquina2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GenerosActivity extends AppCompatActivity {
    private TextView tvGenerosInicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generos);

        tvGenerosInicio = (TextView) findViewById(R.id.tvInicio);
        Bundle b = this.getIntent().getExtras();

        tvGenerosInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent. Esto crea una nueva instancia de la activida principal, por lo que solo se debe finalizar
                Intent intent = new Intent(GenerosActivity.this, MainActivity.class);

                //Iniciamos la nueva actividad
                startActivity(intent);
                finish();
            }
        });
    }
    public void salsa(View v){
        Intent intent = new Intent(GenerosActivity.this, ArtistasActivity.class);

        //Creamos la información a pasar entre actividades
        Bundle b = new Bundle();
        b.putString("GENERO", "Salsa");
        b.putInt("idGenero", 258);
        intent.putExtras(b);
        // Iniciamos la nueva actividad
        startActivity(intent);
    }
    public void reggae(View v){
        Intent intent = new Intent(GenerosActivity.this, ArtistasActivity.class);

        //Creamos la información a pasar entre actividades
        Bundle b = new Bundle();
        b.putString("GENERO", "Reggae");
        b.putInt("idGenero", 88);
        intent.putExtras(b);
        // Iniciamos la nueva actividad
        startActivity(intent);
    }

    public void rock(View v){
        Intent intent = new Intent(GenerosActivity.this, ArtistasActivity.class);

        //Creamos la información a pasar entre actividades
        Bundle b = new Bundle();
        b.putString("GENERO", "Rock");
        b.putInt("idGenero", 173);
        intent.putExtras(b);
        // Iniciamos la nueva actividad
        startActivity(intent);
    }

    public void pop(View v){
        Intent intent = new Intent(GenerosActivity.this, ArtistasActivity.class);

        //Creamos la información a pasar entre actividades
        Bundle b = new Bundle();
        b.putString("GENERO", "Pop");
        b.putInt("idGenero", 1);
        intent.putExtras(b);
        // Iniciamos la nueva actividad
        startActivity(intent);
    }
}