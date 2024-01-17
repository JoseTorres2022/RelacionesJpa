package com.relaciones.JPArelaciones.service;

import com.relaciones.JPArelaciones.entity.EditorEntity;

import java.util.List;

public interface EditorService {

    List<EditorEntity> obtenerTodos();
    EditorEntity obtenerEditorPorId(Long id) throws Exception;
    EditorEntity crearEditor(EditorEntity editor);

}
