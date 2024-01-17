package com.relaciones.JPArelaciones.service;

import com.relaciones.JPArelaciones.entity.AutorEntity;

import java.util.List;

public interface AutorService {

    List<AutorEntity> obtenerTodos();
    AutorEntity obtenerAutorPorId(Long id) throws Exception;
    AutorEntity crearAutor(AutorEntity autor);
    AutorEntity actualizarAutor(Long id,AutorEntity autorActualizado);
    void eliminarAutor(Long id);

}
