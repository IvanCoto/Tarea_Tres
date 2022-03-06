package com.Tarea_Tres.controller;

import com.Tarea_Tres.domain.Usuario;
import com.Tarea_Tres.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping("/")
    public String inicio(){
        return "index";
    }
    @GetMapping("/contactenos")
    public String contactenos(){
        return "contactenos";
    }
    @GetMapping("/insertar")
    public String insertar(){
        return "insertar";
    }  
    @GetMapping("/listar")
    public String listar(){
        return "listado_usuarios";
    }
    
    /*
    @GetMapping("/listado_usuarios")
    public String listado_usuarios(){
        return "listado_usuarios";
    }
    */
    @PostMapping("/registrarse")
    public String registrarse(Usuario usuario){
        usuarioService.save(usuario);
        log.info(" "+usuario);
        return "redirect:/listar";
    }
    
    @GetMapping("/eliminarUsuario/{id}")
    public String eliminarUsuario(Usuario usuario){
        usuarioService.delete(usuario);
        return "redirect:/listar";
    }
    
}
