package com.Car4All.Proyecto.repository;

import com.Car4All.Proyecto.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    public Usuario findByUserName(String userName);
}
