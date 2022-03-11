package com.tarea3v2.demo.controller;


import com.tarea3v2.demo.domain.Contacto;
import com.tarea3v2.demo.domain.Usuario;
import com.tarea3v2.demo.service.ContactoService;
import com.tarea3v2.demo.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @Autowired
    private ContactoService contactoService;
    
  
    @GetMapping("/")
    public String inicio(){
        return "index";
    }
    @GetMapping("/contactenos")
    public String contactenos(){
        return "contactenos";
    }
    @GetMapping("/nuevoUsuario")
    public String nuevoUsuario(){
        return "insertar";
    }
    
    //Listar
    @GetMapping("/listar")
    public String listar(Model model){
        log.info("Estamos usando una arquitectura mvc");
        var usuarios = usuarioService.getUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "listado_usuarios";
    }
    
    //Guardar un nuevo usuario
    @PostMapping("/insertar")
    public String guardarUsuario(Usuario usuario){
        usuarioService.save(usuario);
        return "redirect:/listar";
    }

    //Modificar
    @GetMapping("/modificarUsuario/{idUsuario}")
    public String modificarUsuario(Usuario usuario, Model model){
        usuario = usuarioService.getUsuario(usuario);
        model.addAttribute("usuario",usuario);
        return "modifica";
    }
    
    //Eliminar
    @GetMapping("/eliminarUsuario/{idUsuario}")
    public String eliminarUsuario(Usuario usuario){
        usuarioService.delete(usuario);
        return "redirect:/listar";
    }
    
    // Metodo POST para Enviar Formulario
    @PostMapping("/guardarContacto")
    public String guardarContacto(Contacto contacto){
        contactoService.save(contacto);
        return "redirect:/";
    }
    
}
