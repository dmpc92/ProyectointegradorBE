package com.Car4All.Proyecto.repository;

import com.Car4All.Proyecto.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface ReservaRepository extends JpaRepository<Reserva,Long> {
    Optional<Reserva> findByFecha(LocalDate fecha);
}
