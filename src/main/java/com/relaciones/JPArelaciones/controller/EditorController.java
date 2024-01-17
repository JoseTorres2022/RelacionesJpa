package com.relaciones.JPArelaciones.controller;

import com.relaciones.JPArelaciones.entity.EditorEntity;
import com.relaciones.JPArelaciones.service.EditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editor")
public class EditorController {

    @Autowired
    private EditorService editorService;

    @GetMapping()
    public List<EditorEntity> listarEditores(){
        List<EditorEntity> editores = editorService.obtenerTodos();
        return editores;
    }

    @GetMapping("/{id}")
    public EditorEntity obtenerEditorPorId(@PathVariable Long id) throws Exception {
        EditorEntity editor = editorService.obtenerEditorPorId(id);
        return editor;
    }

    @PostMapping
    public ResponseEntity<EditorEntity> crearEditor(@RequestBody EditorEntity editor){
        EditorEntity nuevoEditor = editorService.crearEditor(editor);
        return new ResponseEntity<>(nuevoEditor, HttpStatus.CREATED);
    }

}
