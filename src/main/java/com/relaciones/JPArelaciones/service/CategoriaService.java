package com.relaciones.JPArelaciones.service;

import com.relaciones.JPArelaciones.entity.CategoriaEntity;

import java.util.List;

public interface CategoriaService {
    List<CategoriaEntity> obtenerTodos();
    CategoriaEntity obtenerCategoriaPorId(Long id) throws Exception;
    CategoriaEntity crearCategoria(CategoriaEntity categoria);
}
