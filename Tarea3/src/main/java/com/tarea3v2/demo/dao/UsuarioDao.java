package com.tarea3v2.demo.dao;

import com.tarea3v2.demo.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario, Long> {
    
}

