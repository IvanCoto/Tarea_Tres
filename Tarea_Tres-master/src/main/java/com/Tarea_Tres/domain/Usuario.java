package com.Tarea_Tres.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long id_usuario;
    private String correo;
    private String nombre;
    private String apellidos;
    private String contrasena; 
    private String telefono;
    
    public Usuario(){
        
    }

    public Usuario(String correo, String nombre, String apellidos, String contrasena, String telefono) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contrasena = contrasena;
        this.telefono = telefono;
    }

    
    
    
    
}
