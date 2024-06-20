package com.claudis.practicomaquina2.modelo;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Artista {
    private Integer id;
    private String nombre;
    private String imagen;
    private Integer albumSeleccionadoIndex = 0;
    private List<Album> albumes;
}
