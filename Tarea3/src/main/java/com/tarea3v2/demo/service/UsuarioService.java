package com.tarea3v2.demo.service;

import com.tarea3v2.demo.domain.Usuario;
import java.util.List;

public interface UsuarioService {
    
    public List<Usuario> getUsuarios();
    public void save(Usuario usuario);
    public void delete(Usuario usuario);
    public Usuario getUsuario(Usuario usuario);
}
