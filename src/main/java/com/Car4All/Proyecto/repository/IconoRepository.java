package com.Car4All.Proyecto.repository;

import com.Car4All.Proyecto.entity.Icono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IconoRepository extends JpaRepository<Icono, Long> {
}
