package com.claudis.practicomaquina2.modelo;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Album {
    private Integer id;
    private String nombre;
    private String nombreOriginal;
    private String imagen;
    private Integer cancionSeleccionadaIndex = 0;
    private List<Cancion> canciones;
}
