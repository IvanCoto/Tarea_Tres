package com.tarea3v2.demo.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="contacto")
public class Contacto implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long idContacto;
    private String nombre;
    private String apellidos;
    private String tour; 
    private String telefono;
    
    public Contacto(){
        
    }

    public Contacto(String nombre, String apellidos, String tour, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tour = tour;
        this.telefono = telefono;
    }
    
    
}
