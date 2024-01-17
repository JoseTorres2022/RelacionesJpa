package com.relaciones.JPArelaciones.dao;

import com.relaciones.JPArelaciones.entity.EditorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorDao extends JpaRepository<EditorEntity,Long> {
}
