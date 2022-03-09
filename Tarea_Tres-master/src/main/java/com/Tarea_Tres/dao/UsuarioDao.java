package com.Tarea_Tres.dao;

import com.Tarea_Tres.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario, Long> {
    
}

