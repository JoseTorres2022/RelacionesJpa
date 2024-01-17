package com.relaciones.JPArelaciones.service;

import com.relaciones.JPArelaciones.entity.LibroEntity;

import java.util.List;


public interface LibroService {
    List<LibroEntity> obtenerTodos();
    LibroEntity obtenerLibroPorId(Long id) throws Exception;
    LibroEntity crearLibro(LibroEntity libro);
}
