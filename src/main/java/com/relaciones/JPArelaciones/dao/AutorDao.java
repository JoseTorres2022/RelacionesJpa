package com.relaciones.JPArelaciones.dao;

import com.relaciones.JPArelaciones.entity.AutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorDao extends JpaRepository<AutorEntity,Long> {
}
