package com.claudis.practicomaquina2.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cancion {
    private Integer id;
    private String nombre;
    private String archivo;
}
