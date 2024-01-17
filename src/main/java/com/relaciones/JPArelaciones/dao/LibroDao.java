package com.relaciones.JPArelaciones.dao;

import com.relaciones.JPArelaciones.entity.LibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroDao extends JpaRepository<LibroEntity,Long> {
}
