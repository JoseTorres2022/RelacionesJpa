package com.relaciones.JPArelaciones.service.Impl;

import com.relaciones.JPArelaciones.dao.LibroDao;
import com.relaciones.JPArelaciones.entity.LibroEntity;
import com.relaciones.JPArelaciones.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroDao libroDao;

    @Override
    public List<LibroEntity> obtenerTodos() {
        return libroDao.findAll();
    }

    @Override
    public LibroEntity obtenerLibroPorId(Long id) throws Exception {
        Optional<LibroEntity> libro = libroDao.findById(id);
        if (libro.isPresent()){
            return libro.get();
        }else {
            throw new Exception("Error,no existe");
        }
    }

    @Override
    public LibroEntity crearLibro(LibroEntity libro) {
        return libroDao.save(libro);
    }
}
