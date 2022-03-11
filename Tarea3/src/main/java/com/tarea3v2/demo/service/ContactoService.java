package com.tarea3v2.demo.service;

import com.tarea3v2.demo.domain.Contacto;
import java.util.List;

public interface ContactoService {
    
    public List<Contacto> getContactos();
    public void save(Contacto contacto);
    public void delete(Contacto contacto);
    public Contacto getContacto(Contacto contacto);
    
}
