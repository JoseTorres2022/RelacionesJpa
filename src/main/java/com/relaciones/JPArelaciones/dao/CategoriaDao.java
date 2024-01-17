package com.relaciones.JPArelaciones.dao;

import com.relaciones.JPArelaciones.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaDao extends JpaRepository<CategoriaEntity,Long> {
}
