package com.claudis.practicomaquina2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.claudis.practicomaquina2.modelo.Album;
import com.claudis.practicomaquina2.modelo.Artista;
import com.claudis.practicomaquina2.persistencia.ArtistaPersistencia;
import java.util.List;
import java.util.Objects;

public class AlbumesActivity extends AppCompatActivity {

    private TextView tvNombreAlbum1,tvNombreAlbum2,tvNombreAlbum3,tvNombreAlbum4,tvAlbunesInicio, tvNombreArtista,tvAlbunesGeneros,tvAlbunesArtistas;
    private ImageButton ibAlbun1, ibAlbun2, ibAlbun3,ibAlbun4;
    private Integer idArtista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albumes);

        ibAlbun1 = findViewById(R.id.ibAlbum1);
        ibAlbun2 = findViewById(R.id.ibAlbum2);
        ibAlbun3 = findViewById(R.id.ibAlbum3);
        ibAlbun4 = findViewById(R.id.ibAlbum4);
        tvNombreAlbum1 = findViewById(R.id.tvNombreAlbum1);
        tvNombreAlbum2 = findViewById(R.id.tvNombreAlbum2);
        tvNombreAlbum3 = findViewById(R.id.tvNombreAlbúm3);
        tvNombreAlbum4 = findViewById(R.id.tvNombreAlbúm4);
        tvAlbunesInicio = findViewById(R.id.tvInicio);
        tvAlbunesGeneros = findViewById(R.id.tvAlbunesGeneros);
        tvAlbunesArtistas = findViewById(R.id.tvAlbunesArtistas);
        tvNombreArtista = findViewById(R.id.tvNombreArtista);

        tvAlbunesInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent. Esto crea una nueva instancia de la activida principal, por lo que solo se debe finalizar
                Intent intent = new Intent(AlbumesActivity.this, MainActivity.class);
                //Iniciamos la nueva actividad
                startActivity(intent);
                finish();
            }
        });

        tvAlbunesGeneros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent. Esto crea una nueva instancia de la activida principal, por lo que solo se debe finalizar
                Intent intent = new Intent(AlbumesActivity.this, GenerosActivity.class);
                //Iniciamos la nueva actividad
                startActivity(intent);
                finish();
            }
        });
        tvAlbunesArtistas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent. Esto crea una nueva instancia de la activida principal, por lo que solo se debe finalizar
                Intent intent = new Intent(AlbumesActivity.this, ArtistasActivity.class);
                //Iniciamos la nueva actividad
                startActivity(intent);
                finish();
            }
        });

        Bundle b = this.getIntent().getExtras();
        this.idArtista = b.getInt("idArtista");
        if (Integer.valueOf(0).equals(idArtista)) {
            cerrar();
        }
        Artista artistaActual = ArtistaPersistencia.obtenerPorId(idArtista);
        if (Objects.isNull(artistaActual)) {
            cerrar();
        }

        tvNombreArtista.setText(artistaActual.getNombre());
        String carpeta = "@drawable/";
        List<Album> albumes = artistaActual.getAlbumes();
        String uri = carpeta + albumes.get(0).getImagen();
        int imageResource = getResources().getIdentifier(uri, "", getPackageName());
        ibAlbun1.setImageResource(imageResource);
        tvNombreAlbum1.setText(albumes.get(0).getNombreOriginal());
        uri = carpeta + albumes.get(1).getImagen();
        ibAlbun2.setImageResource(getResources().getIdentifier(uri, "", getPackageName()));
        tvNombreAlbum2.setText(albumes.get(1).getNombreOriginal());
        uri = carpeta + albumes.get(2).getImagen();
        ibAlbun3.setImageResource(getResources().getIdentifier(uri, "", getPackageName()));
        tvNombreAlbum3.setText(albumes.get(2).getNombreOriginal());
        uri = carpeta + albumes.get(3).getImagen();
        ibAlbun4.setImageResource(getResources().getIdentifier(uri, "", getPackageName()));
        tvNombreAlbum4.setText(albumes.get(3).getNombreOriginal());

    }

    private void cerrar() {
        Toast.makeText(this, "No se encontraron datos, regresando...", Toast.LENGTH_SHORT).show();
        finish();
    }
    public void albumUnoClick(View v){
        abrirReproductor(0);
    }

    public void albumDosClick(View v){
        abrirReproductor(1);
    }

    public void albumTresClick(View v){
        abrirReproductor(2);
    }

    public void albumCuatroClick(View v){
        abrirReproductor(3);
    }

    private void abrirReproductor(Integer index) {
        Intent intent = new Intent(AlbumesActivity.this, ReproductorActivity.class);
        Bundle b = new Bundle();
        b.putInt("idArtista", idArtista);
        b.putInt("albumIndex", index);
        intent.putExtras(b);
        startActivity(intent);
    }
}