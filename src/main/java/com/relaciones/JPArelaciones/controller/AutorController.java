package com.relaciones.JPArelaciones.controller;

import com.relaciones.JPArelaciones.entity.AutorEntity;
import com.relaciones.JPArelaciones.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping()
    public List<AutorEntity> listarAutores(){
        List<AutorEntity> autores = autorService.obtenerTodos();
        return autores;
    }

    @GetMapping("/{id}")
    public AutorEntity obtenerAutorPorId(@PathVariable Long id) throws Exception {
        AutorEntity autor = autorService.obtenerAutorPorId(id);
        return autor;
    }

    @PostMapping
    public ResponseEntity<AutorEntity> crearAutor(@RequestBody AutorEntity autor){
        AutorEntity nuevoAutor = autorService.crearAutor(autor);
        return new ResponseEntity<>(nuevoAutor, HttpStatus.CREATED);
    }

}
