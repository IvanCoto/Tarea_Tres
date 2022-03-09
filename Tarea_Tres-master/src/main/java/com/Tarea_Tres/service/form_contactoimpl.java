package com.Tarea_Tres.service;

import com.Tarea_Tres.dao.Form_contactoDao;
import com.Tarea_Tres.domain.form_contacto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service

public class form_contactoimpl implements Form_contactoService{
    
    @Autowired
    private Form_contactoDao form_contactoDao;

    @Override
    @Transactional(readOnly=true)
    public List<form_contacto> getForm_contacto() {
        return (List<form_contacto>) form_contactoDao.findAll();
    }

    @Override
    public void save(form_contacto form_contacto) {
        form_contactoDao.save(form_contacto);        
    }

    @Override
    public void delete(form_contacto form_contacto) {
        form_contactoDao.delete(form_contacto);
        }

    @Override
    public form_contacto getForm_contacto(form_contacto form_contacto) {
        return form_contactoDao.findById(form_contacto.getId_contacto()).orElse(null);
    }
}
