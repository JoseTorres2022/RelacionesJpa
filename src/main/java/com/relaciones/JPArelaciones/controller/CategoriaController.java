package com.relaciones.JPArelaciones.controller;

import com.relaciones.JPArelaciones.entity.AutorEntity;
import com.relaciones.JPArelaciones.entity.CategoriaEntity;
import com.relaciones.JPArelaciones.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<CategoriaEntity> listarCategorias(){
        List<CategoriaEntity> categoria = categoriaService.obtenerTodos();
        return categoria;
    }

    //Usamos ResponseEntity<> para devolver una respuesta mas detallada utilizando http
    //personalizamos el codigo http q nos indica el estado de la respuesta en este caso
    //si la busqueda es correcta nos dara un 200 k
    @GetMapping("/{id}")
    public ResponseEntity<CategoriaEntity> obtenerCategoriaPorId(@PathVariable Long id) throws Exception {
        CategoriaEntity categoria = categoriaService.obtenerCategoriaPorId(id);
        return ResponseEntity.ok(categoria);
    }

    @PostMapping
    public ResponseEntity<CategoriaEntity> crearCategoria(@RequestBody CategoriaEntity categoria){
        CategoriaEntity nuevaCategoria = categoriaService.crearCategoria(categoria);
        //devolvemos el objeto guardado y le damos un HttpStatus  q es created
        return new ResponseEntity<>(nuevaCategoria, HttpStatus.CREATED);
    }

}
