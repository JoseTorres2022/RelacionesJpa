package com.relaciones.JPArelaciones.service.Impl;

import com.relaciones.JPArelaciones.dao.CategoriaDao;
import com.relaciones.JPArelaciones.entity.CategoriaEntity;
import com.relaciones.JPArelaciones.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public List<CategoriaEntity> obtenerTodos() {
        return categoriaDao.findAll();
    }

    @Override
    public CategoriaEntity obtenerCategoriaPorId(Long id) throws Exception {
        Optional<CategoriaEntity> categoria = categoriaDao.findById(id);
        if (categoria.isPresent()){
            return categoria.get();
        }else {
            throw new Exception("Error,no existe");
        }
    }

    @Override
    public CategoriaEntity crearCategoria(CategoriaEntity categoria) {
        return categoriaDao.save(categoria);
    }
}
