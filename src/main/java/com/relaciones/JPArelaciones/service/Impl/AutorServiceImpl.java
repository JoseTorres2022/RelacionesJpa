package com.relaciones.JPArelaciones.service.Impl;

import com.relaciones.JPArelaciones.dao.AutorDao;
import com.relaciones.JPArelaciones.entity.AutorEntity;
import com.relaciones.JPArelaciones.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorServiceImpl implements AutorService {

    @Autowired
    private AutorDao autorDao;

    @Override
    public List<AutorEntity> obtenerTodos() {
        return autorDao.findAll();
    }

    @Override
    public AutorEntity obtenerAutorPorId(Long id) throws Exception {
        Optional<AutorEntity> autor = autorDao.findById(id);
        if (autor.isPresent()){
            return autor.get();
        }else {
            throw new Exception("Error no existe");
        }
    }

    @Override
    public AutorEntity crearAutor(AutorEntity autor) {
        return autorDao.save(autor);
    }

    @Override
    public AutorEntity actualizarAutor(Long id, AutorEntity autorActualizado) {
        return null;
    }

    @Override
    public void eliminarAutor(Long id) {

    }
}
