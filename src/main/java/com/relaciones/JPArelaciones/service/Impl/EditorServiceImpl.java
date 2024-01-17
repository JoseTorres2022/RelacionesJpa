package com.relaciones.JPArelaciones.service.Impl;

import com.relaciones.JPArelaciones.dao.EditorDao;
import com.relaciones.JPArelaciones.entity.EditorEntity;
import com.relaciones.JPArelaciones.service.EditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EditorServiceImpl implements EditorService {

    @Autowired
    private EditorDao editorDao;

    @Override
    public List<EditorEntity> obtenerTodos() {
        return editorDao.findAll();
    }

    @Override
    public EditorEntity obtenerEditorPorId(Long id) throws Exception {
        Optional<EditorEntity> editor = editorDao.findById(id);
        if (editor.isPresent()){
            return editor.get();
        }else {
            throw new Exception("Error,no existe");
        }
    }

    @Override
    public EditorEntity crearEditor(EditorEntity editor) {
        return editorDao.save(editor);
    }
}
