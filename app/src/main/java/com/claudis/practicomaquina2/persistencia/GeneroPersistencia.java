package com.claudis.practicomaquina2.persistencia;

import com.claudis.practicomaquina2.mock.DatosMock;
import com.claudis.practicomaquina2.modelo.Genero;
import java.util.List;

public class GeneroPersistencia {

    public static List<Genero> obtenerTodos() {
        return DatosMock.obtenerTodos();
    }

}
