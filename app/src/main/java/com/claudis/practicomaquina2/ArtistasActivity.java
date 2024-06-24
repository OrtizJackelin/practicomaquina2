package com.claudis.practicomaquina2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.claudis.practicomaquina2.modelo.Artista;
import com.claudis.practicomaquina2.persistencia.ArtistaPersistencia;
import java.util.List;
import java.util.Objects;

public class ArtistasActivity extends AppCompatActivity {
    private Integer idArtista1, idArtista2, idArtista3, idArtista4;
    private Integer idAlbumSeleccionadoindex;
    private ImageButton ibArtista1,ibArtista2,ibArtista3,ibArtista4;
    private TextView tvTituloArtistas, tvGenerosInicio, tvGenerosMusica, tvNombreArtista1, tvNombreGenero, tvNombreArtista2,tvNombreArtista3,tvNombreArtista4;
    private Integer idGenero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artistas);

        tvGenerosInicio = (TextView)findViewById(R.id.tvInicio);
        tvGenerosMusica = (TextView)findViewById(R.id.tvAlbunesGeneros);

        ibArtista1 = findViewById(R.id.ibArtista1);
        ibArtista2 = findViewById(R.id.ibArtista2);
        ibArtista3 = findViewById(R.id.ibArtista3);
        ibArtista4 = findViewById(R.id.ibArtista4);
        tvNombreArtista1 = findViewById(R.id.tvNombreArtista1);
        tvNombreArtista2 = findViewById(R.id.tvNombreArtista2);
        tvNombreArtista3 = findViewById(R.id.tvNombreArtista3);
        tvNombreArtista4 = findViewById(R.id.tvNombreArtista4);
        tvNombreGenero = findViewById(R.id.tvNombreGenero);

        tvGenerosInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent. Esto crea una nueva instancia de la activida principal, por lo que solo se debe finalizar
                Intent intent = new Intent(ArtistasActivity.this, MainActivity.class);
                //Iniciamos la nueva actividad
                startActivity(intent);
                finish();
            }
        });

        tvGenerosMusica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent. Esto crea una nueva instancia de la activida principal, por lo que solo se debe finalizar
                Intent intent = new Intent(ArtistasActivity.this, GenerosActivity.class);

                //Iniciamos la nueva actividad
                startActivity(intent);
                finish();
            }
        });

        Bundle b = this.getIntent().getExtras();
        if(Objects.nonNull(b)) {
            idGenero = b.getInt("idGenero", 0);
            if (idGenero > 0) {
                List<Artista> artistas = ArtistaPersistencia.obtenerPorGenero(idGenero);
                if (!artistas.isEmpty()) {
                    tvNombreGenero.setText(b.getString("GENERO"));
                    String carpeta = "@drawable/";
                    String uri = carpeta + artistas.get(0).getImagen();
                    int imageResource = getResources().getIdentifier(uri, "", getPackageName());
                    ibArtista1.setImageResource(imageResource);
                    tvNombreArtista1.setText(artistas.get(0).getNombre());
                    idArtista1 = artistas.get(0).getId();

                    uri = carpeta + artistas.get(1).getImagen();
                    imageResource = getResources().getIdentifier(uri, "", getPackageName());
                    ibArtista2.setImageResource(imageResource);
                    tvNombreArtista2.setText(artistas.get(1).getNombre());
                    idArtista2 = artistas.get(1).getId();

                    uri = carpeta + artistas.get(2).getImagen();
                    imageResource = getResources().getIdentifier(uri, "", getPackageName());
                    ibArtista3.setImageResource(imageResource);
                    tvNombreArtista3.setText(artistas.get(2).getNombre());
                    idArtista3 = artistas.get(2).getId();

                    uri = carpeta + artistas.get(3).getImagen();
                    imageResource = getResources().getIdentifier(uri, "", getPackageName());
                    ibArtista4.setImageResource(imageResource);
                    tvNombreArtista4.setText(artistas.get(3).getNombre());
                    idArtista4 = artistas.get(3).getId();
                }
            }
        }
    }
    public void discograficaUno(View v){
        Intent intent = new Intent(ArtistasActivity.this, AlbumesActivity.class);
        Bundle b = new Bundle();
        b.putString("ARTISTA", tvNombreArtista1.getText().toString());
        b.putInt("idArtista", idArtista1);
        b.putInt("idGenero",idGenero);
        intent.putExtras(b);
        startActivity(intent);
    }

    public void discograficaDos(View v){
        Intent intent = new Intent(ArtistasActivity.this, AlbumesActivity.class);
        Bundle b = new Bundle();
        b.putString("ARTISTA", tvNombreArtista2.getText().toString());
        b.putInt("idArtista", idArtista2);
        b.putInt("idGenero",idGenero);
        intent.putExtras(b);
        startActivity(intent);
    }

    public void discograficaTres(View v){
        Intent intent = new Intent(ArtistasActivity.this, AlbumesActivity.class);
        Bundle b = new Bundle();
        b.putString("ARTISTA", tvNombreArtista3.getText().toString());
        b.putInt("idArtista", idArtista3);
        b.putInt("idGenero",idGenero);
        intent.putExtras(b);
        startActivity(intent);
    }

    public void discograficaCuatro(View v){
        Intent intent = new Intent(ArtistasActivity.this, AlbumesActivity.class);
        Bundle b = new Bundle();
        b.putString("ARTISTA", tvNombreArtista4.getText().toString());
        b.putInt("idArtista", idArtista4);
        b.putInt("idGenero",idGenero);
        intent.putExtras(b);
        startActivity(intent);
    }
}