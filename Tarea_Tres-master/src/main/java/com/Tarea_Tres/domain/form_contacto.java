
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
@Table(name="form_contacto")


public class form_contacto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long id_contacto;
    private String nombre;
    private String apellidos;
    private String nombre_tour;
    private String cant_dias;

    public form_contacto() {
    }

    public form_contacto(long id_contacto, String nombre, String apellidos, String nombre_tour, String cant_dias) {
        this.id_contacto = id_contacto;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombre_tour = nombre_tour;
        this.cant_dias = cant_dias;
    }
}
