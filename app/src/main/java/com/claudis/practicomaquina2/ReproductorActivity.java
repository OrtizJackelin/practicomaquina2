package com.claudis.practicomaquina2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.claudis.practicomaquina2.modelo.Album;
import com.claudis.practicomaquina2.modelo.Artista;
import com.claudis.practicomaquina2.modelo.Cancion;
import com.claudis.practicomaquina2.persistencia.ArtistaPersistencia;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import androidx.viewpager.widget.ViewPager;

public class ReproductorActivity  extends AppCompatActivity {

    private Integer albumIndex;
    private Artista artista;
    private Album album;
    private int posicion;
    private MediaPlayer[] mediaPlayers;
    private Button play_pause;
    private LinearLayout layoutCanciones;
    private SeekBar seekBar;
    private final Handler handler = new Handler();

    private TextView tvNombreAlbum;
    private Integer idGenero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reproductor);

        TextView tvInicio = findViewById(R.id.tvInicio);
        TextView tvGeneros = findViewById(R.id.tvGeneros);
        TextView tvArtistas = findViewById(R.id.tvArtistas);
        TextView tvAlbumes = findViewById(R.id.tvAlbumes);
        TextView tvNArtista = findViewById(R.id.tvNArtista);
        tvNombreAlbum = findViewById(R.id.tvNombreAlbum);

        tvInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent. Esto crea una nueva instancia de la activida principal, por lo que solo se debe finalizar
                Intent intent = new Intent(ReproductorActivity.this, MainActivity.class);
                //Iniciamos la nueva actividad
                startActivity(intent);
                finish();
            }
        });

        tvGeneros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent. Esto crea una nueva instancia de la activida principal, por lo que solo se debe finalizar
                Intent intent = new Intent(ReproductorActivity.this, GenerosActivity.class);
                //Iniciamos la nueva actividad
                startActivity(intent);
                finish();
            }
        });
        tvArtistas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent. Esto crea una nueva instancia de la activida principal, por lo que solo se debe finalizar
                Intent intent = new Intent(ReproductorActivity.this, ArtistasActivity.class);
                //Iniciamos la nueva actividad
                Bundle b = new Bundle();
                b.putInt("idGenero", idGenero);
                intent.putExtras(b);
                startActivity(intent);
                finish();
            }
        });
        tvAlbumes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent. Esto crea una nueva instancia de la activida principal, por lo que solo se debe finalizar
                Intent intent = new Intent(ReproductorActivity.this, AlbumesActivity.class);
                Bundle b = new Bundle();
                b.putInt("idArtista", artista.getId());
                b.putInt("idGenero", idGenero);
                intent.putExtras(b);
                //Iniciamos la nueva actividad
                startActivity(intent);
                finish();
            }
        });

        play_pause = findViewById(R.id.btn_play);
        layoutCanciones = findViewById(R.id.layout_canciones);
        seekBar = findViewById(R.id.seekBar);

        Bundle b = this.getIntent().getExtras();
        idGenero = b.getInt("idGenero");
        if (Objects.isNull(b)) {
            cerrar();
        }
        Integer idArtista = b.getInt("idArtista", 0);
        if (Integer.valueOf(0).equals(idArtista)) {
            cerrar();
        }
        artista = ArtistaPersistencia.obtenerPorId(idArtista);
        if (Objects.isNull(artista)) {
            cerrar();
        }

        albumIndex = b.getInt("albumIndex",0);
        album = artista.getAlbumes().get(albumIndex);
        List<Integer> imagenesAlbumes = obtenerIdsImagenes();
        mediaPlayers = new MediaPlayer[album.getCanciones().size()];
        posicion = 0;

        ViewPager mViewPager = findViewById(R.id.viewPagerMain);
        ViewPagerAdapter mViewPagerAdapter = new ViewPagerAdapter(ReproductorActivity.this, imagenesAlbumes);
        mViewPager.setAdapter(mViewPagerAdapter);
        mViewPager.setCurrentItem(albumIndex);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                // No action needed here
            }

            @Override
            public void onPageSelected(int index) {
                albumIndex = index;
                Stop(null);
                actualizarListaReproduccion();
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser && Objects.nonNull(mediaPlayers[posicion])) {
                    mediaPlayers[posicion].seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        actualizarListaReproduccion();

        tvNombreAlbum.setText(album.getNombreOriginal());
        tvNArtista.setText(artista.getNombre());
    }

    private void actualizarListaReproduccion() {
        album = artista.getAlbumes().get(albumIndex);
        layoutCanciones.removeAllViews();
        asignarCanciones();
        agregarTextViewsDinamicos();
        actualizarColoresTextViews(posicion);
        tvNombreAlbum.setText(album.getNombreOriginal());
    }
    private List<Integer> obtenerIdsImagenes() {
        String carpeta = "@drawable/";
        List<Integer> ids = new ArrayList<>();
        for (Album album:artista.getAlbumes()) {
            ids.add(getResources().getIdentifier(carpeta + album.getImagen(), "", getPackageName()));
        }
        return ids;
    }

    private void asignarCanciones() {
        String carpeta = "@raw/";
        int i = 0;
        for (Cancion cancion : album.getCanciones()) {
            String uri = carpeta + cancion.getArchivo();
            int resourceId = getResources().getIdentifier(uri, "", getPackageName());
            mediaPlayers[i] = MediaPlayer.create(this, resourceId);
            final int index = i;
            mediaPlayers[i].setOnCompletionListener(mp -> {
                if (index < album.getCanciones().size()-1) {
                    Siguiente(null);
                }
            });
            i++;
        }
    }

    private void agregarTextViewsDinamicos() {

        for (int i = 0; i < album.getCanciones().size(); i++) {
            Cancion cancion = album.getCanciones().get(i);
            TextView textView = new TextView(this);
            textView.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            textView.setText(String.format("%d- %s", i+1, cancion.getNombre()));
            textView.setTextColor(getResources().getColor(R.color.colorTextoOriginal));
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
            textView.setPadding(25, 16, 16, 16);
            final int index = i;
            textView.setOnClickListener(view -> reproducirCancion(index));
            layoutCanciones.addView(textView);
        }
    }

    private void reproducirCancion(int index) {
        if (Objects.nonNull(mediaPlayers[posicion])) {
            if (mediaPlayers[posicion].isPlaying()) {
                mediaPlayers[posicion].stop();
            }
            mediaPlayers[posicion].reset();
            mediaPlayers[posicion] = MediaPlayer.create(this, getResources().getIdentifier(
                    "@raw/" + album.getCanciones().get(index).getArchivo(), "", getPackageName()));
        }
        posicion = index;
        mediaPlayers[posicion].start();
        actualizarColoresTextViews(posicion);
        play_pause.setBackgroundResource(R.drawable.pausa);
        mensajeReproduciendo(index);
        actualizarSeekBar();
    }

    private void cerrar() {
        Toast.makeText(this, "No se puede reproducir, regresando...", Toast.LENGTH_SHORT).show();
        finish();
    }

    private void mensajeReproduciendo(Integer index) {
        Toast.makeText(this, "Reproduciendo: " + album.getCanciones().get(index).getNombre(), Toast.LENGTH_SHORT).show();

    }
    public void PlayPause(View view){
        if(Objects.nonNull(mediaPlayers[posicion])) {
            if (mediaPlayers[posicion].isPlaying()) {
                mediaPlayers[posicion].pause();
                play_pause.setBackgroundResource(R.drawable.reproducir);
                handler.removeCallbacks(updateSeekBar);
                Toast.makeText(this, "Pausa", Toast.LENGTH_SHORT).show();
            } else {
                mediaPlayers[posicion].start();
                play_pause.setBackgroundResource(R.drawable.pausa);
                actualizarColoresTextViews(posicion);
                actualizarSeekBar();
                mensajeReproduciendo(posicion);
            }
        }
    }

    public void Stop(View view){
        if(Objects.nonNull(mediaPlayers[posicion])) {
            mediaPlayers[posicion].stop();
            asignarCanciones();
            posicion = 0;
            play_pause.setBackgroundResource(R.drawable.reproducir);
            actualizarColoresTextViews(0);
            handler.removeCallbacks(updateSeekBar);
            seekBar.setProgress(0);
            Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
        }
    }

    public void Siguiente(View view) {
        if (posicion < mediaPlayers.length -1) {
            if(mediaPlayers[posicion].isPlaying()) {
                mediaPlayers[posicion].stop();
                asignarCanciones();
            }
            posicion++;
            mediaPlayers[posicion].start();
            actualizarColoresTextViews(posicion);
            actualizarSeekBar();
            mensajeReproduciendo(posicion);
        } else {
            Toast.makeText(this, "Última canción",Toast.LENGTH_SHORT).show();
        }
    }

    public void Anterior(View view) {
        if (posicion >= 1) {
            if(mediaPlayers[posicion].isPlaying()) {
                mediaPlayers[posicion].stop();
                asignarCanciones();
            }
            -- posicion;
            mediaPlayers[posicion].start();
            actualizarColoresTextViews(posicion);
            actualizarSeekBar();
            mensajeReproduciendo(posicion);
        } else{
            Toast.makeText(this, "Primera canción",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopAndReleaseMediaPlayers();
    }

    private void stopAndReleaseMediaPlayers() {
        if (Objects.nonNull(mediaPlayers)){
            for (MediaPlayer mediaPlayer : mediaPlayers) {
                if (Objects.nonNull(mediaPlayer)) {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                    }
                    mediaPlayer.release();
                }
            }
        }
        handler.removeCallbacks(updateSeekBar);
        posicion=0;
    }

    private void actualizarColoresTextViews(int posicionActual) {
        for (int i = 0; i < album.getCanciones().size(); i++) {
            TextView textView = (TextView) layoutCanciones.getChildAt(i);

            if (i == posicionActual) {
                // Si es la canción en reproducción, cambiar a un color gris claro
                textView.setTextColor(getResources().getColor(R.color.colorTextoReproduciendo));
            } else {
                textView.setTextColor(getResources().getColor(R.color.colorTextoOriginal));
            }
        }
    }

    private void actualizarSeekBar() {
        if (Objects.nonNull(mediaPlayers[posicion])) {
            seekBar.setMax(mediaPlayers[posicion].getDuration());
            seekBar.setProgress(mediaPlayers[posicion].getCurrentPosition());
            handler.postDelayed(updateSeekBar, 1000);
        }
    }

    private Runnable updateSeekBar = new Runnable() {
        @Override
        public void run() {
            actualizarSeekBar();
        }
    };

}
