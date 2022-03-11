package com.tarea3v2.demo.dao;

import com.tarea3v2.demo.domain.Contacto;
import org.springframework.data.repository.CrudRepository;

public interface ContactoDao extends CrudRepository<Contacto, Long> {
    
}
