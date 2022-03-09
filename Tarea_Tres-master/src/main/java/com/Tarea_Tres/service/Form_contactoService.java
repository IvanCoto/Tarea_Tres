package com.Tarea_Tres.service;

import com.Tarea_Tres.domain.form_contacto;
import java.util.List;

public interface Form_contactoService {
    
    public List<form_contacto> getForm_contacto();
    public void save(form_contacto form_contacto);
    public void delete(form_contacto form_contacto);
    public form_contacto getForm_contacto(form_contacto form_contacto);
}

