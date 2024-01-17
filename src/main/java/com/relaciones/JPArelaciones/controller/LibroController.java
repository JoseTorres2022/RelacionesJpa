package com.relaciones.JPArelaciones.controller;

import com.relaciones.JPArelaciones.entity.LibroEntity;
import com.relaciones.JPArelaciones.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping()
    public List<LibroEntity> listarLibros(){
        List<LibroEntity> libros = libroService.obtenerTodos();
        return libros;
    }

    @GetMapping("/{id}")
    public LibroEntity obtenerLibroPorId(@PathVariable Long id) throws Exception {
        LibroEntity libro = libroService.obtenerLibroPorId(id);
        return libro;
    }

    @PostMapping
    public ResponseEntity<LibroEntity> crearLibro(@RequestBody LibroEntity libro){
        LibroEntity nuevoLibro = libroService.crearLibro(libro);
        return new ResponseEntity<>(nuevoLibro, HttpStatus.CREATED);
    }

}
