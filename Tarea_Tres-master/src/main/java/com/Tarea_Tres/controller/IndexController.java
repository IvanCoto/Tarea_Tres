package com.Tarea_Tres.controller;

import com.Tarea_Tres.domain.Usuario;
import com.Tarea_Tres.service.UsuarioService;
import com.Tarea_Tres.domain.form_contacto;
import com.Tarea_Tres.service.Form_contactoService;
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
    private Form_contactoService form_contactoService;
    
    //@Autowired
    //private UsuarioDao usuarioDao;
    
    //@Autowired
    //private Form_contacto Form_contactoDao;
    
    //lista desde base de datos
    //var usuarioDB = UsuarioDao.findAll();
    //model.addAttribute("usuarioDB",usuarioDB);
    
    //var form_contactoDB = Form_contactoDao.findAll();
    //model.addAttribute("form_contactoDB",form_contactoDB);
    
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
    
    //crud para form_contacto
    
    @GetMapping("")
    public String nuevoForm_contacto(form_contacto form_contacto){
        return "";
    }
    
    @PostMapping("")
    public String guardarForm_contacto(form_contacto form_contacto){
        form_contactoService.save(form_contacto);
        return "";
    }
    
    @GetMapping("")
    public String modificarForm_contacto(form_contacto form_contacto, Model model){
        form_contacto respuesta = form_contactoService.getForm_contacto(form_contacto);
        model.addAttribute("form_contacto", respuesta);
        return"";
    } 
    
}
