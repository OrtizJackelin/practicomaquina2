package com.claudis.practicomaquina2.persistencia;

import com.claudis.practicomaquina2.mock.DatosMock;
import com.claudis.practicomaquina2.modelo.Artista;
import com.claudis.practicomaquina2.modelo.Genero;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArtistaPersistencia {

    public static List<Artista> obtenerPorGenero(Integer idGenero) {;
        List<Genero> generos = DatosMock.obtenerTodos();
        Optional<Genero> generoOptional = generos.stream()
                .filter(genero -> genero.getId().equals(idGenero))
                .findAny();

        return generoOptional.map(Genero::getArtistas).orElse(new ArrayList<>());
    }

    public static Artista obtenerPorId(Integer idArtista) {
        List<Genero> generos = DatosMock.obtenerTodos();
        for (Genero genero : generos) {
            Optional<Artista> artistaOptional = genero.getArtistas().stream()
                    .filter(artista -> artista.getId().equals(idArtista))
                    .findFirst();

            if (artistaOptional.isPresent()) {
                return artistaOptional.get();
            }
        }
        return null;
    }

}
