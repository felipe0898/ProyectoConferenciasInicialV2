package com.example.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Data;


@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
    
    private static final long serialVersionUID= 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_usuario;
    
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    private String apellido;
    
    @NotEmpty
    @Email
    private String correo;
    
    @NotEmpty
    private String telefono;
    
    @NotEmpty
    private String domicilio;
    
    
}
