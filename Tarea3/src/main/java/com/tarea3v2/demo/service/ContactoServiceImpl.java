package com.tarea3v2.demo.service;

import com.tarea3v2.demo.dao.ContactoDao;
import com.tarea3v2.demo.domain.Contacto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContactoServiceImpl implements ContactoService {
    
    @Autowired
    private ContactoDao contactoDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Contacto> getContactos() {
        return (List<Contacto>) contactoDao.findAll();
    }

    @Override
    @Transactional
    public void save(Contacto usuario) {
        contactoDao.save(usuario);
    }

    @Override
    @Transactional
    public void delete(Contacto usuario) {
        contactoDao.delete(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public Contacto getContacto(Contacto usuario) {
        return contactoDao.findById(usuario.getIdContacto()).orElse(null);
    }
}
